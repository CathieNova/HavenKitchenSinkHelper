package net.cathienova.havenksh;

import com.mojang.logging.LogUtils;
import io.wispforest.accessories.api.AccessoriesAPI;
import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.commands.ModCommands;
import net.cathienova.havenksh.compat.REIHavenKSHPlugin;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.events.*;
import net.cathienova.havenksh.item.*;
import net.cathienova.havenksh.item.artifacts.Magnet;
import net.cathienova.havenksh.item.artifacts.RepairTalisman;
import net.cathienova.havenksh.util.DistUtils;
import net.cathienova.havenksh.util.ModVillagers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
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

    public HavenKSH(IEventBus bus, ModContainer modContainer)
    {
        bus.addListener(this::setup);
        modContainer.registerConfig(ModConfig.Type.COMMON, commonSpec);
        ModBlocks.register(bus);
        ModItems.register(bus);
        ModFoods.register(bus);
        ModArmor.register(bus);
        ModTools.register(bus);
        ModVillagers.register(bus);
        ModBlockEntities.register(bus);
        ModCreativeModTabs.register(bus);
        bus.addListener(this::setup);
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

    private void setup(FMLCommonSetupEvent event)
    {
        AccessoriesAPI.registerAccessory(ModArmor.magnet.get(), new Magnet());
        AccessoriesAPI.registerAccessory(ModArmor.repair_talisman.get(), new RepairTalisman());
        REIHavenKSHPlugin.populateItemDescriptions();
    }
    public static ResourceLocation loc(String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }
}
