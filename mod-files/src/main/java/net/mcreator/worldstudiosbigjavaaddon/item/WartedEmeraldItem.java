package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WartedEmeraldItem extends Item {
	public WartedEmeraldItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}