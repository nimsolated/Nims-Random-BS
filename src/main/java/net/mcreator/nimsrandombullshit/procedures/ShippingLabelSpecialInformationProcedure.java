package net.mcreator.nimsrandombullshit.procedures;

import net.minecraft.world.item.ItemStack;

public class ShippingLabelSpecialInformationProcedure {
	public static String execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("connected")) {
			return ("Dest. Mailbox X:" + itemstack.getOrCreateTag().getDouble("connected_mailbox_x") + "\n") + "" + ("Dest. Mailbox Y:" + itemstack.getOrCreateTag().getDouble("connected_mailbox_y") + "\n")
					+ ("Dest. Mailbox Z:" + itemstack.getOrCreateTag().getDouble("connected_mailbox_z") + "\n");
		}
		return "No assigned destination.";
	}
}
