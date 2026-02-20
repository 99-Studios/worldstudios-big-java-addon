package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModMobEffects;

public class BleedingOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("big_addon:bleed")))),
				(float) (0.25 * (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BigAddonModMobEffects.BLEEDING) ? _livEnt.getEffect(BigAddonModMobEffects.BLEEDING).getAmplifier() : 0))));
	}
}