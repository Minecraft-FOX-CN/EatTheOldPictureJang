package eat.tujang.entity;

import eat.tujang.registry.ModEntities;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.fluid.FluidState;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.world.explosion.ExplosionBehavior;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class OldPictureJangTntEntity extends Entity implements Ownable {
    private static final TrackedData<Integer> FUSE;
    private static final int DEFAULT_FUSE = 100;
    @Nullable
    private LivingEntity causingEntity;

    public OldPictureJangTntEntity(EntityType<? extends Entity> entityType, World world) {
        super(entityType, world);
        this.intersectionChecked = true;
    }

    public OldPictureJangTntEntity(World world, double x, double y, double z, @Nullable LivingEntity igniter) {
        this(ModEntities.OLD_PICTURE_JANG_TNT_ENTITY, world);
        this.setPosition(x, y, z);
        double d = world.random.nextDouble() * 6.283;
        this.setVelocity(-Math.sin(d) * 0.02, 0.2, -Math.cos(d) * 0.02);
        this.setFuse(DEFAULT_FUSE);
        this.prevX = x;
        this.prevY = y;
        this.prevZ = z;
        this.causingEntity = igniter;
    }


    @Override
    protected void initDataTracker() {
        this.dataTracker.startTracking(FUSE, 80);
    }

    protected Entity.MoveEffect getMoveEffect() {
        return MoveEffect.NONE;
    }

    public boolean canHit() {
        return !this.isRemoved();
    }

    public void tick() {
        if (!this.hasNoGravity()) {
            this.setVelocity(this.getVelocity().add(0.0, -0.04, 0.0));
        }

        if (this.getFuse() % 20 == 0) {
            if (this.causingEntity != null) {
                this.causingEntity.sendMessage(Text.of(this.getFuse() / 20+Text.translatable("text.eatujang.explosion_countdown").getString()));
            }
            getWorld().playSoundFromEntity(null, this, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.VOICE, 5.0f, 1.0f);
        }

        this.move(MovementType.SELF, this.getVelocity());
        this.setVelocity(this.getVelocity().multiply(0.98));
        if (this.isOnGround()) {
            this.setVelocity(this.getVelocity().multiply(0.7, -0.5, 0.7));
        }

        int i = this.getFuse() - 1;
        this.setFuse(i);


        if (i <= 0) {
            this.discard();
            if (!this.getWorld().isClient) {
                this.explode(this.getX(), this.getY() + 0.5, this.getZ(), 16.0f);
            }
        } else {
            this.updateWaterState();

            if (this.getWorld().isClient) {
                this.getWorld().addParticle(ParticleTypes.LAVA, this.getX(), this.getY() + 0.5, this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }

    private void explode(double x, double y, double z, float power) {
        ExplosionBehavior explosionBehavior = new ExplosionBehavior() {
            @Override
            public Optional<Float> getBlastResistance(Explosion explosion, BlockView world, BlockPos pos, BlockState blockState, FluidState fluidState) {
                return super.getBlastResistance(explosion, world, pos, blockState, fluidState);
            }
        };
        this.getWorld().createExplosion(null, getWorld().getDamageSources().explosion(this, this), explosionBehavior, x, y, z, power, true, World.ExplosionSourceType.TNT);
    }

    protected void writeCustomDataToNbt(NbtCompound nbt) {
        nbt.putShort("Fuse", (short) this.getFuse());
    }

    protected void readCustomDataFromNbt(NbtCompound nbt) {
        this.setFuse(nbt.getShort("Fuse"));
    }

    @Nullable
    public LivingEntity getOwner() {
        return this.causingEntity;
    }

    protected float getEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 0.15F;
    }

    public void setFuse(int fuse) {
        this.dataTracker.set(FUSE, fuse);
    }

    public int getFuse() {
        return this.dataTracker.get(FUSE);
    }

    static {
        FUSE = DataTracker.registerData(OldPictureJangTntEntity.class, TrackedDataHandlerRegistry.INTEGER);
    }
}
