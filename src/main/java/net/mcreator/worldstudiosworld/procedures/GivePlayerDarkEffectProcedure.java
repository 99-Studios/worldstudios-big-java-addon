package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModMobEffects;

public class GivePlayerDarkEffectProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(WorldstudiosWorldModMobEffects.DARK_EFFECT, 100, 1));
	}
}