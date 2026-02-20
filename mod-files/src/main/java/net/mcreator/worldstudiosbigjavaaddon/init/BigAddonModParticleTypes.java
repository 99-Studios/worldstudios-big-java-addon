/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class BigAddonModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, BigAddonMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ACID_PARTICLE = REGISTRY.register("acid_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> ICING_PARTICLE = REGISTRY.register("icing_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> RADIATION_PARTICLES = REGISTRY.register("radiation_particles", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BRAIN_FLUID_PARTICLE = REGISTRY.register("brain_fluid_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> DARK_PARTICLE = REGISTRY.register("dark_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BLEEDING_PARTICLE = REGISTRY.register("bleeding_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SMART_PARTICLES = REGISTRY.register("smart_particles", () -> new SimpleParticleType(false));
}