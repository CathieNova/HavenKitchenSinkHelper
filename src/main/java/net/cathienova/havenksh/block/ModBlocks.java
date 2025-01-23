package net.cathienova.havenksh.block;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.fuel.FuelBlockItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TintedGlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HavenKSH.MOD_ID);

    public static final DeferredBlock<Block> charcoal_block = registerFuelBlockBlock("charcoal_block",
            () -> new FuelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).strength(5.0F, 3.0F)));

    public static final DeferredItem<FuelBlockItem> charcoal_block_item = ModItems.ITEMS.register("charcoal_block",
            () -> new FuelBlockItem(ModBlocks.charcoal_block.get(),
                    new Item.Properties(), 16000));

    public static final DeferredBlock<Block> dust = registerBlock("dust",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND)));

    public static final DeferredBlock<Block> crushed_netherrack = registerBlock("crushed_netherrack",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)));

    public static final DeferredBlock<Block> crushed_end_stone = registerBlock("crushed_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL)));

    public static final DeferredBlock<Block> diorite_brick = registerBlock("diorite_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> granite_brick = registerBlock("granite_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> andesite_brick = registerBlock("andesite_brick",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> flesh_block = registerBlock("flesh_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> flint_block = registerBlock("flint_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).strength(1.5F, 3.0F)));

    public static final DeferredBlock<Block> nether_star_block = registerBlock("nether_star_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).strength(5.0F, 12000.0F)));

    public static final DeferredBlock<Block> ender_block = registerBlock("ender_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).strength(3.0F, 9.0F)));

    public static final DeferredBlock<Block> lamp_white = registerBlock("lamp_white",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_aqua = registerBlock("lamp_aqua",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_blue = registerBlock("lamp_blue",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_dark_aqua = registerBlock("lamp_dark_aqua",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_dark_blue = registerBlock("lamp_dark_blue",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_dark_gray = registerBlock("lamp_dark_gray",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_dark_green = registerBlock("lamp_dark_green",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_dark_purple = registerBlock("lamp_dark_purple",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_dark_red = registerBlock("lamp_dark_red",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_gold = registerBlock("lamp_gold",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_gray = registerBlock("lamp_gray",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_green = registerBlock("lamp_green",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_light_purple = registerBlock("lamp_light_purple",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_red = registerBlock("lamp_red",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_yellow = registerBlock("lamp_yellow",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> lamp_rainbow = registerBlock("lamp_rainbow",
            () -> new LampBase(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final DeferredBlock<Block> scorched_stone = registerBlock("scorched_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(1.5F, 5.0F)));

    public static final DeferredBlock<Block> scorched_stone_bricks = registerBlock("scorched_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(1.5F, 5.0F)));

    public static final DeferredBlock<Block> scorched_cobblestone = registerBlock("scorched_cobblestone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(1.5F, 5.0F)));

    public static final DeferredBlock<Block> scorched_coal_ore = registerBlock("scorched_coal_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_copper_ore = registerBlock("scorched_copper_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_iron_ore = registerBlock("scorched_iron_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_gold_ore = registerBlock("scorched_gold_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_quartz_ore = registerBlock("scorched_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_lapis_ore = registerBlock("scorched_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_redstone_ore = registerBlock("scorched_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_diamond_ore = registerBlock("scorched_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> scorched_emerald_ore = registerBlock("scorched_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final DeferredBlock<Block> havenite_ore = registerBlock("havenite_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
                    .requiresCorrectToolForDrops().strength(10.0F, 5.0F)));

    public static final DeferredBlock<Block> deepslate_havenite_ore = registerBlock("deepslate_havenite_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
                    .requiresCorrectToolForDrops().strength(10.0F, 5.0F)));

    public static final DeferredBlock<Block> reinforced_glass = registerBlock("reinforced_glass",
            () -> new TintedGlassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)
                    .strength(50.0F, 12000.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GLASS)
                    .isValidSpawn((state, level, pos, type) -> false)
                    .isRedstoneConductor((state, level, pos) -> false)
                    .isSuffocating((state, level, pos) -> false)
                    .isViewBlocking((state, level, pos) -> false)
                    .explosionResistance(12000.0F)
                    .noOcclusion()
                    .friction(0F)
                    .pushReaction(PushReaction.IGNORE)
            ) {
                @Override
                public boolean canEntityDestroy(BlockState state, BlockGetter level, BlockPos pos, Entity entity) {
                    return false;
                }
            }
    );

    public static final DeferredBlock<Block> havenite_block = registerBlock("havenite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).strength(5.0F, 12000.0F)));

    public static final DeferredBlock<Block> raw_havenite_block = registerBlock("raw_havenite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).strength(3.0F, 5.0F)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> registerFuelBlockBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
