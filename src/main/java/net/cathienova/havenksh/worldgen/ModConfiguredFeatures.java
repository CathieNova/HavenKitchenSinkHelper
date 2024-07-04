package net.cathienova.havenksh.worldgen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_havenite_ore_key = registerKey("havenite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_stone_key = registerKey("scorched_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_copper_ore_key = registerKey("scorched_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_coal_ore_key = registerKey("scorched_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_iron_ore_key = registerKey("scorched_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_gold_ore_key = registerKey("scorched_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_redstone_ore_key = registerKey("scorched_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_lapis_ore_key = registerKey("scorched_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_quartz_ore_key = registerKey("scorched_quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_diamond_ore_key = registerKey("scorched_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> overworld_scorched_emerald_ore_key = registerKey("scorched_emerald_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest scorchedStoneReplaceable = new TagMatchTest(ModTags.Blocks.scorched_stone);

        List<OreConfiguration.TargetBlockState> overworldhaveniteOre = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.havenite_ore.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.deepslate_havenite_ore.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> overworldScorchedStone = List.of(OreConfiguration.target(deepslateReplaceables, ModBlocks.scorched_stone.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedCopperOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_copper_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedCoalOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_coal_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedIronOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_iron_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedGoldOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_gold_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedRedstoneOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_redstone_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedLapisOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_lapis_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedQuartzOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_quartz_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedDiamondOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_diamond_ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldScorchedEmeraldOres = List.of(OreConfiguration.target(scorchedStoneReplaceable, ModBlocks.scorched_emerald_ore.get().defaultBlockState()));

        //pSize = vein size
        register(context, overworld_havenite_ore_key, Feature.ORE, new OreConfiguration(overworldhaveniteOre, 10));
        register(context, overworld_scorched_stone_key, Feature.ORE, new OreConfiguration(overworldScorchedStone, 20));
        register(context, overworld_scorched_copper_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedCopperOres, 21));
        register(context, overworld_scorched_coal_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedCoalOres, 17));
        register(context, overworld_scorched_iron_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedIronOres, 9));
        register(context, overworld_scorched_gold_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedGoldOres, 9));
        register(context, overworld_scorched_redstone_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedRedstoneOres, 8));
        register(context, overworld_scorched_lapis_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedLapisOres, 7));
        register(context, overworld_scorched_quartz_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedQuartzOres, 7));
        register(context, overworld_scorched_diamond_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedDiamondOres, 8));
        register(context, overworld_scorched_emerald_ore_key, Feature.ORE, new OreConfiguration(overworldScorchedEmeraldOres, 5));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(HavenKSH.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}