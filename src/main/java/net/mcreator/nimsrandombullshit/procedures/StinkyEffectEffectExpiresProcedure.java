package net.mcreator.nimsrandombullshit.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.nimsrandombullshit.world.inventory.ShitGUIMenu;

public class StinkyEffectEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof ShitGUIMenu) {
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
