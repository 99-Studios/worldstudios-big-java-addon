package net.mcreator.worldstudiosbigjavaaddon.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.worldstudiosbigjavaaddon.procedures.FairyBlessingOnEffectActiveTickProcedure;

public class FairyBlessingMobEffect extends InstantenousMobEffect {
	public FairyBlessingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52276);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		FairyBlessingOnEffectActiveTickProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ());
		return super.applyEffectTick(level, entity, amplifier);
	}
}