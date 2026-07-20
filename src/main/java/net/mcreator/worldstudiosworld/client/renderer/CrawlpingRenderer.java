package net.mcreator.worldstudiosworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.worldstudiosworld.entity.CrawlpingEntity;
import net.mcreator.worldstudiosworld.client.model.Modelcrawlping;

public class CrawlpingRenderer extends MobRenderer<CrawlpingEntity, LivingEntityRenderState, Modelcrawlping> {
	private final Identifier entityTexture = Identifier.parse("worldstudios_world:textures/entities/crawlping.png");

	public CrawlpingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrawlping(context.bakeLayer(Modelcrawlping.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrawlpingEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}