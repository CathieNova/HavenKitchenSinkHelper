package net.cathienova.havenksh.block;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.cobblegen.*;
import net.cathienova.havenksh.block.mobseeds.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HavenKSH.MOD_ID);

    public static final RegistryObject<BlockEntityType<WoodenCobbleGenEntity>> wooden_cobble_gen_tile = BLOCK_ENTITIES.register("wooden_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(WoodenCobbleGenEntity::new, ModBlocks.wooden_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<StoneCobbleGenEntity>> stone_cobble_gen_tile = BLOCK_ENTITIES.register("stone_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(StoneCobbleGenEntity::new, ModBlocks.stone_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<IronCobbleGenEntity>> iron_cobble_gen_tile = BLOCK_ENTITIES.register("iron_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(IronCobbleGenEntity::new, ModBlocks.iron_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<GoldCobbleGenEntity>> gold_cobble_gen_tile = BLOCK_ENTITIES.register("gold_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(GoldCobbleGenEntity::new, ModBlocks.gold_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<DiamondCobbleGenEntity>> diamond_cobble_gen_tile = BLOCK_ENTITIES.register("diamond_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(DiamondCobbleGenEntity::new, ModBlocks.diamond_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<EmeraldCobbleGenEntity>> emerald_cobble_gen_tile = BLOCK_ENTITIES.register("emerald_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(EmeraldCobbleGenEntity::new, ModBlocks.emerald_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<NetheriteCobbleGenEntity>> netherite_cobble_gen_tile = BLOCK_ENTITIES.register("netherite_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(NetheriteCobbleGenEntity::new, ModBlocks.netherite_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<CreativeCobbleGenEntity>> creative_cobble_gen_tile = BLOCK_ENTITIES.register("creative_cobble_gen_tile",
            () -> BlockEntityType.Builder.of(CreativeCobbleGenEntity::new, ModBlocks.creative_cobble_gen.get()).build(null));

    public static final RegistryObject<BlockEntityType<AxolotlSeedEntity>> axolotl_seed_tile = BLOCK_ENTITIES.register("axolotl_seed_tile",
            () -> BlockEntityType.Builder.of(AxolotlSeedEntity::new, ModBlocks.axolotl_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<BeeSeedEntity>> bee_seed_tile = BLOCK_ENTITIES.register("bee_seed_tile",
            () -> BlockEntityType.Builder.of(BeeSeedEntity::new, ModBlocks.bee_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<CatSeedEntity>> cat_seed_tile = BLOCK_ENTITIES.register("cat_seed_tile",
            () -> BlockEntityType.Builder.of(CatSeedEntity::new, ModBlocks.cat_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<ChickenSeedEntity>> chicken_seed_tile = BLOCK_ENTITIES.register("chicken_seed_tile",
            () -> BlockEntityType.Builder.of(ChickenSeedEntity::new, ModBlocks.chicken_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<CowSeedEntity>> cow_seed_tile = BLOCK_ENTITIES.register("cow_seed_tile",
            () -> BlockEntityType.Builder.of(CowSeedEntity::new, ModBlocks.cow_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<DonkeySeedEntity>> donkey_seed_tile = BLOCK_ENTITIES.register("donkey_seed_tile",
            () -> BlockEntityType.Builder.of(DonkeySeedEntity::new, ModBlocks.donkey_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<FoxSeedEntity>> fox_seed_tile = BLOCK_ENTITIES.register("fox_seed_tile",
            () -> BlockEntityType.Builder.of(FoxSeedEntity::new, ModBlocks.fox_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<GoatSeedEntity>> goat_seed_tile = BLOCK_ENTITIES.register("goat_seed_tile",
            () -> BlockEntityType.Builder.of(GoatSeedEntity::new, ModBlocks.goat_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<HorseSeedEntity>> horse_seed_tile = BLOCK_ENTITIES.register("horse_seed_tile",
            () -> BlockEntityType.Builder.of(HorseSeedEntity::new, ModBlocks.horse_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<LlamaSeedEntity>> llama_seed_tile = BLOCK_ENTITIES.register("llama_seed_tile",
            () -> BlockEntityType.Builder.of(LlamaSeedEntity::new, ModBlocks.llama_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<MooshroomSeedEntity>> mooshroom_seed_tile = BLOCK_ENTITIES.register("mooshroom_seed_tile",
            () -> BlockEntityType.Builder.of(MooshroomSeedEntity::new, ModBlocks.mooshroom_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<MuleSeedEntity>> mule_seed_tile = BLOCK_ENTITIES.register("mule_seed_tile",
            () -> BlockEntityType.Builder.of(MuleSeedEntity::new, ModBlocks.mule_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<OcelotSeedEntity>> ocelot_seed_tile = BLOCK_ENTITIES.register("ocelot_seed_tile",
            () -> BlockEntityType.Builder.of(OcelotSeedEntity::new, ModBlocks.ocelot_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<PandaSeedEntity>> panda_seed_tile = BLOCK_ENTITIES.register("panda_seed_tile",
            () -> BlockEntityType.Builder.of(PandaSeedEntity::new, ModBlocks.panda_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<PigSeedEntity>> pig_seed_tile = BLOCK_ENTITIES.register("pig_seed_tile",
            () -> BlockEntityType.Builder.of(PigSeedEntity::new, ModBlocks.pig_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<RabbitSeedEntity>> rabbit_seed_tile = BLOCK_ENTITIES.register("rabbit_seed_tile",
            () -> BlockEntityType.Builder.of(RabbitSeedEntity::new, ModBlocks.rabbit_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<SheepSeedEntity>> sheep_seed_tile = BLOCK_ENTITIES.register("sheep_seed_tile",
            () -> BlockEntityType.Builder.of(SheepSeedEntity::new, ModBlocks.sheep_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<SnifferSeedEntity>> sniffer_seed_tile = BLOCK_ENTITIES.register("sniffer_seed_tile",
            () -> BlockEntityType.Builder.of(SnifferSeedEntity::new, ModBlocks.sniffer_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<ParrotSeedEntity>> parrot_seed_tile = BLOCK_ENTITIES.register("parrot_seed_tile",
            () -> BlockEntityType.Builder.of(ParrotSeedEntity::new, ModBlocks.parrot_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<TurtleSeedEntity>> turtle_seed_tile = BLOCK_ENTITIES.register("turtle_seed_tile",
            () -> BlockEntityType.Builder.of(TurtleSeedEntity::new, ModBlocks.turtle_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<WolfSeedEntity>> wolf_seed_tile = BLOCK_ENTITIES.register("wolf_seed_tile",
            () -> BlockEntityType.Builder.of(WolfSeedEntity::new, ModBlocks.wolf_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<DolphinSeedEntity>> dolphin_seed_tile = BLOCK_ENTITIES.register("dolphin_seed_tile",
            () -> BlockEntityType.Builder.of(DolphinSeedEntity::new, ModBlocks.dolphin_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<GlowSquidSeedEntity>> glow_squid_seed_tile = BLOCK_ENTITIES.register("glow_squid_seed_tile",
            () -> BlockEntityType.Builder.of(GlowSquidSeedEntity::new, ModBlocks.glow_squid_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<PolarBearSeedEntity>> polar_bear_seed_tile = BLOCK_ENTITIES.register("polar_bear_seed_tile",
            () -> BlockEntityType.Builder.of(PolarBearSeedEntity::new, ModBlocks.polar_bear_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<SquidSeedEntity>> squid_seed_tile = BLOCK_ENTITIES.register("squid_seed_tile",
            () -> BlockEntityType.Builder.of(SquidSeedEntity::new, ModBlocks.squid_seed.get()).build(null));

    public static final RegistryObject<BlockEntityType<VillagerSeedEntity>> villager_seed_tile = BLOCK_ENTITIES.register("villager_seed_tile",
            () -> BlockEntityType.Builder.of(VillagerSeedEntity::new, ModBlocks.villager_seed.get()).build(null));

    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
