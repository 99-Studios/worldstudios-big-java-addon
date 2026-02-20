package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.MasterOfTheDarkArtsEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelmasterofthedarkarts;

public class MasterOfTheDarkArtsRenderer extends MobRenderer<MasterOfTheDarkArtsEntity, LivingEntityRenderState, Modelmasterofthedarkarts> {
	private MasterOfTheDarkArtsEntity entity = null;

	public MasterOfTheDarkArtsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmasterofthedarkarts(context.bakeLayer(Modelmasterofthedarkarts.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MasterOfTheDarkArtsEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/masterofthedarkarts.png");
	}
}