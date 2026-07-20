package net.mcreator.worldstudiosworld.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsawping extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("worldstudios_world", "modelsawping"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public Modelsawping(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition
				.addOrReplaceChild(
						"head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -10.0F, -2.5F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 31).addBox(-2.5F, -13.0F, -2.5F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
								.texOffs(12, 40).addBox(-5.5F, -13.0F, 0.5F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 12).addBox(-2.5F, -13.0F, 0.5F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-1.0F, -16.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -7.0F, -3.0F, 6.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-2.5F, -14.0F, -3.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -2.0F, 1.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(30, 40).addBox(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 12).addBox(1.0F, -5.0F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 19)
						.addBox(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 42).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -10.0F, 0.5F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(22, 13).addBox(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
				.addBox(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 42).addBox(1.0F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -11.5F, 0.5F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 34).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 55)
				.addBox(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 34).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 8.0F, 0.5F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 34).addBox(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 46)
				.addBox(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 34).addBox(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 6.5F, 0.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}