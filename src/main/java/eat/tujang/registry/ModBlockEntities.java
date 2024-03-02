package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.common.blockentity.InventoryInsuranceBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<InventoryInsuranceBlockEntity> INVENTORY_INSURANCE_BLOCK_ENTITY;

    static {
        INVENTORY_INSURANCE_BLOCK_ENTITY = registerBlockEntity(
                "inventory_insurance_block",
                ModBlocks.INVENTORY_INSURANCE_BLOCK,
                FabricBlockEntityTypeBuilder.create(InventoryInsuranceBlockEntity::new, ModBlocks.INVENTORY_INSURANCE_BLOCK).build(null));
    }
    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String name, Block block, BlockEntityType<T> factory) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(name, EatTheOldPictureJang.MOD_ID), factory);
    }

    public static void registerModBlockEntities() {
        EatTheOldPictureJang.LOGGER.debug("Registering mod block entities for" + EatTheOldPictureJang.MOD_ID);
    }
}
