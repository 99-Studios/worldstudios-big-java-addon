package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class GreenSandBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WorldstudiosWorldMod.queueServerWork(50, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}