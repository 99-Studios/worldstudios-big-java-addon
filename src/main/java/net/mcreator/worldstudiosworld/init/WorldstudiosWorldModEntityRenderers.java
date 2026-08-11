/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.entity.BoatRenderer;

import net.mcreator.worldstudiosworld.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class WorldstudiosWorldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WorldstudiosWorldModEntities.DINAMITE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.LONG_ZOMBIE.get(), LongZombieRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.TITAN.get(), TitanRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.FAIRY.get(), FairyRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.PROD.get(), ProdRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.PROD_MISSLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.SUGAR_ENTITY.get(), SugarEntityRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.BIRD_BRAIN.get(), BirdBrainRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.DARK_BAT.get(), DarkBatRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.THIEF.get(), ThiefRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.RADIANT_ZOMBIE.get(), RadiantZombieRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.YETI.get(), YetiRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.ICE_DRAGON.get(), IceDragonRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.ICE_DRAGON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.MASTER_OF_THE_DARK_ARTS.get(), MasterOfTheDarkArtsRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.DARK_PHANTOM.get(), DarkPhantomRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.DARK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.WALKING_CHEST.get(), WalkingChestRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.BULL.get(), BullRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.CUBER.get(), CuberRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.STEEL_BOAT.get(), context -> new BoatRenderer(context, WorldstudiosWorldModModels.STEEL_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(WorldstudiosWorldModEntities.CRAWLPING.get(), CrawlpingRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.SAWPING.get(), SawpingRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.SOULDUST_BOAT.get(), context -> new BoatRenderer(context, WorldstudiosWorldModModels.SOULDUST_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(WorldstudiosWorldModEntities.SOULDUST_CHEST_BOAT.get(), context -> new BoatRenderer(context, WorldstudiosWorldModModels.SOULDUST_CHEST_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(WorldstudiosWorldModEntities.DIRT_BOAT.get(), context -> new BoatRenderer(context, WorldstudiosWorldModModels.DIRT_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(WorldstudiosWorldModEntities.OBSERVEER.get(), ObserveerRenderer::new);
		event.registerEntityRenderer(WorldstudiosWorldModEntities.GIRTREE_BOAT.get(), context -> new BoatRenderer(context, WorldstudiosWorldModModels.GIRTREE_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(WorldstudiosWorldModEntities.GIRTREE_CHEST_BOAT.get(), context -> new BoatRenderer(context, WorldstudiosWorldModModels.GIRTREE_CHEST_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(WorldstudiosWorldModEntities.WANDERER.get(), WandererRenderer::new);
	}
}