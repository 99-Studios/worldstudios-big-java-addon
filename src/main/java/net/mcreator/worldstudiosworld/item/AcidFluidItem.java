package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluids;

public class AcidFluidItem extends BucketItem {
	public AcidFluidItem(Item.Properties properties) {
		super(WorldstudiosWorldModFluids.ACID_FLUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}