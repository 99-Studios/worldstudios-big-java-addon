/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.Sheets;

import net.mcreator.worldstudiosworld.block.*;
import net.mcreator.worldstudiosworld.WorldstudiosWorldMod;

import java.util.function.Function;

@EventBusSubscriber
public class WorldstudiosWorldModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(WorldstudiosWorldMod.MODID);
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
	public static final DeferredBlock<Block> CUTEPLANT;
	public static final DeferredBlock<Block> SOULDUST_LOG;
	public static final DeferredBlock<Block> SOULDUST_WOOD;
	public static final DeferredBlock<Block> STRIPPED_SOULDUST_LOG;
	public static final DeferredBlock<Block> STRIPPED_SOULDUST_WOOD;
	public static final DeferredBlock<Block> SOULDUST_PLANKS;
	public static final DeferredBlock<Block> SOULDUST_LEAVES;
	public static final DeferredBlock<Block> SOULDUST_STAIRS;
	public static final DeferredBlock<Block> SOULDUST_SLAB;
	public static final DeferredBlock<Block> SOULDUST_FENCE;
	public static final DeferredBlock<Block> SOULDUST_FENCE_GATE;
	public static final DeferredBlock<Block> SOULDUST_DOOR;
	public static final DeferredBlock<Block> SOULDUST_TRAPDOOR;
	public static final DeferredBlock<Block> SOULDUST_PRESSURE_PLATE;
	public static final DeferredBlock<Block> SOULDUST_BUTTON;
	public static final DeferredBlock<Block> SOULDUST_SIGN;
	public static final DeferredBlock<Block> SOULDUST_WALL_SIGN;
	public static final DeferredBlock<Block> SOULDUST_HANGING_SIGN;
	public static final DeferredBlock<Block> SOULDUST_WALL_HANGING_SIGN;
	public static final DeferredBlock<Block> GRAYSTONE;
	public static final DeferredBlock<Block> SKIP_PORTAL;
	public static final DeferredBlock<Block> DUAL_WEED;
	public static final DeferredBlock<Block> BREAKABLE_BEDROCK;
	public static final DeferredBlock<Block> EYEFLOWER;
	public static final DeferredBlock<Block> SOULDUST_GRAVITE;
	public static final DeferredBlock<Block> DIRT_CHEST;
	public static final DeferredBlock<Block> DARKENED_SAND;
	public static final DeferredBlock<Block> GIRTREE_LOG;
	public static final DeferredBlock<Block> GIRTREE_WOOD;
	public static final DeferredBlock<Block> STRIPPED_GIRTREE_LOG;
	public static final DeferredBlock<Block> STRIPPED_GIRTREE_WOOD;
	public static final DeferredBlock<Block> GIRTREE_PLANKS;
	public static final DeferredBlock<Block> GIRTREE_LEAVES;
	public static final DeferredBlock<Block> GIRTREE_STAIRS;
	public static final DeferredBlock<Block> GIRTREE_SLAB;
	public static final DeferredBlock<Block> GIRTREE_FENCE;
	public static final DeferredBlock<Block> GIRTREE_FENCE_GATE;
	public static final DeferredBlock<Block> GIRTREE_DOOR;
	public static final DeferredBlock<Block> GIRTREE_TRAPDOOR;
	public static final DeferredBlock<Block> GIRTREE_PRESSURE_PLATE;
	public static final DeferredBlock<Block> GIRTREE_BUTTON;
	public static final DeferredBlock<Block> GIRTREE_SIGN;
	public static final DeferredBlock<Block> GIRTREE_WALL_SIGN;
	public static final DeferredBlock<Block> GIRTREE_HANGING_SIGN;
	public static final DeferredBlock<Block> GIRTREE_WALL_HANGING_SIGN;
	public static final DeferredBlock<Block> DIRTY_WATER;
	public static final DeferredBlock<Block> SOGGY_DARKENED_SAND;
	public static final DeferredBlock<Block> GIRSTONE;
	public static final DeferredBlock<Block> TRAVERTINE;
	public static final DeferredBlock<Block> TALLMOSS;
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
		CUTEPLANT = register("cuteplant", CuteplantBlock::new);
		SOULDUST_LOG = register("souldust_log", SouldustLogBlock::new);
		SOULDUST_WOOD = register("souldust_wood", SouldustWoodBlock::new);
		STRIPPED_SOULDUST_LOG = register("stripped_souldust_log", StrippedSouldustLogBlock::new);
		STRIPPED_SOULDUST_WOOD = register("stripped_souldust_wood", StrippedSouldustWoodBlock::new);
		SOULDUST_PLANKS = register("souldust_planks", SouldustPlanksBlock::new);
		SOULDUST_LEAVES = register("souldust_leaves", SouldustLeavesBlock::new);
		SOULDUST_STAIRS = register("souldust_stairs", SouldustStairsBlock::new);
		SOULDUST_SLAB = register("souldust_slab", SouldustSlabBlock::new);
		SOULDUST_FENCE = register("souldust_fence", SouldustFenceBlock::new);
		SOULDUST_FENCE_GATE = register("souldust_fence_gate", SouldustFenceGateBlock::new);
		SOULDUST_DOOR = register("souldust_door", SouldustDoorBlock::new);
		SOULDUST_TRAPDOOR = register("souldust_trapdoor", SouldustTrapdoorBlock::new);
		SOULDUST_PRESSURE_PLATE = register("souldust_pressure_plate", SouldustPressurePlateBlock::new);
		SOULDUST_BUTTON = register("souldust_button", SouldustButtonBlock::new);
		SOULDUST_SIGN = register("souldust_sign", SouldustSignBlock::new);
		SOULDUST_WALL_SIGN = register("souldust_wall_sign", SouldustWallSignBlock::new);
		SOULDUST_HANGING_SIGN = register("souldust_hanging_sign", SouldustHangingSignBlock::new);
		SOULDUST_WALL_HANGING_SIGN = register("souldust_wall_hanging_sign", SouldustWallHangingSignBlock::new);
		GRAYSTONE = register("graystone", GraystoneBlock::new);
		SKIP_PORTAL = register("skip_portal", SkipPortalBlock::new);
		DUAL_WEED = register("dual_weed", DualWeedBlock::new);
		BREAKABLE_BEDROCK = register("breakable_bedrock", BreakableBedrockBlock::new);
		EYEFLOWER = register("eyeflower", EyeflowerBlock::new);
		SOULDUST_GRAVITE = register("souldust_gravite", SouldustGraviteBlock::new);
		DIRT_CHEST = register("dirt_chest", DirtChestBlock::new);
		DARKENED_SAND = register("darkened_sand", DarkenedSandBlock::new);
		GIRTREE_LOG = register("girtree_log", GirtreeLogBlock::new);
		GIRTREE_WOOD = register("girtree_wood", GirtreeWoodBlock::new);
		STRIPPED_GIRTREE_LOG = register("stripped_girtree_log", StrippedGirtreeLogBlock::new);
		STRIPPED_GIRTREE_WOOD = register("stripped_girtree_wood", StrippedGirtreeWoodBlock::new);
		GIRTREE_PLANKS = register("girtree_planks", GirtreePlanksBlock::new);
		GIRTREE_LEAVES = register("girtree_leaves", GirtreeLeavesBlock::new);
		GIRTREE_STAIRS = register("girtree_stairs", GirtreeStairsBlock::new);
		GIRTREE_SLAB = register("girtree_slab", GirtreeSlabBlock::new);
		GIRTREE_FENCE = register("girtree_fence", GirtreeFenceBlock::new);
		GIRTREE_FENCE_GATE = register("girtree_fence_gate", GirtreeFenceGateBlock::new);
		GIRTREE_DOOR = register("girtree_door", GirtreeDoorBlock::new);
		GIRTREE_TRAPDOOR = register("girtree_trapdoor", GirtreeTrapdoorBlock::new);
		GIRTREE_PRESSURE_PLATE = register("girtree_pressure_plate", GirtreePressurePlateBlock::new);
		GIRTREE_BUTTON = register("girtree_button", GirtreeButtonBlock::new);
		GIRTREE_SIGN = register("girtree_sign", GirtreeSignBlock::new);
		GIRTREE_WALL_SIGN = register("girtree_wall_sign", GirtreeWallSignBlock::new);
		GIRTREE_HANGING_SIGN = register("girtree_hanging_sign", GirtreeHangingSignBlock::new);
		GIRTREE_WALL_HANGING_SIGN = register("girtree_wall_hanging_sign", GirtreeWallHangingSignBlock::new);
		DIRTY_WATER = register("dirty_water", DirtyWaterBlock::new);
		SOGGY_DARKENED_SAND = register("soggy_darkened_sand", SoggyDarkenedSandBlock::new);
		GIRSTONE = register("girstone", GirstoneBlock::new);
		TRAVERTINE = register("travertine", TravertineBlock::new);
		TALLMOSS = register("tallmoss", TallmossBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Sheets.addWoodType(WorldstudiosWorldModWoodTypes.SOULDUST_SIGN_WOOD_TYPE);
			Sheets.addWoodType(WorldstudiosWorldModWoodTypes.SOULDUST_HANGING_SIGN_WOOD_TYPE);
			Sheets.addWoodType(WorldstudiosWorldModWoodTypes.GIRTREE_SIGN_WOOD_TYPE);
			Sheets.addWoodType(WorldstudiosWorldModWoodTypes.GIRTREE_HANGING_SIGN_WOOD_TYPE);
		}
	}

	@SubscribeEvent
	public static void registerSigns(BlockEntityTypeAddBlocksEvent event) {
		event.modify(BlockEntityType.SIGN, SOULDUST_SIGN.get(), SOULDUST_WALL_SIGN.get());
		event.modify(BlockEntityType.HANGING_SIGN, SOULDUST_HANGING_SIGN.get(), SOULDUST_WALL_HANGING_SIGN.get());
		event.modify(BlockEntityType.SIGN, GIRTREE_SIGN.get(), GIRTREE_WALL_SIGN.get());
		event.modify(BlockEntityType.HANGING_SIGN, GIRTREE_HANGING_SIGN.get(), GIRTREE_WALL_HANGING_SIGN.get());
	}
}