package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.worldstudiosworld.procedures.WasteProcedureProcedure;

public class WasteItem extends Item {
	public WasteItem(Item.Properties properties) {
		super(properties.stacksTo(32).food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.3f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		WasteProcedureProcedure.execute(entity);
		return retval;
	}
}