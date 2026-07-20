package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.FairyEntity;
import net.mcreator.worldstudiosworld.client.model.Modelfairy;

public class FairyRenderer extends MobRenderer<FairyEntity, LivingEntityRenderState, Modelfairy> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/allay.png");

	public FairyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfairy(context.bakeLayer(Modelfairy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FairyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}