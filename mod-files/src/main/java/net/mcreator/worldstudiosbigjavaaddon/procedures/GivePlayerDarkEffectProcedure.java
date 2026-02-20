package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModMobEffects;

public class GivePlayerDarkEffectProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(BigAddonModMobEffects.DARK_EFFECT, 100, 1));
	}
}