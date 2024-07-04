package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, HavenKSH.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider)
    {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
            .add(ModArmor.stone_helmet.get())
            .add(ModArmor.stone_chestplate.get())
            .add(ModArmor.stone_leggings.get())
            .add(ModArmor.stone_boots.get())
            .add(ModArmor.wooden_helmet.get())
            .add(ModArmor.wooden_chestplate.get())
            .add(ModArmor.wooden_leggings.get())
            .add(ModArmor.wooden_boots.get())
            .add(ModArmor.bone_helmet.get())
            .add(ModArmor.bone_chestplate.get())
            .add(ModArmor.bone_leggings.get())
            .add(ModArmor.bone_boots.get())
            .add(ModArmor.flint_helmet.get())
            .add(ModArmor.flint_chestplate.get())
            .add(ModArmor.flint_leggings.get())
            .add(ModArmor.flint_boots.get())
            .add(ModArmor.copper_helmet.get())
            .add(ModArmor.copper_chestplate.get())
            .add(ModArmor.copper_leggings.get())
            .add(ModArmor.copper_boots.get())
            .add(ModArmor.obsidian_helmet.get())
            .add(ModArmor.obsidian_chestplate.get())
            .add(ModArmor.obsidian_leggings.get())
            .add(ModArmor.obsidian_boots.get())
            .add(ModArmor.emerald_helmet.get())
            .add(ModArmor.emerald_chestplate.get())
            .add(ModArmor.emerald_leggings.get())
            .add(ModArmor.emerald_boots.get())
            .add(ModArmor.dragon_helmet.get())
            .add(ModArmor.dragon_chestplate.get())
            .add(ModArmor.dragon_leggings.get())
            .add(ModArmor.dragon_boots.get())
        ;

        this.tag(ItemTags.LOGS_THAT_BURN)
            ;
        this.tag(ItemTags.LOGS)
            ;

        this.tag(ItemTags.PLANKS)
            ;

        this.tag(ItemTags.WOODEN_SLABS)
            ;

        this.tag(ItemTags.WOODEN_STAIRS)
            ;

        this.tag(ModTags.Items.dyes)
            .add(Items.WHITE_DYE)
            .add(Items.ORANGE_DYE)
            .add(Items.MAGENTA_DYE)
            .add(Items.LIGHT_BLUE_DYE)
            .add(Items.YELLOW_DYE)
            .add(Items.LIME_DYE)
            .add(Items.PINK_DYE)
            .add(Items.GRAY_DYE)
            .add(Items.LIGHT_GRAY_DYE)
            .add(Items.CYAN_DYE)
            .add(Items.PURPLE_DYE)
            .add(Items.BLUE_DYE)
            .add(Items.BROWN_DYE)
            .add(Items.GREEN_DYE)
            .add(Items.RED_DYE)
            .add(Items.BLACK_DYE)
            ;
        
        this.tag(ModTags.Items.lamp)
            .add(ModBlocks.lamp_white.get().asItem())
            .add(ModBlocks.lamp_aqua.get().asItem())
            .add(ModBlocks.lamp_blue.get().asItem())
            .add(ModBlocks.lamp_dark_aqua.get().asItem())
            .add(ModBlocks.lamp_dark_blue.get().asItem())
            .add(ModBlocks.lamp_dark_gray.get().asItem())
            .add(ModBlocks.lamp_dark_green.get().asItem())
            .add(ModBlocks.lamp_dark_purple.get().asItem())
            .add(ModBlocks.lamp_dark_red.get().asItem())
            .add(ModBlocks.lamp_gold.get().asItem())
            .add(ModBlocks.lamp_gray.get().asItem())
            .add(ModBlocks.lamp_green.get().asItem())
            .add(ModBlocks.lamp_light_purple.get().asItem())
            .add(ModBlocks.lamp_red.get().asItem())
            .add(ModBlocks.lamp_yellow.get().asItem())
            .add(ModBlocks.lamp_rainbow.get().asItem())
            ;

        this.tag(ModTags.Items.forgeCopperDust).add(ModItems.copper_dust.get());
        this.tag(ModTags.Items.forgeGoldDust).add(ModItems.gold_dust.get());
        this.tag(ModTags.Items.forgeIronDust).add(ModItems.iron_dust.get());
        this.tag(ModTags.Items.forgeLeadDust).add(ModItems.lead_dust.get());
        this.tag(ModTags.Items.forgeNickelDust).add(ModItems.nickel_dust.get());
        this.tag(ModTags.Items.forgeOsmiumDust).add(ModItems.osmium_dust.get());
        this.tag(ModTags.Items.forgeSilverDust).add(ModItems.silver_dust.get());
        this.tag(ModTags.Items.forgeTinDust).add(ModItems.tin_dust.get());
        this.tag(ModTags.Items.forgeUraniumDust).add(ModItems.uranium_dust.get());
        this.tag(ModTags.Items.forgeZincDust).add(ModItems.zinc_dust.get());
        this.tag(ModTags.Items.forgeNetheriteDust).add(ModItems.netherite_dust.get());
        this.tag(ModTags.Items.forgeAluminumDust).add(ModItems.aluminum_dust.get());

        this.tag(ModTags.Items.forgeCopperIngot).add(Items.COPPER_INGOT);
        this.tag(ModTags.Items.forgeGoldIngot).add(Items.GOLD_INGOT);
        this.tag(ModTags.Items.forgeIronIngot).add(Items.IRON_INGOT);
        this.tag(ModTags.Items.forgeLeadIngot).add(ModItems.lead_ingot.get());
        this.tag(ModTags.Items.forgeNickelIngot).add(ModItems.nickel_ingot.get());
        this.tag(ModTags.Items.forgeOsmiumIngot).add(ModItems.osmium_ingot.get());
        this.tag(ModTags.Items.forgeSilverIngot).add(ModItems.silver_ingot.get());
        this.tag(ModTags.Items.forgeTinIngot).add(ModItems.tin_ingot.get());
        this.tag(ModTags.Items.forgeUraniumIngot).add(ModItems.uranium_ingot.get());
        this.tag(ModTags.Items.forgeZincIngot).add(ModItems.zinc_ingot.get());
        this.tag(ModTags.Items.forgeNetheriteIngot).add(Items.NETHERITE_INGOT);
        this.tag(ModTags.Items.forgeAluminumIngot).add(ModItems.aluminum_ingot.get());

        this.tag(ModTags.Items.bark)
                .add(ModItems.oak_bark.get())
                .add(ModItems.spruce_bark.get())
                .add(ModItems.birch_bark.get())
                .add(ModItems.jungle_bark.get())
                .add(ModItems.acacia_bark.get())
                .add(ModItems.dark_oak_bark.get())
                .add(ModItems.crimson_bark.get())
                .add(ModItems.warped_bark.get())
                .add(ModItems.cherry_bark.get())
                .add(ModItems.mangrove_bark.get())
                ;

        this.tag(ModTags.Items.cobbleGens)
                .add(ModBlocks.wooden_cobble_gen.get().asItem())
                .add(ModBlocks.stone_cobble_gen.get().asItem())
                .add(ModBlocks.iron_cobble_gen.get().asItem())
                .add(ModBlocks.gold_cobble_gen.get().asItem())
                .add(ModBlocks.diamond_cobble_gen.get().asItem())
                .add(ModBlocks.emerald_cobble_gen.get().asItem())
                .add(ModBlocks.netherite_cobble_gen.get().asItem())
                .add(ModBlocks.creative_cobble_gen.get().asItem())
                ;

        this.tag(ModTags.Items.cobbleGenUpgrades)
                .add(ModItems.cobble_gen_upgrade_wooden.get())
                .add(ModItems.cobble_gen_upgrade_stone.get())
                .add(ModItems.cobble_gen_upgrade_iron.get())
                .add(ModItems.cobble_gen_upgrade_gold.get())
                .add(ModItems.cobble_gen_upgrade_diamond.get())
                .add(ModItems.cobble_gen_upgrade_emerald.get())
                .add(ModItems.cobble_gen_upgrade_netherite.get())
                ;

        this.tag(ModTags.Items.oreHammers)
                .add(ModTools.copper_ore_hammer.get())
                .add(ModTools.iron_ore_hammer.get())
                .add(ModTools.gold_ore_hammer.get())
                .add(ModTools.diamond_ore_hammer.get())
                .add(ModTools.emerald_ore_hammer.get())
                .add(ModTools.netherite_ore_hammer.get())
                .add(ModTools.havenite_ore_hammer.get())
        ;

        this.tag(ModTags.Items.hammers)
                .add(ModTools.stone_hammer.get())
                .add(ModTools.copper_hammer.get())
                .add(ModTools.iron_hammer.get())
                .add(ModTools.golden_hammer.get())
                .add(ModTools.diamond_hammer.get())
                .add(ModTools.emerald_hammer.get())
                .add(ModTools.netherite_hammer.get())
                .add(ModTools.havenite_hammer.get())
                ;

        this.tag(ModTags.Items.excavators)
                .add(ModTools.stone_excavator.get())
                .add(ModTools.copper_excavator.get())
                .add(ModTools.iron_excavator.get())
                .add(ModTools.golden_excavator.get())
                .add(ModTools.diamond_excavator.get())
                .add(ModTools.emerald_excavator.get())
                .add(ModTools.netherite_excavator.get())
                .add(ModTools.havenite_excavator.get())
                ;

        this.tag(ModTags.Items.choppers)
                .add(ModTools.stone_chopper.get())
                .add(ModTools.copper_chopper.get())
                .add(ModTools.iron_chopper.get())
                .add(ModTools.golden_chopper.get())
                .add(ModTools.diamond_chopper.get())
                .add(ModTools.emerald_chopper.get())
                .add(ModTools.netherite_chopper.get())
                .add(ModTools.havenite_chopper.get())
                ;

        this.tag(ModTags.Items.forgeStone)
                .add(ModBlocks.scorched_stone.get().asItem())
                .add(ModBlocks.scorched_cobblestone.get().asItem())
                ;

        this.tag(ModTags.Items.forgeCopperNugget)
                .add(ModItems.copper_nugget.get())
                ;

        this.tag(ModTags.Items.forgeIronNugget)
                .add(Items.IRON_NUGGET)
                ;

        this.tag(ModTags.Items.forgeGoldNugget)
                .add(Items.GOLD_NUGGET)
                ;

        this.tag(ModTags.Items.forgeDiamondNugget)
                .add(ModItems.diamond_nugget.get())
                ;

        this.tag(ModTags.Items.forgeEmeraldNugget)
                .add(ModItems.emerald_nugget.get())
                ;

        this.tag(ModTags.Items.forgeNetheriteNugget)
                .add(ModItems.netherite_nugget.get())
                ;

        this.tag(ModTags.Items.forgeLapisNugget)
                .add(ModItems.lapis_nugget.get())
                ;

        this.tag(ModTags.Items.forgeQuartzNugget)
                .add(ModItems.quartz_nugget.get())
                ;

        this.tag(ModTags.Items.forgeRedstoneNugget)
                .add(ModItems.redstone_nugget.get())
                ;

        this.tag(ModTags.Items.forgeHaveniteNugget)
                .add(ModItems.havenite_nugget.get())
                ;

        this.tag(ModTags.Items.forgeHaveniteIngot)
                .add(ModItems.havenite_ingot.get())
                ;

        this.tag(ModTags.Items.forgeHaveniteDust)
                .add(ModItems.havenite_dust.get())
                ;

        this.tag(ModTags.Items.forgeHaveniteBlocks)
                .add(ModBlocks.havenite_block.get().asItem())
                ;

        this.tag(ModTags.Items.forgeRawHavenite)
                .add(ModItems.raw_havenite.get())
                ;

        this.tag(ModTags.Items.forgeRawHaveniteBlocks)
                .add(ModBlocks.raw_havenite_block.get().asItem())
                ;


        this.tag(ModTags.Items.forgeOres)
                .add(ModBlocks.havenite_ore.get().asItem())
                .add(ModBlocks.deepslate_havenite_ore.get().asItem())
                .add(ModBlocks.scorched_copper_ore.get().asItem())
                .add(ModBlocks.scorched_coal_ore.get().asItem())
                .add(ModBlocks.scorched_iron_ore.get().asItem())
                .add(ModBlocks.scorched_gold_ore.get().asItem())
                .add(ModBlocks.scorched_redstone_ore.get().asItem())
                .add(ModBlocks.scorched_lapis_ore.get().asItem())
                .add(ModBlocks.scorched_quartz_ore.get().asItem())
                .add(ModBlocks.scorched_diamond_ore.get().asItem())
                .add(ModBlocks.scorched_emerald_ore.get().asItem())
                ;

        this.tag(ModTags.Items.mini_coals)
                .add(ModItems.mini_coal.get())
                .add(ModItems.mini_charcoal.get())
                ;

        this.tag(ModTags.Items.wooden_armor)
                .add(ModArmor.wooden_helmet.get())
                .add(ModArmor.wooden_chestplate.get())
                .add(ModArmor.wooden_leggings.get())
                .add(ModArmor.wooden_boots.get())
                ;

        this.tag(ModTags.Items.stone_armor)
                .add(ModArmor.stone_helmet.get())
                .add(ModArmor.stone_chestplate.get())
                .add(ModArmor.stone_leggings.get())
                .add(ModArmor.stone_boots.get())
                ;

        this.tag(ModTags.Items.bone_armor)
                .add(ModArmor.bone_helmet.get())
                .add(ModArmor.bone_chestplate.get())
                .add(ModArmor.bone_leggings.get())
                .add(ModArmor.bone_boots.get())
                ;

        this.tag(ModTags.Items.flint_armor)
                .add(ModArmor.flint_helmet.get())
                .add(ModArmor.flint_chestplate.get())
                .add(ModArmor.flint_leggings.get())
                .add(ModArmor.flint_boots.get())
                ;

        this.tag(ModTags.Items.copper_armor)
                .add(ModArmor.copper_helmet.get())
                .add(ModArmor.copper_chestplate.get())
                .add(ModArmor.copper_leggings.get())
                .add(ModArmor.copper_boots.get())
                ;

        this.tag(ModTags.Items.obsidian_armor)
                .add(ModArmor.obsidian_helmet.get())
                .add(ModArmor.obsidian_chestplate.get())
                .add(ModArmor.obsidian_leggings.get())
                .add(ModArmor.obsidian_boots.get())
                ;

        this.tag(ModTags.Items.emerald_armor)
                .add(ModArmor.emerald_helmet.get())
                .add(ModArmor.emerald_chestplate.get())
                .add(ModArmor.emerald_leggings.get())
                .add(ModArmor.emerald_boots.get())
                ;

        this.tag(ModTags.Items.dragon_armor)
                .add(ModArmor.dragon_helmet.get())
                .add(ModArmor.dragon_chestplate.get())
                .add(ModArmor.dragon_leggings.get())
                .add(ModArmor.dragon_boots.get())
                ;

        this.tag(ItemTags.PICKAXES)
                .add(ModTools.bone_pickaxe.get())
                .add(ModTools.flint_pickaxe.get())
                .add(ModTools.copper_pickaxe.get())
                .add(ModTools.emerald_pickaxe.get())
                .add(ModTools.obsidian_pickaxe.get())
                .add(ModTools.dragon_pickaxe.get())
                ;

        this.tag(ItemTags.AXES)
                .add(ModTools.bone_axe.get())
                .add(ModTools.flint_axe.get())
                .add(ModTools.copper_axe.get())
                .add(ModTools.emerald_axe.get())
                .add(ModTools.obsidian_axe.get())
                .add(ModTools.dragon_axe.get())
                ;

        this.tag(ItemTags.SHOVELS)
                .add(ModTools.bone_shovel.get())
                .add(ModTools.flint_shovel.get())
                .add(ModTools.copper_shovel.get())
                .add(ModTools.emerald_shovel.get())
                .add(ModTools.obsidian_shovel.get())
                .add(ModTools.dragon_shovel.get())
                ;

        this.tag(ItemTags.HOES)
                .add(ModTools.bone_hoe.get())
                .add(ModTools.flint_hoe.get())
                .add(ModTools.copper_hoe.get())
                .add(ModTools.emerald_hoe.get())
                .add(ModTools.obsidian_hoe.get())
                .add(ModTools.dragon_hoe.get())
                ;

        this.tag(ItemTags.SWORDS)
                .add(ModTools.bone_sword.get())
                .add(ModTools.flint_sword.get())
                .add(ModTools.copper_sword.get())
                .add(ModTools.emerald_sword.get())
                .add(ModTools.obsidian_sword.get())
                .add(ModTools.dragon_sword.get())
                ;
    }
}
