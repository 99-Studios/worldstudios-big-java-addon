/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

@EventBusSubscriber
public class WorldstudiosWorldModDispenseBehaviors {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DispenserBlock.registerBehavior(WorldstudiosWorldModItems.STEEL_BOAT.get(), new BoatDispenseItemBehavior(WorldstudiosWorldModEntities.STEEL_BOAT.get()));
			DispenserBlock.registerBehavior(WorldstudiosWorldModItems.SOULDUST_CHEST_BOAT.get(), new BoatDispenseItemBehavior(WorldstudiosWorldModEntities.SOULDUST_CHEST_BOAT.get()));
			DispenserBlock.registerBehavior(WorldstudiosWorldModItems.SOULDUST_BOAT.get(), new BoatDispenseItemBehavior(WorldstudiosWorldModEntities.SOULDUST_BOAT.get()));
		});
	}
}