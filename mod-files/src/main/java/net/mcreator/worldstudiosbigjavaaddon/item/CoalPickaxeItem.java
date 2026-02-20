package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CoalPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 5f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:coal_pickaxe_repair_items")));

	public CoalPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 2.5f, -2.8f).fireResistant().setNoCombineRepair());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}