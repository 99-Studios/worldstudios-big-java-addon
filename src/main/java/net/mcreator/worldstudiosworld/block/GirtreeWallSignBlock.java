package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModWoodTypes;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class GirtreeWallSignBlock extends WallSignBlock {
	public GirtreeWallSignBlock(BlockBehaviour.Properties properties) {
		super(WorldstudiosWorldModWoodTypes.GIRTREE_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1.5f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn()
				.overrideLootTable(WorldstudiosWorldModBlocks.GIRTREE_SIGN.get().getLootTable()).overrideDescription(WorldstudiosWorldModBlocks.GIRTREE_SIGN.get().getDescriptionId()));
	}
}