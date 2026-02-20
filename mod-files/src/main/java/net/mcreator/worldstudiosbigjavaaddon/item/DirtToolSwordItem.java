package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DirtToolSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 57, 3f, 0, 5, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:dirt_tool_sword_repair_items")));

	public DirtToolSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 1f, -3f));
	}
}