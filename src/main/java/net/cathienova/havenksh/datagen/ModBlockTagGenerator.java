package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider
{
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HavenKSH.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.andesite_brick.get())
                .add(ModBlocks.diorite_brick.get())
                .add(ModBlocks.granite_brick.get())
                .add(ModBlocks.scorched_stone.get())
                .add(ModBlocks.scorched_stone_bricks.get())
                .add(ModBlocks.scorched_cobblestone.get())
                .add(ModBlocks.scorched_coal_ore.get())
                .add(ModBlocks.scorched_redstone_ore.get())
                .add(ModBlocks.scorched_copper_ore.get())
                .add(ModBlocks.scorched_iron_ore.get())
                .add(ModBlocks.scorched_gold_ore.get())
                .add(ModBlocks.scorched_diamond_ore.get())
                .add(ModBlocks.scorched_emerald_ore.get())
                .add(ModBlocks.scorched_lapis_ore.get())
                .add(ModBlocks.scorched_quartz_ore.get())
                .add(ModBlocks.lamp_white.get())
                .add(ModBlocks.lamp_aqua.get())
                .add(ModBlocks.lamp_blue.get())
                .add(ModBlocks.lamp_dark_aqua.get())
                .add(ModBlocks.lamp_dark_blue.get())
                .add(ModBlocks.lamp_dark_gray.get())
                .add(ModBlocks.lamp_dark_green.get())
                .add(ModBlocks.lamp_dark_purple.get())
                .add(ModBlocks.lamp_dark_red.get())
                .add(ModBlocks.lamp_gold.get())
                .add(ModBlocks.lamp_gray.get())
                .add(ModBlocks.lamp_green.get())
                .add(ModBlocks.lamp_light_purple.get())
                .add(ModBlocks.lamp_red.get())
                .add(ModBlocks.lamp_yellow.get())
                .add(ModBlocks.lamp_rainbow.get())
                .add(ModBlocks.flint_block.get())
                .add(ModBlocks.flesh_block.get())
                .add(ModBlocks.charcoal_block.get())
                .add(ModBlocks.nether_star_block.get())
                .add(ModBlocks.reinforced_glass.get())
                .add(ModBlocks.havenite_block.get())
                .add(ModBlocks.havenite_ore.get())
                .add(ModBlocks.deepslate_havenite_ore.get())
                .add(ModBlocks.raw_havenite_block.get())
            ;

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.scorched_iron_ore.get())
                .add(ModBlocks.scorched_copper_ore.get())
                .add(ModBlocks.scorched_lapis_ore.get())
                .add(ModBlocks.lamp_white.get())
                .add(ModBlocks.lamp_aqua.get())
                .add(ModBlocks.lamp_blue.get())
                .add(ModBlocks.lamp_dark_aqua.get())
                .add(ModBlocks.lamp_dark_blue.get())
                .add(ModBlocks.lamp_dark_gray.get())
                .add(ModBlocks.lamp_dark_green.get())
                .add(ModBlocks.lamp_dark_purple.get())
                .add(ModBlocks.lamp_dark_red.get())
                .add(ModBlocks.lamp_gold.get())
                .add(ModBlocks.lamp_gray.get())
                .add(ModBlocks.lamp_green.get())
                .add(ModBlocks.lamp_light_purple.get())
                .add(ModBlocks.lamp_red.get())
                .add(ModBlocks.lamp_yellow.get())
                .add(ModBlocks.lamp_rainbow.get())
            ;

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.scorched_gold_ore.get())
                .add(ModBlocks.scorched_redstone_ore.get())
                .add(ModBlocks.scorched_emerald_ore.get())
                .add(ModBlocks.scorched_diamond_ore.get())
                .add(ModBlocks.reinforced_glass.get())
            ;

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.havenite_block.get())
                .add(ModBlocks.havenite_ore.get())
                .add(ModBlocks.deepslate_havenite_ore.get())
                .add(ModBlocks.raw_havenite_block.get())
            ;

        this.tag(ModTags.Blocks.haveniteOres)
                .add(ModBlocks.havenite_ore.get())
                .add(ModBlocks.deepslate_havenite_ore.get())
            ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(Blocks.ACACIA_LOG)
                .add(Blocks.BIRCH_LOG)
                .add(Blocks.CHERRY_LOG)
                .add(Blocks.DARK_OAK_LOG)
                .add(Blocks.JUNGLE_LOG)
                .add(Blocks.MANGROVE_LOG)
                .add(Blocks.OAK_LOG)
                .add(Blocks.SPRUCE_LOG)
            ;

        this.tag(BlockTags.LOGS)
                .add(Blocks.ACACIA_LOG)
                .add(Blocks.BIRCH_LOG)
                .add(Blocks.CHERRY_LOG)
                .add(Blocks.DARK_OAK_LOG)
                .add(Blocks.JUNGLE_LOG)
                .add(Blocks.MANGROVE_LOG)
                .add(Blocks.OAK_LOG)
                .add(Blocks.SPRUCE_LOG)
                .add(Blocks.WARPED_STEM)
                .add(Blocks.CRIMSON_STEM)
            ;

        this.tag(BlockTags.PLANKS)
            ;

        this.tag(BlockTags.CROPS)
            ;

        this.tag(ModTags.Blocks.forgeStone)
                .add(ModBlocks.scorched_stone.get())
                .add(ModBlocks.scorched_cobblestone.get())
            ;

        this.tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.havenite_block.get())
            ;

        this.tag(ModTags.Blocks.forgeOres)
                .add(ModBlocks.havenite_ore.get())
                .add(ModBlocks.deepslate_havenite_ore.get())
                .add(ModBlocks.scorched_copper_ore.get())
                .add(ModBlocks.scorched_coal_ore.get())
                .add(ModBlocks.scorched_iron_ore.get())
                .add(ModBlocks.scorched_gold_ore.get())
                .add(ModBlocks.scorched_redstone_ore.get())
                .add(ModBlocks.scorched_lapis_ore.get())
                .add(ModBlocks.scorched_quartz_ore.get())
                .add(ModBlocks.scorched_diamond_ore.get())
                .add(ModBlocks.scorched_emerald_ore.get())
        ;

        this.tag(ModTags.Blocks.copperOres)
                .add(ModBlocks.scorched_copper_ore.get())
            ;

        this.tag(ModTags.Blocks.ironOres)
                .add(ModBlocks.scorched_iron_ore.get())
            ;

        this.tag(ModTags.Blocks.goldOres)
                .add(ModBlocks.scorched_gold_ore.get())
            ;

        this.tag(ModTags.Blocks.diamondOres)
                .add(ModBlocks.scorched_diamond_ore.get())
            ;

        this.tag(ModTags.Blocks.emeraldOres)
                .add(ModBlocks.scorched_emerald_ore.get())
            ;

        this.tag(ModTags.Blocks.redstoneOres)
                .add(ModBlocks.scorched_redstone_ore.get())
            ;

        this.tag(ModTags.Blocks.lapisOres)
                .add(ModBlocks.scorched_lapis_ore.get())
            ;

        this.tag(ModTags.Blocks.quartzOres)
                .add(ModBlocks.scorched_quartz_ore.get())
            ;

        this.tag(ModTags.Blocks.coalOres)
                .add(ModBlocks.scorched_coal_ore.get())
            ;

        this.tag(ModTags.Blocks.scorched_stone)
                .add(ModBlocks.scorched_stone.get())
            ;
    }
}