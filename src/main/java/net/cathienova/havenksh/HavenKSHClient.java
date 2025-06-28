package net.cathienova.havenksh;

import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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
    }
}
