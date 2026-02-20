package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BrainFoodItem extends Item {
	public BrainFoodItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.3f).build()));
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}