package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.RadiantZombieEntity;
import net.mcreator.worldstudiosworld.client.model.Modelradiatedzombie;

public class RadiantZombieRenderer extends MobRenderer<RadiantZombieEntity, LivingEntityRenderState, Modelradiatedzombie> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/radiantzombie.png");

	public RadiantZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelradiatedzombie(context.bakeLayer(Modelradiatedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RadiantZombieEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}