package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class GraniteSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 233, 6f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:granite_sword_repair_items")));

	public GraniteSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3f, -1f));
	}
}