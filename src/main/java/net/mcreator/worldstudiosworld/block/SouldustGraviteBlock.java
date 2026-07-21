package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SouldustGraviteBlock extends Block {
	public SouldustGraviteBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.SOUL_SAND).strength(6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}