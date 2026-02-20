package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WasteLogBlock extends Block {
	public WasteLogBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).speedFactor(0.85f).ignitedByLava().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}