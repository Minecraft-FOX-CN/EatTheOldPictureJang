package eat.tujang;

import eat.tujang.entity.render.MinecraftFoxRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class EatTheOldPictureJangClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EatTheOldPictureJang.MINECRAFT_FOX_ENTITY, (ctx) -> {
            return new MinecraftFoxRenderer(ctx);
        });
    }
}
