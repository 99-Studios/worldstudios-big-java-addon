package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IceDragonIceballItem extends Item {
	public IceDragonIceballItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}