package net.mcreator.worldstudiosworld.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class AndorLeavesBlock extends UntintedParticleLeavesBlock {
	public AndorLeavesBlock(BlockBehaviour.Properties properties) {
		super(0f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -3618668), properties.sound(SoundType.GRASS).strength(0.5f).noOcclusion().ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 75;
	}
}