
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NimsRandomBullshitModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NimsRandomBullshitMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NimsRandomBullshitModBlocks.CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.BROKEN_GLASS.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.QUADRA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.PENTA_CONDENSED_NETHERRACK.get().asItem());
			tabData.accept(NimsRandomBullshitModBlocks.HEXA_CONDENSED_NETHERRACK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NimsRandomBullshitModItems.BLOCK_EATER.get());
			tabData.accept(NimsRandomBullshitModItems.NETHERRACKITE_PICKAXE.get());
			tabData.accept(NimsRandomBullshitModItems.SHIT.get());
			tabData.accept(NimsRandomBullshitModItems.GRAVEDIGGER.get());
			tabData.accept(NimsRandomBullshitModItems.STAR_WAND.get());
			tabData.accept(NimsRandomBullshitModItems.NETHERRACK_JUICE_BUCKET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NimsRandomBullshitModItems.NETHERRACKITE.get());
			tabData.accept(NimsRandomBullshitModItems.SAND_DUST.get());
			tabData.accept(NimsRandomBullshitModItems.LAPIS_LAZULI_NUGGET.get());
			tabData.accept(NimsRandomBullshitModItems.MAGIC_DUST.get());
			tabData.accept(NimsRandomBullshitModItems.STAR.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(NimsRandomBullshitModItems.MAGIC_FLESH.get());
			tabData.accept(NimsRandomBullshitModItems.GOLDEN_BERRIES.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(NimsRandomBullshitModBlocks.ORE_MINER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NimsRandomBullshitModItems.GHOUL_SPAWN_EGG.get());
		}
	}
}
