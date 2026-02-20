/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.worldstudiosbigjavaaddon.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class BigAddonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelJumper.LAYER_LOCATION, ModelJumper::createBodyLayer);
		event.registerLayerDefinition(Modelwalkingchest.LAYER_LOCATION, Modelwalkingchest::createBodyLayer);
		event.registerLayerDefinition(Modeltitan.LAYER_LOCATION, Modeltitan::createBodyLayer);
		event.registerLayerDefinition(Modeltallzombie.LAYER_LOCATION, Modeltallzombie::createBodyLayer);
		event.registerLayerDefinition(Modelradiatedzombie.LAYER_LOCATION, Modelradiatedzombie::createBodyLayer);
		event.registerLayerDefinition(Modelmasterofthedarkarts.LAYER_LOCATION, Modelmasterofthedarkarts::createBodyLayer);
		event.registerLayerDefinition(Modeldarkbat.LAYER_LOCATION, Modeldarkbat::createBodyLayer);
		event.registerLayerDefinition(Modeldarksoul.LAYER_LOCATION, Modeldarksoul::createBodyLayer);
		event.registerLayerDefinition(Modelyeti.LAYER_LOCATION, Modelyeti::createBodyLayer);
		event.registerLayerDefinition(Modelwalking_pig.LAYER_LOCATION, Modelwalking_pig::createBodyLayer);
		event.registerLayerDefinition(Modelbirdbrain.LAYER_LOCATION, Modelbirdbrain::createBodyLayer);
		event.registerLayerDefinition(ModelProd.LAYER_LOCATION, ModelProd::createBodyLayer);
		event.registerLayerDefinition(Modelcuber.LAYER_LOCATION, Modelcuber::createBodyLayer);
		event.registerLayerDefinition(Modeldarkphantom.LAYER_LOCATION, Modeldarkphantom::createBodyLayer);
		event.registerLayerDefinition(Modelbull.LAYER_LOCATION, Modelbull::createBodyLayer);
		event.registerLayerDefinition(Modelthieve.LAYER_LOCATION, Modelthieve::createBodyLayer);
		event.registerLayerDefinition(Modelfairy.LAYER_LOCATION, Modelfairy::createBodyLayer);
		event.registerLayerDefinition(Modelsugar.LAYER_LOCATION, Modelsugar::createBodyLayer);
		event.registerLayerDefinition(ModelNethering_Trader.LAYER_LOCATION, ModelNethering_Trader::createBodyLayer);
		event.registerLayerDefinition(Modelicedragon.LAYER_LOCATION, Modelicedragon::createBodyLayer);
	}
}