package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModWoodTypes;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class SouldustWallSignBlock extends WallSignBlock {
	public SouldustWallSignBlock(BlockBehaviour.Properties properties) {
		super(WorldstudiosWorldModWoodTypes.SOULDUST_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(1f).noCollision().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn()
				.overrideLootTable(WorldstudiosWorldModBlocks.SOULDUST_SIGN.get().getLootTable()).overrideDescription(WorldstudiosWorldModBlocks.SOULDUST_SIGN.get().getDescriptionId()));
	}
}