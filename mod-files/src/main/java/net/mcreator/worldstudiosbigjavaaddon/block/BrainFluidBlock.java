package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModFluids;

public class BrainFluidBlock extends LiquidBlock {
	public BrainFluidBlock(BlockBehaviour.Properties properties) {
		super(BigAddonModFluids.BRAIN_FLUID.get(), properties.mapColor(MapColor.COLOR_PINK).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}