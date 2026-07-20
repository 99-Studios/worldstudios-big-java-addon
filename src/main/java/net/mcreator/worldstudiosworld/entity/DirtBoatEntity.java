package net.mcreator.worldstudiosworld.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;

public class DirtBoatEntity extends Boat {
	public DirtBoatEntity(EntityType<DirtBoatEntity> type, Level world) {
		super(type, world, WorldstudiosWorldModItems.DIRT_BOAT);
	}
}