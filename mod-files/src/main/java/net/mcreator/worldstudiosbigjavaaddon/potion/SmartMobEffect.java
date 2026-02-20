package net.mcreator.worldstudiosbigjavaaddon.potion;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.worldstudiosbigjavaaddon.procedures.SmartEffectStartedappliedProcedure;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModParticleTypes;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModAttributes;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class SmartMobEffect extends MobEffect {
	public SmartMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13108, mobEffectInstance -> (SimpleParticleType) (BigAddonModParticleTypes.SMART_PARTICLES.get()));
		this.addAttributeModifier(BigAddonModAttributes.HIGHLY_INTELEGENT, ResourceLocation.fromNamespaceAndPath(BigAddonMod.MODID, "effect.smart_0"), 1, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		SmartEffectStartedappliedProcedure.execute(entity);
	}
}