package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModMobEffects;

public class GiveSuperHungerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WorldstudiosWorldModMobEffects.SUPER_HUNGER, 140, 1));
		}
	}
}