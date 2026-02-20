package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CubeEssenceItem extends Item {
	public CubeEssenceItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.3f).alwaysEdible().build()));
	}
}