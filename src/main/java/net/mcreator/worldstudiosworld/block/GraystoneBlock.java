package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class GraystoneBlock extends Block {
	public GraystoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.ANVIL).strength(5f, 10f).requiresCorrectToolForDrops());
	}
}