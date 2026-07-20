package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.procedures.DragonProcedureProcedure;

public class SouldustPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 167, 5f, 0, 11, TagKey.create(Registries.ITEM, ResourceLocation.parse("worldstudios_world:souldust_pickaxe_repair_items")));

	public SouldustPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 2f, -3f));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity, InteractionHand hand) {
		boolean retval = super.onEntitySwing(itemstack, entity, hand);
		DragonProcedureProcedure.execute(entity.level(), entity, itemstack);
		return retval;
	}
}