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
        if (event.getType() == ModVillagers.COBBLEMASTER.get())
        {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Check if the list at the key exists, if not, create a new list
            trades.computeIfAbsent(1, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.STONE, 16), // item paid
                    new ItemStack(Items.EMERALD, 1),
                    12, 2, 0.02f));

            trades.computeIfAbsent(1, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GRAVEL, 8), // item paid
                    new ItemStack(Items.EMERALD, 1),
                    12, 2, 0.02f));

            trades.computeIfAbsent(2, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.STONE, 4),
                    12, 3, 0.02f));

            trades.computeIfAbsent(2, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.COBBLED_DEEPSLATE, 4),
                    12, 3, 0.02f));

            trades.computeIfAbsent(3, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.GRANITE, 4),
                    12, 4, 0.02f));

            trades.computeIfAbsent(3, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.DRIPSTONE_BLOCK, 4),
                    12, 4, 0.02f));

            trades.computeIfAbsent(4, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.DIORITE, 4),
                    12, 4, 0.02f));

            trades.computeIfAbsent(4, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.TUFF, 4),
                    12, 4, 0.02f));

            trades.computeIfAbsent(4, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.CALCITE, 4),
                    12, 4, 0.02f));

            trades.computeIfAbsent(4, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.BASALT, 4),
                    12, 4, 0.02f));

            trades.computeIfAbsent(4, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3), // item paid
                    new ItemStack(Items.ANDESITE, 4),
                    12, 4, 0.02f));

            trades.computeIfAbsent(5, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2), // item paid
                    new ItemStack(Items.DEEPSLATE, 4),
                    12, 8, 0.02f));

            trades.computeIfAbsent(5, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3), // item paid
                    new ItemStack(ModBlocks.scorched_stone.get(), 4),
                    16, 8, 0.02f));

            trades.computeIfAbsent(5, k -> new ArrayList<>()).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32), // item paid
                    new ItemStack(ModItems.raw_havenite.get(), 2),
                    4, 8, 0.02f));
        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 48), // item paid
                new ItemStack(ModItems.raw_havenite.get(), 2),
                8, 8, 0.15f));
    }
}
