package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BlaziteShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 999, 11f, 0, 38, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:blazite_shovel_repair_items")));

	public BlaziteShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 10f, 4f, properties);
	}
}