// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbirdbrain<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "birdbrain"), "main");
	private final ModelPart head;
	private final ModelPart brain;
	private final ModelPart body;
	private final ModelPart left_wing;
	private final ModelPart left_wing_rotation;
	private final ModelPart right_wing;
	private final ModelPart right_wing_rotation;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart tail;

	public Modelbirdbrain(ModelPart root) {
		this.head = root.getChild("head");
		this.brain = this.head.getChild("brain");
		this.body = root.getChild("body");
		this.left_wing = root.getChild("left_wing");
		this.left_wing_rotation = this.left_wing.getChild("left_wing_rotation");
		this.right_wing = root.getChild("right_wing");
		this.right_wing_rotation = this.right_wing.getChild("right_wing_rotation");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(2, 2)
						.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 1)
						.addBox(-1.0F, -2.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 7)
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, -0.5F));

		PartDefinition brain = head.addOrReplaceChild("brain", CubeListBuilder.create().texOffs(15, 21).addBox(-1.5F,
				-13.0F, -3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(2, 8).addBox(
				-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.5F, -1.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create(),
				PartPose.offset(1.5F, 16.9F, -0.8F));

		PartDefinition left_wing_rotation = left_wing.addOrReplaceChild(
				"left_wing_rotation", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F,
						3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create(),
				PartPose.offset(-1.5F, 16.9F, -0.8F));

		PartDefinition right_wing_rotation = right_wing.addOrReplaceChild(
				"right_wing_rotation", CubeListBuilder.create().texOffs(19, 8).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F,
						3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(14, 18)
				.addBox(-2.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 22.0F, -1.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(14, 18).addBox(1.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 22.0F, -1.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, 1).addBox(
				-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.1F, 1.2F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_wing.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_wing.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.brain.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.brain.xRot = headPitch / (180F / (float) Math.PI);
	}
}