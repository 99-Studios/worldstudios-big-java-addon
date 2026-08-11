package net.mcreator.worldstudiosworld.block;

import net.neoforged.neoforge.common.CommonHooks;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class TallmossBlock extends SugarCaneBlock {
	public TallmossBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_GREEN).randomTicks().sound(SoundType.GRASS).instabreak().noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public PathType getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return PathType.BLOCKED;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return groundState.is(this) || groundState.is(WorldstudiosWorldModBlocks.TRAVERTINE.get());
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		if (world.isEmptyBlock(pos.above())) {
			int i = 1;
			for (; world.getBlockState(pos.below(i)).is(this); ++i);
			if (i < 14) {
				int j = blockstate.getValue(AGE);
				if (CommonHooks.canCropGrow(world, pos, blockstate, true)) {
					if (j == 15) {
						world.setBlockAndUpdate(pos.above(), defaultBlockState());
						CommonHooks.fireCropGrowPost(world, pos.above(), defaultBlockState());
						world.setBlock(pos, blockstate.setValue(AGE, 0), 4);
					} else {
						world.setBlock(pos, blockstate.setValue(AGE, j + 1), 4);
					}
				}
			}
		}
	}
}