package net.cathienova.havenksh.events;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.cathienova.havenksh.util.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CustomTradesEvent
{
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event)
    {

    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();


    }
}
