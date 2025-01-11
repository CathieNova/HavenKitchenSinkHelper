package net.cathienova.havenksh.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.ArrayList;
import java.util.List;

public class CommonConfig {
    public final ModConfigSpec.ConfigValue<List<? extends String>> cobbleGenValidBlocks;
    public final ModConfigSpec.IntValue wooden_cobble_gen_speed;
    public final ModConfigSpec.IntValue wooden_cobble_gen_output;
    public final ModConfigSpec.IntValue stone_cobble_gen_speed;
    public final ModConfigSpec.IntValue stone_cobble_gen_output;
    public final ModConfigSpec.IntValue iron_cobble_gen_speed;
    public final ModConfigSpec.IntValue iron_cobble_gen_output;
    public final ModConfigSpec.IntValue gold_cobble_gen_speed;
    public final ModConfigSpec.IntValue gold_cobble_gen_output;
    public final ModConfigSpec.IntValue diamond_cobble_gen_speed;
    public final ModConfigSpec.IntValue diamond_cobble_gen_output;
    public final ModConfigSpec.IntValue emerald_cobble_gen_speed;
    public final ModConfigSpec.IntValue emerald_cobble_gen_output;
    public final ModConfigSpec.IntValue netherite_cobble_gen_speed;
    public final ModConfigSpec.IntValue netherite_cobble_gen_output;
    public final ModConfigSpec.IntValue creative_cobble_gen_speed;
    public final ModConfigSpec.IntValue creative_cobble_gen_output;
    public final ModConfigSpec.IntValue mendingNecklaceRepairInterval;
    public final ModConfigSpec.IntValue miniCoalBurnTime;
    public final ModConfigSpec.IntValue miniCharcoalBurnTime;
    public final ModConfigSpec.IntValue dragonScaleDropChance;
    public final ModConfigSpec.IntValue dragonScaleDropAmount;
    public final ModConfigSpec.IntValue wateringCanCooldown;
    public final ModConfigSpec.BooleanValue hammerDurability;
    public final ModConfigSpec.BooleanValue excavatorDurability;
    public final ModConfigSpec.IntValue playerGrowthDistance;
    public final ModConfigSpec.IntValue axolotl_seed_spawn_timer;
    public final ModConfigSpec.IntValue bee_seed_spawn_timer;
    public final ModConfigSpec.IntValue cat_seed_spawn_timer;
    public final ModConfigSpec.IntValue chicken_seed_spawn_timer;
    public final ModConfigSpec.IntValue cow_seed_spawn_timer;
    public final ModConfigSpec.IntValue donkey_seed_spawn_timer;
    public final ModConfigSpec.IntValue fox_seed_spawn_timer;
    public final ModConfigSpec.IntValue goat_seed_spawn_timer;
    public final ModConfigSpec.IntValue horse_seed_spawn_timer;
    public final ModConfigSpec.IntValue llama_seed_spawn_timer;
    public final ModConfigSpec.IntValue mooshroom_seed_spawn_timer;
    public final ModConfigSpec.IntValue mule_seed_spawn_timer;
    public final ModConfigSpec.IntValue ocelot_seed_spawn_timer;
    public final ModConfigSpec.IntValue panda_seed_spawn_timer;
    public final ModConfigSpec.IntValue pig_seed_spawn_timer;
    public final ModConfigSpec.IntValue rabbit_seed_spawn_timer;
    public final ModConfigSpec.IntValue sheep_seed_spawn_timer;
    public final ModConfigSpec.IntValue sniffer_seed_spawn_timer;
    public final ModConfigSpec.IntValue parrot_seed_spawn_timer;
    public final ModConfigSpec.IntValue turtle_seed_spawn_timer;
    public final ModConfigSpec.IntValue wolf_seed_spawn_timer;
    public final ModConfigSpec.IntValue dolphin_seed_spawn_timer;
    public final ModConfigSpec.IntValue glow_squid_seed_spawn_timer;
    public final ModConfigSpec.IntValue polar_bear_seed_spawn_timer;
    public final ModConfigSpec.IntValue squid_seed_spawn_timer;
    public final ModConfigSpec.IntValue villager_seed_spawn_timer;
    public final ModConfigSpec.BooleanValue enable_trowel_durability;
    public final ModConfigSpec.BooleanValue enable_inventory_blocks;
    public final ModConfigSpec.ConfigValue<List<String>> trowel_blacklist;

