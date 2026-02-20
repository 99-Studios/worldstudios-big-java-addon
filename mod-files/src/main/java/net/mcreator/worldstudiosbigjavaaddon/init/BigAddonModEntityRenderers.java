/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.worldstudiosbigjavaaddon.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class BigAddonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BigAddonModEntities.DINAMITE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.LONG_ZOMBIE.get(), LongZombieRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.TITAN.get(), TitanRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.FAIRY.get(), FairyRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.PROD.get(), ProdRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.PROD_MISSLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.SUGAR_ENTITY.get(), SugarEntityRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.BIRD_BRAIN.get(), BirdBrainRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.DARK_BAT.get(), DarkBatRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.THIEF.get(), ThiefRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.RADIANT_ZOMBIE.get(), RadiantZombieRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.YETI.get(), YetiRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.ICE_DRAGON.get(), IceDragonRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.ICE_DRAGON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.MASTER_OF_THE_DARK_ARTS.get(), MasterOfTheDarkArtsRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.DARK_PHANTOM.get(), DarkPhantomRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.DARK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.WALKING_CHEST.get(), WalkingChestRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.BULL.get(), BullRenderer::new);
		event.registerEntityRenderer(BigAddonModEntities.CUBER.get(), CuberRenderer::new);
	}
}