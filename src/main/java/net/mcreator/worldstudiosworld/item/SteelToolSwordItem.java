package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class SteelToolSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1030, 11f, 0, 39, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:steel_tool_sword_repair_items")));

	public SteelToolSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 16f, 0f));
	}
}