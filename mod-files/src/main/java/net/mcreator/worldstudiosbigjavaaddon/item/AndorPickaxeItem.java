package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AndorPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 167, 5f, 0, 11, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:andor_pickaxe_repair_items")));

	public AndorPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 2f, -2f));
	}
}