package net.mcreator.worldstudiosbigjavaaddon.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosbigjavaaddon.procedures.EnderHelmetHelmetTickEventProcedure;

import javax.annotation.Nullable;

import java.util.Map;

public abstract class EnderHelmetItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(15, Map.of(ArmorType.BOOTS, 4, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 4, ArmorType.BODY, 6), 9,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("block.beacon.activate")), 3f, 0.2f, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:ender_helmet_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("big_addon:ender_helmet")));

	private EnderHelmetItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends EnderHelmetItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
			super.inventoryTick(itemstack, world, entity, equipmentSlot);
			if (entity instanceof Player player && (equipmentSlot != null && equipmentSlot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR)) {
				EnderHelmetHelmetTickEventProcedure.execute(world, entity);
			}
		}
	}
}