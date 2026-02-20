package net.mcreator.worldstudiosbigjavaaddon.procedures;

import org.checkerframework.checker.units.qual.Speed;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModItems;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModGameRules;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

import java.util.Set;

public class EnderHelmetHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Speed = 0;
		if ((world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(BigAddonModGameRules.ENDER_HELMET_TELEPORT)) == true) {
			if (new ItemStack(BigAddonModItems.ENDER_HELMET_HELMET.get())
					.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("big_addon:fast_teleport")))) != 0) {
				Speed = 2.5 + new ItemStack(BigAddonModItems.ENDER_HELMET_HELMET.get())
						.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("big_addon:fast_teleport"))));
			} else {
				Speed = 1;
			}
			BigAddonMod.queueServerWork((int) (50 / Speed), () -> {
				if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _serverLevel) {
					ResourceKey<Level> destinationType = Level.OVERWORLD;
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _serverLevel.getServer().getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), Set.of(), _player.getYRot(), _player.getXRot(), true);
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			});
		}
	}
}