package net.mcreator.worldstudiosbigjavaaddon.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import net.mcreator.worldstudiosbigjavaaddon.world.inventory.TrashBagInventoryMenu;
import net.mcreator.worldstudiosbigjavaaddon.init.BigAddonModItems;

import javax.annotation.Nonnull;

@EventBusSubscriber
public class TrashBagInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == BigAddonModItems.TRASH_BAG.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof TrashBagInventoryMenu)
				player.closeContainer();
		}
	}

	public TrashBagInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 18);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 64;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != BigAddonModItems.TRASH_BAG.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}