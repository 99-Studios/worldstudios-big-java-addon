package net.mcreator.worldstudiosworld.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluids;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluidTypes;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBlocks;

public abstract class DirtyWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> WorldstudiosWorldModFluidTypes.DIRTY_WATER_TYPE.get(), () -> WorldstudiosWorldModFluids.DIRTY_WATER.get(),
			() -> WorldstudiosWorldModFluids.FLOWING_DIRTY_WATER.get()).explosionResistance(100f).bucket(() -> WorldstudiosWorldModItems.DIRTY_WATER_BUCKET.get()).block(() -> (LiquidBlock) WorldstudiosWorldModBlocks.DIRTY_WATER.get());

	private DirtyWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DirtyWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DirtyWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}