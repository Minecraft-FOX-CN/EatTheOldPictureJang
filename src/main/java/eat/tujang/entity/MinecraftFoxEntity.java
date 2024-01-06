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
    public MinecraftFoxEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
