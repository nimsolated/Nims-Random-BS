
package net.mcreator.nimsrandombullshit.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModFluids;

public class NetherrackJuiceItem extends BucketItem {
	public NetherrackJuiceItem() {
		super(NimsRandomBullshitModFluids.NETHERRACK_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
