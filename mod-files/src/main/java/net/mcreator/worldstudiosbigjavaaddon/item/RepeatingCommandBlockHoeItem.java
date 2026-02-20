package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RepeatingCommandBlockHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6280, 24f, 0, 140, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:repeating_command_block_hoe_repair_items")));

	public RepeatingCommandBlockHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 39f, 26f, properties);
	}
}