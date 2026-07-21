package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class WopperShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 278, 6f, 0, 15, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:wopper_shovel_repair_items")));

	public WopperShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -3f, properties);
	}
}