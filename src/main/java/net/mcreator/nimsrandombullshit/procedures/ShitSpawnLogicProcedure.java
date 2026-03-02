package net.mcreator.nimsrandombullshit.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShitSpawnLogicProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("ShitCounter", (entity.getPersistentData().getDouble("ShitCounter") + 1));
		if (entity.getPersistentData().getDouble("ShitCounter") % 6000 == 0 && Math.random() < 0.125) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(NimsRandomBullshitModItems.SHIT.get()));
				entityToSpawn.setPickUpDelay(20);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
