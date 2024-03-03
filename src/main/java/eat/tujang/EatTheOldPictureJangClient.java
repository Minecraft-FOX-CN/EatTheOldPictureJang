package eat.tujang;

import eat.tujang.registry.ModEntitiesRenders;
import eat.tujang.registry.ModScreenAndScreenHandler;
import net.fabricmc.api.ClientModInitializer;

public class EatTheOldPictureJangClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModScreenAndScreenHandler.registerModScreen();
        ModEntitiesRenders.registerModEntitiesRenders();
    }
}
