package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ChainCommandBlockHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4198, 20f, 0, 105, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:chain_command_block_hoe_repair_items")));

	public ChainCommandBlockHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 29f, 19f, properties);
	}
}