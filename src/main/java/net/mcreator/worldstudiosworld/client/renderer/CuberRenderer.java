package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.CuberEntity;
import net.mcreator.worldstudiosworld.client.model.Modelcuber;

public class CuberRenderer extends MobRenderer<CuberEntity, LivingEntityRenderState, Modelcuber> {
	private CuberEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("worldstudios_world:textures/entities/cuber.png");

	public CuberRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcuber(context.bakeLayer(Modelcuber.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CuberEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}