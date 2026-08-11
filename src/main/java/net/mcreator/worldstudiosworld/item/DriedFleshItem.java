package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DriedFleshItem extends Item {
	public DriedFleshItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()));
	}
}