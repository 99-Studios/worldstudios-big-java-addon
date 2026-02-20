package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModBlocks;

public class LightRefinedFlintAndSteelProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y + 1, z), BigAddonModBlocks.REBOUNDED_FIRE.get().defaultBlockState(), 3);
		}
	}
}