    public CommonConfig(ModConfigSpec.Builder builder) {
        builder.comment("Block for Cobble Generators").push("block_generator").build();
        cobbleGenValidBlocks = builder
                .comment("Valid blocks for cobblestone generators at any side. Format: \"checkforblock;outputblock\", it also supports multiple outputblock with comma, if it does not match any then it will return Cobblestone.")
                .defineList("cobbleGenValidBlocks",
                        List.of(
                                "minecraft:stone;minecraft:cobblestone",
                                "minecraft:cobblestone;minecraft:cobblestone",
                                "minecraft:deepslate;minecraft:cobbled_deepslate",
                                "minecraft:cobbled_deepslate;minecraft:cobbled_deepslate",
                                "minecraft:tuff;minecraft:tuff",
                                "minecraft:netherrack;minecraft:netherrack",
                                "minecraft:basalt;minecraft:basalt",
                                "minecraft:blackstone;minecraft:blackstone",
                                "minecraft:andesite;minecraft:andesite",
                                "minecraft:diorite;minecraft:diorite",
                                "minecraft:granite;minecraft:granite",
                                "minecraft:end_stone;minecraft:end_stone",
                                "minecraft:beacon;minecraft:coal_ore,minecraft:iron_ore,minecraft:gold_ore,minecraft:diamond_ore,minecraft:emerald_ore"
                        ),
                        obj -> obj instanceof String && ((String) obj).contains(";"));
        builder.pop();

        builder.comment("Wooden Cobblestone Generator").push("wooden_cobble_gen").build();
        wooden_cobble_gen_speed = builder
                .comment("Speed of the Wooden Cobblestone Generator (ticks per cobblestone)")
                .defineInRange("wooden_cobble_gen_speed", 100, 1, Integer.MAX_VALUE);
        wooden_cobble_gen_output = builder
                .comment("The storage capacity of the Wooden Cobblestone Generator")
                .defineInRange("wooden_cobble_gen_output", 8, 1, 64);
        builder.pop();

        builder.comment("Stone Cobblestone Generator").push("stone_cobble_gen").build();
        stone_cobble_gen_speed = builder
                .comment("Speed of the Stone Cobblestone Generator (ticks per cobblestone)")
                .defineInRange("stone_cobble_gen_speed", 80, 1, Integer.MAX_VALUE);
        stone_cobble_gen_output = builder
                .comment("The storage capacity of the Stone Cobblestone Generator")
                .defineInRange("stone_cobble_gen_output", 16, 1, 64);
        builder.pop();

        builder.comment("Iron Cobblestone Generator").push("iron_cobble_gen").build();
        iron_cobble_gen_speed = builder
                .comment("Speed of the Iron Cobblestone Generator (ticks per cobblestone)")
                .defineInRange("iron_cobble_gen_speed", 60, 1, Integer.MAX_VALUE);
        iron_cobble_gen_output = builder
                .comment("The storage capacity of the Iron Cobblestone Generator")
                .defineInRange("iron_cobble_gen_output", 32, 1, 64);
        builder.pop();

        builder.comment("Gold Cobblestone Generator").push("gold_cobble_gen").build();
        gold_cobble_gen_speed = builder
                .comment("Speed of the Gold Cobblestone Generator (ticks per cobblestone)")
                .defineInRange("gold_cobble_gen_speed", 40, 1, Integer.MAX_VALUE);
        gold_cobble_gen_output = builder
                .comment("The storage capacity of the Gold Cobblestone Generator")
                .defineInRange("gold_cobble_gen_output", 64, 1, 64);
        builder.pop();

        builder.comment("Diamond Cobblestone Generator").push("diamond_cobble_gen").build();
        diamond_cobble_gen_speed = builder
                .comment("Speed of the Diamond Cobblestone Generator (ticks per cobblestone)")
                .defineInRange("diamond_cobble_gen_speed", 20, 1, Integer.MAX_VALUE);
        diamond_cobble_gen_output = builder
                .comment("The storage capacity of the Diamond Cobblestone Generator")
                .defineInRange("diamond_cobble_gen_output", 64, 1, 64);
        builder.pop();

        builder.comment("Emerald Cobblestone Generator").push("emerald_cobble_gen").build();
        emerald_cobble_gen_speed = builder
                .comment("Speed of the Emerald Cobblestone Generator (ticks per cobblestone)")
                .defineInRange("emerald_cobble_gen_speed", 10, 1, Integer.MAX_VALUE);
        emerald_cobble_gen_output = builder
                .comment("The storage capacity of the Emerald Cobblestone Generator")
                .defineInRange("emerald_cobble_gen_output", 64, 1, 64);
        builder.pop();

        builder.comment("Netherite Cobblestone Generator").push("netherite_cobble_gen").build();
        netherite_cobble_gen_speed = builder
                .comment("Speed of the Netherite Cobblestone Generator (ticks per cobblestone)")
                .defineInRange("netherite_cobble_gen_speed", 5, 1, Integer.MAX_VALUE);
        netherite_cobble_gen_output = builder
                .comment("The storage capacity of the Netherite Cobblestone Generator")
                .defineInRange("netherite_cobble_gen_output", 64, 1, 64);
        builder.pop();

        builder.comment("Creative Cobblestone Generator").push("creative_cobble_gen").build();
        creative_cobble_gen_speed = builder
                .comment("Speed of the Creative Cobblestone Generator (ticks per 2 cobblestone)")
                .defineInRange("creative_cobble_gen_speed", 1, 1, Integer.MAX_VALUE);
        creative_cobble_gen_output = builder
                .comment("The storage capacity of the Creative Cobblestone Generator")
                .defineInRange("creative_cobble_gen_output", 64, 1, 64);
        builder.pop();

        builder.comment("Mending Necklace").push("mendingNecklace").build();
        mendingNecklaceRepairInterval = builder.comment("The interval in ticks between each repair of the mending necklace.").defineInRange("mendingNecklaceRepairInterval", 100, 1, 100000);
        builder.pop();

        builder.comment("Mini Coal and Mini Charcoal").push("miniFuel").build();
        miniCoalBurnTime = builder.comment("The burn time of mini coal. (200 = 1 item)").defineInRange("miniCoalBurnTime", 200, 1, 100000);
        miniCharcoalBurnTime = builder.comment("The burn time of mini charcoal. (200 = 1 item)").defineInRange("miniCharcoalBurnTime", 200, 1, 100000);
        builder.pop();

        builder.comment("Dragon Scale Drop").push("dragonScaleDropChance").build();
        dragonScaleDropChance = builder.comment("The chance for the Ender Dragon to drop a Dragon Scale.").defineInRange("dragonScaleDropChance", 100, 0, 100);
        dragonScaleDropAmount = builder.comment("The max random amount of Dragon Scales that can drop from the Ender Dragon.").defineInRange("dragonScaleDropAmount", 4, 1, 64);
        builder.pop();

        builder.comment("Watering Cans").push("wateringCan").build();
        wateringCanCooldown = builder.comment("The cooldown in ticks for the watering can.").defineInRange("wateringCanCooldown", 10, 1, 1000);
        builder.pop();

        builder.comment("Hammer And Excavator Durability").push("hammerDurability").build();
        hammerDurability = builder.comment("If enabled, the hammers only takes 1 durability instead of the amount it breaks.").define("hammerDurability", true);
        excavatorDurability = builder.comment("If enabled, the excavators only takes 1 durability instead of the amount it breaks.").define("excavatorDurability", true);
        builder.pop();

        builder.comment("Mob Seeds").push("mobSeeds").build();
        playerGrowthDistance = builder.comment("The distance in blocks a player has to be from a mob seed for it to grow. (if 3 then it checks 3x3x3)").defineInRange("playerGrowthDistance", 20, 1, Integer.MAX_VALUE);
        axolotl_seed_spawn_timer = builder.comment("The time it takes in ticks for an axolotl to spawn from an axolotl seed. (20 ticks = 1 second)").defineInRange("axolotl_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        bee_seed_spawn_timer = builder.comment("The time it takes in ticks for a bee to spawn from a bee seed. (20 ticks = 1 second)").defineInRange("bee_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        cat_seed_spawn_timer = builder.comment("The time it takes in ticks for a cat to spawn from a cat seed. (20 ticks = 1 second)").defineInRange("cat_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        chicken_seed_spawn_timer = builder.comment("The time in ticks it takes for a chicken to spawn from a chicken seed. (20 ticks = 1 second)").defineInRange("chicken_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        cow_seed_spawn_timer = builder.comment("The time in ticks it takes for a cow to spawn from a cow seed. (20 ticks = 1 second)").defineInRange("cow_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        donkey_seed_spawn_timer = builder.comment("The time in ticks it takes for a donkey to spawn from a donkey seed. (20 ticks = 1 second)").defineInRange("donkey_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        fox_seed_spawn_timer = builder.comment("The time in ticks it takes for a fox to spawn from a fox seed. (20 ticks = 1 second)").defineInRange("fox_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        goat_seed_spawn_timer = builder.comment("The time in ticks it takes for a goat to spawn from a goat seed. (20 ticks = 1 second)").defineInRange("goat_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        horse_seed_spawn_timer = builder.comment("The time in ticks it takes for a horse to spawn from a horse seed. (20 ticks = 1 second)").defineInRange("horse_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        llama_seed_spawn_timer = builder.comment("The time in ticks it takes for a llama to spawn from a llama seed. (20 ticks = 1 second)").defineInRange("llama_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        mooshroom_seed_spawn_timer = builder.comment("The time in ticks it takes for a mooshroom to spawn from a mooshroom seed. (20 ticks = 1 second)").defineInRange("mooshroom_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        mule_seed_spawn_timer = builder.comment("The time in ticks it takes for a mule to spawn from a mule seed. (20 ticks = 1 second)").defineInRange("mule_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        ocelot_seed_spawn_timer = builder.comment("The time in ticks it takes for an ocelot to spawn from an ocelot seed. (20 ticks = 1 second)").defineInRange("ocelot_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        panda_seed_spawn_timer = builder.comment("The time in ticks it takes for a panda to spawn from a panda seed. (20 ticks = 1 second)").defineInRange("panda_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        pig_seed_spawn_timer = builder.comment("The time in ticks it takes for a pig to spawn from a pig seed. (20 ticks = 1 second)").defineInRange("pig_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        rabbit_seed_spawn_timer = builder.comment("The time in ticks it takes for a rabbit to spawn from a rabbit seed. (20 ticks = 1 second)").defineInRange("rabbit_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        sheep_seed_spawn_timer = builder.comment("The time in ticks it takes for a sheep to spawn from a sheep seed. (20 ticks = 1 second)").defineInRange("sheep_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        sniffer_seed_spawn_timer = builder.comment("The time in ticks it takes for a sniffer to spawn from a sniffer seed. (20 ticks = 1 second)").defineInRange("sniffer_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        parrot_seed_spawn_timer = builder.comment("The time in ticks it takes for a parrot to spawn from a parrot seed. (20 ticks = 1 second)").defineInRange("parrot_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        turtle_seed_spawn_timer = builder.comment("The time in ticks it takes for a turtle to spawn from a turtle seed. (20 ticks = 1 second)").defineInRange("turtle_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        wolf_seed_spawn_timer = builder.comment("The time in ticks it takes for a wolf to spawn from a wolf seed. (20 ticks = 1 second)").defineInRange("wolf_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        dolphin_seed_spawn_timer = builder.comment("The time in ticks it takes for a dolphin to spawn from a dolphin seed. (20 ticks = 1 second)").defineInRange("dolphin_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        glow_squid_seed_spawn_timer = builder.comment("The time in ticks it takes for a glow squid to spawn from a glow squid seed. (20 ticks = 1 second)").defineInRange("glow_squid_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        polar_bear_seed_spawn_timer = builder.comment("The time in ticks it takes for a polar bear to spawn from a polar bear seed. (20 ticks = 1 second)").defineInRange("polar_bear_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        squid_seed_spawn_timer = builder.comment("The time in ticks it takes for a squid to spawn from a squid seed. (20 ticks = 1 second)").defineInRange("squid_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        villager_seed_spawn_timer = builder.comment("The time in ticks it takes for a villager to spawn from a villager seed. (20 ticks = 1 second)").defineInRange("villager_seed_spawn_timer", 12000, 1, Integer.MAX_VALUE);
        builder.pop();

        builder.comment("Trowel").push("trowel").build();
        enable_trowel_durability = builder.comment("If true, it will have durability when used.").define("enable_trowel_durability", true);
        enable_inventory_blocks = builder.comment("If true, the trowel will use the inventory blocks as well as hotbar blocks, if false it will only use hotbar blocks.").define("enable_inventory_blocks", false);

        List<String> trowelBlacklist = new ArrayList<>(List.of(
                "#minecraft:saplings", "#minecraft:buttons", "#minecraft:pressure_plates", "minecraft:chain", "#minecraft:doors", "#minecraft:candles",
                "#minecraft:banners", "minecraft:snow", "minecraft:moss_carpet", "minecraft:pointed_dripstone", "#c:mushrooms", "#minecraft:flowers",
                "minecraft:torch", "minecraft:ladder", "minecraft:lever", "minecraft:redstone_torch", "minecraft:redstone", "minecraft:tripwire_hook",
                "minecraft:tripwire", "minecraft:repeater", "minecraft:comparator", "minecraft:observer", "minecraft:daylight_detector", "minecraft:daylight_detector_inverted"));

        trowel_blacklist = builder.comment("The blacklist of blocks that can't be placed with the trowel.").define("trowel_blacklist", trowelBlacklist);
        builder.pop();
    }
}