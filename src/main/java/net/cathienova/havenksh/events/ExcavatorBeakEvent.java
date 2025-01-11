package net.cathienova.havenksh.events;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.ExcavatorBase;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;

import java.util.HashSet;
import java.util.Set;

@EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ExcavatorBeakEvent
{
    private static final Set<BlockPos> BlocksBroken = new HashSet<>();

    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if(mainHandItem.getItem() instanceof ExcavatorBase excavator && player instanceof ServerPlayer serverPlayer) {
            BlockPos initialBlockPos = event.getPos();
            if(BlocksBroken.contains(initialBlockPos)) {
                return;
            }

            for(BlockPos pos : ExcavatorBase.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer)) {
                if(pos == initialBlockPos || !excavator.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                BlocksBroken.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                BlocksBroken.remove(pos);
            }
        }
    }
}
