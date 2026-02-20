package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class GyruleOreBlock extends Block {
	public GyruleOreBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_GREEN).sound(SoundType.DEEPSLATE).strength(6f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}