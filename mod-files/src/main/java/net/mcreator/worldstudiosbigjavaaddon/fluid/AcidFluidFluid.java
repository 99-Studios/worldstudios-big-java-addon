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

public abstract class AcidFluidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> BigAddonModFluidTypes.ACID_FLUID_TYPE.get(), () -> BigAddonModFluids.ACID_FLUID.get(), () -> BigAddonModFluids.FLOWING_ACID_FLUID.get())
			.explosionResistance(100f).tickRate(30).levelDecreasePerBlock(3).bucket(() -> BigAddonModItems.ACID_FLUID_BUCKET.get()).block(() -> (LiquidBlock) BigAddonModBlocks.ACID_FLUID.get());

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