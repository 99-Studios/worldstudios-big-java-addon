package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class YetiHeartItem extends Item {
	public YetiHeartItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(16));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}