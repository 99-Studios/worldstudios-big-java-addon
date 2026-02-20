package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.YetiEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelyeti;

public class YetiRenderer extends MobRenderer<YetiEntity, LivingEntityRenderState, Modelyeti> {
	private YetiEntity entity = null;

	public YetiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelyeti(context.bakeLayer(Modelyeti.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(YetiEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/polar_bear.png");
	}
}