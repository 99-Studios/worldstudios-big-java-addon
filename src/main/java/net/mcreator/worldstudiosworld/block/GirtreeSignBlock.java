package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModWoodTypes;

public class GirtreeSignBlock extends StandingSignBlock {
	public GirtreeSignBlock(BlockBehaviour.Properties properties) {
		super(WorldstudiosWorldModWoodTypes.GIRTREE_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1.5f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}