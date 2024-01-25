package eat.tujang.entity.render;

import eat.tujang.EatTheOldPictureJang;
import eat.tujang.entity.OldPictureJangEntity;
import eat.tujang.entity.OldPictureJangTntEntity;
import eat.tujang.registry.ModBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.TntMinecartEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.TntEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

@Environment(value= EnvType.CLIENT)
public class OldPictureJangTntRenderer extends EntityRenderer<OldPictureJangTntEntity> {
    private final BlockRenderManager blockRenderManager;
    public OldPictureJangTntRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.shadowRadius = 0.5f;
        this.blockRenderManager = ctx.getBlockRenderManager();
    }

    @Override
    public void render(OldPictureJangTntEntity oldPictureJangTntEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.translate(0.0f, 0.5f, 0.0f);
        int j = oldPictureJangTntEntity.getFuse();
        if ((float)j - g + 1.0f < 10.0f) {
            float h = 1.0f - ((float)j - g + 1.0f) / 10.0f;
            h = MathHelper.clamp(h, 0.0f, 1.0f);
            h *= h;
            h *= h;
            float k = 1.0f + h * 0.3f;
            matrixStack.scale(k, k, k);
        }
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90.0f));
        matrixStack.translate(-0.5f, -0.5f, 0.5f);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0f));
        TntMinecartEntityRenderer.renderFlashingBlock(this.blockRenderManager, ModBlocks.OLD_PICTURE_JANG_TNT_BLOCK.getDefaultState(), matrixStack, vertexConsumerProvider, i, j / 5 % 2 == 0);
        matrixStack.pop();
        super.render(oldPictureJangTntEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(OldPictureJangTntEntity oldPictureJangTntEntity) {
        return SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE;
    }
}
