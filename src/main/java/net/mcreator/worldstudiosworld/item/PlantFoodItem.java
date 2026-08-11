package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PlantFoodItem extends Item {
	public PlantFoodItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(6f).build()));
	}
}