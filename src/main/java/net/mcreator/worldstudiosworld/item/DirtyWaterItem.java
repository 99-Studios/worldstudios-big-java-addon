package net.mcreator.worldstudiosworld.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModFluids;

public class DirtyWaterItem extends BucketItem {
	public DirtyWaterItem(Item.Properties properties) {
		super(WorldstudiosWorldModFluids.DIRTY_WATER.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}