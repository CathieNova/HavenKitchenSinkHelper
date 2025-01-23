package net.cathienova.havenksh.events;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.ModItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
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

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 48), // item paid
                new ItemStack(ModItems.raw_havenite.get(), 2),
                8, 8, 0.15f));
    }
}
