package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class SteelSytheItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2060, 11f, 0, 39, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:steel_sythe_repair_items")));

	public SteelSytheItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 19f, 4f, properties);
	}
}