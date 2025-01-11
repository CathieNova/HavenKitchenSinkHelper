package net.cathienova.havenksh.util;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.cathienova.havenksh.item.ModTools;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME, modid = HavenKSH.MOD_ID)
public class TooltipEventHandler {

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();

        if (item == ModTools.trowel.get())
        {
            if (HavenConfig.enable_inventory_blocks)
                event.getToolTip().add(Component.translatable("item.havenksh.trowel.tooltip.inventory").withStyle(ChatFormatting.GOLD));
            else
                event.getToolTip().add(Component.translatable("item.havenksh.trowel.tooltip.hotbar").withStyle(ChatFormatting.GOLD));
        }
    }
}