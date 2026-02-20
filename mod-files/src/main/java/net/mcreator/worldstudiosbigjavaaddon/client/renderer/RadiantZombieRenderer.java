package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.RadiantZombieEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelradiatedzombie;

public class RadiantZombieRenderer extends MobRenderer<RadiantZombieEntity, LivingEntityRenderState, Modelradiatedzombie> {
	private RadiantZombieEntity entity = null;

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
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/radiantzombie.png");
	}
}