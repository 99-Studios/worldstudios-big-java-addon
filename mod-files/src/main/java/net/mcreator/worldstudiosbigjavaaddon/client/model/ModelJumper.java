package net.mcreator.worldstudiosbigjavaaddon.client.model;

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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelJumper extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("big_addon", "model_jumper"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart ArmL;
	public final ModelPart ArmR;
	public final ModelPart Leg;

	public ModelJumper(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.ArmL = this.Body.getChild("ArmL");
		this.ArmR = this.Body.getChild("ArmR");
		this.Leg = this.Body.getChild("Leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 5)
				.addBox(-0.5F, -12.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 14).addBox(-0.5F, -12.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.0F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition ArmL = Body.addOrReplaceChild("ArmL",
				CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 14).addBox(-0.5F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition ArmR = Body.addOrReplaceChild("ArmR",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 14).addBox(-0.5F, 2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, -5.0F));
		PartDefinition Leg = Body.addOrReplaceChild("Leg", CubeListBuilder.create().texOffs(8, 9).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}