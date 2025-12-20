// Made with Blockbench 5.0.6
// Exported for Minecraft version 1.17+ for Yarn
package com.diegoagg.gordasmod.client.model;

import com.diegoagg.gordasmod.entity.GordaEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GordaModel extends EntityModel<GordaEntity> {
	public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(
		Identifier.of("gordas-mod", "gorda"), "main"
	);
	
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart legs;
	private final ModelPart foot;
	
	public GordaModel(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.legs = root.getChild("legs");
		this.foot = this.legs.getChild("foot");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -20.0F, -5.0F, 5.0F, 8.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-10.0F, -15.0F, -3.0F, 3.0F, 4.0F, 6.0F, new Dilation(0.0F))
		.uv(18, 18).cuboid(-5.0F, -24.0F, 3.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-5.0F, -24.0F, -7.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(14, 30).cuboid(-7.0F, -12.0F, -5.0F, 15.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(56, 10).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 3).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -11.0F, 0.0F));

		ModelPartData legs = modelPartData.addChild("legs", ModelPartBuilder.create().uv(34, 53).cuboid(-7.0F, -8.0F, -5.0F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 47).cuboid(-7.0F, -8.0F, 2.0F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 50).cuboid(5.0F, -8.0F, -5.0F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F))
		.uv(12, 47).cuboid(5.0F, -8.0F, 2.0F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData foot = legs.addChild("foot", ModelPartBuilder.create().uv(0, 58).cuboid(-8.0F, -2.0F, -5.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(8, 58).cuboid(-8.0F, -2.0F, 2.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(16, 58).cuboid(4.0F, -2.0F, -5.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(46, 49).cuboid(4.0F, -2.0F, 2.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	
	@Override
	public void setAngles(GordaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Aquí puedes agregar animaciones de piernas, cabeza, etc. más adelante
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		head.render(matrices, vertexConsumer, light, overlay, color);
		body.render(matrices, vertexConsumer, light, overlay, color);
		legs.render(matrices, vertexConsumer, light, overlay, color);
	}
}