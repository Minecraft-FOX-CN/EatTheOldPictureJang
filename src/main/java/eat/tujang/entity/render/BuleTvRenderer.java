package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.BuleTvEntity;
import eat.tujang.entity.MinecraftFoxEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class BuleTvRenderer extends MobEntityRenderer<BuleTvEntity, PlayerEntityModel<BuleTvEntity>> {
    public BuleTvRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }
    @Override
    public Identifier getTexture(BuleTvEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/bule_tv/bule_tv.png");
    }
}
