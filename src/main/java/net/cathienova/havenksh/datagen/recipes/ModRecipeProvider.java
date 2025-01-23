package net.cathienova.havenksh.datagen.recipes;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(pOutput, registries);
    }

    public static final List<ItemLike> HAVENITE_SMELTABLES = List.of(
            ModItems.raw_havenite.get(),
            ModItems.havenite_dust.get(),
            ModBlocks.deepslate_havenite_ore.get(),
            ModBlocks.havenite_ore.get()
    );
    private static final List<ItemLike> HAVENITE_BLOCK_SMELTABLES = List.of(
            ModBlocks.raw_havenite_block.get());

    @Override
    protected void buildRecipes(RecipeOutput output)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.copper_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeCopperIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/copper_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.copper_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawCopper)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/copper_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.copper_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', Items.COPPER_BLOCK)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/copper_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.copper_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', Items.RAW_COPPER_BLOCK)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/copper_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.tin_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeTinIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/tin_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.tin_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawTin)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/tin_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.tin_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeTinBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/tin_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.tin_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawTinBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/tin_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.netherite_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeNetheriteIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/netherite_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NETHERITE_INGOT, 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeNetheriteIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/netherite_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.silver_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeSilverIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/silver_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.silver_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawSilver)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/silver_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.silver_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeSilverBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/silver_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.silver_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawSilverBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/silver_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.lead_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeLeadIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/lead_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.lead_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawLead)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/lead_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.lead_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeLeadBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/lead_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.lead_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawLeadBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/lead_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gold_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeGoldIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/gold_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gold_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawGold)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/gold_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gold_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', Items.GOLD_BLOCK)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/gold_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gold_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', Items.RAW_GOLD_BLOCK)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/gold_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.iron_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeIronIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/iron_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.iron_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawIron)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/iron_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.iron_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', Items.IRON_BLOCK)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/iron_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.iron_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', Items.RAW_IRON_BLOCK)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/iron_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.nickel_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeNickelIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/nickel_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.nickel_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawNickel)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/nickel_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.nickel_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeNickelBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/nickel_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.nickel_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawNickelBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/nickel_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.uranium_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeUraniumIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/uranium_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.uranium_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawUranium)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/uranium_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.uranium_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeUraniumBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/uranium_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.uranium_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawUraniumBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/uranium_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.osmium_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeOsmiumIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/osmium_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.osmium_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawOsmium)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/osmium_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.osmium_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeOsmiumBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/osmium_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.osmium_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawOsmiumBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/osmium_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.zinc_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeZincIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/zinc_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.zinc_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawZinc)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/zinc_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.zinc_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeZincBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/zinc_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.zinc_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawZincBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/zinc_dust_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.aluminum_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeAluminumIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/aluminum_dust_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.aluminum_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawAluminum)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/aluminum_dust_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.aluminum_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeAluminumBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/aluminum_dust_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.aluminum_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeRawAluminumBlocks)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/aluminum_dust_from_raw_block");
        
