package net.mcreator.worldstudiosbigjavaaddon.recipe.brewing;

import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.common.brewing.IBrewingRecipe;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.core.component.DataComponents;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModPotions;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModBlocks;

@EventBusSubscriber
public class ExtremelyRadiatedPotionRecipeBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		event.getBuilder().addRecipe(new ExtremelyRadiatedPotionRecipeBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && input.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY).is(BigAddonModPotions.RADIATED_POTION);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(BigAddonModBlocks.GREEN_SAND.get().asItem()).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(input.getItem(), BigAddonModPotions.EXTREMELY_RADIATED_POTION);
		}
		return ItemStack.EMPTY;
	}
}