package net.cathienova.havenksh.item.artifacts;

import io.wispforest.accessories.api.Accessory;
import io.wispforest.accessories.api.SoundEventData;
import io.wispforest.accessories.api.slot.SlotReference;
import net.cathienova.havenksh.HavenKSH;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public abstract  class ArtifactBase implements Accessory
{
    /*protected abstract boolean isCosmetic();

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

    protected String getTooltipItemName() {return BuiltInRegistries.ITEM.getKey(this).getPath();}*/

    @Override
    public boolean canEquipFromUse(ItemStack stack)
    {
        return true;
    }

    @Override
    @Nullable
    public SoundEventData getEquipSound(ItemStack stack, SlotReference reference)
    {
        return new SoundEventData(SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 1.0F);
    }
}
