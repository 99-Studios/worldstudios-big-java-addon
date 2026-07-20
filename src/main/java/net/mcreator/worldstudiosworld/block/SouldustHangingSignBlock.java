package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModWoodTypes;

public class SouldustHangingSignBlock extends CeilingHangingSignBlock {
	public SouldustHangingSignBlock(BlockBehaviour.Properties properties) {
		super(WorldstudiosWorldModWoodTypes.SOULDUST_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}