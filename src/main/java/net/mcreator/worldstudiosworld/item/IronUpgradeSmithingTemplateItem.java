package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronUpgradeSmithingTemplateItem extends Item {
	public IronUpgradeSmithingTemplateItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}