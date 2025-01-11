package net.cathienova.havenksh.item.artifacts;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.ArrayList;
import java.util.List;

public abstract  class ArtifactBase extends Item implements ICurioItem
{
    protected abstract boolean isCosmetic();

    public ArtifactBase(Properties pProperties){super(pProperties);}

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> pTooltip, TooltipFlag flag)
    {
        List<MutableComponent> tooltip = new ArrayList<>();
        addTooltip(stack, tooltip);
        tooltip.forEach(line -> pTooltip.add(line.withStyle(ChatFormatting.GRAY)));
    }

    protected void addTooltip(ItemStack stack, List<MutableComponent> tooltip) {
        if (isCosmetic()) {
            tooltip.add(Component.translatable("%s.tooltip.havenksh".formatted(HavenKSH.MOD_ID)).withStyle(ChatFormatting.ITALIC));
        } else {
            addEffectsTooltip(stack, tooltip);
        }
    }

    protected void addEffectsTooltip(ItemStack stack, List<MutableComponent> tooltip) {
        tooltip.add(Component.translatable("%s.tooltip.item.%s".formatted(HavenKSH.MOD_ID, getTooltipItemName())));
    }

    protected String getTooltipItemName() {return BuiltInRegistries.ITEM.getKey(this).getPath();}

    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack) {return true;}
}
