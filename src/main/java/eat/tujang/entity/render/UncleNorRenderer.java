package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.OldPictureJangEntity;
import eat.tujang.entity.UncleNorEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class UncleNorRenderer extends MobEntityRenderer<UncleNorEntity, PlayerEntityModel<UncleNorEntity>> {
    public UncleNorRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<UncleNorEntity>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }
    @Override
    public Identifier getTexture(UncleNorEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/uncle_nor/uncle_nor.png");
    }
}
