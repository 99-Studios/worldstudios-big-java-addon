package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class WoolPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 18, 2f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("worldstudios_world:wool_pickaxe_repair_items")));

	public WoolPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 0f, -4f));
	}
}