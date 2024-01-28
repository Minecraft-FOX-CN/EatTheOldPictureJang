package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.MinecraftFoxEntity;
import eat.tujang.entity.OldPictureJangEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class OldPictureJangRenderer extends MobEntityRenderer<OldPictureJangEntity, PlayerEntityModel<OldPictureJangEntity>> {
    public OldPictureJangRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PlayerEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }
    @Override
    public Identifier getTexture(OldPictureJangEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/old_picture_jang/old_picture_jang.png");
    }
}
