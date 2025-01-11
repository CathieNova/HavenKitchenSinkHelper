package net.cathienova.havenksh.util;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

import java.util.List;

public class ModToolTiers
{
    public static final Tier stone = new SimpleTier(ModTags.Blocks.needs_stone_tool,
            131, 2f, 1f, 25, () -> Ingredient.of(Tags.Items.STONES));

    public static final Tier copper = new SimpleTier(ModTags.Blocks.needs_iron_tool,
            250, 2f, 1f, 25, () -> Ingredient.of(Items.COPPER_INGOT));

    public static final Tier iron = new SimpleTier(ModTags.Blocks.needs_iron_tool,
             250, 3f, 2f, 25, () -> Ingredient.of(Tags.Items.INGOTS_IRON));

    public static final Tier gold = new SimpleTier(ModTags.Blocks.needs_gold_tool,
            169, 4f, 3f, 25, () -> Ingredient.of(Tags.Items.INGOTS_GOLD));

    public static final Tier diamond = new SimpleTier(ModTags.Blocks.needs_diamond_tool,
            1561, 5f, 4f, 25, () -> Ingredient.of(Tags.Items.GEMS_DIAMOND));

    public static final Tier emerald = new SimpleTier(ModTags.Blocks.needs_diamond_tool,
            1561, 4f, 3f, 25, () -> Ingredient.of(Items.EMERALD));

    public static final Tier netherite = new SimpleTier(ModTags.Blocks.needs_netherite_tool,
            2031, 6f, 5f, 25, () -> Ingredient.of(Tags.Items.INGOTS_NETHERITE));

    public static final Tier havenite = new SimpleTier(ModTags.Blocks.needs_havenite_tool,
            50000, 6f, 5f, 25, () -> Ingredient.of(ModItems.havenite_ingot.get()));
}
