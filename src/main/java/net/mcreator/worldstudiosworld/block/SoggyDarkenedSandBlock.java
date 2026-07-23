package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SoggyDarkenedSandBlock extends Block {
	public SoggyDarkenedSandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WET_GRASS).strength(1f, 0.5f));
	}
}