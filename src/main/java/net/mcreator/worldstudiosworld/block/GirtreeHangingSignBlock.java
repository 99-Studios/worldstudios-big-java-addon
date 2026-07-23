package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModWoodTypes;

public class GirtreeHangingSignBlock extends CeilingHangingSignBlock {
	public GirtreeHangingSignBlock(BlockBehaviour.Properties properties) {
		super(WorldstudiosWorldModWoodTypes.GIRTREE_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1.5f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}