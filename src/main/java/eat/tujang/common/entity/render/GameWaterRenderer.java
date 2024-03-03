package eat.tujang.common.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.common.entity.GameWaterEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class GameWaterRenderer extends MobEntityRenderer<GameWaterEntity, PlayerEntityModel<GameWaterEntity>> {
    public GameWaterRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }

    @Override
    public Identifier getTexture(GameWaterEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/game_water/game_water.png");
    }
}
