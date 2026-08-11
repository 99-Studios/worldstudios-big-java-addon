package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CheapPointBlock extends Block {
	public CheapPointBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.SNOW).sound(SoundType.SNOW).strength(0f, 20f).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true).instrument(NoteBlockInstrument.DRAGON));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 15;
	}
}