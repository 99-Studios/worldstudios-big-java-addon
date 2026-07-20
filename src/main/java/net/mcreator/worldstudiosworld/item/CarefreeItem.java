package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class CarefreeItem extends Item {
	public CarefreeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, "carefree"))));
	}
}