package net.cathienova.havenksh.block;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.cobblegen.*;
import net.cathienova.havenksh.block.mobseeds.*;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.fuel.FuelBlockItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HavenKSH.MOD_ID);

    public static final RegistryObject<Block> wooden_cobble_gen = registerBlock("wooden_cobble_gen",
            WoodenCobbleGen::new);

    public static final RegistryObject<Block> stone_cobble_gen = registerBlock("stone_cobble_gen",
            StoneCobbleGen::new);

    public static final RegistryObject<Block> iron_cobble_gen = registerBlock("iron_cobble_gen",
            IronCobbleGen::new);

    public static final RegistryObject<Block> gold_cobble_gen = registerBlock("gold_cobble_gen",
            GoldCobbleGen::new);

    public static final RegistryObject<Block> diamond_cobble_gen = registerBlock("diamond_cobble_gen",
            DiamondCobbleGen::new);

    public static final RegistryObject<Block> emerald_cobble_gen = registerBlock("emerald_cobble_gen",
            EmeraldCobbleGen::new);

    public static final RegistryObject<Block> netherite_cobble_gen = registerBlock("netherite_cobble_gen",
            NetheriteCobbleGen::new);

    public static final RegistryObject<Block> creative_cobble_gen = registerBlock("creative_cobble_gen",
            CreativeCobbleGen::new);

    public static final RegistryObject<Block> charcoal_block = registerFuelBlockBlock("charcoal_block",
            () -> new FuelBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(5.0F, 3.0F)));

    public static final RegistryObject<Item> charcoal_block_item = ModItems.ITEMS.register("charcoal_block",
            () -> new FuelBlockItem(ModBlocks.charcoal_block.get(),
                    new Item.Properties(), 16000));

    public static final RegistryObject<Block> dust = registerBlock("dust",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static final RegistryObject<Block> crushed_netherrack = registerBlock("crushed_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));

    public static final RegistryObject<Block> crushed_end_stone = registerBlock("crushed_end_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));

    public static final RegistryObject<Block> diorite_brick = registerBlock("diorite_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(1.5F, 3.0F)));

    public static final RegistryObject<Block> granite_brick = registerBlock("granite_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(1.5F, 3.0F)));

    public static final RegistryObject<Block> andesite_brick = registerBlock("andesite_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(1.5F, 3.0F)));

    public static final RegistryObject<Block> flesh_block = registerBlock("flesh_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD).strength(1.5F, 3.0F)));

    public static final RegistryObject<Block> flint_block = registerBlock("flint_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(1.5F, 3.0F)));

    public static final RegistryObject<Block> nether_star_block = registerBlock("nether_star_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(5.0F, 12000.0F)));

    public static final RegistryObject<Block> ender_block = registerBlock("ender_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(3.0F, 9.0F)));

    public static final RegistryObject<Block> lamp_white = registerBlock("lamp_white",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_aqua = registerBlock("lamp_aqua",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_blue = registerBlock("lamp_blue",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_dark_aqua = registerBlock("lamp_dark_aqua",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_dark_blue = registerBlock("lamp_dark_blue",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_dark_gray = registerBlock("lamp_dark_gray",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_dark_green = registerBlock("lamp_dark_green",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_dark_purple = registerBlock("lamp_dark_purple",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_dark_red = registerBlock("lamp_dark_red",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_gold = registerBlock("lamp_gold",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_gray = registerBlock("lamp_gray",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_green = registerBlock("lamp_green",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_light_purple = registerBlock("lamp_light_purple",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_red = registerBlock("lamp_red",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_yellow = registerBlock("lamp_yellow",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> lamp_rainbow = registerBlock("lamp_rainbow",
            () -> new LampBase(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noOcclusion().destroyTime(0.3F)));

    public static final RegistryObject<Block> scorched_stone = registerBlock("scorched_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(1.5F, 5.0F)));

    public static final RegistryObject<Block> scorched_stone_bricks = registerBlock("scorched_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(1.5F, 5.0F)));

    public static final RegistryObject<Block> scorched_cobblestone = registerBlock("scorched_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(1.5F, 5.0F)));

    public static final RegistryObject<Block> scorched_coal_ore = registerBlock("scorched_coal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_copper_ore = registerBlock("scorched_copper_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_iron_ore = registerBlock("scorched_iron_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_gold_ore = registerBlock("scorched_gold_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_quartz_ore = registerBlock("scorched_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_lapis_ore = registerBlock("scorched_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_redstone_ore = registerBlock("scorched_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_diamond_ore = registerBlock("scorched_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> scorched_emerald_ore = registerBlock("scorched_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> reinforced_glass = registerBlock("reinforced_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
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

    public static final RegistryObject<Block> havenite_block = registerBlock("havenite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(5.0F, 12000.0F)));

    public static final RegistryObject<Block> havenite_ore = registerBlock("havenite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> deepslate_havenite_ore = registerBlock("deepslate_havenite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> raw_havenite_block = registerBlock("raw_havenite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(3.0F, 5.0F)));

    public static final RegistryObject<Block> axolotl_seed = registerBlock("axolotl_seed",
            () -> new AxolotlSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> bee_seed = registerBlock("bee_seed",
            () -> new BeeSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> cat_seed = registerBlock("cat_seed",
            () -> new CatSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> chicken_seed = registerBlock("chicken_seed",
            () -> new ChickenSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> cow_seed = registerBlock("cow_seed",
            () -> new CowSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> donkey_seed = registerBlock("donkey_seed",
            () -> new DonkeySeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> fox_seed = registerBlock("fox_seed",
            () -> new FoxSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> goat_seed = registerBlock("goat_seed",
            () -> new GoatSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> horse_seed = registerBlock("horse_seed",
            () -> new HorseSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> llama_seed = registerBlock("llama_seed",
            () -> new LlamaSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> mooshroom_seed = registerBlock("mooshroom_seed",
            () -> new MooshroomSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> mule_seed = registerBlock("mule_seed",
            () -> new MuleSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> ocelot_seed = registerBlock("ocelot_seed",
            () -> new OcelotSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> panda_seed = registerBlock("panda_seed",
            () -> new PandaSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> pig_seed = registerBlock("pig_seed",
            () -> new PigSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> rabbit_seed = registerBlock("rabbit_seed",
            () -> new RabbitSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> sheep_seed = registerBlock("sheep_seed",
            () -> new SheepSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> sniffer_seed = registerBlock("sniffer_seed",
            () -> new SnifferSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> turtle_seed = registerBlock("turtle_seed",
            () -> new TurtleSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> parrot_seed = registerBlock("parrot_seed",
            () -> new ParrotSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> wolf_seed = registerBlock("wolf_seed",
            () -> new WolfSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> dolphin_seed = registerBlock("dolphin_seed",
            () -> new DolphinSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> glow_squid_seed = registerBlock("glow_squid_seed",
            () -> new GlowSquidSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> polar_bear_seed = registerBlock("polar_bear_seed",
            () -> new PolarBearSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> squid_seed = registerBlock("squid_seed",
            () -> new SquidSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    public static final RegistryObject<Block> villager_seed = registerBlock("villager_seed",
            () -> new VillagerSeedBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).noLootTable()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerFuelBlockBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
