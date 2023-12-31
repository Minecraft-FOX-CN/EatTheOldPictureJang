package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.MinecraftFoxEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class MinecraftFoxRenderer extends MobEntityRenderer<MinecraftFoxEntity, PlayerEntityModel<MinecraftFoxEntity>> {
    public MinecraftFoxRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<MinecraftFoxEntity>(context.getPart(EntityModelLayers.PLAYER), false), 0.5f);
    }


    @Override
    public Identifier getTexture(MinecraftFoxEntity entity) {
        return new Identifier(EatTheOldPictureJang.MOD_ID, "textures/entity/OldPictureJiangEntity/OldPictureJiangEntity.png");
    }
}
