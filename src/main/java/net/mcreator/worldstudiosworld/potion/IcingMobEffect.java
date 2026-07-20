package net.mcreator.worldstudiosworld.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModParticleTypes;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class IcingMobEffect extends MobEffect {
	public IcingMobEffect() {
		super(MobEffectCategory.HARMFUL, -13382401, mobEffectInstance -> (SimpleParticleType) (WorldstudiosWorldModParticleTypes.ICING_PARTICLE.get()));
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, Identifier.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, "effect.icing_0"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_SPEED, Identifier.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, "effect.icing_1"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.FLYING_SPEED, Identifier.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, "effect.icing_2"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, Identifier.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, "effect.icing_3"), -0.25, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, Identifier.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, "effect.icing_4"), -0.25, AttributeModifier.Operation.ADD_VALUE);
	}
}