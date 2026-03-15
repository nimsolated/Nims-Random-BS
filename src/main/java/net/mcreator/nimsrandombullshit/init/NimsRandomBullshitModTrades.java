
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NimsRandomBullshitModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == NimsRandomBullshitModVillagerProfessions.MAILMAN_PROFESSION.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(NimsRandomBullshitModItems.SHIPPING_LABEL.get(), 12), 100, 5, 0.05f));
		}
	}
}
