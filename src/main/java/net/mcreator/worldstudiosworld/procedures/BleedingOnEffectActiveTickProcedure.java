package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModMobEffects;

public class BleedingOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("worldstudios_world:bleed")))),
				(float) (0.25 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WorldstudiosWorldModMobEffects.BLEEDING) ? _livEnt.getEffect(WorldstudiosWorldModMobEffects.BLEEDING).getAmplifier() : 0))));
	}
}