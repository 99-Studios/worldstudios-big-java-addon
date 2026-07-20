package net.mcreator.worldstudiosworld.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.block.FluidModel;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluids;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class AcidFluidFluidExtension {
	@SubscribeEvent
	public static void registerRegisterFluidModels(RegisterFluidModelsEvent event) {
		event.register(new FluidModel.Unbaked(new Material(Identifier.parse("worldstudios_world:block/acid_fluid1")), new Material(Identifier.parse("worldstudios_world:block/acid_flowing")), null, null), WorldstudiosWorldModFluids.ACID_FLUID,
				WorldstudiosWorldModFluids.FLOWING_ACID_FLUID);
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
		}, WorldstudiosWorldModFluidTypes.ACID_FLUID_TYPE);
	}
}