package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WasteLeavesBlock extends Block {
	public WasteLeavesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRASS).strength(1f, 10f).speedFactor(0.85f).ignitedByLava());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}