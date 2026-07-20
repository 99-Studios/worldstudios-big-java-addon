package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.SugarEntityEntity;
import net.mcreator.worldstudiosworld.client.model.Modelsugar;

public class SugarEntityRenderer extends MobRenderer<SugarEntityEntity, LivingEntityRenderState, Modelsugar> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/zombie_2.png");

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
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}