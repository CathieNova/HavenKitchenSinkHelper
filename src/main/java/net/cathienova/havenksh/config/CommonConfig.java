package net.cathienova.havenksh.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import net.cathienova.havenksh.HavenKSH;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CommonConfig {
    public final ForgeConfigSpec.IntValue mendingNecklaceRepairInterval;
    public final ForgeConfigSpec.IntValue miniCoalBurnTime;
    public final ForgeConfigSpec.IntValue miniCharcoalBurnTime;
    public final ForgeConfigSpec.IntValue dragonScaleDropChance;
    public final ForgeConfigSpec.IntValue dragonScaleDropAmount;
    public final ForgeConfigSpec.IntValue wateringCanCooldown;
    public final ForgeConfigSpec.BooleanValue hammerDurability;
    public final ForgeConfigSpec.BooleanValue excavatorDurability;

    public CommonConfig(ForgeConfigSpec.Builder builder) {
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
    }
}
