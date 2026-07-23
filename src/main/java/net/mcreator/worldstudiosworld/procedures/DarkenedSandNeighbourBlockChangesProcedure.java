package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class DarkenedSandNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() instanceof LiquidBlock || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() instanceof LiquidBlock
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() instanceof LiquidBlock || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() instanceof LiquidBlock
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof LiquidBlock) {
			world.setBlock(BlockPos.containing(x, y, z), WorldstudiosWorldModBlocks.SOGGY_DARKENED_SAND.get().defaultBlockState(), 3);
		}
	}
}