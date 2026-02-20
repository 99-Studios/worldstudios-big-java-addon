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

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldarkbat extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("big_addon", "modeldarkbat"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_wing;
	public final ModelPart outer_left_wing;
	public final ModelPart right_wing;
	public final ModelPart outer_right_wing;
	public final ModelPart feet;

	public Modeldarkbat(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_wing = root.getChild("left_wing");
		this.outer_left_wing = root.getChild("outer_left_wing");
		this.right_wing = root.getChild("right_wing");
		this.outer_right_wing = root.getChild("outer_right_wing");
		this.feet = root.getChild("feet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
				.addBox(1.0F, -7.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-5.0F, -7.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(12, 7).addBox(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 17.0F, 0.0F));
		PartDefinition outer_left_wing = partdefinition.addOrReplaceChild("outer_left_wing", CubeListBuilder.create().texOffs(16, 8).addBox(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 17.0F, 0.0F));
		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(12, 0).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 17.0F, 0.0F));
		PartDefinition outer_right_wing = partdefinition.addOrReplaceChild("outer_right_wing", CubeListBuilder.create().texOffs(16, 0).addBox(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 17.0F, 0.0F));
		PartDefinition feet = partdefinition.addOrReplaceChild("feet", CubeListBuilder.create().texOffs(16, 16).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_wing.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.left_wing.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.outer_left_wing.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.outer_right_wing.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
	}
}