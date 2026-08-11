package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModMobEffects;

public class SuperHungerOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)
					- 0.0125 * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WorldstudiosWorldModMobEffects.SUPER_HUNGER) ? _livEnt.getEffect(WorldstudiosWorldModMobEffects.SUPER_HUNGER).getAmplifier() : 0) + 1)));
	}
}