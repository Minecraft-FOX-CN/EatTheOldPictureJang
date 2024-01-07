package eat.tujang;

import eat.tujang.entity.MinecraftFoxEntity;
import eat.tujang.registry.ModEntities;
import eat.tujang.registry.ModItemGroup;
import eat.tujang.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EatTheOldPictureJang implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "eatujang";
    public static final Logger LOGGER = LoggerFactory.getLogger("eatujang");

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(ModEntities.MINECRAFT_FOX_ENTITY, MinecraftFoxEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 80.0d)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.6d)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0d)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0d)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.325d)
                .add(EntityAttributes.GENERIC_ARMOR, 2.0d)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0.5d));
        ModItemGroup.registerModItemGroup();
        ModItems.registerModItems();
    }
}