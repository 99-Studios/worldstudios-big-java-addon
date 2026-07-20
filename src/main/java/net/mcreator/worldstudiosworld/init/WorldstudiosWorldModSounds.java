/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class WorldstudiosWorldModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, WorldstudiosWorldMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CAREFREE = REGISTRY.register("carefree", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("worldstudios_world", "carefree")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FAIRY_AMBIENT = REGISTRY.register("fairy.ambient", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("worldstudios_world", "fairy.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> THE_WILL_OF_RIGHTS = REGISTRY.register("the_will_of_rights", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("worldstudios_world", "the_will_of_rights")));
}