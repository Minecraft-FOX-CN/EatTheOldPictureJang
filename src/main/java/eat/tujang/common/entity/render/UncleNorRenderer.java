package eat.tujang.common.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.common.entity.UncleNorEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class UncleNorRenderer extends MobEntityRenderer<UncleNorEntity, PlayerEntityModel<UncleNorEntity>> {
    public UncleNorRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }

    @Override
    public Identifier getTexture(UncleNorEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/uncle_nor/uncle_nor.png");
    }
}
