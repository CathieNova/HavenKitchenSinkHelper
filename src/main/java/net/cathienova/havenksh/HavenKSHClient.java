package net.cathienova.havenksh;

import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HavenKSHClient {
    public HavenKSHClient() {
        ModLoadingContext.get().getActiveContainer().getEventBus().addListener(this::clientSetup);
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
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
    }
}
