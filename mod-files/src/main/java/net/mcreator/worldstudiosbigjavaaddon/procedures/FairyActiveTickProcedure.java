package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.worldstudiosbigjavaaddon.entity.FairyEntity;

public class FairyActiveTickProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof FairyEntity _datEntL0 && _datEntL0.getEntityData().get(FairyEntity.DATA_FairyBrew)) == true) {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(x, (y + 200), z, 1);
		}
	}
}