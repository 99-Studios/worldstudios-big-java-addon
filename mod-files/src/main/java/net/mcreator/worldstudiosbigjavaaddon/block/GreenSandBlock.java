package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.procedures.GreenSandOnTickUpdateProcedure;
import net.mcreator.worldstudiosbigjavaaddon.procedures.GreenSandBlockAddedProcedure;

import com.mojang.serialization.MapCodec;

public class GreenSandBlock extends FallingBlock {
	public static final BooleanProperty FALLING = BlockStateProperties.FALLING;
	public static final MapCodec<GreenSandBlock> CODEC = simpleCodec(GreenSandBlock::new);

	@Override
	public MapCodec<GreenSandBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public GreenSandBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.EMERALD).sound(SoundType.SAND).strength(1f, 0.5f));
		this.registerDefaultState(this.stateDefinition.any().setValue(FALLING, true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FALLING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FALLING, true);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		GreenSandBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		GreenSandOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}