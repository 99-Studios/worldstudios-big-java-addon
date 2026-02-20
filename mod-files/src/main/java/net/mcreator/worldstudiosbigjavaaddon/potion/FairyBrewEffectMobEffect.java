package net.mcreator.worldstudiosbigjavaaddon.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.worldstudiosbigjavaaddon.procedures.FairyBrewProcedureProcedure;

public class FairyBrewEffectMobEffect extends MobEffect {
	public FairyBrewEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407668);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		FairyBrewProcedureProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}