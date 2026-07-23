package net.mcreator.worldstudiosworld.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;

public class GirtreeBoatEntity extends Boat {
	public GirtreeBoatEntity(EntityType<GirtreeBoatEntity> type, Level world) {
		super(type, world, WorldstudiosWorldModItems.GIRTREE_BOAT);
	}
}