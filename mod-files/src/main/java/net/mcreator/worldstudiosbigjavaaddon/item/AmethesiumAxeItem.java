package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AmethesiumAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1741, 14f, 0, 56, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:amethesium_axe_repair_items")));

	public AmethesiumAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 35f, 0f, properties.fireResistant());
	}
}