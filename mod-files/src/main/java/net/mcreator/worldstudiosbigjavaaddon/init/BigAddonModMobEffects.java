/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosbigjavaaddon.procedures.SmartEffectExpiresProcedure;
import net.mcreator.worldstudiosbigjavaaddon.potion.*;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

@EventBusSubscriber
public class BigAddonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, BigAddonMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ACID_EFFECT = REGISTRY.register("acid_effect", () -> new AcidEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FAIRY_BLESSING = REGISTRY.register("fairy_blessing", () -> new FairyBlessingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FAIRY_BREW_EFFECT = REGISTRY.register("fairy_brew_effect", () -> new FairyBrewEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICING = REGISTRY.register("icing", () -> new IcingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> RADIATION = REGISTRY.register("radiation", () -> new RadiationMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_EFFECT = REGISTRY.register("dark_effect", () -> new DarkEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SMART = REGISTRY.register("smart", () -> new SmartMobEffect());

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
		if (effectInstance.getEffect().is(SMART)) {
			SmartEffectExpiresProcedure.execute(entity);
		}
	}
}