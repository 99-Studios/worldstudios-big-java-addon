package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SteelItem extends Item {
	public SteelItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).fireResistant());
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}