package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup OLD_PICTURE_JIANG;

    static {
        OLD_PICTURE_JIANG = Registry.register(Registries.ITEM_GROUP,
                new Identifier(EatTheOldPictureJang.MOD_ID, "old_picture_jang"),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemgroup.eatujang.old_picture_jang"))
                        .icon(() -> new ItemStack(ModItems.OLD_PICTURE_JANG_FOOD))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.NOR_COOKING_CAKE);
                            entries.add(ModItems.FANS_GRAIN_RESERVES);
                            entries.add(ModItems.OLD_PICTURE_JANG_FOOD);
                            entries.add(ModItems.GAME_WATER_ENOKI);
                            entries.add(ModItems.LIKE);
                            entries.add(ModItems.COIN);
                            entries.add(ModItems.BOOKMARK);
                            entries.add(ModItems.NE_GIANT_SHOVEL);
                            entries.add(ModItems.OLD_PICTURE_JANG_INGOT);
                            entries.add(ModItems.OLD_PICTURE_JANG_HELMET);
                            entries.add(ModItems.OLD_PICTURE_JANG_CHESTPLATE);
                            entries.add(ModItems.OLD_PICTURE_JANG_LEGGINGS);
                            entries.add(ModItems.OLD_PICTURE_JANG_BOOTS);
                            entries.add(ModItems.MINECRAFT_FOX_SPAWN_EGG);
                            entries.add(ModItems.GAME_WATER_SPAWN_EGG);
                            entries.add(ModItems.OLD_PICTURE_JANG_SPAWN_EGG);
                            entries.add(ModItems.UNCLE_NOR_SPAWN_EGG);
                            entries.add(ModItems.MUMU_SPAWN_EGG);
                            entries.add(ModItems.BULE_TV_SPAWN_EGG);
                            entries.add(ModBlocks.OLD_PICTURE_JANG_TNT_BLOCK);
                            entries.add(ModBlocks.OLD_PICTURE_JANG_BLOCK);
                        })
                        .build());
    }

    public static void registerModItemGroup() {
        EatTheOldPictureJang.LOGGER.debug("Registering mod item group for " + EatTheOldPictureJang.MOD_ID);
    }
}
