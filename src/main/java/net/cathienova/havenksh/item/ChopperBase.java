package net.cathienova.havenksh.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class ChopperBase extends AxeItem {
    private final int maxBlocksToBreak;

    public ChopperBase(Tier pTier, Properties pProperties, int maxBreak) {
        super(pTier, pProperties);
        this.maxBlocksToBreak = maxBreak;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("item.havenksh.chopper.tooltip1").withStyle(ChatFormatting.GOLD));
        tooltip.add(Component.translatable("item.havenksh.chopper.tooltip2").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.havenksh.chopper.tooltip3").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("tooltip.havenksh.ore_hammer.durability", "§2" + (stack.getMaxDamage() - stack.getDamageValue())).withStyle(ChatFormatting.GOLD));
    }

    public int getMaxBlocksToBreak() {
        return this.maxBlocksToBreak;
    }
}
