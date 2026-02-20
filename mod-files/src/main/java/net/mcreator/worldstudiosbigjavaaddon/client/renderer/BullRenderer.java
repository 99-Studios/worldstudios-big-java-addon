package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.BullEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelbull;

public class BullRenderer extends MobRenderer<BullEntity, LivingEntityRenderState, Modelbull> {
	private BullEntity entity = null;

	public BullRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbull(context.bakeLayer(Modelbull.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BullEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/cow_1.png");
	}
}