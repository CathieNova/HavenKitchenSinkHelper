package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.critereon.ImpossibleTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends AdvancementProvider
{

    public ModAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, ExistingFileHelper fileHelper) {
        super(output, registries, fileHelper, List.of(new ModAdvancements()));
    }

    public static class ModAdvancements implements AdvancementGenerator {
        @Override
        public void generate(HolderLookup.Provider provider, Consumer<AdvancementHolder> consumer, ExistingFileHelper existingFileHelper) {
            AdvancementHolder root = Advancement.Builder.advancement()
                    .display(ModItems.dice.get(),
                            Component.translatable("advancements.havenksh.root.title"),
                            Component.translatable("advancements.havenksh.root.description"),
                            ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "textures/block/scorched_stone.png"),
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("tick", CriteriaTriggers.IMPOSSIBLE.createCriterion(new ImpossibleTrigger.TriggerInstance()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "root").toString());

            AdvancementHolder lamps = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.lamp_rainbow.get(),
                            Component.translatable("advancements.havenksh.lamp.title"),
                            Component.translatable("advancements.havenksh.lamp.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("lamp", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTags.Items.lamp).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "lamp").toString());

            AdvancementHolder nether_star_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.nether_star_block.get(),
                            Component.translatable("advancements.havenksh.nether_star_block.title"),
                            Component.translatable("advancements.havenksh.nether_star_block.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("nether_star_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.nether_star_block.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "nether_star_block").toString());

            AdvancementHolder copper_ore_hammer = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModTools.copper_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.copper_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.copper_ore_hammer.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("copper_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.copper_ore_hammer.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "copper_ore_hammer").toString());

            AdvancementHolder iron_ore_hammer = Advancement.Builder.advancement()
                    .parent(copper_ore_hammer)
                    .display(ModTools.iron_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.iron_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.iron_ore_hammer.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("iron_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.iron_ore_hammer.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "iron_ore_hammer").toString());

            AdvancementHolder gold_ore_hammer = Advancement.Builder.advancement()
                    .parent(iron_ore_hammer)
                    .display(ModTools.gold_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.gold_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.gold_ore_hammer.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("gold_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.gold_ore_hammer.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "gold_ore_hammer").toString());

            AdvancementHolder diamond_ore_hammer = Advancement.Builder.advancement()
                    .parent(gold_ore_hammer)
                    .display(ModTools.diamond_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.diamond_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.diamond_ore_hammer.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("diamond_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.diamond_ore_hammer.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "diamond_ore_hammer").toString());

            AdvancementHolder emerald_ore_hammer = Advancement.Builder.advancement()
                    .parent(diamond_ore_hammer)
                    .display(ModTools.emerald_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.emerald_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.emerald_ore_hammer.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("emerald_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.emerald_ore_hammer.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "emerald_ore_hammer").toString());

            AdvancementHolder netherite_ore_hammer = Advancement.Builder.advancement()
                    .parent(emerald_ore_hammer)
                    .display(ModTools.netherite_ore_hammer.get(),
                            Component.translatable("advancements.havenksh.netherite_ore_hammer.title"),
                            Component.translatable("advancements.havenksh.netherite_ore_hammer.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("netherite_ore_hammer", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.netherite_ore_hammer.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "netherite_ore_hammer").toString());

            AdvancementHolder magnet = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModArmor.magnet.get(),
                            Component.translatable("advancements.havenksh.magnet.title"),
                            Component.translatable("advancements.havenksh.magnet.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("magnet", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModArmor.magnet.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "magnet").toString());

            AdvancementHolder repair_talisman = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModArmor.repair_talisman.get(),
                            Component.translatable("advancements.havenksh.repair_talisman.title"),
                            Component.translatable("advancements.havenksh.repair_talisman.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("repair_talisman", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModArmor.repair_talisman.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "repair_talisman").toString());

            AdvancementHolder trowel = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModTools.trowel.get(),
                            Component.translatable("advancements.havenksh.trowel.title"),
                            Component.translatable("advancements.havenksh.trowel.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("trowel", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModTools.trowel.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "trowel").toString());

            AdvancementHolder acacia_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.acacia_bark.get(),
                            Component.translatable("advancements.havenksh.acacia_bark.title"),
                            Component.translatable("advancements.havenksh.acacia_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("acacia_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.acacia_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "acacia_bark").toString());

            AdvancementHolder birch_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.birch_bark.get(),
                            Component.translatable("advancements.havenksh.birch_bark.title"),
                            Component.translatable("advancements.havenksh.birch_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("birch_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.birch_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "birch_bark").toString());

            AdvancementHolder cherry_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.cherry_bark.get(),
                            Component.translatable("advancements.havenksh.cherry_bark.title"),
                            Component.translatable("advancements.havenksh.cherry_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("cherry_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.cherry_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "cherry_bark").toString());

            AdvancementHolder crimson_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.crimson_bark.get(),
                            Component.translatable("advancements.havenksh.crimson_bark.title"),
                            Component.translatable("advancements.havenksh.crimson_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("crimson_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.crimson_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "crimson_bark").toString());

            AdvancementHolder dark_oak_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.dark_oak_bark.get(),
                            Component.translatable("advancements.havenksh.dark_oak_bark.title"),
                            Component.translatable("advancements.havenksh.dark_oak_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("dark_oak_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.dark_oak_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "dark_oak_bark").toString());

            AdvancementHolder jungle_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.jungle_bark.get(),
                            Component.translatable("advancements.havenksh.jungle_bark.title"),
                            Component.translatable("advancements.havenksh.jungle_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("jungle_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.jungle_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "jungle_bark").toString());

            AdvancementHolder mangrove_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.mangrove_bark.get(),
                            Component.translatable("advancements.havenksh.mangrove_bark.title"),
                            Component.translatable("advancements.havenksh.mangrove_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("mangrove_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.mangrove_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "mangrove_bark").toString());

            AdvancementHolder oak_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.oak_bark.get(),
                            Component.translatable("advancements.havenksh.oak_bark.title"),
                            Component.translatable("advancements.havenksh.oak_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("oak_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.oak_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "oak_bark").toString());

            AdvancementHolder spruce_bark = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.spruce_bark.get(),
                            Component.translatable("advancements.havenksh.spruce_bark.title"),
                            Component.translatable("advancements.havenksh.spruce_bark.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("spruce_bark", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModItems.spruce_bark.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "spruce_bark").toString());

            AdvancementHolder flint_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.flint_block.get(),
                            Component.translatable("advancements.havenksh.flint_block.title"),
                            Component.translatable("advancements.havenksh.flint_block.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("flint_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.flint_block.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "flint_block").toString());

            AdvancementHolder flesh_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.flesh_block.get(),
                            Component.translatable("advancements.havenksh.flesh_block.title"),
                            Component.translatable("advancements.havenksh.flesh_block.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("flesh_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.flesh_block.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "flesh_block").toString());

            AdvancementHolder ender_block = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModBlocks.ender_block.get(),
                            Component.translatable("advancements.havenksh.ender_block.title"),
                            Component.translatable("advancements.havenksh.ender_block.description"),
                            null,
                            AdvancementType.TASK, true, true, false)
                    .addCriterion("ender_block", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(ModBlocks.ender_block.get()).build()))
                    .save(consumer, ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "ender_block").toString());
        }
    }
}
