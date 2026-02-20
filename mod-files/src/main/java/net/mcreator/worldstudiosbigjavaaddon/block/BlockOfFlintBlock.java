package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class BlockOfFlintBlock extends FallingBlock {
	public static final MapCodec<BlockOfFlintBlock> CODEC = simpleCodec(BlockOfFlintBlock::new);

	@Override
	public MapCodec<BlockOfFlintBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public BlockOfFlintBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_BLACK).sound(SoundType.GRAVEL).strength(0.54f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}