package net.mcreator.worldstudiosworld.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;

public class SteelBoatEntity extends Boat {
	public SteelBoatEntity(EntityType<SteelBoatEntity> type, Level world) {
		super(type, world, WorldstudiosWorldModItems.STEEL_BOAT);
	}
}