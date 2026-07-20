package net.mcreator.worldstudiosworld.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class AcidFluidFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("worldstudios_world:block/acid_fluid1");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("worldstudios_world:block/acid_flowing");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, WorldstudiosWorldModFluidTypes.ACID_FLUID_TYPE.get());
	}
}