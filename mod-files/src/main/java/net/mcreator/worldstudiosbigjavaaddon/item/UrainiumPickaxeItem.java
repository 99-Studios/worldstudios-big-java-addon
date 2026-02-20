package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class UrainiumPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4084, 14f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:urainium_pickaxe_repair_items")));

	public UrainiumPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 7f, -2.4f).fireResistant().setNoCombineRepair());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}