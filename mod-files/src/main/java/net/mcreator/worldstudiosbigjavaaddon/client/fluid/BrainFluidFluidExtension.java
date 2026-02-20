package net.mcreator.worldstudiosbigjavaaddon.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class BrainFluidFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("big_addon:block/brain_fluid");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("big_addon:block/brain_fluid");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, BigAddonModFluidTypes.BRAIN_FLUID_TYPE.get());
	}
}