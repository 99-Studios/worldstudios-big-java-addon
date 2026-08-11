package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModGameRules;

public class CuberNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean LetCuberSpawn = false;
		LetCuberSpawn = world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().get(WorldstudiosWorldModGameRules.CUBER_SPAWN.get());
		return LetCuberSpawn;
	}
}