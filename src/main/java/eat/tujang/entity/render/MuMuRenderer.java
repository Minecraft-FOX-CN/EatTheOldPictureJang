package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.MuMuEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class MuMuRenderer extends MobEntityRenderer<MuMuEntity, PlayerEntityModel<MuMuEntity>> {
    public MuMuRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }
    @Override
    public Identifier getTexture(MuMuEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/mumu/mumu.png");
    }
}
