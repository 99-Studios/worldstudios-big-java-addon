package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.ThiefEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelthieve;

public class ThiefRenderer extends MobRenderer<ThiefEntity, LivingEntityRenderState, Modelthieve> {
	private ThiefEntity entity = null;

	public ThiefRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthieve(context.bakeLayer(Modelthieve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ThiefEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/villager.png");
	}
}