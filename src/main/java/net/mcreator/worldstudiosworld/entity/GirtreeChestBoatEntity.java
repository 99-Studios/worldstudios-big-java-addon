package net.mcreator.worldstudiosworld.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;

public class GirtreeChestBoatEntity extends ChestBoat {
	public GirtreeChestBoatEntity(EntityType<GirtreeChestBoatEntity> type, Level world) {
		super(type, world, WorldstudiosWorldModItems.GIRTREE_CHEST_BOAT);
	}
}