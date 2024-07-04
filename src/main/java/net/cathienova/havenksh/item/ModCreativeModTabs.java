package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HavenKSH.MOD_ID);

    public static String HavenKSH_tab_title = "itemgroup.havenksh.havenksh_tab";
    public static final RegistryObject<CreativeModeTab> Haven_TAB = CREATIVE_MODE_TABS.register("havenksh_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.dice.get()))
                    .title(Component.translatable(HavenKSH_tab_title))
                    .displayItems((pParameters, add) -> {

                        add.accept(new ItemStack(ModItems.research_tier_basic.get()));
                        add.accept(new ItemStack(ModItems.research_tier_intermediate.get()));
                        add.accept(new ItemStack(ModItems.research_tier_advanced.get()));
                        add.accept(new ItemStack(ModItems.research_tier_elite.get()));
                        add.accept(new ItemStack(ModItems.research_tier_ultimate.get()));


                        add.accept(new ItemStack(ModBlocks.scorched_stone.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_stone_bricks.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_cobblestone.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_coal_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_iron_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_gold_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_diamond_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_emerald_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_redstone_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_lapis_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_copper_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.scorched_quartz_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.havenite_ore.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.deepslate_havenite_ore.get().asItem()));

                        add.accept(new ItemStack(ModItems.havenite_ingot.get()));
                        add.accept(new ItemStack(ModBlocks.havenite_block.get().asItem()));
                        add.accept(new ItemStack(ModItems.raw_havenite.get()));
                        add.accept(new ItemStack(ModBlocks.raw_havenite_block.get().asItem()));

                        add.accept(new ItemStack(ModArmor.magnet.get()));
                        add.accept(new ItemStack(ModArmor.repair_talisman.get()));
                        add.accept(new ItemStack(ModItems.empty_iron_watering_can.get()));
                        add.accept(new ItemStack(ModItems.iron_watering_can.get()));
                        add.accept(new ItemStack(ModItems.dragon_scale.get()));
                        add.accept(new ItemStack(ModTools.trowel.get()));

                        add.accept(new ItemStack(ModItems.havenite_nugget.get()));
                        add.accept(new ItemStack(ModItems.diamond_nugget.get()));
                        add.accept(new ItemStack(ModItems.emerald_nugget.get()));
                        add.accept(new ItemStack(ModItems.netherite_nugget.get()));
                        add.accept(new ItemStack(ModItems.lapis_nugget.get()));
                        add.accept(new ItemStack(ModItems.quartz_nugget.get()));
                        add.accept(new ItemStack(ModItems.redstone_nugget.get()));
                        add.accept(new ItemStack(ModItems.copper_nugget.get()));
                        add.accept(new ItemStack(ModItems.copper_dust.get()));
                        add.accept(new ItemStack(ModItems.tin_dust.get()));
                        add.accept(new ItemStack(ModItems.tin_ingot.get()));
                        add.accept(new ItemStack(ModItems.netherite_dust.get()));
                        add.accept(new ItemStack(ModItems.iron_dust.get()));
                        add.accept(new ItemStack(ModItems.gold_dust.get()));
                        add.accept(new ItemStack(ModItems.lead_dust.get()));
                        add.accept(new ItemStack(ModItems.lead_ingot.get()));
                        add.accept(new ItemStack(ModItems.silver_dust.get()));
                        add.accept(new ItemStack(ModItems.silver_ingot.get()));
                        add.accept(new ItemStack(ModItems.nickel_dust.get()));
                        add.accept(new ItemStack(ModItems.nickel_ingot.get()));
                        add.accept(new ItemStack(ModItems.uranium_dust.get()));
                        add.accept(new ItemStack(ModItems.uranium_ingot.get()));
                        add.accept(new ItemStack(ModItems.osmium_dust.get()));
                        add.accept(new ItemStack(ModItems.osmium_ingot.get()));
                        add.accept(new ItemStack(ModItems.zinc_dust.get()));
                        add.accept(new ItemStack(ModItems.zinc_ingot.get()));
                        add.accept(new ItemStack(ModItems.aluminum_dust.get()));
                        add.accept(new ItemStack(ModItems.aluminum_ingot.get()));;

                        add.accept(new ItemStack(ModItems.mini_coal.get()));
                        add.accept(new ItemStack(ModItems.mini_charcoal.get()));

                        add.accept(new ItemStack(ModBlocks.wooden_cobble_gen.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.stone_cobble_gen.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.iron_cobble_gen.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.gold_cobble_gen.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.diamond_cobble_gen.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.emerald_cobble_gen.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.netherite_cobble_gen.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.creative_cobble_gen.get().asItem()));

                        add.accept(new ItemStack(ModItems.cobble_gen_upgrade_wooden.get()));
                        add.accept(new ItemStack(ModItems.cobble_gen_upgrade_stone.get()));
                        add.accept(new ItemStack(ModItems.cobble_gen_upgrade_iron.get()));
                        add.accept(new ItemStack(ModItems.cobble_gen_upgrade_gold.get()));
                        add.accept(new ItemStack(ModItems.cobble_gen_upgrade_diamond.get()));
                        add.accept(new ItemStack(ModItems.cobble_gen_upgrade_emerald.get()));
                        add.accept(new ItemStack(ModItems.cobble_gen_upgrade_netherite.get()));

                        add.accept(new ItemStack(ModTools.copper_ore_hammer.get()));
                        add.accept(new ItemStack(ModTools.iron_ore_hammer.get()));
                        add.accept(new ItemStack(ModTools.gold_ore_hammer.get()));
                        add.accept(new ItemStack(ModTools.diamond_ore_hammer.get()));
                        add.accept(new ItemStack(ModTools.emerald_ore_hammer.get()));
                        add.accept(new ItemStack(ModTools.netherite_ore_hammer.get()));
                        add.accept(new ItemStack(ModTools.havenite_ore_hammer.get()));

                        add.accept(new ItemStack(ModTools.stone_hammer.get()));
                        add.accept(new ItemStack(ModTools.copper_hammer.get()));
                        add.accept(new ItemStack(ModTools.iron_hammer.get()));
                        add.accept(new ItemStack(ModTools.golden_hammer.get()));
                        add.accept(new ItemStack(ModTools.diamond_hammer.get()));
                        add.accept(new ItemStack(ModTools.emerald_hammer.get()));
                        add.accept(new ItemStack(ModTools.netherite_hammer.get()));
                        add.accept(new ItemStack(ModTools.havenite_hammer.get()));

                        add.accept(new ItemStack(ModTools.stone_excavator.get()));
                        add.accept(new ItemStack(ModTools.copper_excavator.get()));
                        add.accept(new ItemStack(ModTools.iron_excavator.get()));
                        add.accept(new ItemStack(ModTools.golden_excavator.get()));
                        add.accept(new ItemStack(ModTools.diamond_excavator.get()));
                        add.accept(new ItemStack(ModTools.emerald_excavator.get()));
                        add.accept(new ItemStack(ModTools.netherite_excavator.get()));
                        add.accept(new ItemStack(ModTools.havenite_excavator.get()));

                        add.accept(new ItemStack(ModTools.stone_chopper.get()));
                        add.accept(new ItemStack(ModTools.copper_chopper.get()));
                        add.accept(new ItemStack(ModTools.iron_chopper.get()));
                        add.accept(new ItemStack(ModTools.golden_chopper.get()));
                        add.accept(new ItemStack(ModTools.diamond_chopper.get()));
                        add.accept(new ItemStack(ModTools.emerald_chopper.get()));
                        add.accept(new ItemStack(ModTools.netherite_chopper.get()));
                        add.accept(new ItemStack(ModTools.havenite_chopper.get()));

                        add.accept(new ItemStack(ModItems.acacia_bark.get()));
                        add.accept(new ItemStack(ModItems.birch_bark.get()));
                        add.accept(new ItemStack(ModItems.dark_oak_bark.get()));
                        add.accept(new ItemStack(ModItems.jungle_bark.get()));
                        add.accept(new ItemStack(ModItems.oak_bark.get()));
                        add.accept(new ItemStack(ModItems.spruce_bark.get()));
                        add.accept(new ItemStack(ModItems.warped_bark.get()));
                        add.accept(new ItemStack(ModItems.crimson_bark.get()));

                        add.accept(new ItemStack(ModBlocks.charcoal_block_item.get()));
                        add.accept(new ItemStack(ModBlocks.andesite_brick.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.diorite_brick.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.granite_brick.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.flesh_block.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.flint_block.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.ender_block.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.nether_star_block.get().asItem()));

                        add.accept(new ItemStack(ModBlocks.axolotl_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.bee_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.cat_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.chicken_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.cow_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.donkey_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.fox_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.goat_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.horse_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.llama_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.mooshroom_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.mule_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.pig_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.rabbit_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.sheep_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.sniffer_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.parrot_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.turtle_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.wolf_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.dolphin_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.glow_squid_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.polar_bear_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.squid_seed.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.villager_seed.get().asItem()));

                        add.accept(new ItemStack(ModBlocks.lamp_white.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_aqua.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_blue.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_dark_aqua.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_dark_blue.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_dark_gray.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_dark_green.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_dark_purple.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_dark_red.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_gold.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_gray.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_green.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_light_purple.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_red.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_yellow.get().asItem()));
                        add.accept(new ItemStack(ModBlocks.lamp_rainbow.get().asItem()));

                        add.accept(new ItemStack(ModArmor.wooden_helmet.get()));
                        add.accept(new ItemStack(ModArmor.wooden_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.wooden_leggings.get()));
                        add.accept(new ItemStack(ModArmor.wooden_boots.get()));
                        add.accept(new ItemStack(ModTools.wooden_shears.get()));

                        add.accept(new ItemStack(ModArmor.bone_helmet.get()));
                        add.accept(new ItemStack(ModArmor.bone_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.bone_leggings.get()));
                        add.accept(new ItemStack(ModArmor.bone_boots.get()));
                        add.accept(new ItemStack(ModTools.bone_shovel.get()));
                        add.accept(new ItemStack(ModTools.bone_sword.get()));
                        add.accept(new ItemStack(ModTools.bone_pickaxe.get()));
                        add.accept(new ItemStack(ModTools.bone_axe.get()));
                        add.accept(new ItemStack(ModTools.bone_hoe.get()));

                        add.accept(new ItemStack(ModArmor.flint_helmet.get()));
                        add.accept(new ItemStack(ModArmor.flint_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.flint_leggings.get()));
                        add.accept(new ItemStack(ModArmor.flint_boots.get()));
                        add.accept(new ItemStack(ModTools.flint_shovel.get()));
                        add.accept(new ItemStack(ModTools.flint_sword.get()));
                        add.accept(new ItemStack(ModTools.flint_pickaxe.get()));
                        add.accept(new ItemStack(ModTools.flint_axe.get()));
                        add.accept(new ItemStack(ModTools.flint_hoe.get()));

                        add.accept(new ItemStack(ModArmor.stone_helmet.get()));
                        add.accept(new ItemStack(ModArmor.stone_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.stone_leggings.get()));
                        add.accept(new ItemStack(ModArmor.stone_boots.get()));

                        add.accept(new ItemStack(ModArmor.copper_helmet.get()));
                        add.accept(new ItemStack(ModArmor.copper_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.copper_leggings.get()));
                        add.accept(new ItemStack(ModArmor.copper_boots.get()));
                        add.accept(new ItemStack(ModTools.copper_shovel.get()));
                        add.accept(new ItemStack(ModTools.copper_sword.get()));
                        add.accept(new ItemStack(ModTools.copper_pickaxe.get()));
                        add.accept(new ItemStack(ModTools.copper_axe.get()));
                        add.accept(new ItemStack(ModTools.copper_hoe.get()));

                        add.accept(new ItemStack(ModArmor.obsidian_helmet.get()));
                        add.accept(new ItemStack(ModArmor.obsidian_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.obsidian_leggings.get()));
                        add.accept(new ItemStack(ModArmor.obsidian_boots.get()));
                        add.accept(new ItemStack(ModTools.obsidian_shovel.get()));
                        add.accept(new ItemStack(ModTools.obsidian_sword.get()));
                        add.accept(new ItemStack(ModTools.obsidian_pickaxe.get()));
                        add.accept(new ItemStack(ModTools.obsidian_axe.get()));
                        add.accept(new ItemStack(ModTools.obsidian_hoe.get()));

                        add.accept(new ItemStack(ModArmor.emerald_helmet.get()));
                        add.accept(new ItemStack(ModArmor.emerald_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.emerald_leggings.get()));
                        add.accept(new ItemStack(ModArmor.emerald_boots.get()));
                        add.accept(new ItemStack(ModTools.emerald_shovel.get()));
                        add.accept(new ItemStack(ModTools.emerald_sword.get()));
                        add.accept(new ItemStack(ModTools.emerald_pickaxe.get()));
                        add.accept(new ItemStack(ModTools.emerald_axe.get()));
                        add.accept(new ItemStack(ModTools.emerald_hoe.get()));

                        add.accept(new ItemStack(ModArmor.dragon_helmet.get()));
                        add.accept(new ItemStack(ModArmor.dragon_chestplate.get()));
                        add.accept(new ItemStack(ModArmor.dragon_leggings.get()));
                        add.accept(new ItemStack(ModArmor.dragon_boots.get()));
                        add.accept(new ItemStack(ModTools.dragon_bow.get()));
                        add.accept(new ItemStack(ModTools.dragon_shovel.get()));
                        add.accept(new ItemStack(ModTools.dragon_sword.get()));
                        add.accept(new ItemStack(ModTools.dragon_pickaxe.get()));
                        add.accept(new ItemStack(ModTools.dragon_axe.get()));
                        add.accept(new ItemStack(ModTools.dragon_hoe.get()));
                        add.accept(new ItemStack(ModTools.dragon_shield.get()));
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
