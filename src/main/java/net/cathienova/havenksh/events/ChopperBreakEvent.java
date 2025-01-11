package net.cathienova.havenksh.events;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.ChopperBase;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;

import java.util.HashSet;
import java.util.Set;

@EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ChopperBreakEvent {

    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @SubscribeEvent
    public static void onChopperUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        if (!(player instanceof ServerPlayer serverPlayer)) return;

        ItemStack mainHandItem = player.getMainHandItem();
        if (mainHandItem.getItem() instanceof ChopperBase chopper) {
            BlockPos initialBlockPos = event.getPos();

            if (HARVESTED_BLOCKS.contains(initialBlockPos)) {
                return;
            }

            if (player.isCrouching()) {
                HARVESTED_BLOCKS.add(initialBlockPos);
                serverPlayer.gameMode.destroyBlock(initialBlockPos);
                HARVESTED_BLOCKS.remove(initialBlockPos);
            } else {
                Level level = player.level();
                Set<BlockPos> logsToBreak = new HashSet<>();
                findLogs(level, initialBlockPos, logsToBreak, chopper.getMaxBlocksToBreak());

                for (BlockPos pos : logsToBreak) {
                    if (!level.getBlockState(pos).isAir()) {
                        BlockState blockState = level.getBlockState(pos);
                        if (chopper.isCorrectToolForDrops(mainHandItem, blockState)) {
                            HARVESTED_BLOCKS.add(pos);
                            serverPlayer.gameMode.destroyBlock(pos);
                            HARVESTED_BLOCKS.remove(pos);
                        }
                    }
                }
            }
        }
    }

    public static void findLogs(Level world, BlockPos pos, Set<BlockPos> logsToBreak, int maxBlocksToBreak) {
        BlockState state = world.getBlockState(pos);
        boolean isLog = state.is(BlockTags.LOGS) ||
                state.is(BlockTags.LOGS_THAT_BURN) ||
                state.is(ModTags.Blocks.minecraftLogs) ||
                state.is(ModTags.Blocks.minecraftLogsThatBurn);

        if (logsToBreak.contains(pos) || logsToBreak.size() >= maxBlocksToBreak || !isLog)
            return;

        logsToBreak.add(pos);

        // Search all adjacent blocks
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                for (int dz = -1; dz <= 1; dz++) {
                    if (dx == 0 && dy == 0 && dz == 0) continue;
                    BlockPos adjacentPos = pos.offset(dx, dy, dz);
                    findLogs(world, adjacentPos, logsToBreak, maxBlocksToBreak);
                }
            }
        }
    }
}
