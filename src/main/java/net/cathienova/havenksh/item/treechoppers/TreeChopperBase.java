package net.cathienova.havenksh.item.treechoppers;

import net.cathienova.havenksh.item.ModTools;
import net.cathienova.havenksh.util.ModTags;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TreeChopperBase extends AxeItem {

    public TreeChopperBase(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> tooltip, TooltipFlag pIsAdvanced) {
        tooltip.add(Component.translatable("item.havenksh.chopper.tooltip1").withStyle(ChatFormatting.GOLD));
        tooltip.add(Component.translatable("item.havenksh.chopper.tooltip2").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.havenksh.chopper.tooltip3").withStyle(ChatFormatting.GRAY));
        if (pStack.getItem() == ModTools.havenite_chopper.get()) {
            tooltip.add(Component.translatable("tooltip.havenksh.ore_hammer.durability.infinite").withStyle(ChatFormatting.GOLD));
        }
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, Player player) {
        Level world = player.level();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (!player.isCrouching() && !player.isCreative() && !player.isSpectator()) {
            if (block.defaultBlockState().is(ModTags.Blocks.minecraftLogs) || block.defaultBlockState().is(ModTags.Blocks.minecraftLogsThatBurn)) {
                int maxBlocksToBreak = itemstack.getMaxDamage() - itemstack.getDamageValue();
                if (itemstack.getItem() == ModTools.havenite_chopper.get())
                    maxBlocksToBreak = 200;
                breakTree(world, pos, player, itemstack, maxBlocksToBreak);
            }
        }

        return super.onBlockStartBreak(itemstack, pos, player);
    }

    private void breakTree(Level world, BlockPos pos, Player player, ItemStack itemstack, int maxBlocksToBreak) {
        Set<BlockPos> logsToBreak = new HashSet<>();
        findLogs(world, pos, logsToBreak, maxBlocksToBreak);

        int blocksBroken = 0;
        for (BlockPos logPos : logsToBreak) {
            if (blocksBroken >= maxBlocksToBreak) break;
            world.destroyBlock(logPos, true);
            blocksBroken++;
            itemstack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(player.getUsedItemHand()));
            player.awardStat(Stats.BLOCK_MINED.get(world.getBlockState(logPos).getBlock()));
        }
    }

    private void findLogs(Level world, BlockPos pos, Set<BlockPos> logsToBreak, int maxBlocksToBreak) {
        if (logsToBreak.size() >= maxBlocksToBreak || logsToBreak.contains(pos)) {
            return;
        }

        BlockState state = world.getBlockState(pos);
        if (state.is(ModTags.Blocks.minecraftLogs) || state.is(ModTags.Blocks.minecraftLogsThatBurn)) {
            logsToBreak.add(pos);

            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    for (int dz = -1; dz <= 1; dz++) {
                        BlockPos adjacentPos = pos.offset(dx, dy, dz);
                        if (!logsToBreak.contains(adjacentPos)) {
                            findLogs(world, adjacentPos, logsToBreak, maxBlocksToBreak);
                        }
                    }
                }
            }
        }
    }
}
