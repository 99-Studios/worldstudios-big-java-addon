package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.LongZombieEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modeltallzombie;

public class LongZombieRenderer extends MobRenderer<LongZombieEntity, LivingEntityRenderState, Modeltallzombie> {
	private LongZombieEntity entity = null;

	public LongZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltallzombie(context.bakeLayer(Modeltallzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LongZombieEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/tallzombie.png");
	}
}