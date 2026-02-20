package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class UrainiumIngotItem extends Item {
	public UrainiumIngotItem(Item.Properties properties) {
		super(properties.fireResistant());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}