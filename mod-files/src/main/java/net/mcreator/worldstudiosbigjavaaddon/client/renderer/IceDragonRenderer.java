package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.IceDragonEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelicedragon;

public class IceDragonRenderer extends MobRenderer<IceDragonEntity, LivingEntityRenderState, Modelicedragon> {
	private IceDragonEntity entity = null;

	public IceDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelicedragon(context.bakeLayer(Modelicedragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(IceDragonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/icedragon.png");
	}
}