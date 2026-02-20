package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AndesiteHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 67, 3f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:andesite_hoe_repair_items")));

	public AndesiteHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, -1f, -3f, properties);
	}
}