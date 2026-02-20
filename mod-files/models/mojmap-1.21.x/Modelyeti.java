// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelyeti<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "yeti"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart leftarm;
	private final ModelPart rightarm;

	public Modelyeti(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -9.0F, 2.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
						.addBox(-4.0F, -12.0F, 4.0F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.0F, 12.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(50, 22)
				.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 14.0F, 6.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(50, 22)
				.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 14.0F, 6.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(3.5F, 14.0F, -8.0F));

		PartDefinition leg3_r1 = leftarm.addOrReplaceChild("leg3_r1",
				CubeListBuilder.create().texOffs(50, 40).addBox(-2.0F, -5.0F, -3.0F, 4.0F, 10.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0786F, -13.5318F, 14.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-3.5F, 14.0F, -8.0F));

		PartDefinition leg4_r1 = rightarm.addOrReplaceChild("leg4_r1",
				CubeListBuilder.create().texOffs(50, 40).addBox(-2.0F, -5.0F, -3.0F, 4.0F, 10.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0786F, -13.5318F, 16.0F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}