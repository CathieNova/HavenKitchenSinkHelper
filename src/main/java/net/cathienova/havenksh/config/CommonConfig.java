package net.cathienova.havenksh.config;

import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.ArrayList;
import java.util.List;

public class CommonConfig {
    public final ModConfigSpec.IntValue mendingNecklaceRepairInterval;
    public final ModConfigSpec.IntValue miniCoalBurnTime;
    public final ModConfigSpec.IntValue miniCharcoalBurnTime;
    public final ModConfigSpec.IntValue dragonScaleDropChance;
    public final ModConfigSpec.IntValue dragonScaleDropAmount;
    public final ModConfigSpec.IntValue wateringCanCooldown;
    public final ModConfigSpec.BooleanValue hammerDurability;
    public final ModConfigSpec.BooleanValue excavatorDurability;
    public final ModConfigSpec.BooleanValue enable_trowel_durability;
    public final ModConfigSpec.BooleanValue enable_inventory_blocks;
    public final ModConfigSpec.ConfigValue<List<String>> trowel_blacklist;

    public CommonConfig(ModConfigSpec.Builder builder) {
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