package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

public class DarkPhantomNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean IsInsomnia = false;
		IsInsomnia = world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().get(GameRules.SPAWN_PHANTOMS);
		return IsInsomnia;
	}
}