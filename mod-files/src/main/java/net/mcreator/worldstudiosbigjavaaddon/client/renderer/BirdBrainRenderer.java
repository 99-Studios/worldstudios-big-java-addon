package net.mcreator.worldstudiosbigjavaaddon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosbigjavaaddon.entity.BirdBrainEntity;
import net.mcreator.worldstudiosbigjavaaddon.client.model.Modelbirdbrain;

import com.mojang.blaze3d.vertex.PoseStack;

public class BirdBrainRenderer extends MobRenderer<BirdBrainEntity, LivingEntityRenderState, Modelbirdbrain> {
	private BirdBrainEntity entity = null;

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
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("big_addon:textures/entities/parrot.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}