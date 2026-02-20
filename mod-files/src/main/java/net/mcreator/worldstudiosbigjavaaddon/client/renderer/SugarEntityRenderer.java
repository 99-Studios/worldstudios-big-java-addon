package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.SugarEntityEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelsugar;

public class SugarEntityRenderer extends MobRenderer<SugarEntityEntity, LivingEntityRenderState, Modelsugar> {
	private SugarEntityEntity entity = null;

	public SugarEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsugar(context.bakeLayer(Modelsugar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SugarEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/zombie_2.png");
	}
}