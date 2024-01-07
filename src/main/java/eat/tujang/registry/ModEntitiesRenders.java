package eat.tujang.registry;

import eat.tujang.entity.render.MinecraftFoxRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ModEntitiesRenders {
    public static void registerModEntitiesRenders() {
        EntityRendererRegistry.register(ModEntities.MINECRAFT_FOX_ENTITY, MinecraftFoxRenderer::new);
    }
}
