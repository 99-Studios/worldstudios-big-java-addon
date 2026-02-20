package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BrainBlock extends Block {
	public BrainBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SLIME_BLOCK).strength(1.5f, 10f).friction(1f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}