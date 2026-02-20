package net.mcreator.worldstudiosbigjavaaddon.item;

import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.ItemAbilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.worldstudiosbigjavaaddon.procedures.FogiumMultitoolProcedureProcedure;

public class ForgiumMultitoolItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5052, 16f, 0, 26, TagKey.create(Registries.ITEM, ResourceLocation.parse("big_addon:forgium_multitool_repair_items")));

	public ForgiumMultitoolItem(Item.Properties properties) {
		super(TOOL_MATERIAL.applyToolProperties(properties, BlockTags.MINEABLE_WITH_PICKAXE, 12f, -2.4f, 0)
				.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 12, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build())
				.setNoCombineRepair());
	}

	@Override
	public boolean isCorrectToolForDrops(ItemStack itemstack, BlockState blockstate) {
		return blockstate.is(BlockTags.MINEABLE_WITH_AXE) || blockstate.is(BlockTags.MINEABLE_WITH_HOE) || blockstate.is(BlockTags.MINEABLE_WITH_PICKAXE) || blockstate.is(BlockTags.MINEABLE_WITH_SHOVEL);
	}

	@Override
	public boolean canPerformAction(ItemStack stack, ItemAbility toolAction) {
		return ItemAbilities.DEFAULT_AXE_ACTIONS.contains(toolAction) || ItemAbilities.DEFAULT_HOE_ACTIONS.contains(toolAction) || ItemAbilities.DEFAULT_SHOVEL_ACTIONS.contains(toolAction) || toolAction == ItemAbilities.SWORD_SWEEP;
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
		return 16f;
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		itemstack.hurtAndBreak(1, entity, LivingEntity.getSlotForHand(entity.getUsedItemHand()));
		FogiumMultitoolProcedureProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		itemstack.hurtAndBreak(2, entity, LivingEntity.getSlotForHand(entity.getUsedItemHand()));
		FogiumMultitoolProcedureProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		return new ItemStack(this);
	}
}