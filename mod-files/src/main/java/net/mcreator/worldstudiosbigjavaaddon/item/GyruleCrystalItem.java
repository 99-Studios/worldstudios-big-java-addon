package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GyruleCrystalItem extends Item {
	public GyruleCrystalItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).fireResistant());
	}
}