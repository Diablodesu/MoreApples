
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreapples.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.moreapples.block.BucketOfFluidAppleBlock;
import net.mcreator.moreapples.block.AppleOreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreapplesModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block APPLE_ORE = register(new AppleOreBlock());
	public static final Block BUCKET_OF_FLUID_APPLE = register(new BucketOfFluidAppleBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
