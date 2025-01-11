package net.cathienova.havenksh.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class OreHammerBase extends Item
{
    public OreHammerBase(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        if (itemStack.isDamageableItem() && itemStack.getDamageValue() < itemStack.getMaxDamage() - 1) {
            ItemStack damaged = itemStack.copy();
            int newDamage = damaged.getDamageValue() + 1;
            if (newDamage >= damaged.getMaxDamage()) {
                return ItemStack.EMPTY;
            } else {
                damaged.setDamageValue(newDamage);
                return damaged;
            }
        } else {
            return ItemStack.EMPTY;
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag)
    {
        super.appendHoverText(stack, context, tooltip, tooltipFlag);

        tooltip.add(Component.translatable("tooltip.havenksh.ore_hammer").withStyle(ChatFormatting.GOLD));
        tooltip.add(Component.translatable("tooltip.havenksh.ore_hammer.durability", "§2" + (stack.getMaxDamage() - stack.getDamageValue())).withStyle(ChatFormatting.GOLD));
    }
}
