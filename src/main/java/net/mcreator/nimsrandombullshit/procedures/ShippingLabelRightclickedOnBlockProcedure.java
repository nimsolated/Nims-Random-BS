package net.mcreator.nimsrandombullshit.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModBlocks;

public class ShippingLabelRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			if (blockstate.getBlock() == NimsRandomBullshitModBlocks.MAILBOX.get() && entity.isShiftKeyDown()) {
				itemstack.getOrCreateTag().putDouble("connected_mailbox_x", x);
				itemstack.getOrCreateTag().putDouble("connected_mailbox_y", y);
				itemstack.getOrCreateTag().putDouble("connected_mailbox_z", z);
				itemstack.getOrCreateTag().putBoolean("connected", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.PLAYERS, (float) 0.75,
								(float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.PLAYERS, (float) 0.75, (float) Mth.nextDouble(RandomSource.create(), 0.95, 1.05), false);
					}
				}
			}
		}
	}
}
