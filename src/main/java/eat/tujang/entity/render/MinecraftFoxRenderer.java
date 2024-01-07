package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.MinecraftFoxEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class MinecraftFoxRenderer extends MobEntityRenderer<MinecraftFoxEntity, PlayerEntityModel<MinecraftFoxEntity>> {
    public MinecraftFoxRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<MinecraftFoxEntity>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }
    @Override
    public Identifier getTexture(MinecraftFoxEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/minecraft_fox/minecraft_fox.png");
    }
}
