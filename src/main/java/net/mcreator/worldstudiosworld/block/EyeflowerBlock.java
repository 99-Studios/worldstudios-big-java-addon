package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class EyeflowerBlock extends FlowerBlock {
	public EyeflowerBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.STRENGTH, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.GRASS).strength(20f, 20f).noCollision().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(WorldstudiosWorldModBlocks.BREAKABLE_BEDROCK.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}