
package net.mcreator.moreapples.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.moreapples.init.MoreapplesModBlocks;

import java.util.Set;
import java.util.Random;

public class AppleOreFeature extends OreFeature {
	public static final AppleOreFeature FEATURE = (AppleOreFeature) new AppleOreFeature().setRegistryName("moreapples:apple_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(AppleOreFeatureRuleTest.INSTANCE, MoreapplesModBlocks.APPLE_ORE.defaultBlockState(), 16))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)))).squared().count(10);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public AppleOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class AppleOreFeatureRuleTest extends RuleTest {
		static final AppleOreFeatureRuleTest INSTANCE = new AppleOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<AppleOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<AppleOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("moreapples:apple_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.IRON_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DIAMOND_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.COAL_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GOLD_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.EMERALD_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.REDSTONE_ORE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
