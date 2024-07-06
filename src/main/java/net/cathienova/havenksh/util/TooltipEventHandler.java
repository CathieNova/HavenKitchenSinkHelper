package net.cathienova.havenksh.util;

import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModTools;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.OnlyIn;

@Mod.EventBusSubscriber(bus = Bus.FORGE)
public class TooltipEventHandler {

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();

        if (item == ModTools.havenite_hammer.get())
        {
            event.getToolTip().add(Component.translatable("tooltip.havenksh.hammer.durability.infinite").withStyle(net.minecraft.ChatFormatting.GOLD));
        }
    }
}