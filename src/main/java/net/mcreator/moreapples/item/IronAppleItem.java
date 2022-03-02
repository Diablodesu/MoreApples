
package net.mcreator.moreapples.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class IronAppleItem extends Item {
	public IronAppleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.3f).alwaysEat()

						.build()));
		setRegistryName("iron_apple");
	}
}
