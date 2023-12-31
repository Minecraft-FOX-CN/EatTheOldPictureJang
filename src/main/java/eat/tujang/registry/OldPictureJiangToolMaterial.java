package eat.tujang.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public  class OldPictureJiangToolMaterial implements ToolMaterial {
    public static final OldPictureJiangToolMaterial INSTANCE = new OldPictureJiangToolMaterial();
    @Override
    public int getDurability() {
        return 2333;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 32.0F;
    }

    @Override
    public float getAttackDamage() {
        return 16.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 114514;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.OLD_PICTURE_JIANG_FOOD);
    }
}
