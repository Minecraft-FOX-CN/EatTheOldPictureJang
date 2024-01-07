package eat.tujang;

import eat.tujang.registry.ModEntities;
import eat.tujang.registry.ModEntitiesRenders;
import net.fabricmc.api.ClientModInitializer;

public class EatTheOldPictureJangClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModEntitiesRenders.registerModEntitiesRenders();
    }
}
