package net.mcreator.worldstudiosbigjavaaddon.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.worldstudiosbigjavaaddon.procedures.BleedingOnEffectActiveTickProcedure;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModParticleTypes;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1, mobEffectInstance -> (SimpleParticleType) (BigAddonModParticleTypes.BLEEDING_PARTICLE.get()));
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.player.hurt")));
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		BleedingOnEffectActiveTickProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}