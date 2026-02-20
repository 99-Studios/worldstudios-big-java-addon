package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SteelToolAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1030, 11f, 0, 39, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:steel_tool_axe_repair_items")));

	public SteelToolAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 24f, -2f, properties);
	}
}