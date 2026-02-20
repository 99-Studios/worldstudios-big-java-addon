package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.TitanEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modeltitan;

public class TitanRenderer extends MobRenderer<TitanEntity, LivingEntityRenderState, Modeltitan> {
	private TitanEntity entity = null;

	public TitanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltitan(context.bakeLayer(Modeltitan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TitanEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/giant_3.png");
	}
}