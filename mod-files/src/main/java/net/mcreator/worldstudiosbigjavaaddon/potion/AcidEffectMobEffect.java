package net.mcreator.worldstudiosbigjavaaddon.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.worldstudiosbigjavaaddon.procedures.AcidProcedureProcedure;

public class AcidEffectMobEffect extends MobEffect {
	public AcidEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -16724941);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		AcidProcedureProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}