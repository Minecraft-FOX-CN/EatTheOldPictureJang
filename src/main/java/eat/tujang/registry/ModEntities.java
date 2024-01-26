package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MinecraftFoxEntity> MINECRAFT_FOX_ENTITY = registerModEntity(
            "minecraft_fox",
            SpawnGroup.CREATURE,
            MinecraftFoxEntity::new,
            0.6f,
            1.8f
    );

    public static final EntityType<OldPictureJangEntity> OLD_PICTURE_JANG_ENTITY = registerModEntity(
            "old_picture_jang",
            SpawnGroup.MONSTER,
            OldPictureJangEntity::new,
            0.6f,
            1.8f
    );

    public static final EntityType<UncleNorEntity> UNCLE_NOR_ENTITY = registerModEntity(
            "uncle_nor",
            SpawnGroup.CREATURE,
            UncleNorEntity::new,
            0.6f,
            1.8f
    );

    public static final EntityType<GameWaterEntity> GAME_WATER_ENTITY = registerModEntity(
            "game_water",
            SpawnGroup.CREATURE,
            GameWaterEntity::new,
            0.6f,
            1.8f
    );

    public static final EntityType<OldPictureJangTntEntity> OLD_PICTURE_JANG_TNT_ENTITY = registerModEntity(
            "old_picture_jang_tnt",
            SpawnGroup.CREATURE,
            OldPictureJangTntEntity::new,
            1f,
            1f
    );



    private static <T extends Entity> EntityType<T> registerModEntity(String name, SpawnGroup spawnGroup, EntityType.EntityFactory<T> entityFactory, float width, float height) {
            EntityType<T> type = FabricEntityTypeBuilder
                    .create(spawnGroup, entityFactory)
                    .dimensions(EntityDimensions.fixed(width, height))
                    .build();
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(EatTheOldPictureJang.MOD_ID, name), type);
    }

    private static void registerAttribute(EntityType<? extends LivingEntity> entityType) {
        FabricDefaultAttributeRegistry.register(entityType, MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 80.0d)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.35d)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0d)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0d)
                .add(EntityAttributes.GENERIC_ARMOR, 2.0d));
    }

    public static void registerModEntitiesAttribute() {
        registerAttribute(MINECRAFT_FOX_ENTITY);
        registerAttribute(OLD_PICTURE_JANG_ENTITY);
        registerAttribute(GAME_WATER_ENTITY);
        registerAttribute(UNCLE_NOR_ENTITY);
        EatTheOldPictureJang.LOGGER.debug("Registering mod entities for" + EatTheOldPictureJang.MOD_ID);
    }
}

