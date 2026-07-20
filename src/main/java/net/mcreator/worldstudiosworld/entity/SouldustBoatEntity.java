package net.mcreator.worldstudiosworld.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;

public class SouldustBoatEntity extends Boat {
	public SouldustBoatEntity(EntityType<SouldustBoatEntity> type, Level world) {
		super(type, world, WorldstudiosWorldModItems.SOULDUST_BOAT);
	}
}