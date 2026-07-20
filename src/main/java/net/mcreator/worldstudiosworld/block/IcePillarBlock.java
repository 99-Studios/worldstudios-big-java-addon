package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class IcePillarBlock extends Block {
	public IcePillarBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}