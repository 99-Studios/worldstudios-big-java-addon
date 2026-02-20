package net.mcreator.worldstudiosbigjavaaddon.fluid.types;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.common.SoundActions;

import net.minecraft.world.item.Rarity;
import net.minecraft.sounds.SoundEvents;

public class BrainFluidFluidType extends FluidType {
	public BrainFluidFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.007D).rarity(Rarity.UNCOMMON).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
				.sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}
}