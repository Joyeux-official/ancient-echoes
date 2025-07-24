package com.ancientechoes.models.heads;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class WardenHeadModel extends SinglePartEntityModel {
    private final ModelPart root;
    public WardenHeadModel(ModelPart root) {
        this.root = root.getChild("root");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData left_tendril = root.addChild("left_tendril", ModelPartBuilder.create().uv(58, 0).cuboid(-8.0F, 21.0F, 8.0F, 16.0F, 16.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, -46.0F, -8.0F));

        ModelPartData right_tendril = root.addChild("right_tendril", ModelPartBuilder.create().uv(52, 32).cuboid(-24.0F, 21.0F, 8.0F, 16.0F, 16.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -46.0F, -8.0F));

        ModelPartData head = root.addChild("head", ModelPartBuilder.create().uv(1, 5).cuboid(-16.0F, 18.0F, 4.0F, 16.0F, 16.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -34.0F, -9.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }


    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }
}
