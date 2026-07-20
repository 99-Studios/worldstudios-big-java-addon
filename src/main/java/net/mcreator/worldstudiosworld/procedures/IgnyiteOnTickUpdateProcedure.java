package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class IgnyiteOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == WorldstudiosWorldModBlocks.REBOUNDED_FIRE.get() && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
		}
	}
}