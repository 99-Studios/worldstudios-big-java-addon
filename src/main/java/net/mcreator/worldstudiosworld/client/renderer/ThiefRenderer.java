package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.ThiefEntity;
import net.mcreator.worldstudiosworld.client.model.Modelthieve;

public class ThiefRenderer extends MobRenderer<ThiefEntity, LivingEntityRenderState, Modelthieve> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/villager.png");

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
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}