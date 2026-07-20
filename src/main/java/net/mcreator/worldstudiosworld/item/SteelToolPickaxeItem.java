package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SteelToolPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1030, 11f, 0, 39, TagKey.create(Registries.ITEM, ResourceLocation.parse("worldstudios_world:steel_tool_pickaxe_repair_items")));

	public SteelToolPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 10f, -1f));
	}
}