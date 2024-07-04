package net.cathienova.havenksh.item.excavators;

import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExcavatorBase extends ShovelItem
{
    private static final Map<Player, List<BlockPos>> breakingBlocks = new ConcurrentHashMap<>();

    public ExcavatorBase(Tier material, int attackDamage, float attackSpeed, Properties properties)
    {
        super(material, attackDamage, attackSpeed, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag)
    {
        super.appendHoverText(stack, world, tooltip, flag);
        tooltip.add(Component.translatable("item.havenksh.excavator.tooltip").withStyle(ChatFormatting.GOLD));
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

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, Player player) {
        if (player.level().isClientSide) return false;

        BlockState blockState = player.level().getBlockState(pos);
        if (!isBreakableByTool(blockState)) {
            return super.onBlockStartBreak(itemstack, pos, player);
        }

        BlockHitResult hitResult = (BlockHitResult) player.pick(10.0D, 1.0F, false);
        if (hitResult.getType() != HitResult.Type.BLOCK) {
            return false;
        }

        Direction face = hitResult.getDirection();

        breakAdjacentBlocks(player, pos, face);

        return true;
    }

    private void breakAdjacentBlocks(Player player, BlockPos pos, Direction face) {
        int breakAmount = 0;
        BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos();

        int startX = face.getAxis() == Direction.Axis.X ? 0 : -1;
        int endX = face.getAxis() == Direction.Axis.X ? 0 : 1;
        int startY = face.getAxis() == Direction.Axis.Y ? 0 : -1;
        int endY = face.getAxis() == Direction.Axis.Y ? 0 : 1;
        int startZ = face.getAxis() == Direction.Axis.Z ? 0 : -1;
        int endZ = face.getAxis() == Direction.Axis.Z ? 0 : 1;

        for (int dx = startX; dx <= endX; dx++) {
            for (int dy = startY; dy <= endY; dy++) {
                for (int dz = startZ; dz <= endZ; dz++) {
                    mutablePos.set(pos.getX() + dx, pos.getY() + dy, pos.getZ() + dz);
                    BlockState adjacentBlock = player.level().getBlockState(mutablePos);

                    if (isBreakableByTool(adjacentBlock)) {
                        destroyBlock(player.level(), mutablePos, player);
                        breakAmount++;
                    }
                }
            }
        }

        int finalBreakAmount = HavenConfig.excavatorDurability ? 1 : breakAmount;
        consumeDurability(player, finalBreakAmount);
    }

    private void consumeDurability(Player player, int durabilityCost)
    {
        if (!player.isCreative() && durabilityCost > 0)
        {
            player.getMainHandItem().hurtAndBreak(durabilityCost, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));
        }
    }

    private static boolean isBreakableByTool(BlockState state) {
        return state.is(BlockTags.MINEABLE_WITH_SHOVEL) || state.isAir();
    }

    private void destroyBlock(Level level, BlockPos pos, Player player) {
        BlockState blockState = level.getBlockState(pos);
        boolean canHarvest = canHarvestBlock(blockState, player);
        boolean isCreative = player.isCreative();

        if (canHarvest) {
            if (isCreative) {
                level.destroyBlock(pos, false, player);
            } else {
                level.destroyBlock(pos, true, player);
                player.awardStat(Stats.ITEM_USED.get(player.getMainHandItem().getItem()));
                player.awardStat(Stats.BLOCK_MINED.get(blockState.getBlock()));
            }
        }
    }

    private boolean canHarvestBlock(BlockState state, Player player) {
        ItemStack tool = player.getMainHandItem();
        return tool.isCorrectToolForDrops(state);
    }

    public List<BlockPos> get3x3Area(BlockPos pos, Direction face, Player player) {
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
                    BlockState blockState = player.level().getBlockState(blockPos);
                    if (isBreakableByTool(blockState) && !blockState.isAir()) {
                        blocks.add(blockPos);
                    }
                }
            }
        }
        return blocks;
    }
}
