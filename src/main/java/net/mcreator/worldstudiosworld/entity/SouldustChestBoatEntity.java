package net.mcreator.worldstudiosworld.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.worldstudiosworld.init.WorldstudiosWorldModItems;

public class SouldustChestBoatEntity extends ChestBoat {
	public SouldustChestBoatEntity(EntityType<SouldustChestBoatEntity> type, Level world) {
		super(type, world, WorldstudiosWorldModItems.SOULDUST_CHEST_BOAT);
	}
}