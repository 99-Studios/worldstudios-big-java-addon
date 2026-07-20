package net.mcreator.worldstudiosworld.potion;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.worldstudiosworld.procedures.SmartEffectStartedappliedProcedure;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModParticleTypes;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModAttributes;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class SmartMobEffect extends MobEffect {
	public SmartMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13108, mobEffectInstance -> (SimpleParticleType) (WorldstudiosWorldModParticleTypes.SMART_PARTICLES.get()));
		this.addAttributeModifier(WorldstudiosWorldModAttributes.HIGHLY_INTELEGENT, ResourceLocation.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, "effect.smart_0"), 1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		SmartEffectStartedappliedProcedure.execute(entity);
	}
}