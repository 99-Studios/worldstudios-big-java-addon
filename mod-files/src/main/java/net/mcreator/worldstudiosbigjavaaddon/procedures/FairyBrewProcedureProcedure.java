package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.worldstudiosbigjavaaddon.entity.FairyEntity;

public class FairyBrewProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof FairyEntity _datEntSetL)
			_datEntSetL.getEntityData().set(FairyEntity.DATA_FairyBrew, true);
	}
}