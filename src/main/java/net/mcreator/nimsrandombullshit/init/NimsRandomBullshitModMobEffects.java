
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nimsrandombullshit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.nimsrandombullshit.potion.SummonedEntityEffectMobEffect;
import net.mcreator.nimsrandombullshit.potion.StinkyEffectMobEffect;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

public class NimsRandomBullshitModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NimsRandomBullshitMod.MODID);
	public static final RegistryObject<MobEffect> STINKY_EFFECT = REGISTRY.register("stinky_effect", () -> new StinkyEffectMobEffect());
	public static final RegistryObject<MobEffect> SUMMONED_ENTITY_EFFECT = REGISTRY.register("summoned_entity_effect", () -> new SummonedEntityEffectMobEffect());
}
