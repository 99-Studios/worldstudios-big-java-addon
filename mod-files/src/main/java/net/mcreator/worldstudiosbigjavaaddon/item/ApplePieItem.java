package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ApplePieItem extends Item {
	public ApplePieItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(3f).build()));
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}