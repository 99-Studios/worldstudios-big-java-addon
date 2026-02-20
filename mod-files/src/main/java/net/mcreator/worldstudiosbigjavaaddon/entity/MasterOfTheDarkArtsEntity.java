package net.mcreator.worldstudiosbigjavaaddon.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.worldstudiosbigjavaaddon.procedures.MasterOfTheDarkArtsOnEntityTickUpdateProcedure;
import net.mcreator.worldstudiosbigjavaaddon.procedures.GivePlayerDarkEffectProcedure;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModEntities;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModBlocks;

public class MasterOfTheDarkArtsEntity extends Raider implements RangedAttackMob {
	public static final EnumProxy<Raid.RaiderType> RAIDER_TYPE = new EnumProxy<>(Raid.RaiderType.class, BigAddonModEntities.MASTER_OF_THE_DARK_ARTS, new int[]{0, 0, 0, 0, 0, 1, 3, 7});

	public MasterOfTheDarkArtsEntity(EntityType<MasterOfTheDarkArtsEntity> type, Level world) {
		super(type, world);
		xpReward = 50;
		setNoAi(false);
		setCustomName(Component.literal("Master Of The Dark Arts"));
		setCustomNameVisible(true);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 15, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource source, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(serverLevel, source, recentlyHitIn);
		this.spawnAtLocation(serverLevel, new ItemStack(BigAddonModBlocks.DARK_FLOWER.get()));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.evoker.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.evoker.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.evoker.death"));
	}

	@Override
	public SoundEvent getCelebrateSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.evoker.celebrate"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		MasterOfTheDarkArtsOnEntityTickUpdateProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		GivePlayerDarkEffectProcedure.execute(sourceentity);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		DarkProjectileEntity.shoot(this, target);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	@Override
	public void applyRaidBuffs(ServerLevel serverLevel, int num, boolean logic) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 60);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}