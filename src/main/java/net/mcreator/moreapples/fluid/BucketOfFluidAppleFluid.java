
package net.mcreator.moreapples.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.moreapples.init.MoreapplesModItems;
import net.mcreator.moreapples.init.MoreapplesModFluids;
import net.mcreator.moreapples.init.MoreapplesModBlocks;

public abstract class BucketOfFluidAppleFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MoreapplesModFluids.BUCKET_OF_FLUID_APPLE,
			() -> MoreapplesModFluids.FLOWING_BUCKET_OF_FLUID_APPLE,
			FluidAttributes.builder(new ResourceLocation("moreapples:blocks/water_still"), new ResourceLocation("moreapples:blocks/water_flow"))

	).explosionResistance(100f)

			.bucket(() -> MoreapplesModItems.BUCKET_OF_FLUID_APPLE_BUCKET).block(() -> (LiquidBlock) MoreapplesModBlocks.BUCKET_OF_FLUID_APPLE);

	private BucketOfFluidAppleFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BucketOfFluidAppleFluid {
		public Source() {
			super();
			setRegistryName("bucket_of_fluid_apple");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BucketOfFluidAppleFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_bucket_of_fluid_apple");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
