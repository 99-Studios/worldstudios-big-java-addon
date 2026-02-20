package net.mcreator.worldstudiosbigjavaaddon.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModItems;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModFluids;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModFluidTypes;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModBlocks;

public abstract class BrainFluidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> BigAddonModFluidTypes.BRAIN_FLUID_TYPE.get(), () -> BigAddonModFluids.BRAIN_FLUID.get(), () -> BigAddonModFluids.FLOWING_BRAIN_FLUID.get())
			.explosionResistance(100f).bucket(() -> BigAddonModItems.BRAIN_FLUID_BUCKET.get()).block(() -> (LiquidBlock) BigAddonModBlocks.BRAIN_FLUID.get());

	private BrainFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BrainFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BrainFluidFluid {
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