package net.mcreator.nimsrandombullshit.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModEnchantments;

public class NetherrackingLogicProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getEnchantmentLevel(NimsRandomBullshitModEnchantments.NETHERRACKING_ENCHANTMENT.get()) > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 2, (int) (itemstack.getEnchantmentLevel(NimsRandomBullshitModEnchantments.NETHERRACKING_ENCHANTMENT.get()) * 4), false, false));
		}
	}
}
