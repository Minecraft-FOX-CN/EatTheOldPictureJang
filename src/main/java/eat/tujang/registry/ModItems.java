package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.common.material.OldPictureJangArmorMaterial;
import eat.tujang.common.material.OldPictureJangToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item NOR_COOKING_CAKE;
    public static Item FANS_GRAIN_RESERVES;
    public static Item GAME_WATER_ENOKI;
    public static Item OLD_PICTURE_JANG_FOOD;
    public static Item NE_GIANT_SHOVEL;
    public static Item LIKE;
    public static Item COIN;
    public static Item BOOKMARK;
    public static Item OLD_PICTURE_JANG_INGOT;
    public static Item OLD_PICTURE_JANG_HELMET;
    public static Item OLD_PICTURE_JANG_CHESTPLATE;
    public static Item OLD_PICTURE_JANG_LEGGINGS;
    public static Item OLD_PICTURE_JANG_BOOTS;

    public static Item MINECRAFT_FOX_SPAWN_EGG;
    public static Item GAME_WATER_SPAWN_EGG;
    public static Item OLD_PICTURE_JANG_SPAWN_EGG;
    public static Item UNCLE_NOR_SPAWN_EGG;
    public static Item MUMU_SPAWN_EGG;
    public static Item BULE_TV_SPAWN_EGG;

    static {
        NOR_COOKING_CAKE = registerItem("nor_cooking_cake", new Item(new FabricItemSettings()
                .food((new FoodComponent.Builder())
                        .hunger(114514)
                        .saturationModifier(114514)
                        .alwaysEdible()
                        .snack()
                        .build())));

        FANS_GRAIN_RESERVES = registerItem("fans_grain_reserves", new Item(new FabricItemSettings()
                .food((new FoodComponent.Builder())
                        .hunger(114514)
                        .saturationModifier(114514)
                        .alwaysEdible()
                        .snack()
                        .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5 * 60 * 20, 5), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5 * 60 * 20, 1), 1.0f)
                        .build())));

        GAME_WATER_ENOKI = registerItem("game_water_enoki", new Item(new FabricItemSettings()
                .food((new FoodComponent.Builder())
                        .hunger(114514)
                        .saturationModifier(114514)
                        .alwaysEdible()
                        .snack()
                        .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 30 * 60 * 20, 15), 1.0f)
                        .build())));

        OLD_PICTURE_JANG_FOOD = registerItem("old_picture_jang_food", new Item(new FabricItemSettings()
                .food((new FoodComponent.Builder())
                        .hunger(114514)
                        .saturationModifier(114514)
                        .alwaysEdible()
                        .snack()
                        .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 60 * 20, 14), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 60 * 20, 2), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 60 * 20, 2), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 60 * 20), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 60 * 20), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 60 * 20, 8), 1.0F)
                        .build())));

        NE_GIANT_SHOVEL = registerItem("ne_giant_shovel", new ShovelItem(OldPictureJangToolMaterial.INSTANCE, 233, 8, new FabricItemSettings()));
        LIKE = registerItem("bilibili_like", new Item(new FabricItemSettings()));
        COIN = registerItem("bilibili_coin", new Item(new FabricItemSettings()));
        BOOKMARK = registerItem("bilibili_bookmark", new Item(new FabricItemSettings()));
        OLD_PICTURE_JANG_INGOT = registerItem("old_picture_jang_ingot", new Item(new FabricItemSettings()));
        OLD_PICTURE_JANG_HELMET = registerItem("old_picture_jang_helmet", new ArmorItem(OldPictureJangArmorMaterial.OLD_PICTURE_JANG_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings()));
        OLD_PICTURE_JANG_CHESTPLATE = registerItem("old_picture_jang_chestplate", new ArmorItem(OldPictureJangArmorMaterial.OLD_PICTURE_JANG_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        OLD_PICTURE_JANG_LEGGINGS = registerItem("old_picture_jang_leggings", new ArmorItem(OldPictureJangArmorMaterial.OLD_PICTURE_JANG_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        OLD_PICTURE_JANG_BOOTS = registerItem("old_picture_jang_boots", new ArmorItem(OldPictureJangArmorMaterial.OLD_PICTURE_JANG_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

        MINECRAFT_FOX_SPAWN_EGG = registerItem("minecraft_fox_spawn_egg", new SpawnEggItem(ModEntities.MINECRAFT_FOX_ENTITY, 0xf7ad7b, 0xdc8245, new FabricItemSettings()));
        GAME_WATER_SPAWN_EGG = registerItem("game_water_spawn_egg", new SpawnEggItem(ModEntities.GAME_WATER_ENTITY, 0x080f26, 0x3c0d76, new FabricItemSettings()));
        OLD_PICTURE_JANG_SPAWN_EGG = registerItem("old_picture_jang_spawn_egg", new SpawnEggItem(ModEntities.OLD_PICTURE_JANG_ENTITY, 0x00b8f3, 0xec1c24, new FabricItemSettings()));
        UNCLE_NOR_SPAWN_EGG = registerItem("uncle_nor_spawn_egg", new SpawnEggItem(ModEntities.UNCLE_NOR_ENTITY, 0xffd30d, 0xfcdeae, new FabricItemSettings()));
        MUMU_SPAWN_EGG = registerItem("mumu_spawn_egg", new SpawnEggItem(ModEntities.MUMU_ENTITY, 0x000000, 0xffffff, new FabricItemSettings()));
        BULE_TV_SPAWN_EGG = registerItem("bule_tv_spawn_egg", new SpawnEggItem(ModEntities.BULE_TV_ENTITY, 0x8386f5, 0x6262f5, new FabricItemSettings()));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EatTheOldPictureJang.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EatTheOldPictureJang.LOGGER.debug("Registering mod items for" + EatTheOldPictureJang.MOD_ID);
    }
}
