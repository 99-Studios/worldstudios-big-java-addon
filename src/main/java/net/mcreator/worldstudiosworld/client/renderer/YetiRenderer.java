package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.YetiEntity;
import net.mcreator.worldstudiosworld.client.model.Modelyeti;

public class YetiRenderer extends MobRenderer<YetiEntity, LivingEntityRenderState, Modelyeti> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/polar_bear.png");

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
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}