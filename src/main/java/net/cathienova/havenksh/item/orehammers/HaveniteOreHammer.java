package net.cathienova.havenksh.item.orehammers;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HaveniteOreHammer extends Item
{
    public HaveniteOreHammer(Properties pProperties)
    {
        super(pProperties);
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return false;
    }

    @Override
    public boolean canBeDepleted() {
        return true;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        if (itemStack.isDamageableItem() && itemStack.getMaxDamage() > 0) {
            ItemStack damaged = itemStack.copy();
            int newDamage = damaged.getDamageValue() + 1;
            if (newDamage >= damaged.getMaxDamage()) {
                return ItemStack.EMPTY;
            } else {
                damaged.setDamageValue(newDamage);
                return damaged;
            }
        }
        return itemStack.copy();
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> tooltip, @NotNull TooltipFlag isAdvanced)
    {
        super.appendHoverText(stack, level, tooltip, isAdvanced);
    }
}
