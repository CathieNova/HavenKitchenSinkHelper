package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.block.cobblegen.WoodenCobbleGen;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.ImpossibleTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends ForgeAdvancementProvider {

    public ModAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper fileHelper) {
        super(output, registries, fileHelper, List.of(new ModAdvancements()));
    }

    public static class ModAdvancements implements AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider registries, Consumer<Advancement> consumer, ExistingFileHelper fileHelper) {
            Advancement root = Advancement.Builder.advancement()
                    .display(ModItems.dice.get(),
                            Component.translatable("advancements.havenksh.root.title"),
                            Component.translatable("advancements.havenksh.root.description"),
                            new ResourceLocation(HavenKSH.MOD_ID, "textures/block/scorched_stone.png"),
                            FrameType.TASK, true, true, false)
                    .addCriterion("tick", new ImpossibleTrigger.TriggerInstance())
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "root").toString());

            Advancement woodenCobbleGen = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.wooden_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.wooden_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.wooden_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("wooden_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.wooden_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "wooden_cobble_gen").toString());

            Advancement woodenCobbleGen2 = Advancement.Builder.advancement()
                    .parent(woodenCobbleGen)
                    .display(ModBlocks.stone_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.stone_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.stone_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("stone_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.stone_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "stone_cobble_gen").toString());

            Advancement woodenCobbleGen3 = Advancement.Builder.advancement()
                    .parent(woodenCobbleGen2)
                    .display(ModBlocks.iron_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.iron_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.iron_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("iron_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.iron_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "iron_cobble_gen").toString());

            Advancement woodenCobbleGen4 = Advancement.Builder.advancement()
                    .parent(woodenCobbleGen3)
                    .display(ModBlocks.gold_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.gold_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.gold_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("gold_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.gold_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "gold_cobble_gen").toString());

            Advancement woodenCobbleGen5 = Advancement.Builder.advancement()
                    .parent(woodenCobbleGen4)
                    .display(ModBlocks.diamond_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.diamond_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.diamond_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("diamond_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.diamond_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "diamond_cobble_gen").toString());

            Advancement woodenCobbleGen6 = Advancement.Builder.advancement()
                    .parent(woodenCobbleGen5)
                    .display(ModBlocks.emerald_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.emerald_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.emerald_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("emerald_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.emerald_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "emerald_cobble_gen").toString());

            Advancement woodenCobbleGen7 = Advancement.Builder.advancement()
                    .parent(woodenCobbleGen6)
                    .display(ModBlocks.netherite_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.netherite_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.netherite_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("netherite_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.netherite_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "netherite_cobble_gen").toString());

            Advancement woodenCobbleGen8 = Advancement.Builder.advancement()
                    .parent(woodenCobbleGen7)
                    .display(ModBlocks.creative_cobble_gen.get(),
                            Component.translatable("advancements.havenksh.creative_cobble_gen.title"),
                            Component.translatable("advancements.havenksh.creative_cobble_gen.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("creative_cobble_gen", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.creative_cobble_gen.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "creative_cobble_gen").toString());

            Advancement lamps = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.lamp_rainbow.get(),
                            Component.translatable("advancements.havenksh.lamp.title"),
                            Component.translatable("advancements.havenksh.lamp.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTags.Items.lamp).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "lamp").toString());

            Advancement nether_star_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.nether_star_block.get(),
                            Component.translatable("advancements.havenksh.nether_star_block.title"),
                            Component.translatable("advancements.havenksh.nether_star_block.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("nether_star_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.nether_star_block.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "nether_star_block").toString());

            Advancement copper_ore_hammer = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModTools.copper_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.copper_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.copper_ore_hammer.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("copper_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.copper_ore_hammer.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "copper_ore_hammer").toString());

            Advancement iron_ore_hammer = Advancement.Builder.advancement()
                    .parent(copper_ore_hammer)
                    .display(ModTools.iron_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.iron_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.iron_ore_hammer.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("iron_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.iron_ore_hammer.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "iron_ore_hammer").toString());

            Advancement gold_ore_hammer = Advancement.Builder.advancement()
                    .parent(iron_ore_hammer)
                    .display(ModTools.gold_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.gold_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.gold_ore_hammer.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("gold_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.gold_ore_hammer.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "gold_ore_hammer").toString());

            Advancement diamond_ore_hammer = Advancement.Builder.advancement()
                    .parent(gold_ore_hammer)
                    .display(ModTools.diamond_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.diamond_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.diamond_ore_hammer.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("diamond_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.diamond_ore_hammer.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "diamond_ore_hammer").toString());

            Advancement emerald_ore_hammer = Advancement.Builder.advancement()
                    .parent(diamond_ore_hammer)
                    .display(ModTools.emerald_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.emerald_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.emerald_ore_hammer.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("emerald_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.emerald_ore_hammer.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "emerald_ore_hammer").toString());

            Advancement netherite_ore_hammer = Advancement.Builder.advancement()
                    .parent(emerald_ore_hammer)
                    .display(ModTools.netherite_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.netherite_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.netherite_ore_hammer.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("netherite_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.netherite_ore_hammer.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "netherite_ore_hammer").toString());

            Advancement magnet = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModArmor.magnet.get(),
                            Component.translatable("advancements.havenksh.magnet.title"),
                            Component.translatable("advancements.havenksh.magnet.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("magnet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModArmor.magnet.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "magnet").toString());

            /*Advancement repair_talisman = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModArmor.repair_talisman.get(),
                            Component.translatable("advancements.havenksh.repair_talisman.title"),
                            Component.translatable("advancements.havenksh.repair_talisman.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("repair_talisman", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModArmor.repair_talisman.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "repair_talisman").toString());*/

            Advancement trowel = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModTools.trowel.get(),
                            Component.translatable("advancements.havenksh.trowel.title"),
                            Component.translatable("advancements.havenksh.trowel.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("trowel", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.trowel.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "trowel").toString());

            Advancement acacia_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.acacia_bark.get(),
                            Component.translatable("advancements.havenksh.acacia_bark.title"),
                            Component.translatable("advancements.havenksh.acacia_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("acacia_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.acacia_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "acacia_bark").toString());

            Advancement birch_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.birch_bark.get(),
                            Component.translatable("advancements.havenksh.birch_bark.title"),
                            Component.translatable("advancements.havenksh.birch_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("birch_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.birch_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "birch_bark").toString());

            Advancement cherry_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.cherry_bark.get(),
                            Component.translatable("advancements.havenksh.cherry_bark.title"),
                            Component.translatable("advancements.havenksh.cherry_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("cherry_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.cherry_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "cherry_bark").toString());

            Advancement crimson_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.crimson_bark.get(),
                            Component.translatable("advancements.havenksh.crimson_bark.title"),
                            Component.translatable("advancements.havenksh.crimson_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("crimson_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.crimson_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "crimson_bark").toString());

            Advancement dark_oak_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.dark_oak_bark.get(),
                            Component.translatable("advancements.havenksh.dark_oak_bark.title"),
                            Component.translatable("advancements.havenksh.dark_oak_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("dark_oak_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.dark_oak_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "dark_oak_bark").toString());

            Advancement jungle_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.jungle_bark.get(),
                            Component.translatable("advancements.havenksh.jungle_bark.title"),
                            Component.translatable("advancements.havenksh.jungle_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("jungle_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.jungle_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "jungle_bark").toString());

            Advancement mangrove_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.mangrove_bark.get(),
                            Component.translatable("advancements.havenksh.mangrove_bark.title"),
                            Component.translatable("advancements.havenksh.mangrove_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("mangrove_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.mangrove_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "mangrove_bark").toString());

            Advancement oak_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.oak_bark.get(),
                            Component.translatable("advancements.havenksh.oak_bark.title"),
                            Component.translatable("advancements.havenksh.oak_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("oak_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.oak_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "oak_bark").toString());

            Advancement spruce_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.spruce_bark.get(),
                            Component.translatable("advancements.havenksh.spruce_bark.title"),
                            Component.translatable("advancements.havenksh.spruce_bark.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("spruce_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.spruce_bark.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "spruce_bark").toString());

            Advancement flint_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.flint_block.get(),
                            Component.translatable("advancements.havenksh.flint_block.title"),
                            Component.translatable("advancements.havenksh.flint_block.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("flint_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.flint_block.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "flint_block").toString());

            Advancement flesh_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.flesh_block.get(),
                            Component.translatable("advancements.havenksh.flesh_block.title"),
                            Component.translatable("advancements.havenksh.flesh_block.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("flesh_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.flesh_block.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "flesh_block").toString());

            Advancement ender_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.ender_block.get(),
                            Component.translatable("advancements.havenksh.ender_block.title"),
                            Component.translatable("advancements.havenksh.ender_block.description"),
                            null,
                            FrameType.TASK, true, true, false)
                    .addCriterion("ender_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.ender_block.get()).build()))
                    .save(consumer, new ResourceLocation(HavenKSH.MOD_ID, "ender_block").toString());
        }
    }
}
