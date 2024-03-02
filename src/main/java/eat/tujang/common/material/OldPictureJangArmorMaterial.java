package eat.tujang.common.material;

import eat.tujang.registry.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class OldPictureJangArmorMaterial implements ArmorMaterial {
    public static final ArmorMaterial OLD_PICTURE_JANG_ARMOR_MATERIAL = new OldPictureJangArmorMaterial();
    private static final int[] BASE_DURABILITY = new int[] {864, 960, 1024, 768};
    private static final int[] PROTECTION_VALUES = new int[] {23333, 233333, 233333, 23333};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * 4;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return 114514;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.OLD_PICTURE_JANG_INGOT);
    }

    @Override
    public String getName() {
        return "old_picture_jang";
    }

    @Override
    public float getToughness() {
        return 114514;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.9f;
    }
}