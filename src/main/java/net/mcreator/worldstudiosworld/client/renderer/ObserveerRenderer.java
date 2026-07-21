package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.ObserveerEntity;
import net.mcreator.worldstudiosworld.client.model.Modelobserveer;

public class ObserveerRenderer extends MobRenderer<ObserveerEntity, LivingEntityRenderState, Modelobserveer> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/copper_golem.png");

	public ObserveerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobserveer(context.bakeLayer(Modelobserveer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ObserveerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}