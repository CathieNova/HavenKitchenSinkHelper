package net.cathienova.havenksh;

import com.mojang.logging.LogUtils;
import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.commands.ModCommands;
import net.cathienova.havenksh.events.MobSeedRenderer;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.events.*;
import net.cathienova.havenksh.handler.BlockBreakHandler;
import net.cathienova.havenksh.handler.MobDropHandler;
import net.cathienova.havenksh.item.*;
import net.cathienova.havenksh.util.ModVillagers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;

@Mod(HavenKSH.MOD_ID)
public class HavenKSH
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "havenksh";
    public static final String MOD_NAME = "HavenKitchenSinkHelper";
    static final ForgeConfigSpec commonSpec;
    public static final CommonConfig c_config;

    static
    {
        final Pair<CommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
        commonSpec = specPair.getRight();
        c_config = specPair.getLeft();
    }

    public HavenKSH()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, commonSpec, MOD_NAME + "-Config.toml");
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModFoods.register(modEventBus);
        ModArmor.register(modEventBus);
        ModTools.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());
        MinecraftForge.EVENT_BUS.register(new BlockBreakHandler());
        ModCreativeModTabs.register(modEventBus);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ExcavatorRendering::new);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> HammerRendering::new);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> TrowelRendering::new);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> MobSeedRenderer::new);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> HavenKSHClient::new);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static void Log(String message)
    {
        LogUtils.getLogger().info("[" + MOD_NAME + "] " + message);
    }

    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event)
    {
        ModCommands.register(event.getDispatcher());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }
}
