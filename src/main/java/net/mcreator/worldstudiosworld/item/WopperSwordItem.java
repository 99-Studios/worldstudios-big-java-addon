package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class WopperSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 278, 6f, 0, 15, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:wopper_sword_repair_items")));

	public WopperSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3f, -1f));
	}
}