/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.worldstudiosbigjavaaddon.fluid.BrainFluidFluid;
import net.mcreator.worldstudiosbigjavaaddon.fluid.AcidFluidFluid;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class BigAddonModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, BigAddonMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> ACID_FLUID = REGISTRY.register("acid_fluid", () -> new AcidFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ACID_FLUID = REGISTRY.register("flowing_acid_fluid", () -> new AcidFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> BRAIN_FLUID = REGISTRY.register("brain_fluid", () -> new BrainFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BRAIN_FLUID = REGISTRY.register("flowing_brain_fluid", () -> new BrainFluidFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ACID_FLUID.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ACID_FLUID.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(BRAIN_FLUID.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BRAIN_FLUID.get(), ChunkSectionLayer.TRANSLUCENT);
		}
	}
}