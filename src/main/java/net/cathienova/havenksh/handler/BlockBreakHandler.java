package net.cathienova.havenksh.handler;

import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockBreakHandler
{
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBlockBreak(BlockEvent.BreakEvent event)
    {

    }
}
