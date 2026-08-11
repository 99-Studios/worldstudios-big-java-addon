package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.component.BlocksAttacks;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import java.util.Optional;
import java.util.List;

public class DirtShieldItem extends ShieldItem {
	public DirtShieldItem(Item.Properties properties) {
		super(properties.repairable(TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:dirt_shield_repair_items"))).component(DataComponents.BREAK_SOUND, SoundEvents.SHIELD_BREAK).equippableUnswappable(EquipmentSlot.OFFHAND)
				.delayedComponent(DataComponents.BLOCKS_ATTACKS, context -> new BlocksAttacks(0.25f, 1, List.of(new BlocksAttacks.DamageReduction(90.0f, Optional.empty(), 0, 1)), new BlocksAttacks.ItemDamageFunction(3, 1, 1),
						Optional.of(context.getOrThrow(DamageTypeTags.BYPASSES_SHIELD)), Optional.of(SoundEvents.SHIELD_BLOCK), Optional.of(SoundEvents.SHIELD_BREAK)))
				.durability(76));
	}
}