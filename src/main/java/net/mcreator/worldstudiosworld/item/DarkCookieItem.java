package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DarkCookieItem extends Item {
	public DarkCookieItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).alwaysEdible().build()));
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