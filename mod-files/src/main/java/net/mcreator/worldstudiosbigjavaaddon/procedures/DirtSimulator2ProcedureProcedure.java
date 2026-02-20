package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModItems;

public class DirtSimulator2ProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (new ItemStack(BigAddonModItems.DIRT_ARMOR_HELMET.get())
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("big_addon:dirt")))) != 0
				&& new ItemStack(BigAddonModItems.DIRT_ARMOR_CHESTPLATE.get())
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("big_addon:dirt")))) != 0
				&& new ItemStack(BigAddonModItems.DIRT_ARMOR_LEGGINGS.get())
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("big_addon:dirt")))) != 0
				&& new ItemStack(BigAddonModItems.DIRT_ARMOR_BOOTS.get())
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("big_addon:dirt")))) != 0) {
			if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
				AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("big_addon:dirt_simulator_2"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}