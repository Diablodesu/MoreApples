
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreapples.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moreapples.item.RedstoneAppleItem;
import net.mcreator.moreapples.item.NetheriteAppleItem;
import net.mcreator.moreapples.item.IronAppleItem;
import net.mcreator.moreapples.item.EmeraldAppleItem;
import net.mcreator.moreapples.item.DiamondAppleItem;
import net.mcreator.moreapples.item.CopperAppleItem;
import net.mcreator.moreapples.item.CoalAppleItem;
import net.mcreator.moreapples.item.BucketOfFluidAppleItem;
import net.mcreator.moreapples.item.AppleSwordItem;
import net.mcreator.moreapples.item.AppleShovelItem;
import net.mcreator.moreapples.item.ApplePickaxeItem;
import net.mcreator.moreapples.item.AppleIngotItem;
import net.mcreator.moreapples.item.AppleAxeItem;
import net.mcreator.moreapples.item.AppleArmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreapplesModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item COPPER_APPLE = register(new CopperAppleItem());
	public static final Item COAL_APPLE = register(new CoalAppleItem());
	public static final Item REDSTONE_APPLE = register(new RedstoneAppleItem());
	public static final Item IRON_APPLE = register(new IronAppleItem());
	public static final Item EMERALD_APPLE = register(new EmeraldAppleItem());
	public static final Item DIAMOND_APPLE = register(new DiamondAppleItem());
	public static final Item NETHERITE_APPLE = register(new NetheriteAppleItem());
	public static final Item APPLE_ORE = register(MoreapplesModBlocks.APPLE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item APPLE_INGOT = register(new AppleIngotItem());
	public static final Item APPLE_SWORD = register(new AppleSwordItem());
	public static final Item APPLE_ARMOR_HELMET = register(new AppleArmorItem.Helmet());
	public static final Item APPLE_ARMOR_CHESTPLATE = register(new AppleArmorItem.Chestplate());
	public static final Item APPLE_ARMOR_LEGGINGS = register(new AppleArmorItem.Leggings());
	public static final Item APPLE_ARMOR_BOOTS = register(new AppleArmorItem.Boots());
	public static final Item APPLE_PICKAXE = register(new ApplePickaxeItem());
	public static final Item BUCKET_OF_FLUID_APPLE_BUCKET = register(new BucketOfFluidAppleItem());
	public static final Item APPLE_AXE = register(new AppleAxeItem());
	public static final Item APPLE_SHOVEL = register(new AppleShovelItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
