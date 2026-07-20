package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.CuberEntity;
import net.mcreator.worldstudiosworld.client.model.Modelcuber;

public class CuberRenderer extends MobRenderer<CuberEntity, LivingEntityRenderState, Modelcuber> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/cuber.png");

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
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}