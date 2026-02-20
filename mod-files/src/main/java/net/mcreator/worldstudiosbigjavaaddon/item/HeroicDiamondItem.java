package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.worldstudiosbigjavaaddon.procedures.HeroicDiamondItemInInventoryTickProcedure;

import javax.annotation.Nullable;

public class HeroicDiamondItem extends Item {
	public HeroicDiamondItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		HeroicDiamondItemInInventoryTickProcedure.execute(entity);
	}
}