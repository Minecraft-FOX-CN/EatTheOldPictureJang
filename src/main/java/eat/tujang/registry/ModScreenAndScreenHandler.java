package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.common.screen.InventoryInsuranceScreen;
import eat.tujang.common.screen.InventoryInsuranceScreenHandler;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenAndScreenHandler {
    public static final ScreenHandlerType<InventoryInsuranceScreenHandler> INVENTORY_INSURANCE_SCREEN_HANDLER;
    static {
        INVENTORY_INSURANCE_SCREEN_HANDLER = registerModScreenHandler("inventory_insurance_block", InventoryInsuranceScreenHandler::new);
    }
    public static <T extends ScreenHandler>ScreenHandlerType<T> registerModScreenHandler(String id, ScreenHandlerRegistry.SimpleClientHandlerFactory<T> screenFactory) {
        return ScreenHandlerRegistry.registerSimple(new Identifier(EatTheOldPictureJang.MOD_ID, id), screenFactory);
    }

    public static void registerModScreen() {
        ScreenRegistry.register(INVENTORY_INSURANCE_SCREEN_HANDLER, InventoryInsuranceScreen::new);
        EatTheOldPictureJang.LOGGER.debug("Registering mod screens for" + EatTheOldPictureJang.MOD_ID);
    }
}
