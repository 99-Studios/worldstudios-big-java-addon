package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WasteStoneBlock extends Block {
	public WasteStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRASS).strength(1.5f, 10f).speedFactor(0.85f).instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}