package net.cathienova.havenksh.item.wateringcans;

import net.cathienova.havenksh.config.HavenConfig;
import net.cathienova.havenksh.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IronWateringCan extends Item
{
    public IronWateringCan(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        HitResult hitResult = player.pick(5.0D, 0.0F, false);

        if (!level.isClientSide && hitResult.getType() == HitResult.Type.BLOCK) {
            BlockPos pos = ((BlockHitResult) hitResult).getBlockPos();
            waterArea((ServerLevel) level, pos);
            spawnParticles((ServerLevel) level, pos);

            if (itemstack.getDamageValue() >= itemstack.getMaxDamage() - 1) {
                ItemStack emptyWateringCan = new ItemStack(ModItems.empty_iron_watering_can.get());
                player.setItemInHand(hand, emptyWateringCan);
            }

            level.gameEvent(player, GameEvent.FLUID_PLACE, pos);
            itemstack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
            player.getCooldowns().addCooldown(this, HavenConfig.wateringCanCooldown);
        }

        return InteractionResultHolder.pass(itemstack);
    }

    private void waterArea(ServerLevel level, BlockPos centerPos) {
        for (int y = -1; y <= 1; y++) {
            for (int x = -1; x <= 1; x++) {
                for (int z = -1; z <= 1; z++) {
                    BlockPos pos = centerPos.offset(x, y, z);
                    BlockState state = level.getBlockState(pos);
                    if (state.isRandomlyTicking()) {
                        state.randomTick(level, pos, level.random);
                    }
                }
            }
        }
    }

    private void spawnParticles(ServerLevel level, BlockPos centerPos) {
        for (int y = -1; y <= 1; y++) {
            for (int x = -1; x <= 1; x++) {
                for (int z = -1; z <= 1; z++) {
                    BlockPos pos = centerPos.offset(x, y, z);
                    BlockState state = level.getBlockState(pos);
                    if (!state.isAir()) {
                        level.sendParticles(ParticleTypes.FALLING_WATER, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 5, 0.2, 0.4, 0.2, 0.0);
                    }
                }
            }
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced)
    {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);

        pTooltipComponents.add(Component.translatable("item.havenksh.iron_watering_can.tooltip"));
    }
}