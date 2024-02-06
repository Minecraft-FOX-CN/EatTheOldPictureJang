package eat.tujang.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class OldPictureJangEntity extends PathAwareEntity {
    public OldPictureJangEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.initCustomGoals();
    }

    protected void initCustomGoals() {
        this.goalSelector.add(2, new AttackGoal(this));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.add(4, new ActiveTargetGoal<>(this, IronGolemEntity.class, true));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, GameWaterEntity.class, false));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, MinecraftFoxEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, MuMuEntity.class, false));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, UncleNorEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, BuleTvEntity.class, false));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, OldPictureJangEntity.class, true));
    }
}
