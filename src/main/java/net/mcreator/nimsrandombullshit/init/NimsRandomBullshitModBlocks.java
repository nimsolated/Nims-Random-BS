
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nimsrandombullshit.block.QuadraCondensedNetherrackBlock;
import net.mcreator.nimsrandombullshit.block.PentaCondensedNetherrackBlock;
import net.mcreator.nimsrandombullshit.block.OreMinerBlock;
import net.mcreator.nimsrandombullshit.block.NetherrackJuiceBlock;
import net.mcreator.nimsrandombullshit.block.MailboxBlock;
import net.mcreator.nimsrandombullshit.block.LabelCopyMachineBlock;
import net.mcreator.nimsrandombullshit.block.HexaCondensedNetherrackBlock;
import net.mcreator.nimsrandombullshit.block.CondensedNetherrackBlock;
import net.mcreator.nimsrandombullshit.block.CondensedCondensedNetherrackBlock;
import net.mcreator.nimsrandombullshit.block.CondensedCondensedCondensedNetherrackBlock;
import net.mcreator.nimsrandombullshit.block.BrokenGlassBlock;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

public class NimsRandomBullshitModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<Block> CONDENSED_NETHERRACK = REGISTRY.register("condensed_netherrack", () -> new CondensedNetherrackBlock());
	public static final RegistryObject<Block> CONDENSED_CONDENSED_NETHERRACK = REGISTRY.register("condensed_condensed_netherrack", () -> new CondensedCondensedNetherrackBlock());
	public static final RegistryObject<Block> CONDENSED_CONDENSED_CONDENSED_NETHERRACK = REGISTRY.register("condensed_condensed_condensed_netherrack", () -> new CondensedCondensedCondensedNetherrackBlock());
	public static final RegistryObject<Block> BROKEN_GLASS = REGISTRY.register("broken_glass", () -> new BrokenGlassBlock());
	public static final RegistryObject<Block> QUADRA_CONDENSED_NETHERRACK = REGISTRY.register("quadra_condensed_netherrack", () -> new QuadraCondensedNetherrackBlock());
	public static final RegistryObject<Block> PENTA_CONDENSED_NETHERRACK = REGISTRY.register("penta_condensed_netherrack", () -> new PentaCondensedNetherrackBlock());
	public static final RegistryObject<Block> HEXA_CONDENSED_NETHERRACK = REGISTRY.register("hexa_condensed_netherrack", () -> new HexaCondensedNetherrackBlock());
	public static final RegistryObject<Block> ORE_MINER = REGISTRY.register("ore_miner", () -> new OreMinerBlock());
	public static final RegistryObject<Block> NETHERRACK_JUICE = REGISTRY.register("netherrack_juice", () -> new NetherrackJuiceBlock());
	public static final RegistryObject<Block> MAILBOX = REGISTRY.register("mailbox", () -> new MailboxBlock());
	public static final RegistryObject<Block> LABEL_COPY_MACHINE = REGISTRY.register("label_copy_machine", () -> new LabelCopyMachineBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
