package net.mcreator.worldstudiosworld.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements WorldstudiosWorldModBiomes.WorldstudiosWorldModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> worldstudios_world_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.worldstudios_world_dimensionTypeReference != null) {
			retval = WorldstudiosWorldModBiomes.adaptSurfaceRule(retval, this.worldstudios_world_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setworldstudios_worldDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.worldstudios_world_dimensionTypeReference = dimensionType;
	}
}