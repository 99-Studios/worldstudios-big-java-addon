package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModMobEffects;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;

public class BraniteLungeLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("worldstudios_world:spike")))) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WorldstudiosWorldModMobEffects.BLEEDING, 200,
						itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("worldstudios_world:spike"))))));
			if (sourceentity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
				AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("worldstudios_world:make_them_bleed"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (itemstack.getItem() == WorldstudiosWorldModItems.AMETHESIUM_LUNGE.get()
					&& (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WorldstudiosWorldModMobEffects.BLEEDING) ? _livEnt.getEffect(WorldstudiosWorldModMobEffects.BLEEDING).getAmplifier() : 0) == 4) {
				if (sourceentity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
					AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("worldstudios_world:revenge"));
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
}