package net.cathienova.havenksh.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonConfig {
    public final ModConfigSpec.IntValue mendingNecklaceRepairInterval;
    public final ModConfigSpec.IntValue miniCoalBurnTime;
    public final ModConfigSpec.IntValue miniCharcoalBurnTime;
    public final ModConfigSpec.IntValue dragonScaleDropChance;
    public final ModConfigSpec.IntValue dragonScaleDropAmount;
    public final ModConfigSpec.IntValue wateringCanCooldown;
    public final ModConfigSpec.BooleanValue hammerDurability;
    public final ModConfigSpec.DoubleValue hammer_highlight_red;
    public final ModConfigSpec.DoubleValue hammer_highlight_green;
    public final ModConfigSpec.DoubleValue hammer_highlight_blue;
    public final ModConfigSpec.DoubleValue hammer_highlight_alpha;
    public final ModConfigSpec.BooleanValue excavatorDurability;
    public final ModConfigSpec.DoubleValue excavator_highlight_red;
    public final ModConfigSpec.DoubleValue excavator_highlight_green;
    public final ModConfigSpec.DoubleValue excavator_highlight_blue;
    public final ModConfigSpec.DoubleValue excavator_highlight_alpha;

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

        builder.comment("Hammers").push("hammers").build();
        hammerDurability = builder.comment("If enabled, the hammers only takes 1 durability instead of the amount it breaks.").define("hammerDurability", true);
        builder.comment("Highlight color for the hammer").push("hammer_highlight").build();
        hammer_highlight_red = builder.comment("The red value of the highlight color.").defineInRange("hammer_highlight_red", 1.0f, 0.0f, 1.0f);
        hammer_highlight_green = builder.comment("The green value of the highlight color.").defineInRange("hammer_highlight_green", 0.0f, 0.0f, 1.0f);
        hammer_highlight_blue = builder.comment("The blue value of the highlight color.").defineInRange("hammer_highlight_blue", 1.0f, 0.0f, 1.0f);
        hammer_highlight_alpha = builder.comment("The alpha value of the highlight color.").defineInRange("hammer_highlight_alpha", 0.4f, 0.0f, 1.0f);
        builder.pop(2);

        builder.comment("Excavators").push("excavators").build();
        excavatorDurability = builder.comment("If enabled, the excavators only takes 1 durability instead of the amount it breaks.").define("excavatorDurability", true);
        builder.comment("Highlight color for the excavator").push("excavator_highlight").build();
        excavator_highlight_red = builder.comment("The red value of the highlight color.").defineInRange("excavator_highlight_red", 1.0f, 0.0f, 1.0f);
        excavator_highlight_green = builder.comment("The green value of the highlight color.").defineInRange("excavator_highlight_green", 0.0f, 0.0f, 1.0f);
        excavator_highlight_blue = builder.comment("The blue value of the highlight color.").defineInRange("excavator_highlight_blue", 1.0f, 0.0f, 1.0f);
        excavator_highlight_alpha = builder.comment("The alpha value of the highlight color.").defineInRange("excavator_highlight_alpha", 0.4f, 0.0f, 1.0f);
        builder.pop(2);
    }
}