package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.worldstudiosbigjavaaddon.procedures.EnergyDetectorItemInInventoryTickProcedure;

import javax.annotation.Nullable;

public class EnergyDetectorItem extends Item {
	public EnergyDetectorItem(Item.Properties properties) {
		super(properties.stacksTo(1).fireResistant());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		if (equipmentSlot == EquipmentSlot.MAINHAND)
			EnergyDetectorItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}