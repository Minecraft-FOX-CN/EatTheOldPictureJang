package eat.tujang.registry;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.render.MinecraftFoxRenderer;
import eat.tujang.entity.render.OldPictureJangRenderer;
import eat.tujang.entity.render.OldPictureJangTntRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ModEntitiesRenders {
    public static void registerModEntitiesRenders() {
        EntityRendererRegistry.register(ModEntities.MINECRAFT_FOX_ENTITY, MinecraftFoxRenderer::new);
        EntityRendererRegistry.register(ModEntities.OLD_PICTURE_JANG_ENTITY, OldPictureJangRenderer::new);
        EntityRendererRegistry.register(ModEntities.OLD_PICTURE_JANG_TNT_ENTITY, OldPictureJangTntRenderer::new);
        EatTheOldPictureJang.LOGGER.debug("Registering mod entities renders for" + EatTheOldPictureJang.MOD_ID);
    }
}
