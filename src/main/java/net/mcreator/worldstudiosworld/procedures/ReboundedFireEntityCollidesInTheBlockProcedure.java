package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.worldstudiosworld.network.WorldstudiosWorldModVariables;

public class ReboundedFireEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.IN_FIRE)), 5);
		WorldstudiosWorldModVariables.MapVariables.get(world).ReboundedFireVariable = true;
		WorldstudiosWorldModVariables.MapVariables.get(world).markSyncDirty();
	}
}