package net.cathienova.havenksh.worldgen;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> add_havenite_ore = registerKey("add_havenite_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_stone = registerKey("add_scorched_stone");
    public static final ResourceKey<BiomeModifier> add_scorched_copper_ore = registerKey("add_scorched_copper_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_coal_ore = registerKey("add_scorched_coal_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_iron_ore = registerKey("add_scorched_iron_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_gold_ore = registerKey("add_scorched_gold_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_redstone_ore = registerKey("add_scorched_redstone_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_lapis_ore = registerKey("add_scorched_lapis_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_quartz_ore = registerKey("add_scorched_quartz_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_diamond_ore = registerKey("add_scorched_diamond_ore");
    public static final ResourceKey<BiomeModifier> add_scorched_emerald_ore = registerKey("add_scorched_emerald_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(add_havenite_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.havenite_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_stone, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_stone_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_copper_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_copper_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_coal_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_coal_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_iron_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_iron_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_gold_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_gold_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_redstone_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_redstone_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_lapis_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_lapis_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_quartz_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_quartz_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_diamond_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_diamond_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(add_scorched_emerald_ore, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.scorched_emerald_ore_placed_key)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, name));
    }
}
