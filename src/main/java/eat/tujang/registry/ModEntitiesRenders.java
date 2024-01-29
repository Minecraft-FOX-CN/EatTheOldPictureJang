package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.render.*;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ModEntitiesRenders {
    public static void registerModEntitiesRenders() {
        EntityRendererRegistry.register(ModEntities.MINECRAFT_FOX_ENTITY, MinecraftFoxRenderer::new);
        EntityRendererRegistry.register(ModEntities.OLD_PICTURE_JANG_ENTITY, OldPictureJangRenderer::new);
        EntityRendererRegistry.register(ModEntities.UNCLE_NOR_ENTITY, UncleNorRenderer::new);
        EntityRendererRegistry.register(ModEntities.GAME_WATER_ENTITY, GameWaterRenderer::new);
        EntityRendererRegistry.register(ModEntities.MUMU_ENTITY, MuMuRenderer::new);
        EntityRendererRegistry.register(ModEntities.BULE_TV_ENTITY, BuleTvRenderer::new);
        EntityRendererRegistry.register(ModEntities.OLD_PICTURE_JANG_TNT_ENTITY, OldPictureJangTntRenderer::new);
        EatTheOldPictureJang.LOGGER.debug("Registering mod entities renders for" + EatTheOldPictureJang.MOD_ID);
    }
}
