package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.ProdEntity;
import net.mcreator.worldstudiosworld.client.model.ModelProd;

public class ProdRenderer extends MobRenderer<ProdEntity, LivingEntityRenderState, ModelProd> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/ghast.png");

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
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}