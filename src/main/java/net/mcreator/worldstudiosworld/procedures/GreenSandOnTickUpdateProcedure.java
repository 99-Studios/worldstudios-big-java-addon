package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModParticleTypes;

public class GreenSandOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (WorldstudiosWorldModParticleTypes.RADIATION_PARTICLES.get()), x, y, z, 5, 3, 3, 3, 1);
	}
}