package net.cathienova.havenksh.events;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.config.HavenConfig;
import net.cathienova.havenksh.item.HammerBase;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderHighlightEvent;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class HammerRendering {
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void renderBlockHighlight(RenderHighlightEvent.Block event) {
        if (event.getTarget().getType() != HitResult.Type.BLOCK) return;

        BlockHitResult rtr = event.getTarget();
        Entity entity = event.getCamera().getEntity();
        if (!(entity instanceof Player player)) return;

        ItemStack itemStack = player.getMainHandItem();
        if (!(itemStack.getItem() instanceof HammerBase)) return;

        if (player.isCrouching()) return;

        // Simulate blocks for rendering on the client
        List<BlockPos> blocks = simulateBlocksToBeDestroyed(1, rtr.getBlockPos(), player);
        if (blocks == null || blocks.isEmpty()) return;

        PoseStack poseStack = event.getPoseStack();
        MultiBufferSource bufferSource = event.getMultiBufferSource();
        VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.LINES);

        double partialTicks = event.getDeltaTracker().getGameTimeDeltaPartialTick(true);
        double dx = player.xOld + (player.getX() - player.xOld) * partialTicks;
        double dy = player.yOld + player.getEyeHeight() + (player.getY() - player.yOld) * partialTicks;
        double dz = player.zOld + (player.getZ() - player.zOld) * partialTicks;

        for (BlockPos blockPos : blocks) {
            AABB aabb = new AABB(blockPos).move(-dx, -dy, -dz);
            LevelRenderer.renderLineBox(poseStack, vertexConsumer, aabb,
                    (float) HavenConfig.hammer_highlight_red,
                    (float) HavenConfig.hammer_highlight_green,
                    (float) HavenConfig.hammer_highlight_blue,
                    (float) HavenConfig.hammer_highlight_alpha);
        }

        event.setCanceled(true);
    }

    private static List<BlockPos> simulateBlocksToBeDestroyed(int range, BlockPos initialBlockPos, Player player) {
        List<BlockPos> positions = new ArrayList<>();
        BlockHitResult traceResult = player.level().clip(new ClipContext(
                player.getEyePosition(1f),
                player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f)),
                ClipContext.Block.COLLIDER,
                ClipContext.Fluid.NONE,
                player));

        if (traceResult.getType() == HitResult.Type.MISS) {
            return positions;
        }

        Direction direction = traceResult.getDirection();

        if (direction == Direction.DOWN || direction == Direction.UP) {
            for (int x = -range; x <= range; x++) {
                for (int z = -range; z <= range; z++) {
                    BlockPos pos = new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY(), initialBlockPos.getZ() + z);
                    if (player.level().getBlockState(pos).is(BlockTags.MINEABLE_WITH_PICKAXE)) {
                        positions.add(pos);
                    }
                }
            }
        } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
            for (int x = -range; x <= range; x++) {
                for (int y = -range; y <= range; y++) {
                    BlockPos pos = new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY() + y, initialBlockPos.getZ());
                    if (player.level().getBlockState(pos).is(BlockTags.MINEABLE_WITH_PICKAXE)) {
                        positions.add(pos);
                    }
                }
            }
        } else if (direction == Direction.EAST || direction == Direction.WEST) {
            for (int z = -range; z <= range; z++) {
                for (int y = -range; y <= range; y++) {
                    BlockPos pos = new BlockPos(initialBlockPos.getX(), initialBlockPos.getY() + y, initialBlockPos.getZ() + z);
                    if (player.level().getBlockState(pos).is(BlockTags.MINEABLE_WITH_PICKAXE)) {
                        positions.add(pos);
                    }
                }
            }
        }

        return positions;
    }
}
