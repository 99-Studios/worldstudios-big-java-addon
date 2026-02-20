package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SugarCookieItem extends Item {
	public SugarCookieItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(10).saturationModifier(7f).alwaysEdible().build()));
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}