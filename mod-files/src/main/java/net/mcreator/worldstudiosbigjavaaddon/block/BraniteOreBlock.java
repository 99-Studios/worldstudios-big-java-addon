package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.util.ARGB;
import net.minecraft.core.BlockPos;

public class BraniteOreBlock extends Block {
	public BraniteOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public Integer getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return ARGB.opaque(-10066432);
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}