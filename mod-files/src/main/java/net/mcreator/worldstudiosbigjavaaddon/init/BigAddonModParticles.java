/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.worldstudiosbigjavaaddon.client.particle.*;

@EventBusSubscriber(Dist.CLIENT)
public class BigAddonModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(BigAddonModParticleTypes.ACID_PARTICLE.get(), AcidParticleParticle::provider);
		event.registerSpriteSet(BigAddonModParticleTypes.ICING_PARTICLE.get(), IcingParticleParticle::provider);
		event.registerSpriteSet(BigAddonModParticleTypes.RADIATION_PARTICLES.get(), RadiationParticlesParticle::provider);
		event.registerSpriteSet(BigAddonModParticleTypes.BRAIN_FLUID_PARTICLE.get(), BrainFluidParticleParticle::provider);
		event.registerSpriteSet(BigAddonModParticleTypes.DARK_PARTICLE.get(), DarkParticleParticle::provider);
		event.registerSpriteSet(BigAddonModParticleTypes.BLEEDING_PARTICLE.get(), BleedingParticleParticle::provider);
		event.registerSpriteSet(BigAddonModParticleTypes.SMART_PARTICLES.get(), SmartParticlesParticle::provider);
	}
}