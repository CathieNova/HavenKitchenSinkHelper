package net.cathienova.havenksh.config;

import net.cathienova.havenksh.HavenKSH;
import net.minecraftforge.fml.config.ModConfig;

import java.util.List;

public class HavenConfig
{
    public static List<? extends String> cobbleGenValidBlocks;
    public static int wooden_cobble_gen_speed;
    public static int wooden_cobble_gen_output;
    public static int stone_cobble_gen_speed;
    public static int stone_cobble_gen_output;
    public static int iron_cobble_gen_speed;
    public static int iron_cobble_gen_output;
    public static int gold_cobble_gen_speed;
    public static int gold_cobble_gen_output;
    public static int diamond_cobble_gen_speed;
    public static int diamond_cobble_gen_output;
    public static int emerald_cobble_gen_speed;
    public static int emerald_cobble_gen_output;
    public static int netherite_cobble_gen_speed;
    public static int netherite_cobble_gen_output;
    public static int creative_cobble_gen_speed;
    public static int creative_cobble_gen_output;
    public static int mendingNecklaceRepairInterval;
    public static int miniCoalBurnTime;
    public static int miniCharcoalBurnTime;
    public static int dragonScaleDropChance;
    public static int dragonScaleDropAmount;
    public static int wateringCanCooldown;
    public static boolean hammerDurability;
    public static boolean excavatorDurability;
    public static int playerGrowthDistance;
    public static int axolotl_seed_spawn_timer;
    public static int bee_seed_spawn_timer;
    public static int cat_seed_spawn_timer;
    public static int chicken_seed_spawn_timer;
    public static int cow_seed_spawn_timer;
    public static int donkey_seed_spawn_timer;
    public static int fox_seed_spawn_timer;
    public static int goat_seed_spawn_timer;
    public static int horse_seed_spawn_timer;
    public static int llama_seed_spawn_timer;
    public static int mooshroom_seed_spawn_timer;
    public static int mule_seed_spawn_timer;
    public static int ocelot_seed_spawn_timer;
    public static int panda_seed_spawn_timer;
    public static int pig_seed_spawn_timer;
    public static int rabbit_seed_spawn_timer;
    public static int sheep_seed_spawn_timer;
    public static int sniffer_seed_spawn_timer;
    public static int parrot_seed_spawn_timer;
    public static int turtle_seed_spawn_timer;
    public static int wolf_seed_spawn_timer;
    public static int dolphin_seed_spawn_timer;
    public static int glow_squid_seed_spawn_timer;
    public static int polar_bear_seed_spawn_timer;
    public static int squid_seed_spawn_timer;
    public static int villager_seed_spawn_timer;
    public static boolean enable_trowel_durability;
    public static boolean enable_inventory_blocks;
    public static List<String> trowel_blacklist;

