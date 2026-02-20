/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class BigAddonModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, BigAddonMod.MODID);
	public static final DeferredHolder<Potion, Potion> ACID = REGISTRY.register("acid", () -> new Potion("acid", new MobEffectInstance(BigAddonModMobEffects.ACID_EFFECT, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> ACID_II = REGISTRY.register("acid_ii", () -> new Potion("acid_ii", new MobEffectInstance(BigAddonModMobEffects.ACID_EFFECT, 3600, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> FAIRY_BREW = REGISTRY.register("fairy_brew", () -> new Potion("fairy_brew", new MobEffectInstance(BigAddonModMobEffects.FAIRY_BREW_EFFECT, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> POTION_OF_ICING = REGISTRY.register("potion_of_icing", () -> new Potion("potion_of_icing", new MobEffectInstance(BigAddonModMobEffects.ICING, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> POTION_OF_ICING_II = REGISTRY.register("potion_of_icing_ii", () -> new Potion("potion_of_icing_ii", new MobEffectInstance(BigAddonModMobEffects.ICING, 3600, 1, false, true)));
	public static final DeferredHolder<Potion, Potion> RADIATED_POTION = REGISTRY.register("radiated_potion",
			() -> new Potion("radiated_potion", new MobEffectInstance(BigAddonModMobEffects.RADIATION, 3600, 0, false, true), new MobEffectInstance(MobEffects.NAUSEA, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> EXTREMELY_RADIATED_POTION = REGISTRY.register("extremely_radiated_potion",
			() -> new Potion("extremely_radiated_potion", new MobEffectInstance(BigAddonModMobEffects.RADIATION, 5400, 2, false, true), new MobEffectInstance(MobEffects.NAUSEA, 5400, 2, false, true)));
	public static final DeferredHolder<Potion, Potion> EVERYTHING = REGISTRY.register("everything",
			() -> new Potion("everything", new MobEffectInstance(BigAddonModMobEffects.ACID_EFFECT, 3600, 0, false, true), new MobEffectInstance(BigAddonModMobEffects.FAIRY_BLESSING, 3600, 0, false, true),
					new MobEffectInstance(BigAddonModMobEffects.FAIRY_BREW_EFFECT, 3600, 0, false, true), new MobEffectInstance(BigAddonModMobEffects.ICING, 3600, 0, false, true),
					new MobEffectInstance(BigAddonModMobEffects.RADIATION, 3600, 0, false, true), new MobEffectInstance(BigAddonModMobEffects.DARK_EFFECT, 3600, 0, false, true), new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.BAD_OMEN, 3600, 0, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true), new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.DARKNESS, 3600, 0, false, true), new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0, false, true), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.GLOWING, 3600, 0, false, true), new MobEffectInstance(MobEffects.HASTE, 3600, 0, false, true), new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 0, false, true), new MobEffectInstance(MobEffects.HUNGER, 3600, 0, false, true), new MobEffectInstance(MobEffects.INFESTED, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 3600, 0, false, true), new MobEffectInstance(MobEffects.INSTANT_HEALTH, 3600, 0, false, true), new MobEffectInstance(MobEffects.INVISIBILITY, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.JUMP_BOOST, 3600, 0, false, true), new MobEffectInstance(MobEffects.LEVITATION, 3600, 0, false, true), new MobEffectInstance(MobEffects.LUCK, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.MINING_FATIGUE, 3600, 0, false, true), new MobEffectInstance(MobEffects.NAUSEA, 3600, 0, false, true), new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.OOZING, 3600, 0, false, true), new MobEffectInstance(MobEffects.POISON, 3600, 0, false, true), new MobEffectInstance(MobEffects.RAID_OMEN, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.REGENERATION, 3600, 0, false, true), new MobEffectInstance(MobEffects.RESISTANCE, 3600, 0, false, true), new MobEffectInstance(MobEffects.SATURATION, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 3600, 0, false, true), new MobEffectInstance(MobEffects.SLOWNESS, 3600, 0, false, true), new MobEffectInstance(MobEffects.SPEED, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.STRENGTH, 3600, 0, false, true), new MobEffectInstance(MobEffects.TRIAL_OMEN, 3600, 0, false, true), new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 3600, 0, false, true), new MobEffectInstance(MobEffects.WEAVING, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.WIND_CHARGED, 3600, 0, false, true), new MobEffectInstance(MobEffects.WITHER, 3600, 0, false, true), new MobEffectInstance(BigAddonModMobEffects.BLEEDING, 3600, 0, false, true),
					new MobEffectInstance(BigAddonModMobEffects.SMART, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> POTION_OF_THE_DARK_ARTS = REGISTRY.register("potion_of_the_dark_arts",
			() -> new Potion("potion_of_the_dark_arts", new MobEffectInstance(BigAddonModMobEffects.DARK_EFFECT, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> SHARP_POTION = REGISTRY.register("sharp_potion", () -> new Potion("sharp_potion", new MobEffectInstance(BigAddonModMobEffects.BLEEDING, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> INTELLIGENCE = REGISTRY.register("intelligence", () -> new Potion("intelligence", new MobEffectInstance(BigAddonModMobEffects.SMART, 3600, 0, false, true)));
}