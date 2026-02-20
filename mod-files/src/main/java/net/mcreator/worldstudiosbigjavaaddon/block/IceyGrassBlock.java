package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModMobEffects;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModBlocks;

public class IceyGrassBlock extends FlowerBlock {
	public IceyGrassBlock(BlockBehaviour.Properties properties) {
		super(BigAddonModMobEffects.ICING, 100, properties.mapColor(MapColor.ICE).sound(SoundType.GRASS).instabreak().noCollission().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(BigAddonModBlocks.FROZEN_GRAVITE.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}