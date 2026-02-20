package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class TheWillOfRightsItem extends Item {
	public TheWillOfRightsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(BigAddonMod.MODID, "the_will_of_rights"))));
	}
}