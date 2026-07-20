package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class WoolShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 18, 2f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:wool_shovel_repair_items")));

	public WoolShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -4f, properties);
	}
}