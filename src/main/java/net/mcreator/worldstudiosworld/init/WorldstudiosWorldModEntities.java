/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.worldstudiosworld.entity.*;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

@EventBusSubscriber
public class WorldstudiosWorldModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, WorldstudiosWorldMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DinamiteProjectileEntity>> DINAMITE_PROJECTILE = register("dinamite_projectile",
			EntityType.Builder.<DinamiteProjectileEntity>of(DinamiteProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LongZombieEntity>> LONG_ZOMBIE = register("long_zombie",
			EntityType.Builder.<LongZombieEntity>of(LongZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TitanEntity>> TITAN = register("titan",
			EntityType.Builder.<TitanEntity>of(TitanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FairyEntity>> FAIRY = register("fairy",
			EntityType.Builder.<FairyEntity>of(FairyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProdEntity>> PROD = register("prod",
			EntityType.Builder.<ProdEntity>of(ProdEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProdMissleEntity>> PROD_MISSLE = register("prod_missle",
			EntityType.Builder.<ProdMissleEntity>of(ProdMissleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SugarEntityEntity>> SUGAR_ENTITY = register("sugar_entity",
			EntityType.Builder.<SugarEntityEntity>of(SugarEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BirdBrainEntity>> BIRD_BRAIN = register("bird_brain",
			EntityType.Builder.<BirdBrainEntity>of(BirdBrainEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkBatEntity>> DARK_BAT = register("dark_bat",
			EntityType.Builder.<DarkBatEntity>of(DarkBatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThiefEntity>> THIEF = register("thief",
			EntityType.Builder.<ThiefEntity>of(ThiefEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RadiantZombieEntity>> RADIANT_ZOMBIE = register("radiant_zombie",
			EntityType.Builder.<RadiantZombieEntity>of(RadiantZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<YetiEntity>> YETI = register("yeti",
			EntityType.Builder.<YetiEntity>of(YetiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IceDragonEntity>> ICE_DRAGON = register("ice_dragon",
			EntityType.Builder.<IceDragonEntity>of(IceDragonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IceDragonProjectileEntity>> ICE_DRAGON_PROJECTILE = register("ice_dragon_projectile",
			EntityType.Builder.<IceDragonProjectileEntity>of(IceDragonProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MasterOfTheDarkArtsEntity>> MASTER_OF_THE_DARK_ARTS = register("master_of_the_dark_arts",
			EntityType.Builder.<MasterOfTheDarkArtsEntity>of(MasterOfTheDarkArtsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkPhantomEntity>> DARK_PHANTOM = register("dark_phantom",
			EntityType.Builder.<DarkPhantomEntity>of(DarkPhantomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkProjectileEntity>> DARK_PROJECTILE = register("dark_projectile",
			EntityType.Builder.<DarkProjectileEntity>of(DarkProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<WalkingChestEntity>> WALKING_CHEST = register("walking_chest",
			EntityType.Builder.<WalkingChestEntity>of(WalkingChestEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<BullEntity>> BULL = register("bull",
			EntityType.Builder.<BullEntity>of(BullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CuberEntity>> CUBER = register("cuber",
			EntityType.Builder.<CuberEntity>of(CuberEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SteelBoatEntity>> STEEL_BOAT = register("steel_boat",
			EntityType.Builder.<SteelBoatEntity>of(SteelBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<CrawlpingEntity>> CRAWLPING = register("crawlping",
			EntityType.Builder.<CrawlpingEntity>of(CrawlpingEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SawpingEntity>> SAWPING = register("sawping",
			EntityType.Builder.<SawpingEntity>of(SawpingEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SouldustBoatEntity>> SOULDUST_BOAT = register("souldust_boat",
			EntityType.Builder.<SouldustBoatEntity>of(SouldustBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<SouldustChestBoatEntity>> SOULDUST_CHEST_BOAT = register("souldust_chest_boat",
			EntityType.Builder.<SouldustChestBoatEntity>of(SouldustChestBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<DirtBoatEntity>> DIRT_BOAT = register("dirt_boat",
			EntityType.Builder.<DirtBoatEntity>of(DirtBoatEntity::new, MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(WorldstudiosWorldMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		LongZombieEntity.init(event);
		TitanEntity.init(event);
		FairyEntity.init(event);
		ProdEntity.init(event);
		SugarEntityEntity.init(event);
		BirdBrainEntity.init(event);
		DarkBatEntity.init(event);
		ThiefEntity.init(event);
		RadiantZombieEntity.init(event);
		YetiEntity.init(event);
		IceDragonEntity.init(event);
		MasterOfTheDarkArtsEntity.init(event);
		DarkPhantomEntity.init(event);
		WalkingChestEntity.init(event);
		BullEntity.init(event);
		CuberEntity.init(event);
		CrawlpingEntity.init(event);
		SawpingEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LONG_ZOMBIE.get(), LongZombieEntity.createAttributes().build());
		event.put(TITAN.get(), TitanEntity.createAttributes().build());
		event.put(FAIRY.get(), FairyEntity.createAttributes().build());
		event.put(PROD.get(), ProdEntity.createAttributes().build());
		event.put(SUGAR_ENTITY.get(), SugarEntityEntity.createAttributes().build());
		event.put(BIRD_BRAIN.get(), BirdBrainEntity.createAttributes().build());
		event.put(DARK_BAT.get(), DarkBatEntity.createAttributes().build());
		event.put(THIEF.get(), ThiefEntity.createAttributes().build());
		event.put(RADIANT_ZOMBIE.get(), RadiantZombieEntity.createAttributes().build());
		event.put(YETI.get(), YetiEntity.createAttributes().build());
		event.put(ICE_DRAGON.get(), IceDragonEntity.createAttributes().build());
		event.put(MASTER_OF_THE_DARK_ARTS.get(), MasterOfTheDarkArtsEntity.createAttributes().build());
		event.put(DARK_PHANTOM.get(), DarkPhantomEntity.createAttributes().build());
		event.put(WALKING_CHEST.get(), WalkingChestEntity.createAttributes().build());
		event.put(BULL.get(), BullEntity.createAttributes().build());
		event.put(CUBER.get(), CuberEntity.createAttributes().build());
		event.put(CRAWLPING.get(), CrawlpingEntity.createAttributes().build());
		event.put(SAWPING.get(), SawpingEntity.createAttributes().build());
	}
}