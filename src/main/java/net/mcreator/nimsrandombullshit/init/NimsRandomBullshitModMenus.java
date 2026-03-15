
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.nimsrandombullshit.world.inventory.ShitGUIMenu;
import net.mcreator.nimsrandombullshit.world.inventory.OreMinerGUIMenu;
import net.mcreator.nimsrandombullshit.world.inventory.MailboxNameEntryGUIMenu;
import net.mcreator.nimsrandombullshit.world.inventory.MailboxGUIMenu;
import net.mcreator.nimsrandombullshit.world.inventory.LabelCopyMachineGUIMenu;
import net.mcreator.nimsrandombullshit.world.inventory.BedrockifierGUIMenu;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

public class NimsRandomBullshitModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<MenuType<ShitGUIMenu>> SHIT_GUI = REGISTRY.register("shit_gui", () -> IForgeMenuType.create(ShitGUIMenu::new));
	public static final RegistryObject<MenuType<OreMinerGUIMenu>> ORE_MINER_GUI = REGISTRY.register("ore_miner_gui", () -> IForgeMenuType.create(OreMinerGUIMenu::new));
	public static final RegistryObject<MenuType<MailboxGUIMenu>> MAILBOX_GUI = REGISTRY.register("mailbox_gui", () -> IForgeMenuType.create(MailboxGUIMenu::new));
	public static final RegistryObject<MenuType<MailboxNameEntryGUIMenu>> MAILBOX_NAME_ENTRY_GUI = REGISTRY.register("mailbox_name_entry_gui", () -> IForgeMenuType.create(MailboxNameEntryGUIMenu::new));
	public static final RegistryObject<MenuType<LabelCopyMachineGUIMenu>> LABEL_COPY_MACHINE_GUI = REGISTRY.register("label_copy_machine_gui", () -> IForgeMenuType.create(LabelCopyMachineGUIMenu::new));
	public static final RegistryObject<MenuType<BedrockifierGUIMenu>> BEDROCKIFIER_GUI = REGISTRY.register("bedrockifier_gui", () -> IForgeMenuType.create(BedrockifierGUIMenu::new));
}
