package net.mcreator.worldstudiosbigjavaaddon.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
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

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltitan extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("big_addon", "modeltitan"), "main");
	public final ModelPart head;
	public final ModelPart headwear;
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public Modeltitan(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.headwear = root.getChild("headwear");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition righthorn_r1 = head.addOrReplaceChild("righthorn_r1", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(8.0F, -26.0F, -4.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, -22.0F, 2.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition lefthorn_r1 = head.addOrReplaceChild("lefthorn_r1", CubeListBuilder.create().texOffs(38, 16).mirror().addBox(8.0F, -26.0F, -4.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition headwear = partdefinition.addOrReplaceChild("headwear", CubeListBuilder.create().texOffs(0, 64).addBox(-8.5F, -16.5F, -8.5F, 17.0F, 17.0F, 17.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 32).addBox(-8.0F, 0.0F, -4.0F, 16.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(80, 32).mirror().addBox(-2.0F, -4.0F, -4.0F, 8.0F, 32.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(10.0F, -20.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(80, 32).addBox(-6.0F, -4.0F, -4.0F, 8.0F, 32.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -20.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-3.8F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.8F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 32).addBox(-4.2F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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