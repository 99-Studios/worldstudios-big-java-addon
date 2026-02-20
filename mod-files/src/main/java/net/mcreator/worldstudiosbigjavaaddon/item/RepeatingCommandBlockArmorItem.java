package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class RepeatingCommandBlockArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(150, Map.of(ArmorType.BOOTS, 20, ArmorType.LEGGINGS, 50, ArmorType.CHESTPLATE, 60, ArmorType.HELMET, 20, ArmorType.BODY, 60), 90,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:repeating_command_block_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("big_addon:repeating_command_block_armor")));

	private RepeatingCommandBlockArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends RepeatingCommandBlockArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends RepeatingCommandBlockArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends RepeatingCommandBlockArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends RepeatingCommandBlockArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}