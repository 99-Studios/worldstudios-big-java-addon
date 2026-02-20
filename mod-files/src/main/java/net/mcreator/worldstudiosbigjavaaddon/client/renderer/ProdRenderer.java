package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.ProdEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.ModelProd;

public class ProdRenderer extends MobRenderer<ProdEntity, LivingEntityRenderState, ModelProd> {
	private ProdEntity entity = null;

	public ProdRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelProd(context.bakeLayer(ModelProd.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ProdEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/ghast.png");
	}
}