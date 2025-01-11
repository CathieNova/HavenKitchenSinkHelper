package net.cathienova.havenksh.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExcavatorBase extends DiggerItem
{
    private static final Map<Player, List<BlockPos>> breakingBlocks = new ConcurrentHashMap<>();

    public ExcavatorBase(Tier material, Properties properties)
    {
        super(material, BlockTags.MINEABLE_WITH_SHOVEL, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag)
    {
        super.appendHoverText(stack, context, tooltip, flag);
        tooltip.add(Component.translatable("item.havenksh.excavator.tooltip").withStyle(ChatFormatting.GOLD));
        tooltip.add(Component.translatable("item.havenksh.excavator.tooltip2").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("tooltip.havenksh.ore_hammer.durability", "§2" + (stack.getMaxDamage() - stack.getDamageValue())).withStyle(ChatFormatting.GOLD));
    }

    @Override
    public boolean isEnchantable(ItemStack pStack)
    {
        return true;
    }

    @Override
    public int getEnchantmentValue()
    {
        return 25;
    }

    public static List<BlockPos> blockPosList = new ArrayList<>();

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initalBlockPos, ServerPlayer player) {
        List<BlockPos> positions = new ArrayList<>();

        BlockHitResult traceResult = player.level().clip(new ClipContext(player.getEyePosition(1f),
                (player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f))),
                ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));
        if(traceResult.getType() == HitResult.Type.MISS) {
            return positions;
        }

        if(traceResult.getDirection() == Direction.DOWN || traceResult.getDirection() == Direction.UP) {
            for(int x = -range; x <= range; x++) {
                for(int y = -range; y <= range; y++) {
                    positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY(), initalBlockPos.getZ() + y));
                }
            }
        }

        if(traceResult.getDirection() == Direction.NORTH || traceResult.getDirection() == Direction.SOUTH) {
            for(int x = -range; x <= range; x++) {
                for(int y = -range; y <= range; y++) {
                    positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ()));
                }
            }
        }

        if(traceResult.getDirection() == Direction.EAST || traceResult.getDirection() == Direction.WEST) {
            for(int x = -range; x <= range; x++) {
                for(int y = -range; y <= range; y++) {
                    positions.add(new BlockPos(initalBlockPos.getX(), initalBlockPos.getY() + y, initalBlockPos.getZ() + x));
                }
            }
        }

        blockPosList = positions;
        return positions;
    }

    public static List<BlockPos> get3x3Area(BlockPos pos, Direction face, Player player) {
        List<BlockPos> blocks = new ArrayList<>();
        int startX = face.getAxis() == Direction.Axis.X ? 0 : -1;
        int endX = face.getAxis() == Direction.Axis.X ? 0 : 1;
        int startY = face.getAxis() == Direction.Axis.Y ? 0 : -1;
        int endY = face.getAxis() == Direction.Axis.Y ? 0 : 1;
        int startZ = face.getAxis() == Direction.Axis.Z ? 0 : -1;
        int endZ = face.getAxis() == Direction.Axis.Z ? 0 : 1;

        for (int dx = startX; dx <= endX; dx++) {
            for (int dy = startY; dy <= endY; dy++) {
                for (int dz = startZ; dz <= endZ; dz++) {
                    BlockPos blockPos = pos.offset(dx, dy, dz);
                    blocks.add(blockPos);
                }
            }
        }
        return blocks;
    }
}
