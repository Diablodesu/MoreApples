
package net.mcreator.moreapples.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.moreapples.init.MoreapplesModFluids;

public class BucketOfFluidAppleBlock extends LiquidBlock {
	public BucketOfFluidAppleBlock() {
		super(MoreapplesModFluids.BUCKET_OF_FLUID_APPLE, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("bucket_of_fluid_apple");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
