package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.IceDragonEntity;
import net.mcreator.worldstudiosworld.client.model.Modelicedragon;

public class IceDragonRenderer extends MobRenderer<IceDragonEntity, LivingEntityRenderState, Modelicedragon> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/icedragon.png");

	public IceDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelicedragon(context.bakeLayer(Modelicedragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(IceDragonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}