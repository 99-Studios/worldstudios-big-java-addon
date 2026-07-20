package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModMobEffects;
import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class AcidProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean AcidArmor = false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == WorldstudiosWorldModItems.ACID_ARMOR_HELMET.get()) {
			AcidArmor = true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == WorldstudiosWorldModItems.ACID_ARMOR_CHESTPLATE.get()) {
			AcidArmor = true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == WorldstudiosWorldModItems.ACID_ARMOR_LEGGINGS.get()) {
			AcidArmor = true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == WorldstudiosWorldModItems.ACID_ARMOR_BOOTS.get()) {
			AcidArmor = true;
		}
		if (AcidArmor == false) {
			WorldstudiosWorldMod.queueServerWork(
					(int) (30 / (((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WorldstudiosWorldModMobEffects.ACID_EFFECT) ? _livEnt.getEffect(WorldstudiosWorldModMobEffects.ACID_EFFECT).getAmplifier() : 0) + 1) / 1.5)), () -> {
						{
							Entity _ent = entity;
							if (_ent.level() instanceof ServerLevel _serverLevel) {
								_ent.hurtServer(_serverLevel, new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.parse("worldstudios_world:acid_damage")))),
										1 * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WorldstudiosWorldModMobEffects.ACID_EFFECT) ? _livEnt.getEffect(WorldstudiosWorldModMobEffects.ACID_EFFECT).getAmplifier() : 0) + 1));
							}
						}
					});
		}
	}
}