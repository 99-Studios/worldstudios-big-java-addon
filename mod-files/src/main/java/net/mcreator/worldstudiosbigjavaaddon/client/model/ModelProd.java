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

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelProd extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("big_addon", "model_prod"), "main");
	public final ModelPart body;
	public final ModelPart tentacle1;
	public final ModelPart tentacle2;
	public final ModelPart tentacle3;
	public final ModelPart tentacle4;
	public final ModelPart tentacle5;
	public final ModelPart tentacle6;
	public final ModelPart tentacle7;
	public final ModelPart tentacle8;
	public final ModelPart tentacle9;

	public ModelProd(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.tentacle1 = root.getChild("tentacle1");
		this.tentacle2 = root.getChild("tentacle2");
		this.tentacle3 = root.getChild("tentacle3");
		this.tentacle4 = root.getChild("tentacle4");
		this.tentacle5 = root.getChild("tentacle5");
		this.tentacle6 = root.getChild("tentacle6");
		this.tentacle7 = root.getChild("tentacle7");
		this.tentacle8 = root.getChild("tentacle8");
		this.tentacle9 = root.getChild("tentacle9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition tentacle1 = partdefinition.addOrReplaceChild("tentacle1", CubeListBuilder.create(), PartPose.offset(-3.7F, 11.0F, -5.0F));
		PartDefinition tentacle1_r1 = tentacle1.addOrReplaceChild("tentacle1_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.7F, -13.0F, -6.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7F, -28.0F, 5.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle2 = partdefinition.addOrReplaceChild("tentacle2", CubeListBuilder.create(), PartPose.offset(1.3F, 11.0F, -5.0F));
		PartDefinition tentacle2_r1 = tentacle2.addOrReplaceChild("tentacle2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(5.3F, -13.0F, -6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, -28.0F, 5.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle3 = partdefinition.addOrReplaceChild("tentacle3", CubeListBuilder.create(), PartPose.offset(6.3F, 11.0F, -5.0F));
		PartDefinition tentacle3_r1 = tentacle3.addOrReplaceChild("tentacle3_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, -13.0F, -6.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3F, -28.0F, 5.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle4 = partdefinition.addOrReplaceChild("tentacle4", CubeListBuilder.create(), PartPose.offset(-6.3F, 11.0F, 0.0F));
		PartDefinition tentacle4_r1 = tentacle4.addOrReplaceChild("tentacle4_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.3F, -13.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3F, -28.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle5 = partdefinition.addOrReplaceChild("tentacle5", CubeListBuilder.create(), PartPose.offset(-1.3F, 11.0F, 0.0F));
		PartDefinition tentacle5_r1 = tentacle5.addOrReplaceChild("tentacle5_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3F, -13.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, -28.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle6 = partdefinition.addOrReplaceChild("tentacle6", CubeListBuilder.create(), PartPose.offset(3.7F, 11.0F, 0.0F));
		PartDefinition tentacle6_r1 = tentacle6.addOrReplaceChild("tentacle6_r1", CubeListBuilder.create().texOffs(0, 0).addBox(2.7F, -13.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7F, -28.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle7 = partdefinition.addOrReplaceChild("tentacle7", CubeListBuilder.create(), PartPose.offset(-3.7F, 11.0F, 5.0F));
		PartDefinition tentacle7_r1 = tentacle7.addOrReplaceChild("tentacle7_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.7F, -13.0F, 4.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7F, -28.0F, -5.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle8 = partdefinition.addOrReplaceChild("tentacle8", CubeListBuilder.create(), PartPose.offset(1.3F, 11.0F, 5.0F));
		PartDefinition tentacle8_r1 = tentacle8.addOrReplaceChild("tentacle8_r1", CubeListBuilder.create().texOffs(0, 0).addBox(5.3F, -13.0F, 4.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, -28.0F, -5.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tentacle9 = partdefinition.addOrReplaceChild("tentacle9", CubeListBuilder.create(), PartPose.offset(6.3F, 11.0F, 5.0F));
		PartDefinition tentacle9_r1 = tentacle9.addOrReplaceChild("tentacle9_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.3F, -13.0F, 4.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3F, -28.0F, -5.0F, 0.0F, 0.0F, -3.1416F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.tentacle1.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle8.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle9.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle6.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle7.xRot = headPitch / (180F / (float) Math.PI);
		this.body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.body.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle4.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle5.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle2.xRot = headPitch / (180F / (float) Math.PI);
		this.tentacle3.xRot = headPitch / (180F / (float) Math.PI);
	}
}