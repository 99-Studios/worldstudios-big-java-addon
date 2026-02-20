/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosbigjavaaddon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.worldstudiosbigjavaaddon.block.*;
import net.mcreator.worldstudiosbigjavaaddon.BigAddonMod;

import java.util.function.Function;

public class BigAddonModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BigAddonMod.MODID);
	public static final DeferredBlock<Block> ACID_FLUID;
	public static final DeferredBlock<Block> WASTE_BLOCK;
	public static final DeferredBlock<Block> WASTE_STONE;
	public static final DeferredBlock<Block> WASTE_LOG;
	public static final DeferredBlock<Block> WASTE_LEAVES;
	public static final DeferredBlock<Block> URAINIUM_CHUNK;
	public static final DeferredBlock<Block> GRAVITE;
	public static final DeferredBlock<Block> ORACLE_PORTAL;
	public static final DeferredBlock<Block> SEMITE;
	public static final DeferredBlock<Block> FORGIUM_ORE;
	public static final DeferredBlock<Block> MOLDELER;
	public static final DeferredBlock<Block> CAPSULE;
	public static final DeferredBlock<Block> CAPSULED_REDSTONE_BLOCK;
	public static final DeferredBlock<Block> HEVORE;
	public static final DeferredBlock<Block> BLOCK_OF_SPARKLES;
	public static final DeferredBlock<Block> GYRULE_ORE;
	public static final DeferredBlock<Block> ANDOR_WOOD;
	public static final DeferredBlock<Block> ANDOR_LOG;
	public static final DeferredBlock<Block> ANDOR_PLANKS;
	public static final DeferredBlock<Block> ANDOR_LEAVES;
	public static final DeferredBlock<Block> ANDOR_STAIRS;
	public static final DeferredBlock<Block> ANDOR_SLAB;
	public static final DeferredBlock<Block> ANDOR_FENCE;
	public static final DeferredBlock<Block> ANDOR_FENCE_GATE;
	public static final DeferredBlock<Block> ANDOR_PRESSURE_PLATE;
	public static final DeferredBlock<Block> ANDOR_BUTTON;
	public static final DeferredBlock<Block> YELLOW_DIRT;
	public static final DeferredBlock<Block> YELLOW_GRASS_BLOCK;
	public static final DeferredBlock<Block> BLAZITE_ORE;
	public static final DeferredBlock<Block> BLAZITE_BLOCK;
	public static final DeferredBlock<Block> BRAIN;
	public static final DeferredBlock<Block> GREEN_SAND;
	public static final DeferredBlock<Block> GREEN_SANDSTONE;
	public static final DeferredBlock<Block> SMOOTH_GREEN_SANDSTONE;
	public static final DeferredBlock<Block> FROZEN_GRAVITE;
	public static final DeferredBlock<Block> NACOR_WOOD;
	public static final DeferredBlock<Block> NACOR_LOG;
	public static final DeferredBlock<Block> NACOR_PLANKS;
	public static final DeferredBlock<Block> NACOR_LEAVES;
	public static final DeferredBlock<Block> NACOR_STAIRS;
	public static final DeferredBlock<Block> NACOR_SLAB;
	public static final DeferredBlock<Block> NACOR_FENCE;
	public static final DeferredBlock<Block> NACOR_FENCE_GATE;
	public static final DeferredBlock<Block> NACOR_PRESSURE_PLATE;
	public static final DeferredBlock<Block> NACOR_BUTTON;
	public static final DeferredBlock<Block> ICEY_GRASS;
	public static final DeferredBlock<Block> IGNIGHTIUM_ORE;
	public static final DeferredBlock<Block> IGNIGHTIUM_BLOCK;
	public static final DeferredBlock<Block> BRAIN_FLUID;
	public static final DeferredBlock<Block> DARK_FLOWER;
	public static final DeferredBlock<Block> ICE_PILLAR;
	public static final DeferredBlock<Block> IGNYITE;
	public static final DeferredBlock<Block> REBOUNDED_FIRE;
	public static final DeferredBlock<Block> BLOCK_OF_FLINT;
	public static final DeferredBlock<Block> BRANITE_ORE;
	public static final DeferredBlock<Block> AMETHESIUM_ORE;
	static {
		ACID_FLUID = register("acid_fluid", AcidFluidBlock::new);
		WASTE_BLOCK = register("waste_block", WasteBlockBlock::new);
		WASTE_STONE = register("waste_stone", WasteStoneBlock::new);
		WASTE_LOG = register("waste_log", WasteLogBlock::new);
		WASTE_LEAVES = register("waste_leaves", WasteLeavesBlock::new);
		URAINIUM_CHUNK = register("urainium_chunk", UrainiumChunkBlock::new);
		GRAVITE = register("gravite", GraviteBlock::new);
		ORACLE_PORTAL = register("oracle_portal", OraclePortalBlock::new);
		SEMITE = register("semite", SemiteBlock::new);
		FORGIUM_ORE = register("forgium_ore", ForgiumOreBlock::new);
		MOLDELER = register("moldeler", MoldelerBlock::new);
		CAPSULE = register("capsule", CapsuleBlock::new);
		CAPSULED_REDSTONE_BLOCK = register("capsuled_redstone_block", CapsuledRedstoneBlockBlock::new);
		HEVORE = register("hevore", HevoreBlock::new);
		BLOCK_OF_SPARKLES = register("block_of_sparkles", BlockOfSparklesBlock::new);
		GYRULE_ORE = register("gyrule_ore", GyruleOreBlock::new);
		ANDOR_WOOD = register("andor_wood", AndorWoodBlock::new);
		ANDOR_LOG = register("andor_log", AndorLogBlock::new);
		ANDOR_PLANKS = register("andor_planks", AndorPlanksBlock::new);
		ANDOR_LEAVES = register("andor_leaves", AndorLeavesBlock::new);
		ANDOR_STAIRS = register("andor_stairs", AndorStairsBlock::new);
		ANDOR_SLAB = register("andor_slab", AndorSlabBlock::new);
		ANDOR_FENCE = register("andor_fence", AndorFenceBlock::new);
		ANDOR_FENCE_GATE = register("andor_fence_gate", AndorFenceGateBlock::new);
		ANDOR_PRESSURE_PLATE = register("andor_pressure_plate", AndorPressurePlateBlock::new);
		ANDOR_BUTTON = register("andor_button", AndorButtonBlock::new);
		YELLOW_DIRT = register("yellow_dirt", YellowDirtBlock::new);
		YELLOW_GRASS_BLOCK = register("yellow_grass_block", YellowGrassBlockBlock::new);
		BLAZITE_ORE = register("blazite_ore", BlaziteOreBlock::new);
		BLAZITE_BLOCK = register("blazite_block", BlaziteBlockBlock::new);
		BRAIN = register("brain", BrainBlock::new);
		GREEN_SAND = register("green_sand", GreenSandBlock::new);
		GREEN_SANDSTONE = register("green_sandstone", GreenSandstoneBlock::new);
		SMOOTH_GREEN_SANDSTONE = register("smooth_green_sandstone", SmoothGreenSandstoneBlock::new);
		FROZEN_GRAVITE = register("frozen_gravite", FrozenGraviteBlock::new);
		NACOR_WOOD = register("nacor_wood", NacorWoodBlock::new);
		NACOR_LOG = register("nacor_log", NacorLogBlock::new);
		NACOR_PLANKS = register("nacor_planks", NacorPlanksBlock::new);
		NACOR_LEAVES = register("nacor_leaves", NacorLeavesBlock::new);
		NACOR_STAIRS = register("nacor_stairs", NacorStairsBlock::new);
		NACOR_SLAB = register("nacor_slab", NacorSlabBlock::new);
		NACOR_FENCE = register("nacor_fence", NacorFenceBlock::new);
		NACOR_FENCE_GATE = register("nacor_fence_gate", NacorFenceGateBlock::new);
		NACOR_PRESSURE_PLATE = register("nacor_pressure_plate", NacorPressurePlateBlock::new);
		NACOR_BUTTON = register("nacor_button", NacorButtonBlock::new);
		ICEY_GRASS = register("icey_grass", IceyGrassBlock::new);
		IGNIGHTIUM_ORE = register("ignightium_ore", IgnightiumOreBlock::new);
		IGNIGHTIUM_BLOCK = register("ignightium_block", IgnightiumBlockBlock::new);
		BRAIN_FLUID = register("brain_fluid", BrainFluidBlock::new);
		DARK_FLOWER = register("dark_flower", DarkFlowerBlock::new);
		ICE_PILLAR = register("ice_pillar", IcePillarBlock::new);
		IGNYITE = register("ignyite", IgnyiteBlock::new);
		REBOUNDED_FIRE = register("rebounded_fire", ReboundedFireBlock::new);
		BLOCK_OF_FLINT = register("block_of_flint", BlockOfFlintBlock::new);
		BRANITE_ORE = register("branite_ore", BraniteOreBlock::new);
		AMETHESIUM_ORE = register("amethesium_ore", AmethesiumOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}