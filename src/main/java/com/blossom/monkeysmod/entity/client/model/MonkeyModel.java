package com.blossom.monkeysmod.entity.client.model;

import com.blossom.monkeysmod.entity.MonkeyEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.render.entity.model.EntityModel;


public class MonkeyModel extends EntityModel<LivingEntityRenderState>{

	private final ModelPart leftFrontArm;
    private final ModelPart rightFrontArm;
	private final ModelPart rightBackArm;
	private final ModelPart leftBackArm;
	private final ModelPart Torso;
	private final ModelPart Tail;
	private final ModelPart tail6;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart Head;
    public MonkeyModel(ModelPart root) {
        super(root);
        this.rightFrontArm = root.getChild("rightFrontArm");
		this.leftFrontArm = root.getChild("leftFrontArm");
		this.rightBackArm = root.getChild("rightBackArm");
		this.leftBackArm = root.getChild("leftBackArm");
		this.Torso = root.getChild("Torso");
		this.Tail = root.getChild("Tail");
		this.tail6 = root.getChild("tail6");
		this.tail1 = root.getChild("tail1");
		this.tail2 = root.getChild("tail2");
		this.tail3 = root.getChild("tail3");
		this.tail4 = root.getChild("tail4");
		this.tail5 = root.getChild("tail5");
		this.Head = root.getChild("Head");
	}
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        root.addChild("rightFrontArm", ModelPartBuilder.create(), ModelTransform.of(5.0F, 20.0F, -6.0F, 0.0F, 0.0F, 0.0F))
                .addChild("rightFrontArm_r1", ModelPartBuilder.create().uv(0, 20).cuboid(-3.0F, -4.0F, 1.0F, 3.0F, 8.0F, 3.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        root.addChild("leftFrontArm", ModelPartBuilder.create(), ModelTransform.of(-3.0F, 20.0F, -6.0F, 0.0F, 0.0F, 0.0F))
                .addChild("leftFrontArm_r1", ModelPartBuilder.create().uv(12, 20).cuboid(-2.0F, -4.0F, 1.0F, 3.0F, 8.0F, 3.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        root.addChild("rightBackArm", ModelPartBuilder.create().uv(24, 0).cuboid(1.0F, -4.0F, 2.0F, 3.0F, 4.0F, 2.0F), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        root.addChild("leftBackArm", ModelPartBuilder.create().uv(24, 16).cuboid(-4.0F, -4.0F, 2.0F, 3.0F, 4.0F, 2.0F), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData torso = root.addChild("Torso", ModelPartBuilder.create(), ModelTransform.of(0.0F, 20.0F, 2.0F, 0.0F, 0.0F, 0.0F));
        torso.addChild("Coxis_r1", ModelPartBuilder.create().uv(22, 11).cuboid(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 3.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
        torso.addChild("Chest_r1", ModelPartBuilder.create().uv(0, 11).cuboid(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 3.0F), ModelTransform.of(0.0F, -3.0F, -2.0F, 1.0908F, 0.0F, 0.0F));

        root.addChild("Tail", ModelPartBuilder.create(), ModelTransform.of(0.0F, 21.0F, 6.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData tail1 = root.addChild("tail1", ModelPartBuilder.create(), ModelTransform.of(0.0F, 20.0F, 4.0F, 0.0F, 0.0F, 0.0F));
        tail1.addChild("tail1_r1", ModelPartBuilder.create().uv(24, 9).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        ModelPartData tail2 = root.addChild("tail2", ModelPartBuilder.create(), ModelTransform.of(0.0F, 20.0F, 5.0F, 0.0F, 0.0F, 0.0F));
        tail2.addChild("tail2_r1", ModelPartBuilder.create().uv(24, 22).cuboid(-1.0F, -0.4483F, -1.1907F, 2.0F, 1.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

        ModelPartData tail3 = root.addChild("tail3", ModelPartBuilder.create(), ModelTransform.of(0.0F, 20.0F, 6.0F, 0.0F, 0.0F, 0.0F));
        tail3.addChild("tail3_r1", ModelPartBuilder.create().uv(24, 24).cuboid(-1.0F, -0.4483F, -0.1907F, 2.0F, 1.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3271F, 0.076F, -0.0325F));

        ModelPartData tail4 = root.addChild("tail4", ModelPartBuilder.create(), ModelTransform.of(0.0F, 20.0F, 7.0F, 0.0F, 0.0F, 0.0F));
        tail4.addChild("tail4_r1", ModelPartBuilder.create().uv(24, 26).cuboid(-1.0F, -0.4483F, 0.8093F, 2.0F, 1.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.7198F, 0.076F, -0.0325F));

        ModelPartData tail5 = root.addChild("tail5", ModelPartBuilder.create(), ModelTransform.of(0.0F, 20.0F, 8.0F, 0.0F, 0.0F, 0.0F));
        tail5.addChild("tail5_r1", ModelPartBuilder.create().uv(24, 28).cuboid(-1.0F, -0.4483F, 1.8093F, 2.0F, 1.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0688F, 0.076F, -0.0325F));

        ModelPartData tail6 = root.addChild("tail6", ModelPartBuilder.create(), ModelTransform.of(0.0F, 20.0F, 9.0F, 0.0F, 0.0F, 0.0F));
        tail6.addChild("tail6_r1", ModelPartBuilder.create().uv(30, 6).cuboid(-1.0F, -1.4483F, 2.8093F, 2.0F, 1.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.0252F, 0.076F, -0.0325F));

        root.addChild("Head", ModelPartBuilder.create()
                        .uv(0, 0).cuboid(-7.0F, -2.0F, -3.0F, 6.0F, 5.0F, 6.0F)
                        .uv(24, 6).cuboid(-5.0F, 1.0F, -4.0F, 2.0F, 2.0F, 1.0F),
                        ModelTransform.of(4.0F, 13.0F, -3.0F, 0.0F, 0.0F, 0.0F))
                .addChild("rightEar_r1", ModelPartBuilder.create()
                                .uv(30, 8).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F)
                                .uv(30, 22).cuboid(-8.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F),
                        ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        return TexturedModelData.of(modelData, 64, 64);
    }

        public void setAngles(MonkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

}