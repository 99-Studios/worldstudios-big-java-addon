/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber
public class WorldstudiosWorldModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> ENDER_HELMET_TELEPORT;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		ENDER_HELMET_TELEPORT = GameRules.register("enderHelmetTeleport", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	}
}