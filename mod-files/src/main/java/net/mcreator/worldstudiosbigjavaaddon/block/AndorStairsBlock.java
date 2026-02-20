package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class AndorStairsBlock extends StairBlock {
	public AndorStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.WOOD).strength(7.5f, 5f).ignitedByLava().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public float getExplosionResistance() {
		return 5f;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 13;
	}
}