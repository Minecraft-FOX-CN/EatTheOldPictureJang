package eat.tujang.common.material;

import eat.tujang.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OldPictureJangToolMaterial implements ToolMaterial {
    public static final OldPictureJangToolMaterial INSTANCE = new OldPictureJangToolMaterial();

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
        return Ingredient.ofItems(ModItems.OLD_PICTURE_JANG_FOOD);
    }
}
