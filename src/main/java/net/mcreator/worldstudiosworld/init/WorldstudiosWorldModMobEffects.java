/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.procedures.SmartEffectExpiresProcedure;
import net.mcreator.worldstudiosworld.potion.*;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

@EventBusSubscriber
public class WorldstudiosWorldModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, WorldstudiosWorldMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ACID_EFFECT = REGISTRY.register("acid_effect", AcidEffectMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> FAIRY_BLESSING = REGISTRY.register("fairy_blessing", FairyBlessingMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> FAIRY_BREW_EFFECT = REGISTRY.register("fairy_brew_effect", FairyBrewEffectMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> ICING = REGISTRY.register("icing", IcingMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> RADIATION = REGISTRY.register("radiation", RadiationMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> DARK_EFFECT = REGISTRY.register("dark_effect", DarkEffectMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> BLEEDING = REGISTRY.register("bleeding", BleedingMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> SMART = REGISTRY.register("smart", SmartMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> SUPER_HUNGER = REGISTRY.register("super_hunger", SuperHungerMobEffect::new);

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.is(SMART)) {
			SmartEffectExpiresProcedure.execute(entity);
		}
	}
}