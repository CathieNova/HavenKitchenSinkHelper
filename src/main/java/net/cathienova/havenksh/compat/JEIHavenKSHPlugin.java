package net.cathienova.havenksh.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public class JEIHavenKSHPlugin implements IModPlugin
{
    @Override
    public ResourceLocation getPluginUid()
    {
        return ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration)
    {

    }

    @Override
    public void registerRecipes(IRecipeRegistration registration)
    {
        Component[] ore_hammer_description = new Component[] {
                Component.translatable("jei.havenksh.ore_hammer.desc.line1"),
                Component.literal(" "),
                Component.translatable("jei.havenksh.ore_hammer.desc.line2")
        };

        ItemStack copper_ore_hammer = new ItemStack(ModTools.copper_ore_hammer.get());
        registration.addIngredientInfo(copper_ore_hammer, VanillaTypes.ITEM_STACK, ore_hammer_description);

        ItemStack iron_ore_hammer = new ItemStack(ModTools.iron_ore_hammer.get());
        registration.addIngredientInfo(iron_ore_hammer, VanillaTypes.ITEM_STACK, ore_hammer_description);

        ItemStack gold_ore_hammer = new ItemStack(ModTools.gold_ore_hammer.get());
        registration.addIngredientInfo(gold_ore_hammer, VanillaTypes.ITEM_STACK, ore_hammer_description);

        ItemStack diamond_ore_hammer = new ItemStack(ModTools.diamond_ore_hammer.get());
        registration.addIngredientInfo(diamond_ore_hammer, VanillaTypes.ITEM_STACK, ore_hammer_description);

        ItemStack emerald_ore_hammer = new ItemStack(ModTools.emerald_ore_hammer.get());
        registration.addIngredientInfo(emerald_ore_hammer, VanillaTypes.ITEM_STACK, ore_hammer_description);

        ItemStack netherite_ore_hammer = new ItemStack(ModTools.netherite_ore_hammer.get());
        registration.addIngredientInfo(netherite_ore_hammer, VanillaTypes.ITEM_STACK, ore_hammer_description);

        Component[] trowelDescription = new Component[] {
                Component.translatable("jei.havenksh.trowel.desc.line1")
        };

        ItemStack trowel = new ItemStack(ModTools.trowel.get());
        registration.addIngredientInfo(trowel, VanillaTypes.ITEM_STACK, trowelDescription);

        Component[] barkDescription = new Component[] {
                Component.translatable("jei.havenksh.bark.desc.line1"),
                Component.literal(" "),
                Component.translatable("jei.havenksh.bark.desc.line2"),
                Component.literal(" "),
                Component.translatable("jei.havenksh.bark.desc.line3")
        };

        ItemStack acacia_bark = new ItemStack(ModItems.acacia_bark.get());
        registration.addIngredientInfo(acacia_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack birch_bark = new ItemStack(ModItems.birch_bark.get());
        registration.addIngredientInfo(birch_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack cherry_bark = new ItemStack(ModItems.cherry_bark.get());
        registration.addIngredientInfo(cherry_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack crimson_bark = new ItemStack(ModItems.crimson_bark.get());
        registration.addIngredientInfo(crimson_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack dark_oak_bark = new ItemStack(ModItems.dark_oak_bark.get());
        registration.addIngredientInfo(dark_oak_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack jungle_bark = new ItemStack(ModItems.jungle_bark.get());
        registration.addIngredientInfo(jungle_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack mangrove_bark = new ItemStack(ModItems.mangrove_bark.get());
        registration.addIngredientInfo(mangrove_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack oak_bark = new ItemStack(ModItems.oak_bark.get());
        registration.addIngredientInfo(oak_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack spruce_bark = new ItemStack(ModItems.spruce_bark.get());
        registration.addIngredientInfo(spruce_bark, VanillaTypes.ITEM_STACK, barkDescription);

        ItemStack warped_bark = new ItemStack(ModItems.warped_bark.get());
        registration.addIngredientInfo(warped_bark, VanillaTypes.ITEM_STACK, barkDescription);

        Component[] magnetDescription = new Component[] {
                Component.translatable("jei.havenksh.magnet.desc.line1")
        };

        ItemStack magnet = new ItemStack(ModArmor.magnet.get());
        registration.addIngredientInfo(magnet, VanillaTypes.ITEM_STACK, magnetDescription);

        Component[] repairTalismanDescription = new Component[] {
                Component.translatable("jei.havenksh.repair_talisman.desc.line1")
        };

        /*ItemStack repairTalisman = new ItemStack(ModArmor.repair_talisman.get());
        registration.addIngredientInfo(repairTalisman, VanillaTypes.ITEM_STACK, repairTalismanDescription);*/

        Component[] dragonscaleDescription = new Component[] {
                Component.translatable("jei.havenksh.dragonscale.desc.line1"),
                Component.literal(" "),
                Component.translatable("jei.havenksh.dragonscale.desc.line2")
        };
        registration.addIngredientInfo(new ItemStack(ModItems.dragon_scale.get()), VanillaTypes.ITEM_STACK, dragonscaleDescription);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration)
    {

    }
}
