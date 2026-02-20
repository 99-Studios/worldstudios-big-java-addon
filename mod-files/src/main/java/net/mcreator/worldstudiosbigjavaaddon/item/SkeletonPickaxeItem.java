package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SkeletonPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 295, 6f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:skeleton_pickaxe_repair_items")));

	public SkeletonPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 4f, -1f));
	}
}