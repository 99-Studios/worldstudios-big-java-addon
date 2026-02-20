package net.mcreator.worldstudiosbigjavaaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModFluids;

public class BrainFluidItem extends BucketItem {
	public BrainFluidItem(Item.Properties properties) {
		super(BigAddonModFluids.BRAIN_FLUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}