package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class NacorSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 778, 10f, 0, 32, TagKey.create(Registries.ITEM, Identifier.parse("worldstudios_world:nacor_sword_repair_items")));

	public NacorSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 13f, 0f));
	}
}