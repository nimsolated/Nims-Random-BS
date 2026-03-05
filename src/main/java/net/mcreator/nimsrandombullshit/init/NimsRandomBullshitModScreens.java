
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.nimsrandombullshit.client.gui.ShitGUIScreen;
import net.mcreator.nimsrandombullshit.client.gui.OreMinerGUIScreen;
import net.mcreator.nimsrandombullshit.client.gui.MailboxGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NimsRandomBullshitModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(NimsRandomBullshitModMenus.SHIT_GUI.get(), ShitGUIScreen::new);
			MenuScreens.register(NimsRandomBullshitModMenus.ORE_MINER_GUI.get(), OreMinerGUIScreen::new);
			MenuScreens.register(NimsRandomBullshitModMenus.MAILBOX_GUI.get(), MailboxGUIScreen::new);
		});
	}
}
