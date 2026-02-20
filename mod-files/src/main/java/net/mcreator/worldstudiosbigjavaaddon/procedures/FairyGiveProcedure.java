package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModMobEffects;

public class FairyGiveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(BigAddonModMobEffects.FAIRY_BLESSING, 600, 1));
		if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
			AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("big_addon:spread_the_love"));
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