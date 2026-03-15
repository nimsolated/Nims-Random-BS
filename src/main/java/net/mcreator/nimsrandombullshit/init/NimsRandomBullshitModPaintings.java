
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

public class NimsRandomBullshitModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<PaintingVariant> SHIT_PAINTING = REGISTRY.register("shit_painting", () -> new PaintingVariant(16, 16));
}
