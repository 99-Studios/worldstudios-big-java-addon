package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MoltenMetalItem extends Item {
	public MoltenMetalItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}