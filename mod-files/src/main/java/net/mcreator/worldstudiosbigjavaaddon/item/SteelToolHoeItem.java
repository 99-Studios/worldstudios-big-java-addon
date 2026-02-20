package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SteelToolHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1030, 11f, 0, 39, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:steel_tool_hoe_repair_items")));

	public SteelToolHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, 4f, properties);
	}
}