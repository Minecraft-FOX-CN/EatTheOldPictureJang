package eat.tujang.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.task.RandomLookAroundTask;
import net.minecraft.entity.ai.goal.AttackGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.World;

public class MinecraftFoxEntity extends PathAwareEntity {
    public MinecraftFoxEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.add(2, new AttackGoal(this, 3.0D, false));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(8, new RandomLookAroundTask(1,45,5,20));
    }
    private final class AttackGoal extends MeleeAttackGoal {
        private final MinecraftFoxEntity walker;
        private int ticks;

        public AttackGoal(MinecraftFoxEntity walker, double speed, boolean pauseWhenMobIdle) {
            super(walker, speed, pauseWhenMobIdle);
            this.walker = walker;
        }

    }
}
