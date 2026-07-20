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

public abstract class AcidFluidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> WorldstudiosWorldModFluidTypes.ACID_FLUID_TYPE.get(), () -> WorldstudiosWorldModFluids.ACID_FLUID.get(),
			() -> WorldstudiosWorldModFluids.FLOWING_ACID_FLUID.get()).explosionResistance(100f).tickRate(30).levelDecreasePerBlock(3).bucket(() -> WorldstudiosWorldModItems.ACID_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) WorldstudiosWorldModBlocks.ACID_FLUID.get());

	private AcidFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluidFluid {
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