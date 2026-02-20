/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

@EventBusSubscriber
public class BigAddonModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, BigAddonMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> HIGHLY_INTELEGENT = REGISTRY.register("highly_intelegent", () -> new RangedAttribute("attribute.big_addon.highly_intelegent", 0, 0, 1).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.getTypes().forEach(entity -> event.add(entity, HIGHLY_INTELEGENT));
	}
}