/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.worldstudiosworld.fluid.BrainFluidFluid;
import net.mcreator.worldstudiosworld.fluid.AcidFluidFluid;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class WorldstudiosWorldModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, WorldstudiosWorldMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> ACID_FLUID = REGISTRY.register("acid_fluid", AcidFluidFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ACID_FLUID = REGISTRY.register("flowing_acid_fluid", AcidFluidFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> BRAIN_FLUID = REGISTRY.register("brain_fluid", BrainFluidFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BRAIN_FLUID = REGISTRY.register("flowing_brain_fluid", BrainFluidFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> DIRTY_WATER = REGISTRY.register("dirty_water", DirtyWaterFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_DIRTY_WATER = REGISTRY.register("flowing_dirty_water", DirtyWaterFluid.Flowing::new);
}