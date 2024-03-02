package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.common.block.InventoryInsuranceBlock;
import eat.tujang.common.block.OldPictureJangBlock;
import eat.tujang.common.block.OldPictureJangTntBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block OLD_PICTURE_JANG_TNT_BLOCK;
    public static Block OLD_PICTURE_JANG_BLOCK;
    public static Block INVENTORY_INSURANCE_BLOCK;

    static {
        OLD_PICTURE_JANG_TNT_BLOCK = registerBlock("old_picture_jang_tnt_block", new OldPictureJangTntBlock(FabricBlockSettings.create()
                .sounds(BlockSoundGroup.GRASS)
                .mapColor(DyeColor.CYAN)
                .breakInstantly()
                .burnable()), new FabricItemSettings());

        OLD_PICTURE_JANG_BLOCK = registerBlock("old_picture_jang_block", new OldPictureJangBlock(FabricBlockSettings.create()
                .sounds(BlockSoundGroup.METAL)
                .mapColor(DyeColor.BLUE)
                .strength(16f)), new FabricItemSettings().fireproof());

        INVENTORY_INSURANCE_BLOCK = registerBlock("inventory_insurance_block", new InventoryInsuranceBlock(FabricBlockSettings.create()
                .sounds(BlockSoundGroup.METAL)
                .mapColor(DyeColor.WHITE)
                .strength(4f)), new FabricItemSettings().fireproof());
    }

    public static Block registerBlock(String name, Block block, FabricItemSettings fabricItemSettings) {
        ModItems.registerItem(name, new BlockItem(block, fabricItemSettings));
        return Registry.register(Registries.BLOCK, new Identifier(EatTheOldPictureJang.MOD_ID, name), block);
    }

    public static void registerModBlock() {
        EatTheOldPictureJang.LOGGER.debug("Registering mod blocks for" + EatTheOldPictureJang.MOD_ID);
    }
}
