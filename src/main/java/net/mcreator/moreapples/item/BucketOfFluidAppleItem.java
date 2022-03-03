
package net.mcreator.moreapples.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.moreapples.init.MoreapplesModFluids;

public class BucketOfFluidAppleItem extends BucketItem {
	public BucketOfFluidAppleItem() {
		super(() -> MoreapplesModFluids.BUCKET_OF_FLUID_APPLE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("bucket_of_fluid_apple_bucket");
	}
}
