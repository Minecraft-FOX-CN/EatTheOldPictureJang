package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.GameWaterEntity;
import eat.tujang.entity.UncleNorEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class GameWaterRenderer extends MobEntityRenderer<GameWaterEntity, PlayerEntityModel<GameWaterEntity>> {
    public GameWaterRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<GameWaterEntity>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }
    @Override
    public Identifier getTexture(GameWaterEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/old_picture_jang/old_picture_jang.png");
    }
}
