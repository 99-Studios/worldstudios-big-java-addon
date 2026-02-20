package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.DarkBatEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modeldarkbat;

public class DarkBatRenderer extends MobRenderer<DarkBatEntity, LivingEntityRenderState, Modeldarkbat> {
	private DarkBatEntity entity = null;

	public DarkBatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldarkbat(context.bakeLayer(Modeldarkbat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DarkBatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/dark_bat.png");
	}
}