package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DirtToolShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 57, 3f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:dirt_tool_shovel_repair_items")));

	public DirtToolShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -4f, properties);
	}
}