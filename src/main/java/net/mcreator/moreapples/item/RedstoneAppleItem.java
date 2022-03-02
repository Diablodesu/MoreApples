
package net.mcreator.moreapples.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class RedstoneAppleItem extends Item {
	public RedstoneAppleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.3f).alwaysEat()

						.build()));
		setRegistryName("redstone_apple");
	}
}
