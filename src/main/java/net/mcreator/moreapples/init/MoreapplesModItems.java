
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreapples.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.moreapples.item.RedstoneAppleItem;
import net.mcreator.moreapples.item.NetheriteAppleItem;
import net.mcreator.moreapples.item.IronAppleItem;
import net.mcreator.moreapples.item.EmeraldAppleItem;
import net.mcreator.moreapples.item.DiamondAppleItem;
import net.mcreator.moreapples.item.CopperAppleItem;
import net.mcreator.moreapples.item.CoalAppleItem;

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

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
