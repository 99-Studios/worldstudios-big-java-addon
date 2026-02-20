package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ForgiumOreBlock extends Block {
	public ForgiumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_BROWN).strength(12f, 10f).instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}