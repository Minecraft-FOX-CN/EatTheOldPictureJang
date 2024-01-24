package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item NOR_COOKING_CAKE = registerItem("nor_cooking_cake", new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .hunger(114514)
                    .saturationModifier(114514)
                    .alwaysEdible()
                    .snack()
                    .build())));
    public static final Item FANS_GRAIN_RESERVES = registerItem("fans_grain_reserves", new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .hunger(114514)
                    .saturationModifier(114514)
                    .alwaysEdible()
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5 * 60 * 20, 5), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5 * 60 * 20, 1), 1.0f)
                    .build())));
    public static final Item GAME_WATER_ENOKI = registerItem("game_water_enoki", new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .hunger(114514)
                    .saturationModifier(114514)
                    .alwaysEdible()
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 30 * 60 * 20, 15), 1.0f)
                    .build())));
    public static final Item OLD_PICTURE_JANG_FOOD = registerItem("old_picture_jang_food", new Item(new FabricItemSettings()
            .food((new FoodComponent.Builder())
                    .hunger(114514)
                    .saturationModifier(114514)
                    .alwaysEdible()
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20 * 60 * 20, 15), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 60 * 20, 2), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 60 * 20, 2), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 60 * 20, 1), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 60 * 20), 1.0f)
                    .build())));
    public static final Item NE_GIANT_SHOVEL = registerItem("ne_giant_shovel", new ShovelItem(OldPictureJiangToolMaterial.INSTANCE, 16, 8, new FabricItemSettings()));
    public static final Item LIKE = registerItem("bilibili_like", new Item(new FabricItemSettings()));
    public static final Item COIN = registerItem("bilibili_coin", new Item(new FabricItemSettings()));
    public static final Item BOOKMARK = registerItem("bilibili_bookmark", new Item(new FabricItemSettings()));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EatTheOldPictureJang.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EatTheOldPictureJang.LOGGER.debug("Registering mod items for" + EatTheOldPictureJang.MOD_ID);
    }
}
