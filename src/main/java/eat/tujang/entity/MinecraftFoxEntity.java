package eat.tujang.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class MinecraftFoxEntity extends PathAwareEntity {
    public MinecraftFoxEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
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
        this.targetSelector.add(2, new ActiveTargetGoal<OldPictureJangEntity>((MobEntity)this, OldPictureJangEntity.class, true));
    }
}
