
package net.mcreator.nimsrandombullshit.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModItems;

public class OrichalcumAxeItem extends AxeItem {
	public OrichalcumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NimsRandomBullshitModItems.ORICHALCUM.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
