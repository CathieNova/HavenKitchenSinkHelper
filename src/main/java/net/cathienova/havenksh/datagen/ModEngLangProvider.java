package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModCreativeModTabs;
import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEngLangProvider extends LanguageProvider
{
    public ModEngLangProvider(PackOutput output)
    {
        super(output, HavenKSH.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        add(ModCreativeModTabs.HavenKSH_tab_title, "Haven Kitchen Sink Helper");
        add("tooltip.cobblegen_1", "§7Holds §6%d §7Blocks!");
        add("tooltip.cobblegen_2", "§7Generates §6%.2f §7Blocks per second!");
        add("tooltip.cobblegen_3", "§7Outputs to an Inventory Above!");
        add("tooltip.cobblegen_4", "§7Outputs to Hopper Below!");

        add("tooltip.havenksh.ore_hammer", "Used to craft raw ore into dust.");
        add("tooltip.havenksh.ore_hammer.durability", "Durability: %s");
        add("tooltip.havenksh.ore_hammer.durability.infinite", "Durability: §2Infinite§r");
        add("tooltip.havenksh.hammer.durability.infinite", "Durability: §2Infinite§r");

        add("entity.minecraft.villager.havenksh.cobblemaster", "Cobble Master");

        add(ModBlocks.wooden_cobble_gen.get(), "Wooden Cobblestone Generator");
        add(ModBlocks.stone_cobble_gen.get(), "Stone Cobblestone Generator");
        add(ModBlocks.iron_cobble_gen.get(), "Iron Cobblestone Generator");
        add(ModBlocks.gold_cobble_gen.get(), "Gold Cobblestone Generator");
        add(ModBlocks.diamond_cobble_gen.get(), "Diamond Cobblestone Generator");
        add(ModBlocks.emerald_cobble_gen.get(), "Emerald Cobblestone Generator");
        add(ModBlocks.netherite_cobble_gen.get(), "Netherite Cobblestone Generator");
        add(ModBlocks.creative_cobble_gen.get(), "Creative Cobblestone Generator");

        add(ModItems.cobble_gen_upgrade_wooden.get(), "Wooden Cobblestone Generator Upgrade");
        add("item.havenksh.cobble_gen_upgrade_wooden.tooltip", "§bCrouch+Right Click§r to upgrade a §2Wooden§r to §5Stone§r");

        add(ModItems.cobble_gen_upgrade_stone.get(), "Stone Cobblestone Generator Upgrade");
        add("item.havenksh.cobble_gen_upgrade_stone.tooltip", "§bCrouch+Right Click§r to upgrade a §2Stone§r to §5Iron§r.");

        add(ModItems.cobble_gen_upgrade_iron.get(), "Iron Cobblestone Generator Upgrade");
        add("item.havenksh.cobble_gen_upgrade_iron.tooltip", "§bCrouch+Right Click§r to upgrade a §2Iron§r to §5Gold§r.");

        add(ModItems.cobble_gen_upgrade_gold.get(), "Gold Cobblestone Generator Upgrade");
        add("item.havenksh.cobble_gen_upgrade_gold.tooltip", "§bCrouch+Right Click§r to upgrade a §2Gold§r to §5Diamond§r.");

        add(ModItems.cobble_gen_upgrade_diamond.get(), "Diamond Cobblestone Generator Upgrade");
        add("item.havenksh.cobble_gen_upgrade_diamond.tooltip", "§bCrouch+Right Click§r to upgrade a §2Diamond§r to §5Emerald§r.");

        add(ModItems.cobble_gen_upgrade_emerald.get(), "Emerald Cobblestone Generator Upgrade");
        add("item.havenksh.cobble_gen_upgrade_emerald.tooltip", "§bCrouch+Right Click§r to upgrade a §2Emerald§r to §5Netherite§r.");

        add(ModItems.cobble_gen_upgrade_netherite.get(), "Netherite Cobblestone Generator Upgrade");
        add("item.havenksh.cobble_gen_upgrade_netherite.tooltip", "§bCrouch+Right Click§r to upgrade a §2Netherite§r to §5Creative§r.");


        add(ModBlocks.axolotl_seed.get(), "Axolotl Seed");
        add(ModBlocks.bee_seed.get(), "Bee Seed");
        add(ModBlocks.cat_seed.get(), "Cat Seed");
        add(ModBlocks.chicken_seed.get(), "Chicken Seed");
        add(ModBlocks.cow_seed.get(), "Cow Seed");
        add(ModBlocks.donkey_seed.get(), "Donkey Seed");
        add(ModBlocks.fox_seed.get(), "Fox Seed");
        add(ModBlocks.goat_seed.get(), "Goat Seed");
        add(ModBlocks.horse_seed.get(), "Horse Seed");
        add(ModBlocks.llama_seed.get(), "Llama Seed");
        add(ModBlocks.mooshroom_seed.get(), "Mooshroom Seed");
        add(ModBlocks.mule_seed.get(), "Mule Seed");
        add(ModBlocks.ocelot_seed.get(), "Ocelot Seed");
        add(ModBlocks.panda_seed.get(), "Panda Seed");
        add(ModBlocks.pig_seed.get(), "Pig Seed");
        add(ModBlocks.rabbit_seed.get(), "Rabbit Seed");
        add(ModBlocks.sheep_seed.get(), "Sheep Seed");
        add(ModBlocks.sniffer_seed.get(), "Sniffer Seed");
        add(ModBlocks.parrot_seed.get(), "Parrot Seed");
        add(ModBlocks.turtle_seed.get(), "Turtle Seed");
        add(ModBlocks.wolf_seed.get(), "Wolf Seed");
        add(ModBlocks.dolphin_seed.get(), "Dolphin Seed");
        add(ModBlocks.glow_squid_seed.get(), "Glow Squid Seed");
        add(ModBlocks.polar_bear_seed.get(), "Polar Bear Seed");
        add(ModBlocks.squid_seed.get(), "Squid Seed");
        add(ModBlocks.villager_seed.get(), "Village Seed");

        add("mobseed.remaining_time", "Growing time: %d seconds");
        add("mobseed.tooclose", "§cYou're too close to the seed for it to grow.");
        add("config.jade.plugin_havenksh.mobseed_remaining_time", "Remaining Time");

        add("tooltip.cobblegen.amount", "Cobblestone: %d / %d");
        add("tooltip.cobblegen.full", "Cobblestone Generator is Full: %d");
        add("tooltip.cobblegen.generating", "Generating %d");
        add("config.jade.plugin_havenksh.cobblegen_data", "Cobblestone Generator Info");

        add("block.havenksh.placement_on", "§7Can only be placed on %s");
        add("block.havenksh.placement_in", "§7Can only be placed in %s");

        add(ModBlocks.andesite_brick.get(), "Andesite Brick");
        add(ModBlocks.diorite_brick.get(), "Diorite Brick");
        add(ModBlocks.granite_brick.get(), "Granite Brick");
        add(ModBlocks.charcoal_block.get(), "Charcoal Block");
        add(ModBlocks.ender_block.get(), "Ender Block");
        add(ModBlocks.flesh_block.get(), "Flesh Block");
        add(ModBlocks.flint_block.get(), "Flint Block");
        add(ModBlocks.lamp_white.get(), "White Lamp");
        add(ModBlocks.lamp_aqua.get(), "Aqua Lamp");
        add(ModBlocks.lamp_blue.get(), "Blue Lamp");
        add(ModBlocks.lamp_dark_aqua.get(), "Dark Aqua Lamp");
        add(ModBlocks.lamp_dark_blue.get(), "Dark Blue Lamp");
        add(ModBlocks.lamp_dark_gray.get(), "Dark Gray Lamp");
        add(ModBlocks.lamp_dark_green.get(), "Dark Green Lamp");
        add(ModBlocks.lamp_dark_purple.get(), "Dark Purple Lamp");
        add(ModBlocks.lamp_dark_red.get(), "Dark Red Lamp");
        add(ModBlocks.lamp_gold.get(), "Gold Lamp");
        add(ModBlocks.lamp_gray.get(), "Gray Lamp");
        add(ModBlocks.lamp_green.get(), "Green Lamp");
        add(ModBlocks.lamp_light_purple.get(), "Light Purple Lamp");
        add(ModBlocks.lamp_red.get(), "Red Lamp");
        add(ModBlocks.lamp_yellow.get(), "Yellow Lamp");
        add(ModBlocks.lamp_rainbow.get(), "Rainbow Lamp");
        add("block.havenksh.lamp.tooltip", "§bRight click§r to toggle light.");
        add(ModBlocks.nether_star_block.get(), "Nether Star Block");
        add(ModBlocks.reinforced_glass.get(), "Reinforced Glass");
        add(ModBlocks.dust.get(), "Dust");
        add(ModBlocks.crushed_end_stone.get(), "Crushed End Stone");
        add(ModBlocks.crushed_netherrack.get(), "Crushed Netherrack");

        add(ModBlocks.scorched_stone.get(), "Scorched Stone");
        add(ModBlocks.scorched_stone_bricks.get(), "Scorched Stone Bricks");
        add(ModBlocks.scorched_cobblestone.get(), "Scorched Cobblestone");
        add(ModBlocks.scorched_coal_ore.get(), "Scorched Coal Ore");
        add(ModBlocks.scorched_iron_ore.get(), "Scorched Iron Ore");
        add(ModBlocks.scorched_gold_ore.get(), "Scorched Gold Ore");
        add(ModBlocks.scorched_diamond_ore.get(), "Scorched Diamond Ore");
        add(ModBlocks.scorched_emerald_ore.get(), "Scorched Emerald Ore");
        add(ModBlocks.scorched_lapis_ore.get(), "Scorched Lapis Ore");
        add(ModBlocks.scorched_redstone_ore.get(), "Scorched Redstone Ore");
        add(ModBlocks.scorched_copper_ore.get(), "Scorched Copper Ore");
        add(ModBlocks.scorched_quartz_ore.get(), "Scorched Quartz Ore");

        add(ModItems.mini_coal.get(), "Mini Coal");
        add(ModItems.mini_charcoal.get(), "Mini Charcoal");
        add(ModItems.copper_nugget.get(), "Copper Nugget");
        add(ModItems.diamond_nugget.get(), "Diamond Nugget");
        add(ModItems.emerald_nugget.get(), "Emerald Nugget");
        add(ModItems.netherite_nugget.get(), "Netherite Nugget");
        add(ModItems.lapis_nugget.get(), "Lapis Nugget");
        add(ModItems.quartz_nugget.get(), "Quartz Nugget");
        add(ModItems.redstone_nugget.get(), "Redstone Nugget");

        addItem(ModItems.havenite_dust, "Havenite Dust");
        addItem(ModItems.havenite_ingot, "Havenite Ingot");
        addItem(ModItems.havenite_nugget, "Havenite Nugget");
        addItem(ModItems.raw_havenite, "Raw Havenite");
        add(ModBlocks.havenite_ore.get(), "Havenite Ore");
        add(ModBlocks.deepslate_havenite_ore.get(), "Deepslate Havenite Ore");
        add(ModBlocks.havenite_block.get(), "Havenite Block");
        add(ModBlocks.raw_havenite_block.get(), "Raw Havenite Block");

        addItem(ModItems.copper_dust, "Copper Dust");
        addItem(ModItems.tin_dust, "Tin Dust");
        addItem(ModItems.netherite_dust, "Netherite Dust");
        addItem(ModItems.iron_dust, "Iron Dust");
        addItem(ModItems.gold_dust, "Gold Dust");
        addItem(ModItems.lead_dust, "Lead Dust");
        addItem(ModItems.silver_dust, "Silver Dust");
        addItem(ModItems.nickel_dust, "Nickel Dust");
        addItem(ModItems.uranium_dust, "Uranium Dust");
        addItem(ModItems.osmium_dust, "Osmium Dust");
        addItem(ModItems.zinc_dust, "Zinc Dust");
        addItem(ModItems.aluminum_dust, "Aluminum Dust");
        addItem(ModItems.tin_ingot, "Tin Ingot");
        addItem(ModItems.lead_ingot, "Lead Ingot");
        addItem(ModItems.silver_ingot, "Silver Ingot");
        addItem(ModItems.nickel_ingot, "Nickel Ingot");
        addItem(ModItems.uranium_ingot, "Uranium Ingot");
        addItem(ModItems.osmium_ingot, "Osmium Ingot");
        addItem(ModItems.zinc_ingot, "Zinc Ingot");
        addItem(ModItems.aluminum_ingot, "Aluminum Ingot");

        addItem(ModItems.research_tier_basic, "Basic Research Tier");
        addItem(ModItems.research_tier_intermediate, "Intermediate Research Tier");
        addItem(ModItems.research_tier_advanced, "Advanced Research Tier");
        addItem(ModItems.research_tier_elite, "Elite Research Tier");
        addItem(ModItems.research_tier_ultimate, "Ultimate Research Tier");

        addItem(ModTools.trowel, "Trowel");
        add("item.havenksh.trowel.tooltip.hotbar", "§bRight click§r to place random blocks from the hotbar.");
        add("item.havenksh.trowel.tooltip.inventory", "§bRight click§r to place random blocks from the inventory and hotbar.");

        addItem(ModItems.acacia_bark, "Acacia Bark");
        addItem(ModItems.birch_bark, "Birch Bark");
        addItem(ModItems.dark_oak_bark, "Dark Oak Bark");
        addItem(ModItems.jungle_bark, "Jungle Bark");
        addItem(ModItems.oak_bark, "Oak Bark");
        addItem(ModItems.spruce_bark, "Spruce Bark");
        addItem(ModItems.warped_bark, "Warped Bark");
        addItem(ModItems.crimson_bark, "Crimson Bark");
        addItem(ModItems.mangrove_bark, "Mangrove Bark");
        addItem(ModItems.cherry_bark, "Cherry Bark");

        addItem(ModArmor.magnet, "Magnet");
        add("havenksh.tooltip.item.magnet", "Attracts items if equipped with a range of 5 blocks.");
        addItem(ModArmor.repair_talisman, "Repair Talisman");
        add("havenksh.tooltip.item.repair_talisman", "Repairs items in your inventory over time.");

        add(ModItems.dragon_scale.get(), "Dragon Scale");
        add(ModItems.empty_iron_watering_can.get(), "Empty Iron Watering Can");
        add("item.havenksh.empty_watering_can.tooltip", "§bRight click§r on water to fill the watering can.");
        add(ModItems.iron_watering_can.get(), "Iron Watering Can");
        add("item.havenksh.iron_watering_can.tooltip", "§bRight click§r to water a 3x3 area.");

        add(ModArmor.bone_helmet.get(), "Bone Helmet");
        add(ModArmor.bone_chestplate.get(), "Bone Chestplate");
        add(ModArmor.bone_leggings.get(), "Bone Leggings");
        add(ModArmor.bone_boots.get(), "Bone Boots");
        add(ModTools.bone_axe.get(), "Bone Axe");
        add(ModTools.bone_hoe.get(), "Bone Hoe");
        add(ModTools.bone_pickaxe.get(), "Bone Pickaxe");
        add(ModTools.bone_shovel.get(), "Bone Shovel");
        add(ModTools.bone_sword.get(), "Bone Sword");

        add(ModArmor.flint_helmet.get(), "Flint Helmet");
        add(ModArmor.flint_chestplate.get(), "Flint Chestplate");
        add(ModArmor.flint_leggings.get(), "Flint Leggings");
        add(ModArmor.flint_boots.get(), "Flint Boots");
        add(ModTools.flint_axe.get(), "Flint Axe");
        add(ModTools.flint_hoe.get(), "Flint Hoe");
        add(ModTools.flint_pickaxe.get(), "Flint Pickaxe");
        add(ModTools.flint_shovel.get(), "Flint Shovel");
        add(ModTools.flint_sword.get(), "Flint Sword");

        add(ModArmor.copper_helmet.get(), "Copper Helmet");
        add(ModArmor.copper_chestplate.get(), "Copper Chestplate");
        add(ModArmor.copper_leggings.get(), "Copper Leggings");
        add(ModArmor.copper_boots.get(), "Copper Boots");
        add(ModTools.copper_axe.get(), "Copper Axe");
        add(ModTools.copper_hoe.get(), "Copper Hoe");
        add(ModTools.copper_pickaxe.get(), "Copper Pickaxe");
        add(ModTools.copper_shovel.get(), "Copper Shovel");
        add(ModTools.copper_sword.get(), "Copper Sword");
        add(ModTools.wooden_shears.get(), "Wooden Shears");

        add(ModArmor.obsidian_helmet.get(), "Obsidian Helmet");
        add(ModArmor.obsidian_chestplate.get(), "Obsidian Chestplate");
        add(ModArmor.obsidian_leggings.get(), "Obsidian Leggings");
        add(ModArmor.obsidian_boots.get(), "Obsidian Boots");
        add(ModTools.obsidian_axe.get(), "Obsidian Axe");
        add(ModTools.obsidian_pickaxe.get(), "Obsidian Pickaxe");
        add(ModTools.obsidian_shovel.get(), "Obsidian Shovel");
        add(ModTools.obsidian_hoe.get(), "Obsidian Hoe");
        add(ModTools.obsidian_sword.get(), "Obsidian Sword");

        add(ModArmor.emerald_helmet.get(), "Emerald Helmet");
        add(ModArmor.emerald_chestplate.get(), "Emerald Chestplate");
        add(ModArmor.emerald_leggings.get(), "Emerald Leggings");
        add(ModArmor.emerald_boots.get(), "Emerald Boots");
        add(ModTools.emerald_axe.get(), "Emerald Axe");
        add(ModTools.emerald_hoe.get(), "Emerald Hoe");
        add(ModTools.emerald_pickaxe.get(), "Emerald Pickaxe");
        add(ModTools.emerald_shovel.get(), "Emerald Shovel");
        add(ModTools.emerald_sword.get(), "Emerald Sword");

        add(ModArmor.wooden_helmet.get(), "Wooden Helmet");
        add(ModArmor.wooden_chestplate.get(), "Wooden Chestplate");
        add(ModArmor.wooden_leggings.get(), "Wooden Leggings");
        add(ModArmor.wooden_boots.get(), "Wooden Boots");

        add(ModArmor.stone_helmet.get(), "Stone Helmet");
        add(ModArmor.stone_chestplate.get(), "Stone Chestplate");
        add(ModArmor.stone_leggings.get(), "Stone Leggings");
        add(ModArmor.stone_boots.get(), "Stone Boots");

        add(ModArmor.dragon_helmet.get(), "Dragon Helmet");
        add(ModArmor.dragon_chestplate.get(), "Dragon Chestplate");
        add(ModArmor.dragon_leggings.get(), "Dragon Leggings");
        add(ModArmor.dragon_boots.get(), "Dragon Boots");
        add(ModTools.dragon_axe.get(), "Dragon Axe");
        add(ModTools.dragon_hoe.get(), "Dragon Hoe");
        add(ModTools.dragon_pickaxe.get(), "Dragon Pickaxe");
        add(ModTools.dragon_shovel.get(), "Dragon Shovel");
        add(ModTools.dragon_sword.get(), "Dragon Sword");
        add(ModTools.dragon_bow.get(), "Dragon Bow");
        add(ModTools.dragon_shield.get(), "Dragon Shield");

        add(ModItems.dice.get(), "Dice");

        add(ModTools.copper_ore_hammer.get(), "Copper Ore Hammer");
        add(ModTools.iron_ore_hammer.get(), "Iron Ore Hammer");
        add(ModTools.gold_ore_hammer.get(), "Gold Ore Hammer");
        add(ModTools.diamond_ore_hammer.get(), "Diamond Ore Hammer");
        add(ModTools.emerald_ore_hammer.get(), "Emerald Ore Hammer");
        add(ModTools.netherite_ore_hammer.get(), "Netherite Ore Hammer");
        add(ModTools.havenite_ore_hammer.get(), "Havenite Ore Hammer");

        add(ModTools.stone_hammer.get(), "Stone Hammer");
        add(ModTools.copper_hammer.get(), "Copper Hammer");
        add(ModTools.iron_hammer.get(), "Iron Hammer");
        add(ModTools.golden_hammer.get(), "Gold Hammer");
        add(ModTools.diamond_hammer.get(), "Diamond Hammer");
        add(ModTools.emerald_hammer.get(), "Emerald Hammer");
        add(ModTools.netherite_hammer.get(), "Netherite Hammer");
        add(ModTools.havenite_hammer.get(), "Havenite Hammer");
        add("item.havenksh.hammer.tooltip", "Breaks blocks in a 3x3 area.");
        add("item.havenksh.hammer.tooltip2", "Crouch while breaking only breaks 1 block.");

        add("tooltip.havenksh.ore.havenite", "This ore can only be broken by a player.");

        add(ModTools.stone_excavator.get(), "Stone Excavator");
        add(ModTools.copper_excavator.get(), "Copper Excavator");
        add(ModTools.iron_excavator.get(), "Iron Excavator");
        add(ModTools.golden_excavator.get(), "Golden Excavator");
        add(ModTools.diamond_excavator.get(), "Diamond Excavator");
        add(ModTools.emerald_excavator.get(), "Emerald Excavator");
        add(ModTools.netherite_excavator.get(), "Netherite Excavator");
        add(ModTools.havenite_excavator.get(), "Havenite Excavator");
        add("item.havenksh.excavator.tooltip", "Digs blocks in a 3x3 area.");
        add("item.havenksh.excavator.tooltip2", "Crouch while digging only digs 1 block.");

        add(ModTools.stone_chopper.get(), "Stone Chopper");
        add(ModTools.copper_chopper.get(), "Copper Chopper");
        add(ModTools.iron_chopper.get(), "Iron Chopper");
        add(ModTools.golden_chopper.get(), "Golden Chopper");
        add(ModTools.diamond_chopper.get(), "Diamond Chopper");
        add(ModTools.emerald_chopper.get(), "Emerald Chopper");
        add(ModTools.netherite_chopper.get(), "Netherite Chopper");
        add(ModTools.havenite_chopper.get(), "Havenite Chopper");
        add("item.havenksh.chopper.tooltip1", "Chops down entire trees.");
        add("item.havenksh.chopper.tooltip2", "Crouch§r while breaking only breaks 1 Log.");
        add("item.havenksh.chopper.tooltip3", "It breaks every log connected to the one you break.");





        add("jei.havenksh.cobble_gen.desc.line1", "Cobble Generators is a stable source of Cobblestone for your needs. The higher the tier, the faster it generates Cobblestone.");
        add("jei.havenksh.cobble_gen.desc.line2", "It automatically outputs to an inventory above and manually to a hopper below.");

        add("jei.havenksh.ore_hammer.desc.line1", "Ore Hammers are used to crush ores into dust. The higher the tier, the higher the durability it has.");
        add("jei.havenksh.ore_hammer.desc.line2", "The dust can be smelted into ingots or used in other recipes.");

        add("jei.havenksh.trowel.desc.line1", "Trowels are used to place random blocks from the hotbar. Right click to place a block.");

        add("jei.havenksh.bark.desc.line1", "Bark can be obtained by stripping logs. It can be used to craft various items.");
        add("jei.havenksh.bark.desc.line2", "You can use the Bark to Right Click the equivalent stripped log to turn it back into a log.");
        add("jei.havenksh.bark.desc.line3", "It can also be used as fuel in a furnace.");

        add("jei.havenksh.magnet.desc.line1", "Attracts items if equipped with a range of 5 blocks.");
        add("jei.havenksh.repair_talisman.desc.line1", "Repairs items in your inventory over time.");

        add("jei.havenksh.dragonscale.desc.line1", "A scale that drops from the Ender Dragon.");
        add("jei.havenksh.dragonscale.desc.line2", "It can be used to craft more powerful tools and armor than Netherite.");

        add("rei.category.havenksh.item_info", "REI Information");




        add("advancements.havenksh.root.title", "Haven: Kitchen Sink Helper");
        add("advancements.havenksh.root.description", "The beginning of your journey in Haven: Kitchen Sink Helper");

        add("advancements.havenksh.wooden_cobble_gen.title", "Wooden Cobble Generator");
        add("advancements.havenksh.wooden_cobble_gen.description", "Starting small: a wooden wonder for all your cobblestone dreams.");

        add("advancements.havenksh.stone_cobble_gen.title", "Stone Cobble Generator");
        add("advancements.havenksh.stone_cobble_gen.description", "Upgrading to stone, because wood just wasn't rock solid enough.");

        add("advancements.havenksh.iron_cobble_gen.title", "Iron Cobble Generator");
        add("advancements.havenksh.iron_cobble_gen.description", "Stronger than stone, shinier than wood. Iron: now you're serious.");

        add("advancements.havenksh.gold_cobble_gen.title", "Gold Cobble Generator");
        add("advancements.havenksh.gold_cobble_gen.description", "Golden cobbles, for when you want your rocks to have bling.");

        add("advancements.havenksh.diamond_cobble_gen.title", "Diamond Cobble Generator");
        add("advancements.havenksh.diamond_cobble_gen.description", "Diamonds are forever, just like your endless supply of cobblestone.");

        add("advancements.havenksh.emerald_cobble_gen.title", "Emerald Cobble Generator");
        add("advancements.havenksh.emerald_cobble_gen.description", "Green with envy? Get your emerald cobble generator now!");

        add("advancements.havenksh.netherite_cobble_gen.title", "Netherite Cobble Generator");
        add("advancements.havenksh.netherite_cobble_gen.description", "From the depths of the nether, cobble that's tougher than tough.");

        add("advancements.havenksh.creative_cobble_gen.title", "Creative Cobble Generator");
        add("advancements.havenksh.creative_cobble_gen.description", "Unlimited cobblestone. Your pickaxe can finally retire.");

        add("advancements.havenksh.lamp.title", "Lamp");
        add("advancements.havenksh.lamp.description", "Let there be light!");

        add("advancements.havenksh.nether_star_block.title", "Nether Star Block");
        add("advancements.havenksh.nether_star_block.description", "The power of the stars in a block");

        add("advancements.havenksh.copper_ore_hammer.title", "Copper Ore Hammer");
        add("advancements.havenksh.copper_ore_hammer.description", "Your basic ore doubling tool");

        add("advancements.havenksh.iron_ore_hammer.title", "Iron Ore Hammer");
        add("advancements.havenksh.iron_ore_hammer.description", "Your basic ore doubling tool");

        add("advancements.havenksh.gold_ore_hammer.title", "Gold Ore Hammer");
        add("advancements.havenksh.gold_ore_hammer.description", "Your basic ore doubling tool");

        add("advancements.havenksh.diamond_ore_hammer.title", "Diamond Ore Hammer");
        add("advancements.havenksh.diamond_ore_hammer.description", "Your basic ore doubling tool");

        add("advancements.havenksh.emerald_ore_hammer.title", "Emerald Ore Hammer");
        add("advancements.havenksh.emerald_ore_hammer.description", "Your basic ore doubling tool");

        add("advancements.havenksh.netherite_ore_hammer.title", "Netherite Ore Hammer");
        add("advancements.havenksh.netherite_ore_hammer.description", "Your basic ore doubling tool");

        add("advancements.havenksh.trowel.title", "Trowel");
        add("advancements.havenksh.trowel.description", "A tool for placing random blocks from the hotbar.");

        add("advancements.havenksh.magnet.title", "Magnet");
        add("advancements.havenksh.magnet.description", "Attracts items if equipped with a range of 5 blocks.");

        add("advancements.havenksh.repair_talisman.title", "Repair Talisman");
        add("advancements.havenksh.repair_talisman.description", "Repairs items in your inventory over time.");

        add("advancements.havenksh.acacia_bark.title", "Acacia Bark");
        add("advancements.havenksh.acacia_bark.description", "Stripped from acacia logs, used for crafting.");

        add("advancements.havenksh.birch_bark.title", "Birch Bark");
        add("advancements.havenksh.birch_bark.description", "Stripped from birch logs, used for crafting.");

        add("advancements.havenksh.dark_oak_bark.title", "Dark Oak Bark");
        add("advancements.havenksh.dark_oak_bark.description", "Stripped from dark oak logs, used for crafting.");

        add("advancements.havenksh.jungle_bark.title", "Jungle Bark");
        add("advancements.havenksh.jungle_bark.description", "Stripped from jungle logs, used for crafting.");

        add("advancements.havenksh.oak_bark.title", "Oak Bark");
        add("advancements.havenksh.oak_bark.description", "Stripped from oak logs, used for crafting.");

        add("advancements.havenksh.spruce_bark.title", "Spruce Bark");
        add("advancements.havenksh.spruce_bark.description", "Stripped from spruce logs, used for crafting.");

        add("advancements.havenksh.warped_bark.title", "Warped Bark");
        add("advancements.havenksh.warped_bark.description", "Stripped from warped logs, used for crafting.");

        add("advancements.havenksh.crimson_bark.title", "Crimson Bark");
        add("advancements.havenksh.crimson_bark.description", "Stripped from crimson logs, used for crafting.");

        add("advancements.havenksh.mangrove_bark.title", "Mangrove Bark");
        add("advancements.havenksh.mangrove_bark.description", "Stripped from mangrove logs, used for crafting.");

        add("advancements.havenksh.cherry_bark.title", "Cherry Bark");
        add("advancements.havenksh.cherry_bark.description", "Stripped from cherry logs, used for crafting.");

        add("advancements.havenksh.flint_block.title", "Flint Block");
        add("advancements.havenksh.flint_block.description", "A block made of flint.");

        add("advancements.havenksh.flesh_block.title", "Flesh Block");
        add("advancements.havenksh.flesh_block.description", "A block made of rotten flesh.");

        add("advancements.havenksh.ender_block.title", "Ender Block");
        add("advancements.havenksh.ender_block.description", "A block made of ender pearls.");






        add("command.havenksh.no_permission_use", "§6[§5Haven §2KSH§6]§r §4You do not have permission to use this command.");
        add("command.havenksh.no_block_targeted", "No block targeted or block is too far away.");
        add("command.havenksh.config_reload_success", "§6[§5Haven §2KSH§6]§r §2Config reloaded.");
        add("command.havenksh.config_reload_fail", "§6[§5Haven §2KSH§6]§r §4Failed to reload config.");
    }
}
