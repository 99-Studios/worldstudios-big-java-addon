package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BlockOfSparklesBlock extends Block {
	public BlockOfSparklesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST).strength(1f, 10f));
	}
}