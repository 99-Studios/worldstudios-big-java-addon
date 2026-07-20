package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BlaziteOreBlock extends Block {
	public BlaziteOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(8.07f, 11.0349870628f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}