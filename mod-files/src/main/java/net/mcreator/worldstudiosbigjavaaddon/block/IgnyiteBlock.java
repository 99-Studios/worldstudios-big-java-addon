package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.procedures.IgnyiteOnTickUpdateProcedure;

public class IgnyiteBlock extends Block {
	public IgnyiteBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.GRASS).strength(0.45f, 10f).speedFactor(0.95f).ignitedByLava());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		IgnyiteOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}