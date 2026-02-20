package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AndesiteAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 67, 3f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:andesite_axe_repair_items")));

	public AndesiteAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -4f, properties);
	}
}