    public static void bake(ModConfig config)
    {
        cobbleGenValidBlocks = HavenKSH.c_config.cobbleGenValidBlocks.get();
        wooden_cobble_gen_speed = HavenKSH.c_config.wooden_cobble_gen_speed.get();
        wooden_cobble_gen_output = HavenKSH.c_config.wooden_cobble_gen_output.get();
        stone_cobble_gen_speed = HavenKSH.c_config.stone_cobble_gen_speed.get();
        stone_cobble_gen_output = HavenKSH.c_config.stone_cobble_gen_output.get();
        iron_cobble_gen_speed = HavenKSH.c_config.iron_cobble_gen_speed.get();
        iron_cobble_gen_output = HavenKSH.c_config.iron_cobble_gen_output.get();
        gold_cobble_gen_speed = HavenKSH.c_config.gold_cobble_gen_speed.get();
        gold_cobble_gen_output = HavenKSH.c_config.gold_cobble_gen_output.get();
        diamond_cobble_gen_speed = HavenKSH.c_config.diamond_cobble_gen_speed.get();
        diamond_cobble_gen_output = HavenKSH.c_config.diamond_cobble_gen_output.get();
        emerald_cobble_gen_speed = HavenKSH.c_config.emerald_cobble_gen_speed.get();
        emerald_cobble_gen_output = HavenKSH.c_config.emerald_cobble_gen_output.get();
        netherite_cobble_gen_speed = HavenKSH.c_config.netherite_cobble_gen_speed.get();
        netherite_cobble_gen_output = HavenKSH.c_config.netherite_cobble_gen_output.get();
        creative_cobble_gen_speed = HavenKSH.c_config.creative_cobble_gen_speed.get();
        creative_cobble_gen_output = HavenKSH.c_config.creative_cobble_gen_output.get();
        mendingNecklaceRepairInterval = HavenKSH.c_config.mendingNecklaceRepairInterval.get();
        miniCoalBurnTime = HavenKSH.c_config.miniCoalBurnTime.get();
        miniCharcoalBurnTime = HavenKSH.c_config.miniCharcoalBurnTime.get();
        dragonScaleDropChance = HavenKSH.c_config.dragonScaleDropChance.get();
        dragonScaleDropAmount = HavenKSH.c_config.dragonScaleDropAmount.get();
        wateringCanCooldown = HavenKSH.c_config.wateringCanCooldown.get();
        hammerDurability = HavenKSH.c_config.hammerDurability.get();
        excavatorDurability = HavenKSH.c_config.excavatorDurability.get();
        playerGrowthDistance = HavenKSH.c_config.playerGrowthDistance.get();
        axolotl_seed_spawn_timer = HavenKSH.c_config.axolotl_seed_spawn_timer.get();
        bee_seed_spawn_timer = HavenKSH.c_config.bee_seed_spawn_timer.get();
        cat_seed_spawn_timer = HavenKSH.c_config.cat_seed_spawn_timer.get();
        chicken_seed_spawn_timer = HavenKSH.c_config.chicken_seed_spawn_timer.get();
        cow_seed_spawn_timer = HavenKSH.c_config.cow_seed_spawn_timer.get();
        donkey_seed_spawn_timer = HavenKSH.c_config.donkey_seed_spawn_timer.get();
        fox_seed_spawn_timer = HavenKSH.c_config.fox_seed_spawn_timer.get();
        goat_seed_spawn_timer = HavenKSH.c_config.goat_seed_spawn_timer.get();
        horse_seed_spawn_timer = HavenKSH.c_config.horse_seed_spawn_timer.get();
        llama_seed_spawn_timer = HavenKSH.c_config.llama_seed_spawn_timer.get();
        mooshroom_seed_spawn_timer = HavenKSH.c_config.mooshroom_seed_spawn_timer.get();
        mule_seed_spawn_timer = HavenKSH.c_config.mule_seed_spawn_timer.get();
        ocelot_seed_spawn_timer = HavenKSH.c_config.ocelot_seed_spawn_timer.get();
        panda_seed_spawn_timer = HavenKSH.c_config.panda_seed_spawn_timer.get();
        pig_seed_spawn_timer = HavenKSH.c_config.pig_seed_spawn_timer.get();
        rabbit_seed_spawn_timer = HavenKSH.c_config.rabbit_seed_spawn_timer.get();
        sheep_seed_spawn_timer = HavenKSH.c_config.sheep_seed_spawn_timer.get();
        sniffer_seed_spawn_timer = HavenKSH.c_config.sniffer_seed_spawn_timer.get();
        parrot_seed_spawn_timer = HavenKSH.c_config.parrot_seed_spawn_timer.get();
        turtle_seed_spawn_timer = HavenKSH.c_config.turtle_seed_spawn_timer.get();
        wolf_seed_spawn_timer = HavenKSH.c_config.wolf_seed_spawn_timer.get();
        dolphin_seed_spawn_timer = HavenKSH.c_config.dolphin_seed_spawn_timer.get();
        glow_squid_seed_spawn_timer = HavenKSH.c_config.glow_squid_seed_spawn_timer.get();
        polar_bear_seed_spawn_timer = HavenKSH.c_config.polar_bear_seed_spawn_timer.get();
        squid_seed_spawn_timer = HavenKSH.c_config.squid_seed_spawn_timer.get();
        villager_seed_spawn_timer = HavenKSH.c_config.villager_seed_spawn_timer.get();
        enable_trowel_durability = HavenKSH.c_config.enable_trowel_durability.get();
        enable_inventory_blocks = HavenKSH.c_config.enable_inventory_blocks.get();
        trowel_blacklist = HavenKSH.c_config.trowel_blacklist.get();
    }
}
