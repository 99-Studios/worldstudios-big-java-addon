package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

public class MasterOfTheDarkArtsOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		WorldstudiosWorldMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 1200, 12000), () -> {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WorldstudiosWorldModItems.DARK_SPLATTER.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		});
	}
}