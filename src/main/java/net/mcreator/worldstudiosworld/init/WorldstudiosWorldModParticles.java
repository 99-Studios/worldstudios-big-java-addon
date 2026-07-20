/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.worldstudiosworld.client.particle.*;

@EventBusSubscriber(Dist.CLIENT)
public class WorldstudiosWorldModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(WorldstudiosWorldModParticleTypes.ACID_PARTICLE.get(), AcidParticleParticle::provider);
		event.registerSpriteSet(WorldstudiosWorldModParticleTypes.ICING_PARTICLE.get(), IcingParticleParticle::provider);
		event.registerSpriteSet(WorldstudiosWorldModParticleTypes.RADIATION_PARTICLES.get(), RadiationParticlesParticle::provider);
		event.registerSpriteSet(WorldstudiosWorldModParticleTypes.BRAIN_FLUID_PARTICLE.get(), BrainFluidParticleParticle::provider);
		event.registerSpriteSet(WorldstudiosWorldModParticleTypes.DARK_PARTICLE.get(), DarkParticleParticle::provider);
		event.registerSpriteSet(WorldstudiosWorldModParticleTypes.BLEEDING_PARTICLE.get(), BleedingParticleParticle::provider);
		event.registerSpriteSet(WorldstudiosWorldModParticleTypes.SMART_PARTICLES.get(), SmartParticlesParticle::provider);
	}
}