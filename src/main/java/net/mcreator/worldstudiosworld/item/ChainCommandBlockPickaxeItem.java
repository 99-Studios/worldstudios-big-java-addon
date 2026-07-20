package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class ChainCommandBlockPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4198, 20f, 0, 105, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:chain_command_block_pickaxe_repair_items")));

	public ChainCommandBlockPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 29f, 19f));
	}
}