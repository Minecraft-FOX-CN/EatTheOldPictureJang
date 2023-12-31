package eat.tujang.registry;


import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.MinecraftFoxEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MinecraftFoxEntity> MINECRAFT_FOX_ENTITY = registerModEntity(
            "minecraft_fox",
            SpawnGroup.CREATURE,
            1.8f,
            0.6f,
            MinecraftFoxEntity::new,
            MinecraftFoxEntity.createMobAttributes()
    );
    private static <T extends MobEntity> EntityType<T> registerModEntity(String name, SpawnGroup group, float width, float height, EntityType.EntityFactory<T> entity, EntityType.Builder attributes) {
        EntityType<T> type = FabricEntityTypeBuilder
                .create(group, entity)
                .dimensions(EntityDimensions.fixed(width, height))
                .build();
        FabricDefaultAttributeRegistry.register(type, attributes);
        return Registry.register(
                Registries.ENTITY_TYPE,
                new Identifier(EatTheOldPictureJang.MOD_ID, name),
                type
        );
    }
}
