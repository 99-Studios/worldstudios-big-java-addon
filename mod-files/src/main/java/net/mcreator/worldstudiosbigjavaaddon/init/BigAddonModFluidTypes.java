/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.worldstudiosbigjavaaddon.fluid.types.BrainFluidFluidType;
import net.mcreator.worldstudiosbigjavaaddon.fluid.types.AcidFluidFluidType;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class BigAddonModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, BigAddonMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ACID_FLUID_TYPE = REGISTRY.register("acid_fluid", () -> new AcidFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> BRAIN_FLUID_TYPE = REGISTRY.register("brain_fluid", () -> new BrainFluidFluidType());
}