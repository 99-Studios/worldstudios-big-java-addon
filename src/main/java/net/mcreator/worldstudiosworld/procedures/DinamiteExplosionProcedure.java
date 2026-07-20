package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class DinamiteExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WorldstudiosWorldMod.queueServerWork(40, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z,
						(float) (5 * ((new ItemStack(WorldstudiosWorldModItems.DINAMITE.get())
								.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, Identifier.parse("worldstudios_world:explosion")))) + 1) / 2 - 0.5)),
						Level.ExplosionInteraction.TNT);
		});
	}
}