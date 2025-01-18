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
import net.cathienova.havenksh.util.DistUtils;
import net.cathienova.havenksh.util.ModVillagers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.apache.commons.lang3.tuple.Pair;

@Mod(HavenKSH.MOD_ID)
public class HavenKSH
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "havenksh";
    public static final String MOD_NAME = "HavenKitchenSinkHelper";
    static final ModConfigSpec commonSpec;
    public static final CommonConfig c_config;

    static
    {
        final Pair<CommonConfig, ModConfigSpec> specPair = new ModConfigSpec.Builder().configure(CommonConfig::new);
        commonSpec = specPair.getRight();
        c_config = specPair.getLeft();
    }

    public HavenKSH(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::setup);
        modContainer.registerConfig(ModConfig.Type.COMMON, commonSpec);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModFoods.register(modEventBus);
        ModArmor.register(modEventBus);
        ModTools.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        NeoForge.EVENT_BUS.addListener(this::registerCommands);
        DistUtils.runIfOn(Dist.CLIENT, ExcavatorRendering::new);
        DistUtils.runIfOn(Dist.CLIENT, HammerRendering::new);
        DistUtils.runIfOn(Dist.CLIENT, TrowelRendering::new);
        DistUtils.runIfOn(Dist.CLIENT, HavenKSHClient::new);
    }

    public static void Log(String message)
    {
        LogUtils.getLogger().info("[" + MOD_NAME + "] " + message);
    }

    private void registerCommands(RegisterCommandsEvent evt) {
        ModCommands.register(evt.getDispatcher(), evt.getBuildContext());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }
}
