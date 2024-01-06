package eat.tujang;

import eat.tujang.entity.MinecraftFoxEntity;
import eat.tujang.registry.ModItemGroup;
import eat.tujang.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EatTheOldPictureJang implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "eatujang";
    public static final Logger LOGGER = LoggerFactory.getLogger("eatujang");

    public static final EntityType<MinecraftFoxEntity> MINECRAFT_FOX_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "minecraft_fox"),
            FabricEntityTypeBuilder
                    .create(SpawnGroup.CREATURE, MinecraftFoxEntity::new)
                    .dimensions(EntityDimensions.fixed(1.8f, 0.6f))
                    .build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(MINECRAFT_FOX_ENTITY, MinecraftFoxEntity.createMobAttributes());
        ModItemGroup.registerModItemGroup();
        ModItems.registerModItems();
    }
}