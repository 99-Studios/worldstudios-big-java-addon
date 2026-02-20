package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class IgnightiumOreBlock extends Block {
	public IgnightiumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(9f, 12.0411234264f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}