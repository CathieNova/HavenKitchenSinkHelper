package net.cathienova.havenksh.config;

import net.cathienova.havenksh.HavenKSH;
import net.neoforged.fml.config.ModConfig;

public class HavenConfig
{
    public static int mendingNecklaceRepairInterval;
    public static int miniCoalBurnTime;
    public static int miniCharcoalBurnTime;
    public static int dragonScaleDropChance;
    public static int dragonScaleDropAmount;
    public static int wateringCanCooldown;
    public static boolean hammerDurability;
    public static double hammer_highlight_red;
    public static double hammer_highlight_green;
    public static double hammer_highlight_blue;
    public static double hammer_highlight_alpha;
    public static boolean excavatorDurability;
    public static double excavator_highlight_red;
    public static double excavator_highlight_green;
    public static double excavator_highlight_blue;
    public static double excavator_highlight_alpha;

    public static void bake(ModConfig config)
    {
        mendingNecklaceRepairInterval = HavenKSH.c_config.mendingNecklaceRepairInterval.get();
        miniCoalBurnTime = HavenKSH.c_config.miniCoalBurnTime.get();
        miniCharcoalBurnTime = HavenKSH.c_config.miniCharcoalBurnTime.get();
        dragonScaleDropChance = HavenKSH.c_config.dragonScaleDropChance.get();
        dragonScaleDropAmount = HavenKSH.c_config.dragonScaleDropAmount.get();
        wateringCanCooldown = HavenKSH.c_config.wateringCanCooldown.get();
        hammerDurability = HavenKSH.c_config.hammerDurability.get();
        hammer_highlight_red = HavenKSH.c_config.hammer_highlight_red.get();
        hammer_highlight_green = HavenKSH.c_config.hammer_highlight_green.get();
        hammer_highlight_blue = HavenKSH.c_config.hammer_highlight_blue.get();
        hammer_highlight_alpha = HavenKSH.c_config.hammer_highlight_alpha.get();
        excavatorDurability = HavenKSH.c_config.excavatorDurability.get();
        excavator_highlight_red = HavenKSH.c_config.excavator_highlight_red.get();
        excavator_highlight_green = HavenKSH.c_config.excavator_highlight_green.get();
        excavator_highlight_blue = HavenKSH.c_config.excavator_highlight_blue.get();
        excavator_highlight_alpha = HavenKSH.c_config.excavator_highlight_alpha.get();
    }
}