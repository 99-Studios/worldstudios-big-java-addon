package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class IgnightiumAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1164, 12f, 0, 42, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:ignightium_axe_repair_items")));

	public IgnightiumAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 11f, 5f, properties);
	}
}