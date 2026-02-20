// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelicedragon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "icedragon"), "main");
	private final ModelPart head;
	private final ModelPart mirrored;
	private final ModelPart jaw;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart body;
	private final ModelPart left_wing;
	private final ModelPart left_wing_tip;
	private final ModelPart right_wing;
	private final ModelPart right_wing_tip;
	private final ModelPart front_left_leg;
	private final ModelPart front_left_shin;
	private final ModelPart front_left_foot;
	private final ModelPart front_right_leg;
	private final ModelPart front_right_shin;
	private final ModelPart front_right_foot;
	private final ModelPart back_left_leg;
	private final ModelPart back_left_shin;
	private final ModelPart back_left_foot;
	private final ModelPart back_right_leg;
	private final ModelPart back_right_shin;
	private final ModelPart back_right_foot;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;

	public Modelicedragon(ModelPart root) {
		this.head = root.getChild("head");
		this.mirrored = this.head.getChild("mirrored");
		this.jaw = root.getChild("jaw");
		this.neck1 = root.getChild("neck1");
		this.neck2 = root.getChild("neck2");
		this.neck3 = root.getChild("neck3");
		this.neck4 = root.getChild("neck4");
		this.neck5 = root.getChild("neck5");
		this.body = root.getChild("body");
		this.left_wing = root.getChild("left_wing");
		this.left_wing_tip = root.getChild("left_wing_tip");
		this.right_wing = root.getChild("right_wing");
		this.right_wing_tip = root.getChild("right_wing_tip");
		this.front_left_leg = root.getChild("front_left_leg");
		this.front_left_shin = root.getChild("front_left_shin");
		this.front_left_foot = root.getChild("front_left_foot");
		this.front_right_leg = root.getChild("front_right_leg");
		this.front_right_shin = root.getChild("front_right_shin");
		this.front_right_foot = root.getChild("front_right_foot");
		this.back_left_leg = root.getChild("back_left_leg");
		this.back_left_shin = root.getChild("back_left_shin");
		this.back_left_foot = root.getChild("back_left_foot");
		this.back_right_leg = root.getChild("back_right_leg");
		this.back_right_shin = root.getChild("back_right_shin");
		this.back_right_foot = root.getChild("back_right_foot");
		this.tail1 = root.getChild("tail1");
		this.tail2 = root.getChild("tail2");
		this.tail3 = root.getChild("tail3");
		this.tail4 = root.getChild("tail4");
		this.tail5 = root.getChild("tail5");
		this.tail6 = root.getChild("tail6");
		this.tail7 = root.getChild("tail7");
		this.tail8 = root.getChild("tail8");
		this.tail9 = root.getChild("tail9");
		this.tail10 = root.getChild("tail10");
		this.tail11 = root.getChild("tail11");
		this.tail12 = root.getChild("tail12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(176, 44)
						.addBox(-6.0F, -1.0F, -24.0F, 12.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(112, 30)
						.addBox(-8.0F, -8.0F, -10.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -12.0F, -4.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(112, 0)
						.addBox(3.0F, -3.0F, -22.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -38.0F, -86.0F));

		PartDefinition mirrored = head.addOrReplaceChild("mirrored",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-5.0F, -18.0F, -28.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(112, 0).mirror()
						.addBox(-5.0F, -9.0F, -46.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 6.0F, 24.0F));

		PartDefinition jaw = partdefinition.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(176, 65)
				.addBox(-6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -34.0F, -94.0F));

		PartDefinition neck1 = partdefinition.addOrReplaceChild("neck1",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -37.0F, -36.0F));

		PartDefinition neck2 = partdefinition.addOrReplaceChild("neck2",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -37.0F, -46.0F));

		PartDefinition neck3 = partdefinition.addOrReplaceChild("neck3",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -37.0F, -56.0F));

		PartDefinition neck4 = partdefinition.addOrReplaceChild("neck4",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -37.0F, -66.0F));

		PartDefinition neck5 = partdefinition.addOrReplaceChild("neck5",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -37.0F, -76.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-12.0F, 0.0F, -16.0F, 24.0F, 24.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(220, 53)
						.addBox(-1.0F, -6.0F, -10.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(220, 53)
						.addBox(-1.0F, -6.0F, 10.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(220, 53)
						.addBox(-1.0F, -6.0F, 30.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -54.0F, -16.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing",
				CubeListBuilder.create().texOffs(112, 88).mirror()
						.addBox(0.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(-56, 88).mirror()
						.addBox(0.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(12.0F, -53.0F, -22.0F));

		PartDefinition left_wing_tip = partdefinition.addOrReplaceChild("left_wing_tip",
				CubeListBuilder.create().texOffs(112, 136).mirror()
						.addBox(0.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(-56, 144).mirror()
						.addBox(0.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(68.0F, -53.0F, -22.0F));

		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing",
				CubeListBuilder.create().texOffs(-56, 88)
						.addBox(-56.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(112, 88)
						.addBox(-56.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, -53.0F, -22.0F));

		PartDefinition right_wing_tip = partdefinition.addOrReplaceChild("right_wing_tip",
				CubeListBuilder.create().texOffs(-56, 144)
						.addBox(-56.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(112, 136)
						.addBox(-56.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-68.0F, -53.0F, -22.0F));

		PartDefinition front_left_leg = partdefinition.addOrReplaceChild("front_left_leg", CubeListBuilder.create()
				.texOffs(112, 104).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -38.0F, -22.0F));

		PartDefinition front_left_shin = partdefinition.addOrReplaceChild("front_left_shin", CubeListBuilder.create()
				.texOffs(226, 138).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -17.0F, -22.0F));

		PartDefinition front_left_foot = partdefinition.addOrReplaceChild("front_left_foot", CubeListBuilder.create()
				.texOffs(144, 104).addBox(-3.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.0F, 6.0F, -22.0F));

		PartDefinition front_right_leg = partdefinition.addOrReplaceChild("front_right_leg", CubeListBuilder.create()
				.texOffs(112, 104).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, -38.0F, -22.0F));

		PartDefinition front_right_shin = partdefinition.addOrReplaceChild("front_right_shin", CubeListBuilder.create()
				.texOffs(226, 138).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, -17.0F, -22.0F));

		PartDefinition front_right_foot = partdefinition.addOrReplaceChild("front_right_foot", CubeListBuilder.create()
				.texOffs(144, 104).addBox(-4.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, 6.0F, -22.0F));

		PartDefinition back_left_leg = partdefinition.addOrReplaceChild("back_left_leg", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-8.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(16.0F, -42.0F, 18.0F));

		PartDefinition back_left_shin = partdefinition.addOrReplaceChild("back_left_shin", CubeListBuilder.create()
				.texOffs(196, 0).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(16.0F, -12.0F, 12.0F));

		PartDefinition back_left_foot = partdefinition.addOrReplaceChild("back_left_foot", CubeListBuilder.create()
				.texOffs(112, 0).addBox(-9.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(16.0F, 18.0F, 20.0F));

		PartDefinition back_right_leg = partdefinition.addOrReplaceChild("back_right_leg", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-8.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-16.0F, -42.0F, 18.0F));

		PartDefinition back_right_shin = partdefinition.addOrReplaceChild("back_right_shin", CubeListBuilder.create()
				.texOffs(196, 0).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-16.0F, -12.0F, 12.0F));

		PartDefinition back_right_foot = partdefinition.addOrReplaceChild("back_right_foot", CubeListBuilder.create()
				.texOffs(112, 0).addBox(-9.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-16.0F, 18.0F, 20.0F));

		PartDefinition tail1 = partdefinition.addOrReplaceChild("tail1",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 36.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail2 = partdefinition.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 46.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail3 = partdefinition.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 56.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail4 = partdefinition.addOrReplaceChild("tail4",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 66.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail5 = partdefinition.addOrReplaceChild("tail5",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 76.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail6 = partdefinition.addOrReplaceChild("tail6",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 86.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail7 = partdefinition.addOrReplaceChild("tail7",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 96.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail8 = partdefinition.addOrReplaceChild("tail8",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 106.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail9 = partdefinition.addOrReplaceChild("tail9",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 116.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail10 = partdefinition.addOrReplaceChild("tail10",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 126.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail11 = partdefinition.addOrReplaceChild("tail11",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 136.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tail12 = partdefinition.addOrReplaceChild("tail12",
				CubeListBuilder.create().texOffs(192, 104)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.0F, 146.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing_tip.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing_tip.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_shin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_left_foot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_shin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		front_right_foot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_shin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_left_foot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_shin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back_right_foot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_wing.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_wing_tip.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_wing.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_wing_tip.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}