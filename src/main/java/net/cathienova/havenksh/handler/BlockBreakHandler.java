package net.cathienova.havenksh.handler;


import net.cathienova.havenksh.HavenKSH;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class BlockBreakHandler
{
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBlockBreak(BlockEvent.BreakEvent event)
    {

    }
}
