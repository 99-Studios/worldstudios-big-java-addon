package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluids;

public class DirtyWaterBlock extends LiquidBlock {
	public DirtyWaterBlock(BlockBehaviour.Properties properties) {
		super(WorldstudiosWorldModFluids.DIRTY_WATER.get(), properties.mapColor(MapColor.COLOR_CYAN).strength(100f).noCollision().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}