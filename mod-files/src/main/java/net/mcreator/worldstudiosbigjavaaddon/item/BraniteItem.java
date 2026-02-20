package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BraniteItem extends Item {
	public BraniteItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}