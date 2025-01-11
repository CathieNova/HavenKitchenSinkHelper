package net.cathienova.havenksh.item.cobblegen;

import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.block.cobblegen.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class CobbleGenUpgradeEmerald extends Item
{
    public CobbleGenUpgradeEmerald(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        if (context.getLevel().isClientSide)
            return InteractionResult.PASS;
        if (!Objects.requireNonNull(context.getPlayer()).isCrouching())
            return InteractionResult.PASS;

        if (context.getLevel().getBlockState(context.getClickedPos()).getBlock() instanceof EmeraldCobbleGen)
        {
            context.getLevel().setBlock(context.getClickedPos(), ModBlocks.netherite_cobble_gen.get().defaultBlockState(), 3);

            context.getItemInHand().shrink(1);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag)
    {
        super.appendHoverText(stack, context, tooltip, tooltipFlag);

        tooltip.add(Component.translatable("item.havenksh.cobble_gen_upgrade_emerald.tooltip").withStyle(net.minecraft.ChatFormatting.GOLD));
    }
}
