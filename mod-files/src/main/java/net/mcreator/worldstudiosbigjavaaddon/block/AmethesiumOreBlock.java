package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.util.ARGB;
import net.minecraft.core.BlockPos;

public class AmethesiumOreBlock extends Block {
	public AmethesiumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.AMETHYST).strength(5.75f, 6.75f).requiresCorrectToolForDrops());
	}

	@Override
	public Integer getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return ARGB.opaque(-8823883);
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}