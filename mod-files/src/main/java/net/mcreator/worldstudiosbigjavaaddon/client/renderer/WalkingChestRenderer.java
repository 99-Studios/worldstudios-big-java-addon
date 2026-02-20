package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.WalkingChestEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelwalkingchest;

public class WalkingChestRenderer extends MobRenderer<WalkingChestEntity, LivingEntityRenderState, Modelwalkingchest> {
	private WalkingChestEntity entity = null;

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
		return ResourceLocation.parse("big_addon:textures/entities/chest.png");
	}
}