package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModItems;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

public class DinamiteExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BigAddonMod.queueServerWork(40, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z,
						(float) (5 * ((new ItemStack(BigAddonModItems.DINAMITE.get())
								.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("big_addon:explosion")))) + 1) / 2 - 0.5)),
						Level.ExplosionInteraction.TNT);
		});
	}
}