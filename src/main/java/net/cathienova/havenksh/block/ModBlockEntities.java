package net.cathienova.havenksh.block;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.cobblegen.*;
import net.cathienova.havenksh.block.mobseeds.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, HavenKSH.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenCobbleGenEntity>> wooden_cobble_gen_tile = BLOCK_ENTITIES.register("wooden_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(WoodenCobbleGenEntity::new, ModBlocks.wooden_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StoneCobbleGenEntity>> stone_cobble_gen_tile = BLOCK_ENTITIES.register("stone_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(StoneCobbleGenEntity::new, ModBlocks.stone_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IronCobbleGenEntity>> iron_cobble_gen_tile = BLOCK_ENTITIES.register("iron_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(IronCobbleGenEntity::new, ModBlocks.iron_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GoldCobbleGenEntity>> gold_cobble_gen_tile = BLOCK_ENTITIES.register("gold_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(GoldCobbleGenEntity::new, ModBlocks.gold_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DiamondCobbleGenEntity>> diamond_cobble_gen_tile = BLOCK_ENTITIES.register("diamond_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(DiamondCobbleGenEntity::new, ModBlocks.diamond_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EmeraldCobbleGenEntity>> emerald_cobble_gen_tile = BLOCK_ENTITIES.register("emerald_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(EmeraldCobbleGenEntity::new, ModBlocks.emerald_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<NetheriteCobbleGenEntity>> netherite_cobble_gen_tile = BLOCK_ENTITIES.register("netherite_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(NetheriteCobbleGenEntity::new, ModBlocks.netherite_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CreativeCobbleGenEntity>> creative_cobble_gen_tile = BLOCK_ENTITIES.register("creative_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(CreativeCobbleGenEntity::new, ModBlocks.creative_cobble_gen.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AxolotlSeedEntity>> axolotl_seed_tile = BLOCK_ENTITIES.register("axolotl_seed_tile",
            () -> BlockEntityType.Builder.of(AxolotlSeedEntity::new, ModBlocks.axolotl_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BeeSeedEntity>> bee_seed_tile = BLOCK_ENTITIES.register("bee_seed_tile",
            () -> BlockEntityType.Builder.of(BeeSeedEntity::new, ModBlocks.bee_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CatSeedEntity>> cat_seed_tile = BLOCK_ENTITIES.register("cat_seed_tile",
            () -> BlockEntityType.Builder.of(CatSeedEntity::new, ModBlocks.cat_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ChickenSeedEntity>> chicken_seed_tile = BLOCK_ENTITIES.register("chicken_seed_tile",
            () -> BlockEntityType.Builder.of(ChickenSeedEntity::new, ModBlocks.chicken_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CowSeedEntity>> cow_seed_tile = BLOCK_ENTITIES.register("cow_seed_tile",
            () -> BlockEntityType.Builder.of(CowSeedEntity::new, ModBlocks.cow_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DonkeySeedEntity>> donkey_seed_tile = BLOCK_ENTITIES.register("donkey_seed_tile",
            () -> BlockEntityType.Builder.of(DonkeySeedEntity::new, ModBlocks.donkey_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FoxSeedEntity>> fox_seed_tile = BLOCK_ENTITIES.register("fox_seed_tile",
            () -> BlockEntityType.Builder.of(FoxSeedEntity::new, ModBlocks.fox_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GoatSeedEntity>> goat_seed_tile = BLOCK_ENTITIES.register("goat_seed_tile",
            () -> BlockEntityType.Builder.of(GoatSeedEntity::new, ModBlocks.goat_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HorseSeedEntity>> horse_seed_tile = BLOCK_ENTITIES.register("horse_seed_tile",
            () -> BlockEntityType.Builder.of(HorseSeedEntity::new, ModBlocks.horse_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LlamaSeedEntity>> llama_seed_tile = BLOCK_ENTITIES.register("llama_seed_tile",
            () -> BlockEntityType.Builder.of(LlamaSeedEntity::new, ModBlocks.llama_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MooshroomSeedEntity>> mooshroom_seed_tile = BLOCK_ENTITIES.register("mooshroom_seed_tile",
            () -> BlockEntityType.Builder.of(MooshroomSeedEntity::new, ModBlocks.mooshroom_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MuleSeedEntity>> mule_seed_tile = BLOCK_ENTITIES.register("mule_seed_tile",
            () -> BlockEntityType.Builder.of(MuleSeedEntity::new, ModBlocks.mule_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OcelotSeedEntity>> ocelot_seed_tile = BLOCK_ENTITIES.register("ocelot_seed_tile",
            () -> BlockEntityType.Builder.of(OcelotSeedEntity::new, ModBlocks.ocelot_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PandaSeedEntity>> panda_seed_tile = BLOCK_ENTITIES.register("panda_seed_tile",
            () -> BlockEntityType.Builder.of(PandaSeedEntity::new, ModBlocks.panda_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PigSeedEntity>> pig_seed_tile = BLOCK_ENTITIES.register("pig_seed_tile",
            () -> BlockEntityType.Builder.of(PigSeedEntity::new, ModBlocks.pig_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RabbitSeedEntity>> rabbit_seed_tile = BLOCK_ENTITIES.register("rabbit_seed_tile",
            () -> BlockEntityType.Builder.of(RabbitSeedEntity::new, ModBlocks.rabbit_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SheepSeedEntity>> sheep_seed_tile = BLOCK_ENTITIES.register("sheep_seed_tile",
            () -> BlockEntityType.Builder.of(SheepSeedEntity::new, ModBlocks.sheep_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SnifferSeedEntity>> sniffer_seed_tile = BLOCK_ENTITIES.register("sniffer_seed_tile",
            () -> BlockEntityType.Builder.of(SnifferSeedEntity::new, ModBlocks.sniffer_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ParrotSeedEntity>> parrot_seed_tile = BLOCK_ENTITIES.register("parrot_seed_tile",
            () -> BlockEntityType.Builder.of(ParrotSeedEntity::new, ModBlocks.parrot_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TurtleSeedEntity>> turtle_seed_tile = BLOCK_ENTITIES.register("turtle_seed_tile",
            () -> BlockEntityType.Builder.of(TurtleSeedEntity::new, ModBlocks.turtle_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WolfSeedEntity>> wolf_seed_tile = BLOCK_ENTITIES.register("wolf_seed_tile",
            () -> BlockEntityType.Builder.of(WolfSeedEntity::new, ModBlocks.wolf_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DolphinSeedEntity>> dolphin_seed_tile = BLOCK_ENTITIES.register("dolphin_seed_tile",
            () -> BlockEntityType.Builder.of(DolphinSeedEntity::new, ModBlocks.dolphin_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GlowSquidSeedEntity>> glow_squid_seed_tile = BLOCK_ENTITIES.register("glow_squid_seed_tile",
            () -> BlockEntityType.Builder.of(GlowSquidSeedEntity::new, ModBlocks.glow_squid_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PolarBearSeedEntity>> polar_bear_seed_tile = BLOCK_ENTITIES.register("polar_bear_seed_tile",
            () -> BlockEntityType.Builder.of(PolarBearSeedEntity::new, ModBlocks.polar_bear_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SquidSeedEntity>> squid_seed_tile = BLOCK_ENTITIES.register("squid_seed_tile",
            () -> BlockEntityType.Builder.of(SquidSeedEntity::new, ModBlocks.squid_seed.get()).build(null));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<VillagerSeedEntity>> villager_seed_tile = BLOCK_ENTITIES.register("villager_seed_tile",
            () -> BlockEntityType.Builder.of(VillagerSeedEntity::new, ModBlocks.villager_seed.get()).build(null));

    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
