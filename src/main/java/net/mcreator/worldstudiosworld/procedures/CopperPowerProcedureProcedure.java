package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class CopperPowerProcedureProcedure {
	public static void execute(LevelAccessor world, BlockState blockstate, ItemStack itemstack) {
		if (blockstate.getBlock() == Blocks.COPPER_ORE || blockstate.getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
			if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, Identifier.parse("worldstudios_world:copper_power")))) != 0) {
				if (world instanceof ServerLevel _level) {
					itemstack.hurtAndBreak((-1) * itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, Identifier.parse("worldstudios_world:copper_power")))),
							_level, null, _stkprov -> {
							});
				}
			}
		}
	}
}