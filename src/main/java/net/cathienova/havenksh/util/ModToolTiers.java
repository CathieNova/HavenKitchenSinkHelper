package net.cathienova.havenksh.util;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers
{
    public static final Tier stone = TierSortingRegistry.registerTier(
            new ForgeTier(1, 131, 2f, 1f, 25,
                    ModTags.Blocks.needs_stone_tool, () -> Ingredient.of(Tags.Items.STONE)),
            new ResourceLocation(HavenKSH.MOD_ID, "stone"), List.of(Tiers.WOOD), List.of());

    public static final Tier copper = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 2f, 1f, 25,
                    ModTags.Blocks.needs_iron_tool, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(HavenKSH.MOD_ID, "copper"), List.of(Tiers.WOOD), List.of());

    public static final Tier iron = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 3f, 2f, 25,
                    ModTags.Blocks.needs_iron_tool, () -> Ingredient.of(Tags.Items.INGOTS_IRON)),
            new ResourceLocation(HavenKSH.MOD_ID, "iron"), List.of(Tiers.STONE), List.of());

    public static final Tier gold = TierSortingRegistry.registerTier(
            new ForgeTier(0, 169, 4f, 3f, 25,
                    ModTags.Blocks.needs_gold_tool, () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),
            new ResourceLocation(HavenKSH.MOD_ID, "gold"), List.of(Tiers.IRON), List.of());

    public static final Tier diamond = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 5f, 4f, 25,
                    ModTags.Blocks.needs_diamond_tool, () -> Ingredient.of(Tags.Items.GEMS_DIAMOND)),
            new ResourceLocation(HavenKSH.MOD_ID, "diamond"), List.of(Tiers.GOLD), List.of());

    public static final Tier emerald = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 4f, 3f, 25,
                    ModTags.Blocks.needs_diamond_tool, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(HavenKSH.MOD_ID, "emerald"), List.of(Tiers.GOLD), List.of());

    public static final Tier netherite = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2031, 6f, 5f, 25,
                    ModTags.Blocks.needs_netherite_tool, () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE)),
            new ResourceLocation(HavenKSH.MOD_ID, "netherite"), List.of(Tiers.DIAMOND), List.of());

    /*public static final Tier havenite = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3122, 6f, 5f, 25,
                    ModTags.Blocks.needs_havenite_tool, () -> Ingredient.of(ModItems.havenite_ingot.get())),
            new ResourceLocation(HavenKSH.MOD_ID, "havenite"), List.of(Tiers.NETHERITE), List.of());*/
}
