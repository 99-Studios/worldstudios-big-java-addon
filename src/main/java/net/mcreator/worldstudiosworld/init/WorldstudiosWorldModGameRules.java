/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.gamerules.GameRuleTypeVisitor;
import net.minecraft.world.level.gamerules.GameRuleType;
import net.minecraft.world.level.gamerules.GameRuleCategory;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

import com.mojang.serialization.Codec;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class WorldstudiosWorldModGameRules {
	public static final DeferredRegister<GameRule<?>> REGISTRY = DeferredRegister.create(Registries.GAME_RULE, WorldstudiosWorldMod.MODID);
	public static DeferredHolder<GameRule<?>, GameRule<Boolean>> ENDER_HELMET_TELEPORT = registerBoolean("ender_helmet_teleport", GameRuleCategory.PLAYER, true);

	private static DeferredHolder<GameRule<?>, GameRule<Boolean>> registerBoolean(String registryname, GameRuleCategory category, boolean value) {
		return REGISTRY.register(registryname, () -> new GameRule<>(category, GameRuleType.BOOL, BoolArgumentType.bool(), GameRuleTypeVisitor::visitBoolean, Codec.BOOL, b -> b ? 1 : 0, value, FeatureFlagSet.of()));
	}
}