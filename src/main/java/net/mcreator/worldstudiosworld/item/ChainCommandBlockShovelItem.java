package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class ChainCommandBlockShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4198, 20f, 0, 105, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:chain_command_block_shovel_repair_items")));

	public ChainCommandBlockShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 29f, 19f, properties);
	}
}