//Ore Hammers
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.copper_ore_hammer.get(), 1)
                .pattern(" BS")
                .pattern(" SB")
                .pattern("S  ")
                .define('B', ModTags.Items.forgeCopperBlocks)
                .define('S', Items.STICK)
                .unlockedBy("has_copper_block", has(ModTags.Items.forgeCopperBlocks))
                .save(output, HavenKSH.MOD_ID + ":craft/copper_ore_hammer");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.iron_ore_hammer.get(), 1)
                .pattern(" BS")
                .pattern(" SB")
                .pattern("S  ")
                .define('B', ModTags.Items.forgeIronBlocks)
                .define('S', Items.STICK)
                .unlockedBy("has_iron_block", has(ModTags.Items.forgeIronBlocks))
                .save(output, HavenKSH.MOD_ID + ":craft/iron_ore_hammer");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.gold_ore_hammer.get(), 1)
                .pattern(" BS")
                .pattern(" SB")
                .pattern("S  ")
                .define('B', ModTags.Items.forgeGoldBlocks)
                .define('S', Items.STICK)
                .unlockedBy("has_gold_block", has(ModTags.Items.forgeGoldBlocks))
                .save(output, HavenKSH.MOD_ID + ":craft/gold_ore_hammer");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.diamond_ore_hammer.get(), 1)
                .pattern(" BS")
                .pattern(" SB")
                .pattern("S  ")
                .define('B', ModTags.Items.forgeDiamondBlocks)
                .define('S', Items.STICK)
                .unlockedBy("has_diamond_block", has(ModTags.Items.forgeDiamondBlocks))
                .save(output, HavenKSH.MOD_ID + ":craft/diamond_ore_hammer");
        
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.emerald_ore_hammer.get(), 1)
                .pattern(" BS")
                .pattern(" SB")
                .pattern("S  ")
                .define('B', Blocks.EMERALD_BLOCK)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald_block", has(Blocks.EMERALD_BLOCK))
                .save(output, HavenKSH.MOD_ID + ":craft/emerald_ore_hammer");
        
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.netherite_ore_hammer.get(), 1)
                .pattern(" BS")
                .pattern(" SB")
                .pattern("S  ")
                .define('B', ModTags.Items.forgeNetheriteBlocks)
                .define('S', Items.STICK)
                .unlockedBy("has_netherite_block", has(ModTags.Items.forgeNetheriteBlocks))
                .save(output, HavenKSH.MOD_ID + ":craft/netherite_ore_hammer");
        
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.wooden_shears.get(), 1)
                .pattern(" P")
                .pattern("P ")
                .define('P', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(output, HavenKSH.MOD_ID + ":craft/wooden_shears");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModArmor.magnet.get(), 1)
                .pattern("GEG")
                .pattern("EAE")
                .pattern("GEG")
                .define('G', Items.GLOWSTONE_DUST)
                .define('E', Items.ENDER_PEARL)
                .define('A', Items.IRON_INGOT)
                .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                .save(output, HavenKSH.MOD_ID + ":craft/magnet");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModArmor.repair_talisman.get(), 1)
                .pattern("GEG")
                .pattern("EAE")
                .pattern("GEG")
                .define('G', Items.GOLD_INGOT)
                .define('E', Items.ENDER_PEARL)
                .define('A', Items.IRON_INGOT)
                .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                .save(output, HavenKSH.MOD_ID + ":craft/repair_talisman");

        HelmetRecipe(output, ModArmor.bone_helmet.get(), Items.BONE);
        ChestplateRecipe(output, ModArmor.bone_chestplate.get(), Items.BONE);
        LeggingsRecipe(output, ModArmor.bone_leggings.get(), Items.BONE);
        BootsRecipe(output, ModArmor.bone_boots.get(), Items.BONE);
        ShovelRecipe(output, ModTools.bone_shovel.get(), Items.BONE);
        SwordRecipe(output, ModTools.bone_sword.get(), Items.BONE);
        PickaxeRecipe(output, ModTools.bone_pickaxe.get(), Items.BONE);
        AxeRecipe(output, ModTools.bone_axe.get(), Items.BONE);
        HoeRecipe(output, ModTools.bone_hoe.get(), Items.BONE);

        HelmetRecipe(output, ModArmor.flint_helmet.get(), Items.FLINT);
        ChestplateRecipe(output, ModArmor.flint_chestplate.get(), Items.FLINT);
        LeggingsRecipe(output, ModArmor.flint_leggings.get(), Items.FLINT);
        BootsRecipe(output, ModArmor.flint_boots.get(), Items.FLINT);
        ShovelRecipe(output, ModTools.flint_shovel.get(), Items.FLINT);
        SwordRecipe(output, ModTools.flint_sword.get(), Items.FLINT);
        PickaxeRecipe(output, ModTools.flint_pickaxe.get(), Items.FLINT);
        AxeRecipe(output, ModTools.flint_axe.get(), Items.FLINT);
        HoeRecipe(output, ModTools.flint_hoe.get(), Items.FLINT);

        HelmetRecipe(output, ModArmor.wooden_helmet.get(), Items.OAK_LOG);
        ChestplateRecipe(output, ModArmor.wooden_chestplate.get(), Items.OAK_LOG);
        LeggingsRecipe(output, ModArmor.wooden_leggings.get(), Items.OAK_LOG);
        BootsRecipe(output, ModArmor.wooden_boots.get(), Items.OAK_LOG);

        HelmetRecipe(output, ModArmor.stone_helmet.get(), Blocks.STONE);
        ChestplateRecipe(output, ModArmor.stone_chestplate.get(), Blocks.STONE);
        LeggingsRecipe(output, ModArmor.stone_leggings.get(), Blocks.STONE);
        BootsRecipe(output, ModArmor.stone_boots.get(), Blocks.STONE);

        HelmetRecipe(output, ModArmor.copper_helmet.get(), Items.COPPER_INGOT);
        ChestplateRecipe(output, ModArmor.copper_chestplate.get(), Items.COPPER_INGOT);
        LeggingsRecipe(output, ModArmor.copper_leggings.get(), Items.COPPER_INGOT);
        BootsRecipe(output, ModArmor.copper_boots.get(), Items.COPPER_INGOT);
        ShovelRecipe(output, ModTools.copper_shovel.get(), Items.COPPER_INGOT);
        SwordRecipe(output, ModTools.copper_sword.get(), Items.COPPER_INGOT);
        PickaxeRecipe(output, ModTools.copper_pickaxe.get(), Items.COPPER_INGOT);
        AxeRecipe(output, ModTools.copper_axe.get(), Items.COPPER_INGOT);
        HoeRecipe(output, ModTools.copper_hoe.get(), Items.COPPER_INGOT);

        HelmetRecipe(output, ModArmor.obsidian_helmet.get(), Items.OBSIDIAN);
        ChestplateRecipe(output, ModArmor.obsidian_chestplate.get(), Items.OBSIDIAN);
        LeggingsRecipe(output, ModArmor.obsidian_leggings.get(), Items.OBSIDIAN);
        BootsRecipe(output, ModArmor.obsidian_boots.get(), Items.OBSIDIAN);
        ShovelRecipe(output, ModTools.obsidian_shovel.get(), Items.OBSIDIAN);
        SwordRecipe(output, ModTools.obsidian_sword.get(), Items.OBSIDIAN);
        PickaxeRecipe(output, ModTools.obsidian_pickaxe.get(), Items.OBSIDIAN);
        AxeRecipe(output, ModTools.obsidian_axe.get(), Items.OBSIDIAN);
        HoeRecipe(output, ModTools.obsidian_hoe.get(), Items.OBSIDIAN);

        HelmetRecipe(output, ModArmor.emerald_helmet.get(), Items.EMERALD);
        ChestplateRecipe(output, ModArmor.emerald_chestplate.get(), Items.EMERALD);
        LeggingsRecipe(output, ModArmor.emerald_leggings.get(), Items.EMERALD);
        BootsRecipe(output, ModArmor.emerald_boots.get(), Items.EMERALD);
        ShovelRecipe(output, ModTools.emerald_shovel.get(), Items.EMERALD);
        SwordRecipe(output, ModTools.emerald_sword.get(), Items.EMERALD);
        PickaxeRecipe(output, ModTools.emerald_pickaxe.get(), Items.EMERALD);
        AxeRecipe(output, ModTools.emerald_axe.get(), Items.EMERALD);
        HoeRecipe(output, ModTools.emerald_hoe.get(), Items.EMERALD);

        DragonRecipe(output, ModArmor.dragon_helmet.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_HELMET);
        DragonRecipe(output, ModArmor.dragon_chestplate.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_CHESTPLATE);
        DragonRecipe(output, ModArmor.dragon_leggings.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_LEGGINGS);
        DragonRecipe(output, ModArmor.dragon_boots.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_BOOTS);
        DragonRecipe(output, ModTools.dragon_shovel.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_SHOVEL);
        DragonRecipe(output, ModTools.dragon_sword.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_SWORD);
        DragonRecipe(output, ModTools.dragon_pickaxe.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_PICKAXE);
        DragonRecipe(output, ModTools.dragon_axe.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_AXE);
        DragonRecipe(output, ModTools.dragon_hoe.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.NETHERITE_HOE);
        DragonRecipe(output, ModTools.dragon_bow.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.BOW);
        DragonRecipe(output, ModTools.dragon_shield.get(), ModItems.dragon_scale.get(), Items.DRAGON_BREATH, Items.SHIELD);

        WateringCanRecipe(output, ModItems.empty_iron_watering_can.get(), Items.IRON_INGOT);

        BlockRecipe(output, Items.COPPER_INGOT, ModItems.copper_nugget.get());
        UnBlockRecipe(output, ModItems.copper_nugget.get(), Items.COPPER_INGOT);
        BlockRecipe(output, Items.DIAMOND, ModItems.diamond_nugget.get());
        UnBlockRecipe(output, ModItems.diamond_nugget.get(), Items.DIAMOND);
        BlockRecipe(output, Items.NETHERITE_INGOT, ModItems.netherite_nugget.get());
        UnBlockRecipe(output, ModItems.netherite_nugget.get(), Items.NETHERITE_INGOT);
        BlockRecipe(output, Items.EMERALD, ModItems.emerald_nugget.get());
        UnBlockRecipe(output, ModItems.emerald_nugget.get(), Items.EMERALD);
        BlockRecipe(output, Items.LAPIS_LAZULI, ModItems.lapis_nugget.get());
        UnBlockRecipe(output, ModItems.lapis_nugget.get(), Items.LAPIS_LAZULI);
        BlockRecipe(output, Items.QUARTZ, ModItems.quartz_nugget.get());
        UnBlockRecipe(output, ModItems.quartz_nugget.get(), Items.QUARTZ);
        BlockRecipe(output, Items.REDSTONE, ModItems.redstone_nugget.get());
        UnBlockRecipe(output, ModItems.redstone_nugget.get(), Items.REDSTONE);
        BlockRecipe(output, ModBlocks.charcoal_block_item.get(), Items.CHARCOAL);
        UnBlockRecipe(output, Items.CHARCOAL, ModBlocks.charcoal_block_item.get());
        BlockRecipe(output, Items.COAL, ModItems.mini_coal.get());
        UnBlockRecipe(output, ModItems.mini_coal.get(), Items.COAL);
        BlockRecipe(output, Items.CHARCOAL, ModItems.mini_charcoal.get());
        UnBlockRecipe(output, ModItems.mini_charcoal.get(), Items.CHARCOAL);

        BlockRecipe(output, ModBlocks.ender_block.get(), Items.ENDER_PEARL);
        UnBlockRecipe(output, Items.ENDER_PEARL, ModBlocks.ender_block.get());
        BlockRecipe(output, ModBlocks.nether_star_block.get(), Items.NETHER_STAR);
        UnBlockRecipe(output, Items.NETHER_STAR, ModBlocks.nether_star_block.get());
        BlockRecipe(output, ModBlocks.flesh_block.get(), Items.ROTTEN_FLESH);
        UnBlockRecipe(output, Items.ROTTEN_FLESH, ModBlocks.flesh_block.get());
        SmallBlockRecipe(output, ModBlocks.andesite_brick.get(), Blocks.ANDESITE, 4);
        SmallBlockRecipe(output, ModBlocks.diorite_brick.get(), Blocks.DIORITE, 4);
        SmallBlockRecipe(output, ModBlocks.granite_brick.get(), Blocks.GRANITE, 4);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PAPER, 3)
                .pattern("BBB")
                .define('B', ModTags.Items.bark)
                .unlockedBy("has_bark", has(ModTags.Items.bark))
                .save(output, HavenKSH.MOD_ID + ":craft/paper_from_bark");

        LampRecipe(output, ModBlocks.lamp_white.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_yellow.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.YELLOW_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/yellow_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_white.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.WHITE_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_white_dye", has(Items.WHITE_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/white_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_blue.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.LIGHT_BLUE_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_blue_dye", has(Items.LIGHT_BLUE_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/blue_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_red.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.RED_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/red_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_light_purple.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.PINK_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_light_purple_dye", has(Items.PINK_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/light_purple_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_green.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.WHITE_DYE)
                .define('L', ModBlocks.lamp_dark_green.get())
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/green_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_gray.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.LIGHT_GRAY_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_gray_dye", has(Items.LIGHT_GRAY_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/gray_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_gold.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.ORANGE_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_gold_dye", has(Items.ORANGE_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/gold_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_dark_red.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.RED_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_dark_red_dye", has(Items.RED_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/dark_red_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_dark_purple.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.PURPLE_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_dark_purple_dye", has(Items.PURPLE_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/dark_purple_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_dark_green.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.GREEN_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_dark_green_dye", has(Items.GREEN_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/dark_green_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_dark_gray.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.GRAY_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_dark_gray_dye", has(Items.GRAY_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/dark_gray_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_dark_blue.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.BLUE_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_dark_blue_dye", has(Items.BLUE_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/dark_blue_lamp");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.lamp_aqua.get(), 1)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("DDD")
                .define('D', Items.CYAN_DYE)
                .define('L', ModTags.Items.lamp)
                .unlockedBy("has_aqua_dye", has(Items.CYAN_DYE))
                .save(output, HavenKSH.MOD_ID + ":craft/aqua_lamp");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.lamp_rainbow.get(), 1)
                .requires(ModBlocks.lamp_yellow.get(), 1)
                .requires(ModBlocks.lamp_red.get(), 1)
                .requires(ModBlocks.lamp_light_purple.get(), 1)
                .requires(ModBlocks.lamp_green.get(), 1)
                .requires(ModBlocks.lamp_gold.get(), 1)
                .requires(ModBlocks.lamp_dark_red.get(), 1)
                .requires(ModBlocks.lamp_dark_purple.get(), 1)
                .requires(ModBlocks.lamp_dark_green.get(), 1)
                .requires(ModBlocks.lamp_dark_blue.get(), 1)
                .unlockedBy("has_rainbow_lamp", has(ModBlocks.lamp_white.get()))
                .save(output, HavenKSH.MOD_ID + ":craft/rainbow_lamp");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.scorched_stone.get(), 8)
                .pattern("SSS")
                .pattern("SLS")
                .pattern("SSS")
                .define('S', Items.STONE)
                .define('L', Items.LAVA_BUCKET)
                .unlockedBy("has_scorched_cobblestone", has(ModBlocks.scorched_cobblestone.get()))
                .save(output, HavenKSH.MOD_ID + ":craft/scorched_stone");

        SmallBlockRecipe(output, ModBlocks.scorched_stone_bricks.get(), ModBlocks.scorched_stone.get(), 4);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.reinforced_glass.get(), 8)
                .pattern("GGG")
                .pattern("GSG")
                .pattern("GGG")
                .define('G', Blocks.GLASS)
                .define('S', Items.NETHER_STAR)
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR))
                .save(output, HavenKSH.MOD_ID + ":craft/reinforced_glass");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.scorched_cobblestone.get()), RecipeCategory.MISC, ModBlocks.scorched_stone.get(), 0.0f, 200)
                .unlockedBy("has_scorched_cobblestone", has(ModBlocks.scorched_cobblestone.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/scorched_stone");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.copper_dust.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200)
                .unlockedBy("has_copper_dust", has(ModItems.copper_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/copper_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.tin_dust.get()), RecipeCategory.MISC, ModItems.tin_ingot.get(), 0.25f, 200)
                .unlockedBy("has_tin_dust", has(ModItems.tin_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/tin_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.netherite_dust.get()), RecipeCategory.MISC, Items.NETHERITE_SCRAP, 0.25f, 200)
                .unlockedBy("has_netherite_dust", has(ModItems.netherite_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/netherite_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.silver_dust.get()), RecipeCategory.MISC, ModItems.silver_ingot.get(), 0.25f, 200)
                .unlockedBy("has_silver_dust", has(ModItems.silver_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/silver_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.lead_dust.get()), RecipeCategory.MISC, ModItems.lead_ingot.get(), 0.25f, 200)
                .unlockedBy("has_lead_dust", has(ModItems.lead_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/lead_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.iron_dust.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200)
                .unlockedBy("has_iron_dust", has(ModItems.iron_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/iron_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.gold_dust.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200)
                .unlockedBy("has_gold_dust", has(ModItems.gold_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/gold_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.nickel_dust.get()), RecipeCategory.MISC, ModItems.nickel_ingot.get(), 0.25f, 200)
                .unlockedBy("has_nickel_dust", has(ModItems.nickel_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/nickel_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.uranium_dust.get()), RecipeCategory.MISC, ModItems.uranium_ingot.get(), 0.25f, 200)
                .unlockedBy("has_uranium_dust", has(ModItems.uranium_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/uranium_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.osmium_dust.get()), RecipeCategory.MISC, ModItems.osmium_ingot.get(), 0.25f, 200)
                .unlockedBy("has_osmium_dust", has(ModItems.osmium_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/osmium_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.zinc_dust.get()), RecipeCategory.MISC, ModItems.zinc_ingot.get(), 0.25f, 200)
                .unlockedBy("has_zinc_dust", has(ModItems.zinc_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/zinc_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.aluminum_dust.get()), RecipeCategory.MISC, ModItems.aluminum_ingot.get(), 0.25f, 200)
                .unlockedBy("has_aluminum_dust", has(ModItems.aluminum_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":smelting/aluminum_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.copper_dust.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100)
                .unlockedBy("has_copper_dust", has(ModItems.copper_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/copper_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.tin_dust.get()), RecipeCategory.MISC, ModItems.tin_ingot.get(), 0.25f, 100)
                .unlockedBy("has_tin_dust", has(ModItems.tin_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/tin_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.netherite_dust.get()), RecipeCategory.MISC, Items.NETHERITE_SCRAP, 0.25f, 100)
                .unlockedBy("has_netherite_dust", has(ModItems.netherite_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/netherite_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.silver_dust.get()), RecipeCategory.MISC, ModItems.silver_ingot.get(), 0.25f, 100)
                .unlockedBy("has_silver_dust", has(ModItems.silver_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/silver_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.lead_dust.get()), RecipeCategory.MISC, ModItems.lead_ingot.get(), 0.25f, 100)
                .unlockedBy("has_lead_dust", has(ModItems.lead_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/lead_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.iron_dust.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100)
                .unlockedBy("has_iron_dust", has(ModItems.iron_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/iron_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.gold_dust.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100)
                .unlockedBy("has_gold_dust", has(ModItems.gold_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/gold_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.nickel_dust.get()), RecipeCategory.MISC, ModItems.nickel_ingot.get(), 0.25f, 100)
                .unlockedBy("has_nickel_dust", has(ModItems.nickel_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/nickel_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.uranium_dust.get()), RecipeCategory.MISC, ModItems.uranium_ingot.get(), 0.25f, 100)
                .unlockedBy("has_uranium_dust", has(ModItems.uranium_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/uranium_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.osmium_dust.get()), RecipeCategory.MISC, ModItems.osmium_ingot.get(), 0.25f, 100)
                .unlockedBy("has_osmium_dust", has(ModItems.osmium_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/osmium_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.zinc_dust.get()), RecipeCategory.MISC, ModItems.zinc_ingot.get(), 0.25f, 100)
                .unlockedBy("has_zinc_dust", has(ModItems.zinc_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/zinc_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.aluminum_dust.get()), RecipeCategory.MISC, ModItems.aluminum_ingot.get(), 0.25f, 100)
                .unlockedBy("has_aluminum_dust", has(ModItems.aluminum_dust.get()))
                .save(output, HavenKSH.MOD_ID + ":blasting/aluminum_dust");

        BlockRecipe(output, ModBlocks.flint_block.get(), Items.FLINT);
        UnBlockRecipe(output, Items.FLINT, ModBlocks.flint_block.get());

        BlockRecipe(output, ModBlocks.havenite_block.get(), ModItems.havenite_ingot.get());
        BlockRecipe(output, ModBlocks.raw_havenite_block.get(), ModItems.raw_havenite.get());
        BlockRecipe(output, ModItems.havenite_ingot.get(), ModItems.havenite_nugget.get());
        UnBlockRecipe(output, ModItems.havenite_ingot.get(), ModBlocks.havenite_block.get());
        UnBlockRecipe(output, ModItems.raw_havenite.get(), ModBlocks.raw_havenite_block.get());
        UnBlockRecipe(output, ModItems.havenite_nugget.get(), ModItems.havenite_ingot.get());


        oreSmelting(output, HAVENITE_SMELTABLES, RecipeCategory.MISC, ModItems.havenite_ingot.get(), 0.25f, 200, "havenite_ingot");
        oreBlasting(output, HAVENITE_SMELTABLES, RecipeCategory.MISC, ModItems.havenite_ingot.get(), 0.25f, 100, "havenite_ingot");
        oreSmelting(output, HAVENITE_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.havenite_block.get(), 8.1f, 1800, "havenite_block");
        oreBlasting(output, HAVENITE_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.havenite_block.get(), 7.3f, 900, "havenite_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.havenite_dust.get(), 1)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModTags.Items.forgeHaveniteIngot)
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/havenite_ingot_from_dust");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.havenite_dust.get(), 2)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModItems.raw_havenite.get())
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/havenite_ingot_from_raw");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.havenite_dust.get(), 9)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModBlocks.havenite_block.get())
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/havenite_ingot_from_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.havenite_dust.get(), 18)
                .pattern("HR")
                .define('H', ModTags.Items.oreHammers)
                .define('R', ModBlocks.raw_havenite_block.get())
                .unlockedBy("has_ore_hammer", has(ModTags.Items.oreHammers))
                .save(output, HavenKSH.MOD_ID + ":craft/havenite_ingot_from_raw_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModTools.havenite_ore_hammer.get(), 1)
                .pattern(" BS")
                .pattern(" SB")
                .pattern("S  ")
                .define('B', ModBlocks.havenite_block.get())
                .define('S', Items.STICK)
                .unlockedBy("has_havenite_block", has(ModBlocks.havenite_block.get()))
                .save(output, HavenKSH.MOD_ID + ":craft/havenite_ore_hammer");

        HammerCraft(output, ModTools.stone_hammer.get(), Items.STONE, Items.STICK);
        HammerCraft(output, ModTools.copper_hammer.get(), Items.COPPER_INGOT, Items.STICK);
        HammerCraft(output, ModTools.iron_hammer.get(), Items.IRON_INGOT, Items.STICK);
        HammerCraft(output, ModTools.golden_hammer.get(), Items.GOLD_INGOT, Items.STICK);
        HammerCraft(output, ModTools.diamond_hammer.get(), Items.DIAMOND, Items.STICK);
        HammerCraft(output, ModTools.emerald_hammer.get(), Items.EMERALD, Items.STICK);
        HammerCraft(output, ModTools.netherite_hammer.get(), Items.NETHERITE_INGOT, Items.STICK);
        HammerCraft(output, ModTools.havenite_hammer.get(), ModItems.havenite_ingot.get(), Items.STICK);

        ExcavatorCraft(output, ModTools.stone_excavator.get(), Items.STONE, Items.STICK);
        ExcavatorCraft(output, ModTools.copper_excavator.get(), Items.COPPER_INGOT, Items.STICK);
        ExcavatorCraft(output, ModTools.iron_excavator.get(), Items.IRON_INGOT, Items.STICK);
        ExcavatorCraft(output, ModTools.golden_excavator.get(), Items.GOLD_INGOT, Items.STICK);
        ExcavatorCraft(output, ModTools.diamond_excavator.get(), Items.DIAMOND, Items.STICK);
        ExcavatorCraft(output, ModTools.emerald_excavator.get(), Items.EMERALD, Items.STICK);
        ExcavatorCraft(output, ModTools.netherite_excavator.get(), Items.NETHERITE_INGOT, Items.STICK);
        ExcavatorCraft(output, ModTools.havenite_excavator.get(), ModItems.havenite_ingot.get(), Items.STICK);

        ChopperCraft(output, ModTools.stone_chopper.get(), Items.STONE, Items.STICK);
        ChopperCraft(output, ModTools.copper_chopper.get(), Items.COPPER_INGOT, Items.STICK);
        ChopperCraft(output, ModTools.iron_chopper.get(), Items.IRON_INGOT, Items.STICK);
        ChopperCraft(output, ModTools.golden_chopper.get(), Items.GOLD_INGOT, Items.STICK);
        ChopperCraft(output, ModTools.diamond_chopper.get(), Items.DIAMOND, Items.STICK);
        ChopperCraft(output, ModTools.emerald_chopper.get(), Items.EMERALD, Items.STICK);
        ChopperCraft(output, ModTools.netherite_chopper.get(), Items.NETHERITE_INGOT, Items.STICK);
        ChopperCraft(output, ModTools.havenite_chopper.get(), ModItems.havenite_ingot.get(), Items.STICK);
    }

    protected static void upgradeSmithing(RecipeOutput consumer, ItemLike template, ItemLike base, ItemLike addition, Item result)
    {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(template), Ingredient.of(base), Ingredient.of(addition), RecipeCategory.MISC, result)
                .unlocks("has_" + getItemName(base), has(base))
                .save(consumer, HavenKSH.MOD_ID + ":smithing/" + getItemName(result));
    }

    protected static void ChopperCraft(RecipeOutput consumer, ItemLike result, ItemLike ingredient, ItemLike ingredient2)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("III")
                .pattern("IS ")
                .pattern(" S ")
                .define('I', ingredient)
                .define('S', ingredient2)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void ExcavatorCraft(RecipeOutput consumer, ItemLike result, ItemLike ingredient, ItemLike ingredient2)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" S ")
                .define('L', ingredient)
                .define('S', ingredient2)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void HammerCraft(RecipeOutput consumer, ItemLike result, ItemLike ingredient, ItemLike ingredient2)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("LLL")
                .pattern("LSL")
                .pattern(" S ")
                .define('L', ingredient)
                .define('S', ingredient2)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void WateringCanRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("II ")
                .pattern("IWI")
                .pattern(" II")
                .define('I', ingredient)
                .define('W', Items.BUCKET)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void HelmetRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("III")
                .pattern("I I")
                .define('I', ingredient)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void ChestplateRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .define('I', ingredient)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void LeggingsRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .define('I', ingredient)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void BootsRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("I I")
                .pattern("I I")
                .define('I', ingredient)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void SwordRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .define('I', ingredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void PickaxeRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ingredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void AxeRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .define('I', ingredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void ShovelRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .define('I', ingredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void HoeRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .define('I', ingredient)
                .define('S', Items.STICK)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void crusherRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern(" IS")
                .pattern(" SI")
                .pattern("S  ")
                .define('S', Items.STICK)
                .define('I', ingredient)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result) + "_from_" + getItemName(ingredient));
    }

    protected static void DragonRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient1, ItemLike ingredient2, ItemLike ingredient3)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("SSS")
                .pattern("DTD")
                .pattern("SSS")
                .define('S', ingredient1)
                .define('D', ingredient2)
                .define('T', ingredient3)
                .unlockedBy("has_" + getItemName(ingredient1), has(ingredient1))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void LampRecipe(RecipeOutput consumer, ItemLike result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("BBB")
                .pattern("BTB")
                .pattern("BBB")
                .define('B', Blocks.IRON_BARS)
                .define('T', Blocks.TORCH)
                .unlockedBy("has_torch", has(Blocks.TORCH))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result));
    }

    protected static void BlockRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 1)
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ingredient)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(ingredient) + "_to_" + getItemName(result));
    }

    protected static void UnBlockRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 9)
                .requires(ingredient, 1)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(result) + "_from_" + getItemName(ingredient));
    }
    
    protected static void SmallBlockRecipe(RecipeOutput consumer, ItemLike result, ItemLike ingredient, int amount)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, amount)
                .pattern("LL")
                .pattern("LL")
                .define('L', ingredient)
                .unlockedBy("has_" + getItemName(ingredient), has(ingredient))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(ingredient) + "_to_" + getItemName(result));
    }
    
    protected static void UnSmallBlockRecipe(RecipeOutput consumer, ItemLike result, int resultAmount, ItemLike ingredient, int inputAmount)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingredient, resultAmount)
                .requires(result, inputAmount)
                .unlockedBy("has_" + getItemName(result), has(result))
                .save(consumer, HavenKSH.MOD_ID + ":craft/" + getItemName(ingredient) + "_from_" + getItemName(result));
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput,  HavenKSH.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void stoneCutterRecipe(RecipeOutput pFinishedRecipeConsumer, ItemLike pResult, ItemLike pIngredient) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pIngredient), RecipeCategory.MISC, pResult)
                .unlockedBy(getHasName(pIngredient), has(pIngredient))
                .save(pFinishedRecipeConsumer, HavenKSH.MOD_ID + ":" + getItemName(pResult) + "_from_stonecutting_" + getItemName(pIngredient));
    }
}
