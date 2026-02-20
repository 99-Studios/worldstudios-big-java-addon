package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CapsteelItem extends Item {
	public CapsteelItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).fireResistant());
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}