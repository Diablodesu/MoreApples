
package net.mcreator.moreapples.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.moreapples.procedures.EmeraldAppleFoodEatenProcedure;

public class EmeraldAppleItem extends Item {
	public EmeraldAppleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.3f).alwaysEat()

						.build()));
		setRegistryName("emerald_apple");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EmeraldAppleFoodEatenProcedure.execute(entity);
		return retval;
	}
}
