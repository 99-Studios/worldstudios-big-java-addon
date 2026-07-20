package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.WalkingChestEntity;
import net.mcreator.worldstudiosworld.client.model.Modelwalkingchest;

public class WalkingChestRenderer extends MobRenderer<WalkingChestEntity, LivingEntityRenderState, Modelwalkingchest> {
	private WalkingChestEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("worldstudios_world:textures/entities/chest.png");

	public WalkingChestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwalkingchest(context.bakeLayer(Modelwalkingchest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WalkingChestEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}