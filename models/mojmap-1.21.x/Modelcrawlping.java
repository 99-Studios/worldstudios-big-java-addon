// Made with Blockbench 5.1.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcrawlping<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crawlping"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelcrawlping(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -10.0F, -2.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 31)
						.addBox(-2.5F, -13.0F, -2.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(-5.5F, -13.0F, 1.0F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 12)
						.addBox(-2.5F, -13.0F, 1.0F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 2.0F, -6.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-2.5F, -7.0F, -3.0F, 6.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-2.5F, -14.0F, -3.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 9.0F, 1.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-1.0F, -3.0F, -1.5F, 3.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 55)
						.addBox(-3.0F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 34)
						.addBox(-1.0F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 8.0F, 0.5F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-3.5F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 46)
						.addBox(-5.5F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 34)
						.addBox(-3.5F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 6.5F, 0.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}