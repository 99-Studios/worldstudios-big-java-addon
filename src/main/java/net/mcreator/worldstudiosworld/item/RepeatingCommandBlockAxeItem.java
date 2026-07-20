package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class RepeatingCommandBlockAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6280, 24f, 0, 140, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:repeating_command_block_axe_repair_items")));

	public RepeatingCommandBlockAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 39f, 26f, properties);
	}
}