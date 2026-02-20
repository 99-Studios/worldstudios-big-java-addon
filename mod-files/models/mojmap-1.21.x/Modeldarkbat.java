// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldarkbat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "darkbat"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart left_wing;
	private final ModelPart outer_left_wing;
	private final ModelPart right_wing;
	private final ModelPart outer_right_wing;
	private final ModelPart feet;

	public Modeldarkbat(ModelPart root) {
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

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 7)
						.addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
						.addBox(1.0F, -7.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-5.0F, -7.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(12, 7)
				.addBox(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 17.0F, 0.0F));

		PartDefinition outer_left_wing = partdefinition.addOrReplaceChild("outer_left_wing", CubeListBuilder.create()
				.texOffs(16, 8).addBox(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 17.0F, 0.0F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create()
				.texOffs(12, 0).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 17.0F, 0.0F));

		PartDefinition outer_right_wing = partdefinition.addOrReplaceChild("outer_right_wing", CubeListBuilder.create()
				.texOffs(16, 0).addBox(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 17.0F, 0.0F));

		PartDefinition feet = partdefinition.addOrReplaceChild("feet", CubeListBuilder.create().texOffs(16, 16).addBox(
				-1.5F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		outer_left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		outer_right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		feet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_wing.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
		this.left_wing.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.outer_left_wing.zRot = (Mth.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.outer_right_wing.zRot = (Mth.sin(ageInTicks * 0.6F) * 0.6F);
	}
}