package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CommandBlockShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6280, 24f, 0, 140, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:command_block_shovel_repair_items")));

	public CommandBlockShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 39f, 26f, properties);
	}
}