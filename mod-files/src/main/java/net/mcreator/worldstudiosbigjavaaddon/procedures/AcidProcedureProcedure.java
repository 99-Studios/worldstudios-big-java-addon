package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModMobEffects;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModItems;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class AcidProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean AcidArmor = false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == BigAddonModItems.ACID_ARMOR_HELMET.get()) {
			AcidArmor = true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == BigAddonModItems.ACID_ARMOR_CHESTPLATE.get()) {
			AcidArmor = true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == BigAddonModItems.ACID_ARMOR_LEGGINGS.get()) {
			AcidArmor = true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == BigAddonModItems.ACID_ARMOR_BOOTS.get()) {
			AcidArmor = true;
		}
		if (AcidArmor == false) {
			BigAddonMod.queueServerWork((int) (30 / (((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BigAddonModMobEffects.ACID_EFFECT) ? _livEnt.getEffect(BigAddonModMobEffects.ACID_EFFECT).getAmplifier() : 0) + 1) / 1.5)), () -> {
				entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("big_addon:acid_damage")))),
						1 * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BigAddonModMobEffects.ACID_EFFECT) ? _livEnt.getEffect(BigAddonModMobEffects.ACID_EFFECT).getAmplifier() : 0) + 1));
			});
		}
	}
}