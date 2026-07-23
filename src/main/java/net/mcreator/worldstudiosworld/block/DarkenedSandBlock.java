package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class DarkenedSandBlock extends FallingBlock {
	public static final MapCodec<DarkenedSandBlock> CODEC = simpleCodec(DarkenedSandBlock::new);

	@Override
	public MapCodec<DarkenedSandBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public DarkenedSandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(0.5f).instrument(NoteBlockInstrument.SNARE));
	}
}