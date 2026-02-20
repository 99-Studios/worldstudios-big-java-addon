package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.FairyEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelfairy;

public class FairyRenderer extends MobRenderer<FairyEntity, LivingEntityRenderState, Modelfairy> {
	private FairyEntity entity = null;

	public FairyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfairy(context.bakeLayer(Modelfairy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FairyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/allay.png");
	}
}