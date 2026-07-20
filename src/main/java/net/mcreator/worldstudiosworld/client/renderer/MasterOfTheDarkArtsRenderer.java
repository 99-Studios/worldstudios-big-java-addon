package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.MasterOfTheDarkArtsEntity;
import net.mcreator.worldstudiosworld.client.model.Modelmasterofthedarkarts;

public class MasterOfTheDarkArtsRenderer extends MobRenderer<MasterOfTheDarkArtsEntity, LivingEntityRenderState, Modelmasterofthedarkarts> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/masterofthedarkarts.png");

	public MasterOfTheDarkArtsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmasterofthedarkarts(context.bakeLayer(Modelmasterofthedarkarts.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MasterOfTheDarkArtsEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}