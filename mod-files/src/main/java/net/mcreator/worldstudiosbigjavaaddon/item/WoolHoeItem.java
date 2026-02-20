package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class WoolHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 18, 2f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:wool_hoe_repair_items")));

	public WoolHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -4f, properties);
	}
}