package net.cathienova.havenksh.util;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> andesite = tag("andesite");
        public static final TagKey<Block> diorite = tag("diorite");
        public static final TagKey<Block> granite = tag("granite");
        public static final TagKey<Block> minecraftLogs = minecraftTag("logs");
        public static final TagKey<Block> minecraftLogsThatBurn = minecraftTag("logs_that_burn");
        public static final TagKey<Block> needs_stone_tool = minecraftTag("needs_stone_tool");
        public static final TagKey<Block> needs_iron_tool = minecraftTag("needs_iron_tool");
        public static final TagKey<Block> needs_gold_tool = minecraftTag("needs_gold_tool");
        public static final TagKey<Block> needs_diamond_tool = minecraftTag("needs_diamond_tool");
        public static final TagKey<Block> needs_netherite_tool = cTag("needs_netherite_tool");
        public static final TagKey<Block> needs_havenite_tool = tag("needs_havenite_tool");
        public static final TagKey<Block> needs_pickaxe = cTag("mineable/pickaxe");
        public static final TagKey<Block> needs_shovel = cTag("mineable/shovel");

        public static final TagKey<Block> scorched_stone = tag("scorched_stone");
        public static final TagKey<Block> forgeOres = cTag("ores");

        public static final TagKey<Block> coalOres = tag("ores/coal");
        public static final TagKey<Block> copperOres = tag("ores/copper");
        public static final TagKey<Block> diamondOres = tag("ores/diamond");
        public static final TagKey<Block> emeraldOres = tag("ores/emerald");
        public static final TagKey<Block> goldOres = tag("ores/gold");
        public static final TagKey<Block> ironOres = tag("ores/iron");
        public static final TagKey<Block> lapisOres = tag("ores/lapis");
        public static final TagKey<Block> quartzOres = tag("ores/quartz");
        public static final TagKey<Block> redstoneOres = tag("ores/redstone");
        public static final TagKey<Block> haveniteOres = cTag("ores/havenite");
        public static final TagKey<Block> forgeStone = cTag("stone");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, name));
        }
        private static TagKey<Block> minecraftTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("minecraft", name));
        }
        private static TagKey<Block> cTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> logs = cTag("logs");
        public static final TagKey<Item> lamp = tag("lamp");
        public static final TagKey<Item> forgeOres = cTag("ores");
        public static final TagKey<Item> bark = tag("bark");
        public static final TagKey<Item> dyes = tag("dyes");
        public static final TagKey<Item> haveniteOres = cTag("ores/havenite");

        public static final TagKey<Item> forgeCopperDust = cTag("dusts/copper");
        public static final TagKey<Item> forgeTinDust = cTag("dusts/tin");
        public static final TagKey<Item> forgeNetheriteDust = cTag("dusts/netherite");
        public static final TagKey<Item> forgeIronDust = cTag("dusts/iron");
        public static final TagKey<Item> forgeGoldDust = cTag("dusts/gold");
        public static final TagKey<Item> forgeLeadDust = cTag("dusts/lead");
        public static final TagKey<Item> forgeSilverDust = cTag("dusts/silver");
        public static final TagKey<Item> forgeNickelDust = cTag("dusts/nickel");
        public static final TagKey<Item> forgeUraniumDust = cTag("dusts/uranium");
        public static final TagKey<Item> forgeOsmiumDust = cTag("dusts/osmium");
        public static final TagKey<Item> forgeZincDust = cTag("dusts/zinc");
        public static final TagKey<Item> forgeAluminumDust = cTag("dusts/aluminum");
        public static final TagKey<Item> forgeHaveniteDust = cTag("dusts/havenite");

        public static final TagKey<Item> forgeCopperIngot = cTag("ingots/copper");
        public static final TagKey<Item> forgeTinIngot = cTag("ingots/tin");
        public static final TagKey<Item> forgeIronIngot = cTag("ingots/iron");
        public static final TagKey<Item> forgeGoldIngot = cTag("ingots/gold");
        public static final TagKey<Item> forgeLeadIngot = cTag("ingots/lead");
        public static final TagKey<Item> forgeSilverIngot = cTag("ingots/silver");
        public static final TagKey<Item> forgeNickelIngot = cTag("ingots/nickel");
        public static final TagKey<Item> forgeUraniumIngot = cTag("ingots/uranium");
        public static final TagKey<Item> forgeOsmiumIngot = cTag("ingots/osmium");
        public static final TagKey<Item> forgeZincIngot = cTag("ingots/zinc");
        public static final TagKey<Item> forgeAluminumIngot = cTag("ingots/aluminum");
        public static final TagKey<Item> forgeNetheriteIngot = cTag("ingots/netherite");
        public static final TagKey<Item> forgeHaveniteIngot = cTag("ingots/havenite");

        public static final TagKey<Item> forgeRawCopper = cTag("raw_materials/copper");
        public static final TagKey<Item> forgeRawTin = cTag("raw_materials/tin");
        public static final TagKey<Item> forgeRawIron = cTag("raw_materials/iron");
        public static final TagKey<Item> forgeRawGold = cTag("raw_materials/gold");
        public static final TagKey<Item> forgeRawLead = cTag("raw_materials/lead");
        public static final TagKey<Item> forgeRawSilver = cTag("raw_materials/silver");
        public static final TagKey<Item> forgeRawNickel = cTag("raw_materials/nickel");
        public static final TagKey<Item> forgeRawUranium = cTag("raw_materials/uranium");
        public static final TagKey<Item> forgeRawOsmium = cTag("raw_materials/osmium");
        public static final TagKey<Item> forgeRawZinc = cTag("raw_materials/zinc");
        public static final TagKey<Item> forgeRawAluminum = cTag("raw_materials/aluminum");
        public static final TagKey<Item> forgeRawHavenite = cTag("raw_materials/havenite");

        public static final TagKey<Item> forgeCopperNugget = cTag("nuggets/copper");
        public static final TagKey<Item> forgeTinNugget = cTag("nuggets/tin");
        public static final TagKey<Item> forgeIronNugget = cTag("nuggets/iron");
        public static final TagKey<Item> forgeGoldNugget = cTag("nuggets/gold");
        public static final TagKey<Item> forgeLeadNugget = cTag("nuggets/lead");
        public static final TagKey<Item> forgeSilverNugget = cTag("nuggets/silver");
        public static final TagKey<Item> forgeNickelNugget = cTag("nuggets/nickel");
        public static final TagKey<Item> forgeUraniumNugget = cTag("nuggets/uranium");
        public static final TagKey<Item> forgeOsmiumNugget = cTag("nuggets/osmium");
        public static final TagKey<Item> forgeZincNugget = cTag("nuggets/zinc");
        public static final TagKey<Item> forgeAluminumNugget = cTag("nuggets/aluminum");
        public static final TagKey<Item> forgeDiamondNugget = cTag("nuggets/diamond");
        public static final TagKey<Item> forgeEmeraldNugget = cTag("nuggets/emerald");
        public static final TagKey<Item> forgeNetheriteNugget = cTag("nuggets/netherite");
        public static final TagKey<Item> forgeLapisNugget = cTag("nuggets/lapis");
        public static final TagKey<Item> forgeQuartzNugget = cTag("nuggets/quartz");
        public static final TagKey<Item> forgeRedstoneNugget = cTag("nuggets/redstone");
        public static final TagKey<Item> forgeHaveniteNugget = cTag("nuggets/havenite");
        public static final TagKey<Item> oreHammers = tag("ore_hammers");
        public static final TagKey<Item> hammers = tag("hammers");
        public static final TagKey<Item> excavators = tag("excavators");
        public static final TagKey<Item> choppers = tag("choppers");

        public static final TagKey<Item> forgeCopperBlocks = cTag("storage_blocks/copper");
        public static final TagKey<Item> forgeTinBlocks = cTag("storage_blocks/tin");
        public static final TagKey<Item> forgeNetheriteBlocks = cTag("storage_blocks/netherite");
        public static final TagKey<Item> forgeIronBlocks = cTag("storage_blocks/iron");
        public static final TagKey<Item> forgeGoldBlocks = cTag("storage_blocks/gold");
        public static final TagKey<Item> forgeLeadBlocks = cTag("storage_blocks/lead");
        public static final TagKey<Item> forgeSilverBlocks = cTag("storage_blocks/silver");
        public static final TagKey<Item> forgeNickelBlocks = cTag("storage_blocks/nickel");
        public static final TagKey<Item> forgeUraniumBlocks = cTag("storage_blocks/uranium");
        public static final TagKey<Item> forgeOsmiumBlocks = cTag("storage_blocks/osmium");
        public static final TagKey<Item> forgeZincBlocks = cTag("storage_blocks/zinc");
        public static final TagKey<Item> forgeAluminumBlocks = cTag("storage_blocks/aluminum");
        public static final TagKey<Item> forgeDiamondBlocks = cTag("storage_blocks/diamond");
        public static final TagKey<Item> forgeHaveniteBlocks = cTag("storage_blocks/havenite");
        public static final TagKey<Item> forgeRawTinBlocks = cTag("storage_blocks/raw_tin");
        public static final TagKey<Item> forgeRawCopperBlocks = cTag("storage_blocks/raw_copper");
        public static final TagKey<Item> forgeRawIronBlocks = cTag("storage_blocks/raw_iron");
        public static final TagKey<Item> forgeRawGoldBlocks = cTag("storage_blocks/raw_gold");
        public static final TagKey<Item> forgeRawLeadBlocks = cTag("storage_blocks/raw_lead");
        public static final TagKey<Item> forgeRawSilverBlocks = cTag("storage_blocks/raw_silver");
        public static final TagKey<Item> forgeRawNickelBlocks = cTag("storage_blocks/raw_nickel");
        public static final TagKey<Item> forgeRawUraniumBlocks = cTag("storage_blocks/raw_uranium");
        public static final TagKey<Item> forgeRawOsmiumBlocks = cTag("storage_blocks/raw_osmium");
        public static final TagKey<Item> forgeRawZincBlocks = cTag("storage_blocks/raw_zinc");
        public static final TagKey<Item> forgeRawAluminumBlocks = cTag("storage_blocks/raw_aluminum");
        public static final TagKey<Item> forgeRawHaveniteBlocks = cTag("storage_blocks/raw_havenite");

        public static final TagKey<Item> leather = cTag("leather");
        public static final TagKey<Item> chests = cTag("chests");
        public static final TagKey<Item> glass = cTag("glass");
        public static final TagKey<Item> forgeStone = cTag("stone");
        public static final TagKey<Item> mini_coals = cTag("mini_coals");
        public static final TagKey<Item> crushers = tag("crushers");
        public static final TagKey<Item> wooden_armor = tag("wooden_armor");
        public static final TagKey<Item> flint_armor = tag("flint_armor");
        public static final TagKey<Item> bone_armor = tag("bone_armor");
        public static final TagKey<Item> stone_armor = tag("stone_armor");
        public static final TagKey<Item> copper_armor = tag("copper_armor");
        public static final TagKey<Item> emerald_armor = tag("emerald_armor");
        public static final TagKey<Item> obsidian_armor = tag("obsidian_armor");
        public static final TagKey<Item> dragon_armor = tag("dragon_armor");

        public static final TagKey<Item> pickaxes = cTag("tools/pickaxes");
        public static final TagKey<Item> shovels = cTag("tools/shovels");

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, name));
        }
        private static TagKey<Item> cTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}
