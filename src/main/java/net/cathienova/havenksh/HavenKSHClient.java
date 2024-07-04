package net.cathienova.havenksh;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.events.MobSeedRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HavenKSHClient {
    public HavenKSHClient() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    @OnlyIn(Dist.CLIENT)
    private void clientSetup(final FMLClientSetupEvent event)
    {
        registerRenderers();
    }
    @OnlyIn(Dist.CLIENT)
    private void registerRenderers()
    {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.reinforced_glass.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.axolotl_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.bee_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.cat_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.chicken_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.cow_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.donkey_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.fox_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.goat_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.horse_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.llama_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.mooshroom_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.mule_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ocelot_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.panda_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.pig_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.rabbit_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.sheep_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.sniffer_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.parrot_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.turtle_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.wolf_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.dolphin_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.glow_squid_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.polar_bear_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.squid_seed.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.villager_seed.get(), RenderType.cutout());

        BlockEntityRenderers.register(ModBlockEntities.axolotl_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.bee_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.cat_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.chicken_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.cow_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.donkey_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.fox_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.goat_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.horse_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.llama_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.mooshroom_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.mule_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.ocelot_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.panda_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.pig_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.rabbit_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.sheep_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.sniffer_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.parrot_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.turtle_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.wolf_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.dolphin_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.glow_squid_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.polar_bear_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.squid_seed_tile.get(), MobSeedRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.villager_seed_tile.get(), MobSeedRenderer::new);
    }
}
