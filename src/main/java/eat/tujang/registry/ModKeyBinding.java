package eat.tujang.registry;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;

public class ModKeyBinding {
    public static final KeyBinding sprint = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.eatujang.sprint",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_R,
            "category.eatujang.old_picture_jang_armor_skill"
    ));

    public static void registerModKeyBinding() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            PlayerEntity playerEntity = client.player;
            double Yaw;
            if (playerEntity != null) {
                Yaw = playerEntity.getYaw();
                while (sprint.wasPressed() && isFutureBattlegearArmor(playerEntity.getInventory())) {
//                    playerEntity.addVelocity(5 * Math.sin(0 - playerEntity.getYaw() / 180 * Math.PI), -(playerEntity.getPitch() / 45), 5 * Math.cos(0 - playerEntity.getYaw() / 180 * Math.PI));
                    playerEntity.addVelocity(5 * Math.cos(Math.PI/2 + Yaw / 180 * Math.PI), -(playerEntity.getPitch() / 45), 5 * Math.sin(Math.PI/2 + playerEntity.getYaw() / 180 * Math.PI));
                }
            }
        });
    }

    private static boolean isFutureBattlegearArmor(@NotNull PlayerInventory inventory) {
        return inventory.armor.get(0).isOf(ModItems.OLD_PICTURE_JANG_BOOTS) && inventory.armor.get(1).isOf(ModItems.OLD_PICTURE_JANG_LEGGINGS) && inventory.armor.get(2).isOf(ModItems.OLD_PICTURE_JANG_CHESTPLATE) && inventory.armor.get(3).isOf(ModItems.OLD_PICTURE_JANG_HELMET);
    }
}
