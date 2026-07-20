package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.BullEntity;
import net.mcreator.worldstudiosworld.client.model.Modelbull;

public class BullRenderer extends MobRenderer<BullEntity, LivingEntityRenderState, Modelbull> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/cow_1.png");

	public BullRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbull(context.bakeLayer(Modelbull.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BullEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}