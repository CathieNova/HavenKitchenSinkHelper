package net.cathienova.havenksh.worldgen;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> havenite_ore_placed_key = registerKey("havenite_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_stone_placed_key = registerKey("scorched_stone_placed");
    public static final ResourceKey<PlacedFeature> scorched_copper_ore_placed_key = registerKey("scorched_copper_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_coal_ore_placed_key = registerKey("scorched_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_iron_ore_placed_key = registerKey("scorched_iron_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_gold_ore_placed_key = registerKey("scorched_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_redstone_ore_placed_key = registerKey("scorched_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_lapis_ore_placed_key = registerKey("scorched_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_quartz_ore_placed_key = registerKey("scorched_quartz_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_diamond_ore_placed_key = registerKey("scorched_diamond_ore_placed");
    public static final ResourceKey<PlacedFeature> scorched_emerald_ore_placed_key = registerKey("scorched_emerald_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //pCount = veins amount per chunk
        register(context, havenite_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_havenite_ore_key),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(60))));
        register(context, scorched_stone_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_stone_key),
                ModOrePlacement.commonOrePlacement(20,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_copper_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_copper_ore_key),
                ModOrePlacement.commonOrePlacement(45,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_coal_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_coal_ore_key),
                ModOrePlacement.commonOrePlacement(50,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_iron_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_iron_ore_key),
                ModOrePlacement.commonOrePlacement(45,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_gold_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_gold_ore_key),
                ModOrePlacement.commonOrePlacement(42,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_redstone_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_redstone_ore_key),
                ModOrePlacement.commonOrePlacement(39,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_lapis_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_lapis_ore_key),
                ModOrePlacement.commonOrePlacement(39,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_quartz_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_quartz_ore_key),
                ModOrePlacement.rareOrePlacement(35,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_diamond_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_diamond_ore_key),
                ModOrePlacement.rareOrePlacement(30,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
        register(context, scorched_emerald_ore_placed_key, configuredFeatures.getOrThrow(ModConfiguredFeatures.overworld_scorched_emerald_ore_key),
                ModOrePlacement.rareOrePlacement(30,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-5))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(HavenKSH.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
