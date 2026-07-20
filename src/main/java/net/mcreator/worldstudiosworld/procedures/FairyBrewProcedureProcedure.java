package net.mcreator.worldstudiosworld.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.worldstudiosworld.entity.FairyEntity;

public class FairyBrewProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof FairyEntity _datEntSetL)
			_datEntSetL.getEntityData().set(FairyEntity.DATA_FairyBrew, true);
	}
}