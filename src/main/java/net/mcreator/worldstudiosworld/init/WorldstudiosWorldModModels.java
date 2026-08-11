/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;

import net.mcreator.worldstudiosworld.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class WorldstudiosWorldModModels {
	public static final ModelLayerLocation STEEL_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("worldstudios_world:boat/steel_boat"), "main");
	public static final ModelLayerLocation SOULDUST_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("worldstudios_world:boat/souldust_boat"), "main");
	public static final ModelLayerLocation SOULDUST_CHEST_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("worldstudios_world:chest_boat/souldust_chest_boat"), "main");
	public static final ModelLayerLocation DIRT_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("worldstudios_world:boat/dirt_boat"), "main");
	public static final ModelLayerLocation GIRTREE_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("worldstudios_world:boat/girtree_boat"), "main");
	public static final ModelLayerLocation GIRTREE_CHEST_BOAT_LAYER_LOCATION = new ModelLayerLocation(Identifier.parse("worldstudios_world:chest_boat/girtree_chest_boat"), "main");

	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltitan.LAYER_LOCATION, Modeltitan::createBodyLayer);
		event.registerLayerDefinition(Modelradiatedzombie.LAYER_LOCATION, Modelradiatedzombie::createBodyLayer);
		event.registerLayerDefinition(Modelmasterofthedarkarts.LAYER_LOCATION, Modelmasterofthedarkarts::createBodyLayer);
		event.registerLayerDefinition(Modelsawping.LAYER_LOCATION, Modelsawping::createBodyLayer);
		event.registerLayerDefinition(Modelobserveer.LAYER_LOCATION, Modelobserveer::createBodyLayer);
		event.registerLayerDefinition(Modelwalking_pig.LAYER_LOCATION, Modelwalking_pig::createBodyLayer);
		event.registerLayerDefinition(Modelyeti.LAYER_LOCATION, Modelyeti::createBodyLayer);
		event.registerLayerDefinition(Modelbirdbrain.LAYER_LOCATION, Modelbirdbrain::createBodyLayer);
		event.registerLayerDefinition(Modelbull.LAYER_LOCATION, Modelbull::createBodyLayer);
		event.registerLayerDefinition(Modelthieve.LAYER_LOCATION, Modelthieve::createBodyLayer);
		event.registerLayerDefinition(Modelcrawlping.LAYER_LOCATION, Modelcrawlping::createBodyLayer);
		event.registerLayerDefinition(Modelicedragon.LAYER_LOCATION, Modelicedragon::createBodyLayer);
		event.registerLayerDefinition(ModelJumper.LAYER_LOCATION, ModelJumper::createBodyLayer);
		event.registerLayerDefinition(Modelwalkingchest.LAYER_LOCATION, Modelwalkingchest::createBodyLayer);
		event.registerLayerDefinition(Modeltallzombie.LAYER_LOCATION, Modeltallzombie::createBodyLayer);
		event.registerLayerDefinition(Modeldarkbat.LAYER_LOCATION, Modeldarkbat::createBodyLayer);
		event.registerLayerDefinition(Modeldarksoul.LAYER_LOCATION, Modeldarksoul::createBodyLayer);
		event.registerLayerDefinition(ModelProd.LAYER_LOCATION, ModelProd::createBodyLayer);
		event.registerLayerDefinition(Modelcuber.LAYER_LOCATION, Modelcuber::createBodyLayer);
		event.registerLayerDefinition(Modeldarkphantom.LAYER_LOCATION, Modeldarkphantom::createBodyLayer);
		event.registerLayerDefinition(Modelfairy.LAYER_LOCATION, Modelfairy::createBodyLayer);
		event.registerLayerDefinition(Modelsugar.LAYER_LOCATION, Modelsugar::createBodyLayer);
		event.registerLayerDefinition(ModelNethering_Trader.LAYER_LOCATION, ModelNethering_Trader::createBodyLayer);
		event.registerLayerDefinition(Modelwanderer.LAYER_LOCATION, Modelwanderer::createBodyLayer);
		event.registerLayerDefinition(STEEL_BOAT_LAYER_LOCATION, BoatModel::createBoatModel);
		event.registerLayerDefinition(SOULDUST_BOAT_LAYER_LOCATION, BoatModel::createBoatModel);
		event.registerLayerDefinition(SOULDUST_CHEST_BOAT_LAYER_LOCATION, BoatModel::createChestBoatModel);
		event.registerLayerDefinition(DIRT_BOAT_LAYER_LOCATION, BoatModel::createBoatModel);
		event.registerLayerDefinition(GIRTREE_BOAT_LAYER_LOCATION, BoatModel::createBoatModel);
		event.registerLayerDefinition(GIRTREE_CHEST_BOAT_LAYER_LOCATION, BoatModel::createChestBoatModel);
	}
}