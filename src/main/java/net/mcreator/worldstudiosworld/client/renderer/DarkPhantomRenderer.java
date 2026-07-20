package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.DarkPhantomEntity;
import net.mcreator.worldstudiosworld.client.model.Modeldarkphantom;

public class DarkPhantomRenderer extends MobRenderer<DarkPhantomEntity, LivingEntityRenderState, Modeldarkphantom> {
	private DarkPhantomEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("worldstudios_world:textures/entities/phantom.png");

	public DarkPhantomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldarkphantom(context.bakeLayer(Modeldarkphantom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DarkPhantomEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}