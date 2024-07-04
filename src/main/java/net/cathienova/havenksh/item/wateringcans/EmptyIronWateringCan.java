package net.cathienova.havenksh.item.wateringcans;

import net.cathienova.havenksh.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EmptyIronWateringCan extends Item
{
    public EmptyIronWateringCan(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        ItemStack itemstack = player.getItemInHand(hand);
        HitResult hitResult = player.pick(5.0D, 0.0F, false);

        if (hitResult.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHitResult = (BlockHitResult) hitResult;
            BlockPos blockpos = blockHitResult.getBlockPos();
            Direction direction = blockHitResult.getDirection();
            BlockPos adjacentPos = blockpos.relative(direction);
            FluidState fluidState = level.getFluidState(adjacentPos);

            if (fluidState.isSource() && fluidState.getType() == Fluids.WATER) {
                if (!level.isClientSide) {
                    ItemStack filledWateringCan = new ItemStack(ModItems.iron_watering_can.get());
                    player.setItemInHand(hand, filledWateringCan);

                    level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BUCKET_FILL, SoundSource.PLAYERS, 1.0F, 1.0F);
                    level.gameEvent(player, GameEvent.FLUID_PICKUP, adjacentPos);
                }
                return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
            }
        }

        return InteractionResultHolder.pass(itemstack);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced)
    {
        pTooltipComponents.add(Component.translatable("item.havenksh.empty_watering_can.tooltip").withStyle(net.minecraft.ChatFormatting.GOLD));
    }
}