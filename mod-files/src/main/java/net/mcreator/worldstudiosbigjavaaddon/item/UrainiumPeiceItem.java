package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class UrainiumPeiceItem extends Item {
	public UrainiumPeiceItem(Item.Properties properties) {
		super(properties.fireResistant());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}