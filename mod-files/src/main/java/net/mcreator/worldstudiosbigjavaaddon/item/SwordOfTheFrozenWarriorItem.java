package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SwordOfTheFrozenWarriorItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4086, 15f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:sword_of_the_frozen_warrior_repair_items")));

	public SwordOfTheFrozenWarriorItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 15f, -2.4f));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}