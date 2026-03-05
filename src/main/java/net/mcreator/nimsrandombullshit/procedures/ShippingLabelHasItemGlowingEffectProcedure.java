package net.mcreator.nimsrandombullshit.procedures;

import net.minecraft.world.item.ItemStack;

public class ShippingLabelHasItemGlowingEffectProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("connected")) {
			return true;
		}
		return false;
	}
}
