package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.worldstudiosbigjavaaddon.network.BigAddonModVariables;

public class ReboundedFireEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.IN_FIRE)), 5);
		BigAddonModVariables.MapVariables.get(world).ReboundedFireVariable = true;
		BigAddonModVariables.MapVariables.get(world).markSyncDirty();
	}
}