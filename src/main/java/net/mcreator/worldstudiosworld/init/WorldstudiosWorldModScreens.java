/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worldstudiosworld.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.worldstudiosworld.client.gui.TrashBagInventoryScreen;

@EventBusSubscriber(Dist.CLIENT)
public class WorldstudiosWorldModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(WorldstudiosWorldModMenus.TRASH_BAG_INVENTORY.get(), TrashBagInventoryScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}