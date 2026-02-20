package net.mcreator.worldstudiosbigjavaaddon.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.procedures.AcidProcedureProcedure;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModFluids;

public class AcidFluidBlock extends LiquidBlock {
	public AcidFluidBlock(BlockBehaviour.Properties properties) {
		super(BigAddonModFluids.ACID_FLUID.get(), properties.mapColor(MapColor.COLOR_GREEN).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier) {
		super.entityInside(blockstate, world, pos, entity, insideBlockEffectApplier);
		AcidProcedureProcedure.execute(world, entity);
	}
}