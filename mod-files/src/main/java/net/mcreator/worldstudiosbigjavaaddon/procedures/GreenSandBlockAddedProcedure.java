package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class GreenSandBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BigAddonMod.queueServerWork(50, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}