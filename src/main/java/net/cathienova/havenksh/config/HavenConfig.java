package net.cathienova.havenksh.config;

import net.cathienova.havenksh.HavenKSH;
import net.neoforged.fml.config.ModConfig;

import java.util.List;

public class HavenConfig
{
    public static int mendingNecklaceRepairInterval;
    public static int miniCoalBurnTime;
    public static int miniCharcoalBurnTime;
    public static int dragonScaleDropChance;
    public static int dragonScaleDropAmount;
    public static int wateringCanCooldown;
    public static boolean hammerDurability;
    public static boolean excavatorDurability;
    public static boolean enable_trowel_durability;
    public static boolean enable_inventory_blocks;
    public static List<String> trowel_blacklist;

    public static void bake(ModConfig config)
    {
        mendingNecklaceRepairInterval = HavenKSH.c_config.mendingNecklaceRepairInterval.get();
        miniCoalBurnTime = HavenKSH.c_config.miniCoalBurnTime.get();
        miniCharcoalBurnTime = HavenKSH.c_config.miniCharcoalBurnTime.get();
        dragonScaleDropChance = HavenKSH.c_config.dragonScaleDropChance.get();
        dragonScaleDropAmount = HavenKSH.c_config.dragonScaleDropAmount.get();
        wateringCanCooldown = HavenKSH.c_config.wateringCanCooldown.get();
        hammerDurability = HavenKSH.c_config.hammerDurability.get();
        excavatorDurability = HavenKSH.c_config.excavatorDurability.get();
        enable_trowel_durability = HavenKSH.c_config.enable_trowel_durability.get();
        enable_inventory_blocks = HavenKSH.c_config.enable_inventory_blocks.get();
        trowel_blacklist = HavenKSH.c_config.trowel_blacklist.get();
    }
}