package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModWoodTypes;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public class SouldustWallHangingSignBlock extends WallHangingSignBlock {
	public SouldustWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(WorldstudiosWorldModWoodTypes.SOULDUST_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(1f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn()
				.overrideLootTable(WorldstudiosWorldModBlocks.SOULDUST_HANGING_SIGN.get().getLootTable()).overrideDescription(WorldstudiosWorldModBlocks.SOULDUST_HANGING_SIGN.get().getDescriptionId()));
	}
}