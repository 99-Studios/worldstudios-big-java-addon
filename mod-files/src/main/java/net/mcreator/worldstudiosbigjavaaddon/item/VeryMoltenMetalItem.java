package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VeryMoltenMetalItem extends Item {
	public VeryMoltenMetalItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}