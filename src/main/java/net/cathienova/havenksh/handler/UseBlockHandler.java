package net.cathienova.havenksh.handler;

import net.cathienova.havenksh.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber
public class UseBlockHandler {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getEntity();
        Level level = event.getLevel();
        BlockPos blockPos = event.getPos();
        InteractionHand hand = event.getHand();
        Block block = level.getBlockState(blockPos).getBlock();
        ItemStack itemStack = player.getItemInHand(hand);

        if (!player.isSpectator() && hand == InteractionHand.MAIN_HAND && player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof AxeItem)
            StripBark(level, blockPos);

        if (event.getLevel().isClientSide) return;


        if (itemStack.getItem() == ModItems.acacia_bark.get() && block == Blocks.STRIPPED_ACACIA_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.ACACIA_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.acacia_bark.get()));
            level.playSound(null, blockPos, SoundEvents.WOOD_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        else if (itemStack.getItem() == ModItems.birch_bark.get() && block == Blocks.STRIPPED_BIRCH_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.BIRCH_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.birch_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.cherry_bark.get() && block == Blocks.STRIPPED_CHERRY_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.CHERRY_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.cherry_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.crimson_bark.get() && block == Blocks.STRIPPED_CRIMSON_STEM)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.CRIMSON_STEM.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.crimson_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.dark_oak_bark.get() && block == Blocks.STRIPPED_DARK_OAK_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.DARK_OAK_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.dark_oak_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.jungle_bark.get() && block == Blocks.STRIPPED_JUNGLE_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.JUNGLE_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.jungle_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.mangrove_bark.get() && block == Blocks.STRIPPED_MANGROVE_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.MANGROVE_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.mangrove_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.oak_bark.get() && block == Blocks.STRIPPED_OAK_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.OAK_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.oak_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.spruce_bark.get() && block == Blocks.STRIPPED_SPRUCE_LOG)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.SPRUCE_LOG.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.spruce_bark.get()));
        }
        else if (itemStack.getItem() == ModItems.warped_bark.get() && block == Blocks.STRIPPED_WARPED_STEM)
        {
            level.setBlockAndUpdate(new BlockPos(event.getPos()), Blocks.WARPED_STEM.defaultBlockState());
            itemStack.shrink(1);
            player.awardStat(Stats.ITEM_USED.get(ModItems.warped_bark.get()));
        }
    }

    public static void StripBark(Level level, BlockPos blockPos)
    {
        Block block = level.getBlockState(blockPos).getBlock();
        if (Blocks.ACACIA_LOG.equals(block) || Blocks.ACACIA_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.acacia_bark.get()));
        }
        else if (Blocks.BIRCH_LOG.equals(block) || Blocks.BIRCH_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.birch_bark.get()));
        }
        else if (Blocks.CHERRY_LOG.equals(block) || Blocks.CHERRY_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.cherry_bark.get()));
        }
        else if (Blocks.CRIMSON_STEM.equals(block) || Blocks.CRIMSON_HYPHAE.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.crimson_bark.get()));
        }
        else if (Blocks.DARK_OAK_LOG.equals(block) || Blocks.DARK_OAK_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.dark_oak_bark.get()));
        }
        else if (Blocks.JUNGLE_LOG.equals(block) || Blocks.JUNGLE_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.jungle_bark.get()));
        }
        else if (Blocks.MANGROVE_LOG.equals(block) || Blocks.MANGROVE_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.mangrove_bark.get()));
        }
        else if (Blocks.OAK_LOG.equals(block) || Blocks.OAK_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.oak_bark.get()));
        }
        else if (Blocks.SPRUCE_LOG.equals(block) || Blocks.SPRUCE_WOOD.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.spruce_bark.get()));
        }
        else if (Blocks.WARPED_STEM.equals(block) || Blocks.WARPED_HYPHAE.equals(block))
        {
            spawnItem(level, blockPos, new ItemStack(ModItems.warped_bark.get()));
        }
    }

    private static void spawnItem(Level level, BlockPos blockPos, ItemStack item) {
        if (!level.isClientSide()) {
            level.addFreshEntity(new ItemEntity(level, blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5, item));
        }
    }
}
