package net.cathienova.havenksh.datagen.loot;

import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModFoods;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate()
    {
        this.dropSelf(ModBlocks.wooden_cobble_gen.get());
        this.dropSelf(ModBlocks.stone_cobble_gen.get());
        this.dropSelf(ModBlocks.iron_cobble_gen.get());
        this.dropSelf(ModBlocks.gold_cobble_gen.get());
        this.dropSelf(ModBlocks.diamond_cobble_gen.get());
        this.dropSelf(ModBlocks.emerald_cobble_gen.get());
        this.dropSelf(ModBlocks.netherite_cobble_gen.get());
        this.dropSelf(ModBlocks.creative_cobble_gen.get());

        this.dropSelf(ModBlocks.charcoal_block.get());
        this.dropSelf(ModBlocks.andesite_brick.get());
        this.dropSelf(ModBlocks.diorite_brick.get());
        this.dropSelf(ModBlocks.granite_brick.get());
        this.dropSelf(ModBlocks.flesh_block.get());
        this.dropSelf(ModBlocks.flint_block.get());
        this.dropSelf(ModBlocks.nether_star_block.get());

        this.dropSelf(ModBlocks.lamp_white.get());
        this.dropSelf(ModBlocks.lamp_aqua.get());
        this.dropSelf(ModBlocks.lamp_blue.get());
        this.dropSelf(ModBlocks.lamp_dark_aqua.get());
        this.dropSelf(ModBlocks.lamp_dark_blue.get());
        this.dropSelf(ModBlocks.lamp_dark_gray.get());
        this.dropSelf(ModBlocks.lamp_dark_green.get());
        this.dropSelf(ModBlocks.lamp_dark_purple.get());
        this.dropSelf(ModBlocks.lamp_dark_red.get());
        this.dropSelf(ModBlocks.lamp_gold.get());
        this.dropSelf(ModBlocks.lamp_gray.get());
        this.dropSelf(ModBlocks.lamp_green.get());
        this.dropSelf(ModBlocks.lamp_light_purple.get());
        this.dropSelf(ModBlocks.lamp_red.get());
        this.dropSelf(ModBlocks.lamp_yellow.get());
        this.dropSelf(ModBlocks.lamp_rainbow.get());
        this.dropSelf(ModBlocks.reinforced_glass.get());
        this.dropSelf(ModBlocks.ender_block.get());
        this.add(ModBlocks.scorched_stone.get(),
                block -> createSilkDrop(ModBlocks.scorched_stone.get(), ModBlocks.scorched_cobblestone.get().asItem()));
        this.dropSelf(ModBlocks.scorched_stone_bricks.get());
        this.dropSelf(ModBlocks.scorched_cobblestone.get());
        this.dropSelf(ModBlocks.raw_havenite_block.get());
        this.dropSelf(ModBlocks.havenite_block.get());

        this.add(ModBlocks.scorched_copper_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_copper_ore.get(), ModItems.copper_nugget.get(), 1, 5));
        this.add(ModBlocks.scorched_coal_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_coal_ore.get(), ModItems.mini_coal.get(), 1, 5));
        this.add(ModBlocks.scorched_iron_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_iron_ore.get(), Items.IRON_NUGGET, 1, 5));
        this.add(ModBlocks.scorched_gold_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_gold_ore.get(), Items.GOLD_NUGGET, 1, 5));
        this.add(ModBlocks.scorched_redstone_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_redstone_ore.get(), ModItems.redstone_nugget.get(), 1, 5));
        this.add(ModBlocks.scorched_lapis_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_lapis_ore.get(), ModItems.lapis_nugget.get(), 1, 5));
        this.add(ModBlocks.scorched_diamond_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_diamond_ore.get(), ModItems.diamond_nugget.get(), 1, 5));
        this.add(ModBlocks.scorched_emerald_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_emerald_ore.get(), ModItems.emerald_nugget.get(), 1, 5));
        this.add(ModBlocks.scorched_quartz_ore.get(), block -> createOreLikeOreDrops(ModBlocks.scorched_quartz_ore.get(), ModItems.quartz_nugget.get(), 1, 5));
        this.add(ModBlocks.havenite_ore.get(), block -> createOreLikeOreDrops(ModBlocks.havenite_ore.get(), ModItems.raw_havenite.get(), 1, 1));
        this.add(ModBlocks.deepslate_havenite_ore.get(), block -> createOreLikeOreDrops(ModBlocks.deepslate_havenite_ore.get(), ModItems.raw_havenite.get(), 1, 1));

        this.dropSelf(ModBlocks.dust.get());
        this.dropSelf(ModBlocks.crushed_netherrack.get());
        this.dropSelf(ModBlocks.crushed_end_stone.get());
    }

    protected LootTable.Builder createOreLikeOreDrops(Block pBlock, Item item, int min, int max) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createSilkDrop(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))));
    }

    protected LootTable.Builder createCrusherLootTable(Block inputBlock, Block customDropBlock) {
        return createSilkTouchOrCrusherTable(inputBlock, customDropBlock, inputBlock.asItem());
    }

    protected LootTable.Builder createSilkTouchOrCrusherTable(Block inputBlock, Block customDrop, Item regularDrop) {
        LootPool.Builder crusherPool = LootPool.lootPool()
                .setRolls(UniformGenerator.between(1.0F, 1.0F))
                .add(LootItem.lootTableItem(customDrop)
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item()
                                .of(ModTags.Items.crushers)))
                        .apply(ApplyExplosionDecay.explosionDecay())
                );

        LootPool.Builder regularToolPool = LootPool.lootPool()
                .setRolls(UniformGenerator.between(1.0F, 1.0F))
                .add(LootItem.lootTableItem(regularDrop)
                        .when(MatchTool.toolMatches(getToolPredicateForBlock(inputBlock)))
                        .apply(ApplyExplosionDecay.explosionDecay())
                );

        return LootTable.lootTable().withPool(crusherPool).withPool(regularToolPool);
    }

    protected ItemPredicate.Builder getToolPredicateForBlock(Block block) {
        if (block.defaultBlockState().is(ModTags.Blocks.needs_pickaxe)) {
            return ItemPredicate.Builder.item().of(ModTags.Items.pickaxes);
        } else if (block.defaultBlockState().is(ModTags.Blocks.needs_shovel)) {
            return ItemPredicate.Builder.item().of(ModTags.Items.shovels);
        } else {
            return ItemPredicate.Builder.item().of(block.asItem());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
