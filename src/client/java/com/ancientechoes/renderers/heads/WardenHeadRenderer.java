package com.ancientechoes.renderers.heads;

import com.ancientechoes.AncientEchoes;
import com.ancientechoes.core.blockentites.WardenHeadBlockEntity;
import com.ancientechoes.models.heads.WardenHeadModel;
import net.minecraft.block.BlockState;
import net.minecraft.block.SkullBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.RotationPropertyHelper;

public class WardenHeadRenderer <T extends WardenHeadBlockEntity> implements BlockEntityRenderer<T> {

    public static final Identifier HEAD_TEXTURE = new Identifier(AncientEchoes.MOD_ID,
            "textures/blockentities/head/warden.png");
    private final WardenHeadModel wardenHeadModel;

    public WardenHeadRenderer(BlockEntityRendererFactory.Context ctx) {
        this.wardenHeadModel = new WardenHeadModel(WardenHeadModel.getTexturedModelData().createModel());
    }

    @Override
    public void render(T entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        BlockState blockState = entity.getCachedState();

        int k = blockState.get(SkullBlock.ROTATION);
        float h = RotationPropertyHelper.toDegrees(k);

        matrices.push();
        matrices.translate(0.5f, 1.5f, 0.5f);
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(h));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(180));

        // Retrieve scale dynamically and apply it
        float scale = entity.getScale();
        matrices.scale(scale, scale, scale);

        this. wardenHeadModel.render(matrices,
                vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(HEAD_TEXTURE)), light, overlay, 1.0F,
                1.0F, 1.0F, 1.0F);

        matrices.pop();
    }
}
