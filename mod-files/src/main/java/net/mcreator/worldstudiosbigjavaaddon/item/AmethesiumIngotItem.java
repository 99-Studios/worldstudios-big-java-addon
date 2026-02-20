package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AmethesiumIngotItem extends Item {
	public AmethesiumIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).fireResistant());
	}
}