package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.Item;

public class UrainiumIngotItem extends Item {
	public UrainiumIngotItem(Item.Properties properties) {
		super(properties.fireResistant());
	}

	@Override
	public ItemStackTemplate getCraftingRemainder(ItemInstance itemInstance) {
		return new ItemStackTemplate(this);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}