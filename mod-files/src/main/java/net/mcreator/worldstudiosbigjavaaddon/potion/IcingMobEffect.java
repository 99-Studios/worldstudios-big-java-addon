package net.mcreator.worldstudiosbigjavaaddon.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModParticleTypes;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class IcingMobEffect extends MobEffect {
	public IcingMobEffect() {
		super(MobEffectCategory.HARMFUL, -13382401, mobEffectInstance -> (SimpleParticleType) (BigAddonModParticleTypes.ICING_PARTICLE.get()));
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(BigAddonMod.MODID, "effect.icing_0"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, ResourceLocation.fromNamespaceAndPath(BigAddonMod.MODID, "effect.icing_1"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.FLYING_SPEED, ResourceLocation.fromNamespaceAndPath(BigAddonMod.MODID, "effect.icing_2"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, ResourceLocation.fromNamespaceAndPath(BigAddonMod.MODID, "effect.icing_3"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(BigAddonMod.MODID, "effect.icing_4"), -0.25, AttributeModifier.Operation.ADD_VALUE);
	}
}