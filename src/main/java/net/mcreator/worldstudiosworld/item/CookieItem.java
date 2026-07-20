package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookieItem extends Item {
	public CookieItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.3f).alwaysEdible().build()));
	}

	@Override
	public ItemStackTemplate getCraftingRemainder(ItemInstance itemInstance) {
		return new ItemStackTemplate(this);
	}
}