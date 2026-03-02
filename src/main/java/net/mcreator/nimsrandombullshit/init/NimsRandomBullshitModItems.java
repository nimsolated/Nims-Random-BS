
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nimsrandombullshit.item.ShitItem;
import net.mcreator.nimsrandombullshit.item.SandDustItem;
import net.mcreator.nimsrandombullshit.item.NetherrackitePickaxeItem;
import net.mcreator.nimsrandombullshit.item.NetherrackiteItem;
import net.mcreator.nimsrandombullshit.item.MagicFleshItem;
import net.mcreator.nimsrandombullshit.item.MagicDustItem;
import net.mcreator.nimsrandombullshit.item.LapisLazuliNuggetItem;
import net.mcreator.nimsrandombullshit.item.GravediggerItem;
import net.mcreator.nimsrandombullshit.item.GoldenBerriesItem;
import net.mcreator.nimsrandombullshit.item.BlockEaterItem;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

public class NimsRandomBullshitModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<Item> CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> CONDENSED_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> CONDENSED_CONDENSED_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.CONDENSED_CONDENSED_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> BLOCK_EATER = REGISTRY.register("block_eater", () -> new BlockEaterItem());
	public static final RegistryObject<Item> BROKEN_GLASS = block(NimsRandomBullshitModBlocks.BROKEN_GLASS);
	public static final RegistryObject<Item> QUADRA_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.QUADRA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> NETHERRACKITE_PICKAXE = REGISTRY.register("netherrackite_pickaxe", () -> new NetherrackitePickaxeItem());
	public static final RegistryObject<Item> NETHERRACKITE = REGISTRY.register("netherrackite", () -> new NetherrackiteItem());
	public static final RegistryObject<Item> PENTA_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.PENTA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> HEXA_CONDENSED_NETHERRACK = block(NimsRandomBullshitModBlocks.HEXA_CONDENSED_NETHERRACK);
	public static final RegistryObject<Item> SAND_DUST = REGISTRY.register("sand_dust", () -> new SandDustItem());
	public static final RegistryObject<Item> LAPIS_LAZULI_NUGGET = REGISTRY.register("lapis_lazuli_nugget", () -> new LapisLazuliNuggetItem());
	public static final RegistryObject<Item> MAGIC_DUST = REGISTRY.register("magic_dust", () -> new MagicDustItem());
	public static final RegistryObject<Item> MAGIC_FLESH = REGISTRY.register("magic_flesh", () -> new MagicFleshItem());
	public static final RegistryObject<Item> SHIT = REGISTRY.register("shit", () -> new ShitItem());
	public static final RegistryObject<Item> GOLDEN_BERRIES = REGISTRY.register("golden_berries", () -> new GoldenBerriesItem());
	public static final RegistryObject<Item> ORE_MINER = block(NimsRandomBullshitModBlocks.ORE_MINER);
	public static final RegistryObject<Item> GHOUL_SPAWN_EGG = REGISTRY.register("ghoul_spawn_egg", () -> new ForgeSpawnEggItem(NimsRandomBullshitModEntities.GHOUL, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> GRAVEDIGGER = REGISTRY.register("gravedigger", () -> new GravediggerItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
