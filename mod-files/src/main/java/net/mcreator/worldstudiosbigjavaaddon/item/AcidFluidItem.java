package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModFluids;

public class AcidFluidItem extends BucketItem {
	public AcidFluidItem(Item.Properties properties) {
		super(BigAddonModFluids.ACID_FLUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}