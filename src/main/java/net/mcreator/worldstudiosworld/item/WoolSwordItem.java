package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class WoolSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 18, 2f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:wool_sword_repair_items")));

	public WoolSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 0f, -4f));
	}
}