package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.BirdBrainEntity;
import net.mcreator.worldstudiosworld.client.model.Modelbirdbrain;

import com.mojang.blaze3d.vertex.PoseStack;

public class BirdBrainRenderer extends MobRenderer<BirdBrainEntity, LivingEntityRenderState, Modelbirdbrain> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/parrot.png");

	public BirdBrainRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbirdbrain(context.bakeLayer(Modelbirdbrain.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BirdBrainEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(state.ageScale, state.ageScale, state.ageScale);
	}
}