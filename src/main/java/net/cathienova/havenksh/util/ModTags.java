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
        public static final TagKey<Block> needs_netherite_tool = forgeTag("needs_netherite_tool");
        public static final TagKey<Block> needs_havenite_tool = tag("needs_havenite_tool");
        public static final TagKey<Block> needs_pickaxe = forgeTag("mineable/pickaxe");
        public static final TagKey<Block> needs_shovel = forgeTag("mineable/shovel");

        public static final TagKey<Block> scorched_stone = tag("scorched_stone");
        public static final TagKey<Block> forgeOres = forgeTag("ores");

        public static final TagKey<Block> coalOres = tag("ores/coal");
        public static final TagKey<Block> copperOres = tag("ores/copper");
        public static final TagKey<Block> diamondOres = tag("ores/diamond");
        public static final TagKey<Block> emeraldOres = tag("ores/emerald");
        public static final TagKey<Block> goldOres = tag("ores/gold");
        public static final TagKey<Block> ironOres = tag("ores/iron");
        public static final TagKey<Block> lapisOres = tag("ores/lapis");
        public static final TagKey<Block> quartzOres = tag("ores/quartz");
        public static final TagKey<Block> redstoneOres = tag("ores/redstone");
        public static final TagKey<Block> haveniteOres = forgeTag("ores/havenite");
        public static final TagKey<Block> forgeStone = forgeTag("stone");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(HavenKSH.MOD_ID, name));
        }
        private static TagKey<Block> minecraftTag(String name) {
            return BlockTags.create(new ResourceLocation("minecraft", name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items
    {
        public static final TagKey<Item> logs = forgeTag("logs");
        public static final TagKey<Item> lamp = tag("lamp");
        public static final TagKey<Item> cobbleGens = tag("cobble_gens");
        public static final TagKey<Item> cobbleGenUpgrades = tag("cobble_gen_upgrades");
        public static final TagKey<Item> forgeOres = forgeTag("ores");
        public static final TagKey<Item> seeds = tag("seeds");
        public static final TagKey<Item> bark = tag("bark");
        public static final TagKey<Item> dyes = tag("dyes");
        public static final TagKey<Item> haveniteOres = forgeTag("ores/havenite");

        public static final TagKey<Item> forgeCopperDust = forgeTag("dusts/copper");
        public static final TagKey<Item> forgeTinDust = forgeTag("dusts/tin");
        public static final TagKey<Item> forgeNetheriteDust = forgeTag("dusts/netherite");
        public static final TagKey<Item> forgeIronDust = forgeTag("dusts/iron");
        public static final TagKey<Item> forgeGoldDust = forgeTag("dusts/gold");
        public static final TagKey<Item> forgeLeadDust = forgeTag("dusts/lead");
        public static final TagKey<Item> forgeSilverDust = forgeTag("dusts/silver");
        public static final TagKey<Item> forgeNickelDust = forgeTag("dusts/nickel");
        public static final TagKey<Item> forgeUraniumDust = forgeTag("dusts/uranium");
        public static final TagKey<Item> forgeOsmiumDust = forgeTag("dusts/osmium");
        public static final TagKey<Item> forgeZincDust = forgeTag("dusts/zinc");
        public static final TagKey<Item> forgeAluminumDust = forgeTag("dusts/aluminum");
        public static final TagKey<Item> forgeHaveniteDust = forgeTag("dusts/havenite");

        public static final TagKey<Item> forgeCopperIngot = forgeTag("ingots/copper");
        public static final TagKey<Item> forgeTinIngot = forgeTag("ingots/tin");
        public static final TagKey<Item> forgeIronIngot = forgeTag("ingots/iron");
        public static final TagKey<Item> forgeGoldIngot = forgeTag("ingots/gold");
        public static final TagKey<Item> forgeLeadIngot = forgeTag("ingots/lead");
        public static final TagKey<Item> forgeSilverIngot = forgeTag("ingots/silver");
        public static final TagKey<Item> forgeNickelIngot = forgeTag("ingots/nickel");
        public static final TagKey<Item> forgeUraniumIngot = forgeTag("ingots/uranium");
        public static final TagKey<Item> forgeOsmiumIngot = forgeTag("ingots/osmium");
        public static final TagKey<Item> forgeZincIngot = forgeTag("ingots/zinc");
        public static final TagKey<Item> forgeAluminumIngot = forgeTag("ingots/aluminum");
        public static final TagKey<Item> forgeNetheriteIngot = forgeTag("ingots/netherite");
        public static final TagKey<Item> forgeHaveniteIngot = forgeTag("ingots/havenite");

        public static final TagKey<Item> forgeRawCopper = forgeTag("raw_materials/copper");
        public static final TagKey<Item> forgeRawTin = forgeTag("raw_materials/tin");
        public static final TagKey<Item> forgeRawIron = forgeTag("raw_materials/iron");
        public static final TagKey<Item> forgeRawGold = forgeTag("raw_materials/gold");
        public static final TagKey<Item> forgeRawLead = forgeTag("raw_materials/lead");
        public static final TagKey<Item> forgeRawSilver = forgeTag("raw_materials/silver");
        public static final TagKey<Item> forgeRawNickel = forgeTag("raw_materials/nickel");
        public static final TagKey<Item> forgeRawUranium = forgeTag("raw_materials/uranium");
        public static final TagKey<Item> forgeRawOsmium = forgeTag("raw_materials/osmium");
        public static final TagKey<Item> forgeRawZinc = forgeTag("raw_materials/zinc");
        public static final TagKey<Item> forgeRawAluminum = forgeTag("raw_materials/aluminum");
        public static final TagKey<Item> forgeRawHavenite = forgeTag("raw_materials/havenite");

        public static final TagKey<Item> forgeCopperNugget = forgeTag("nuggets/copper");
        public static final TagKey<Item> forgeTinNugget = forgeTag("nuggets/tin");
        public static final TagKey<Item> forgeIronNugget = forgeTag("nuggets/iron");
        public static final TagKey<Item> forgeGoldNugget = forgeTag("nuggets/gold");
        public static final TagKey<Item> forgeLeadNugget = forgeTag("nuggets/lead");
        public static final TagKey<Item> forgeSilverNugget = forgeTag("nuggets/silver");
        public static final TagKey<Item> forgeNickelNugget = forgeTag("nuggets/nickel");
        public static final TagKey<Item> forgeUraniumNugget = forgeTag("nuggets/uranium");
        public static final TagKey<Item> forgeOsmiumNugget = forgeTag("nuggets/osmium");
        public static final TagKey<Item> forgeZincNugget = forgeTag("nuggets/zinc");
        public static final TagKey<Item> forgeAluminumNugget = forgeTag("nuggets/aluminum");
        public static final TagKey<Item> forgeDiamondNugget = forgeTag("nuggets/diamond");
        public static final TagKey<Item> forgeEmeraldNugget = forgeTag("nuggets/emerald");
        public static final TagKey<Item> forgeNetheriteNugget = forgeTag("nuggets/netherite");
        public static final TagKey<Item> forgeLapisNugget = forgeTag("nuggets/lapis");
        public static final TagKey<Item> forgeQuartzNugget = forgeTag("nuggets/quartz");
        public static final TagKey<Item> forgeRedstoneNugget = forgeTag("nuggets/redstone");
        public static final TagKey<Item> forgeHaveniteNugget = forgeTag("nuggets/havenite");
        public static final TagKey<Item> oreHammers = tag("ore_hammers");
        public static final TagKey<Item> hammers = tag("hammers");
        public static final TagKey<Item> excavators = tag("excavators");
        public static final TagKey<Item> choppers = tag("choppers");

        public static final TagKey<Item> forgeCopperBlocks = forgeTag("storage_blocks/copper");
        public static final TagKey<Item> forgeTinBlocks = forgeTag("storage_blocks/tin");
        public static final TagKey<Item> forgeNetheriteBlocks = forgeTag("storage_blocks/netherite");
        public static final TagKey<Item> forgeIronBlocks = forgeTag("storage_blocks/iron");
        public static final TagKey<Item> forgeGoldBlocks = forgeTag("storage_blocks/gold");
        public static final TagKey<Item> forgeLeadBlocks = forgeTag("storage_blocks/lead");
        public static final TagKey<Item> forgeSilverBlocks = forgeTag("storage_blocks/silver");
        public static final TagKey<Item> forgeNickelBlocks = forgeTag("storage_blocks/nickel");
        public static final TagKey<Item> forgeUraniumBlocks = forgeTag("storage_blocks/uranium");
        public static final TagKey<Item> forgeOsmiumBlocks = forgeTag("storage_blocks/osmium");
        public static final TagKey<Item> forgeZincBlocks = forgeTag("storage_blocks/zinc");
        public static final TagKey<Item> forgeAluminumBlocks = forgeTag("storage_blocks/aluminum");
        public static final TagKey<Item> forgeDiamondBlocks = forgeTag("storage_blocks/diamond");
        public static final TagKey<Item> forgeHaveniteBlocks = forgeTag("storage_blocks/havenite");
        public static final TagKey<Item> forgeRawTinBlocks = forgeTag("storage_blocks/raw_tin");
        public static final TagKey<Item> forgeRawCopperBlocks = forgeTag("storage_blocks/raw_copper");
        public static final TagKey<Item> forgeRawIronBlocks = forgeTag("storage_blocks/raw_iron");
        public static final TagKey<Item> forgeRawGoldBlocks = forgeTag("storage_blocks/raw_gold");
        public static final TagKey<Item> forgeRawLeadBlocks = forgeTag("storage_blocks/raw_lead");
        public static final TagKey<Item> forgeRawSilverBlocks = forgeTag("storage_blocks/raw_silver");
        public static final TagKey<Item> forgeRawNickelBlocks = forgeTag("storage_blocks/raw_nickel");
        public static final TagKey<Item> forgeRawUraniumBlocks = forgeTag("storage_blocks/raw_uranium");
        public static final TagKey<Item> forgeRawOsmiumBlocks = forgeTag("storage_blocks/raw_osmium");
        public static final TagKey<Item> forgeRawZincBlocks = forgeTag("storage_blocks/raw_zinc");
        public static final TagKey<Item> forgeRawAluminumBlocks = forgeTag("storage_blocks/raw_aluminum");
        public static final TagKey<Item> forgeRawHaveniteBlocks = forgeTag("storage_blocks/raw_havenite");

        public static final TagKey<Item> leather = forgeTag("leather");
        public static final TagKey<Item> chests = forgeTag("chests");
        public static final TagKey<Item> glass = forgeTag("glass");
        public static final TagKey<Item> forgeStone = forgeTag("stone");
        public static final TagKey<Item> mini_coals = forgeTag("mini_coals");
        public static final TagKey<Item> crushers = tag("crushers");
        public static final TagKey<Item> wooden_armor = tag("wooden_armor");
        public static final TagKey<Item> flint_armor = tag("flint_armor");
        public static final TagKey<Item> bone_armor = tag("bone_armor");
        public static final TagKey<Item> stone_armor = tag("stone_armor");
        public static final TagKey<Item> copper_armor = tag("copper_armor");
        public static final TagKey<Item> emerald_armor = tag("emerald_armor");
        public static final TagKey<Item> obsidian_armor = tag("obsidian_armor");
        public static final TagKey<Item> dragon_armor = tag("dragon_armor");

        public static final TagKey<Item> pickaxes = forgeTag("tools/pickaxes");
        public static final TagKey<Item> shovels = forgeTag("tools/shovels");

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(HavenKSH.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
