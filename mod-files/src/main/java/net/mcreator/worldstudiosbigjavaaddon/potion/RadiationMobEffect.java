package net.mcreator.worldstudiosbigjavaaddon.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.worldstudiosbigjavaaddon.procedures.RadiationOnEffectActiveTickProcedure;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModParticleTypes;

public class RadiationMobEffect extends MobEffect {
	public RadiationMobEffect() {
		super(MobEffectCategory.HARMFUL, -16737997, mobEffectInstance -> (SimpleParticleType) (BigAddonModParticleTypes.RADIATION_PARTICLES.get()));
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		RadiationOnEffectActiveTickProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}