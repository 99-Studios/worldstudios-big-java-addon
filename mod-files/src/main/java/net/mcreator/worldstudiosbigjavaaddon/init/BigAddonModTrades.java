/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class BigAddonModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("big_addon:moldeler_profession"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.CLAY), new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(BigAddonModBlocks.CAPSULE.get()), 10, 10, 0.1f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.BRICKS, 2), new ItemStack(Items.BRICK, 2), new ItemStack(Items.EMERALD, 4), 7, 15, 0.15f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.CLAY, 3), new ItemStack(BigAddonModBlocks.CAPSULE.get(), 2), new ItemStack(Items.REDSTONE, 5), 7, 20, 0.2f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(BigAddonModBlocks.CAPSULE.get(), 4), new ItemStack(Blocks.SMOOTH_STONE, 3), new ItemStack(Items.ENDER_PEARL, 6), 5, 25, 0.25f));
		}
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("big_addon:nethering_trader"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.NETHER_WART, 4), new ItemStack(BigAddonModItems.WARTED_EMERALD.get(), 2), 32, 4, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.SHROOMLIGHT, 2), new ItemStack(BigAddonModItems.STEEL.get(), 5), 25, 9, 0.12f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(BigAddonModItems.WARTED_EMERALD.get(), 5), new ItemStack(Items.NETHERITE_INGOT, 2), 32, 11, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(BigAddonModItems.CAPSTEEL.get(), 5), new ItemStack(Items.NETHERITE_SCRAP, 3), new ItemStack(BigAddonModBlocks.IGNYITE.get(), 4), 32, 20, 0.03f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(BigAddonModItems.REFINED_FLINT_AND_STEEL.get()), new ItemStack(BigAddonModItems.TITAN_TOOL_SWORD.get()), 3, 32, 0.14f));
		}
	}
}