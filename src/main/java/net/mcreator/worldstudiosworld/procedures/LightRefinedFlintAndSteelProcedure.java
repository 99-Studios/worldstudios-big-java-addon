package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class LightRefinedFlintAndSteelProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y + 1, z), WorldstudiosWorldModBlocks.REBOUNDED_FIRE.get().defaultBlockState(), 3);
		}
	}
}