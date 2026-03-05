package net.mcreator.nimsrandombullshit.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModItems;

public class MailboxSlot99ShippingLabelInsertionConditionProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getItem() == NimsRandomBullshitModItems.SHIPPING_LABEL.get() && itemstack.getOrCreateTag().getBoolean("connected")) {
			return false;
		}
		return true;
	}
}
