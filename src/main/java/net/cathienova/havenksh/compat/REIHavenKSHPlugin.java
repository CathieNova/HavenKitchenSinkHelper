package net.cathienova.havenksh.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.forge.REIPluginClient;
import net.cathienova.havenksh.compat.rei.ItemInfoCategory;
import net.cathienova.havenksh.compat.rei.ItemInfoDisplay;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

@REIPluginClient
public class REIHavenKSHPlugin implements REIClientPlugin {
    private static final Map<Item, Component[]> ITEM_DESCRIPTIONS = new HashMap<>();

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new ItemInfoCategory());
    }
    static Component[] ore_hammer_description = new Component[] {
            Component.translatable("jei.havenksh.ore_hammer.desc.line1"),
            Component.literal(" "),
            Component.translatable("jei.havenksh.ore_hammer.desc.line2")
    };

    static Component[] trowelDescription = new Component[] {
            Component.translatable("jei.havenksh.trowel.desc.line1")
    };

    static Component[] barkDescription = new Component[] {
            Component.translatable("jei.havenksh.bark.desc.line1"),
            Component.literal(" "),
            Component.translatable("jei.havenksh.bark.desc.line2"),
            Component.literal(" "),
            Component.translatable("jei.havenksh.bark.desc.line3")
    };

    static Component[] magnetDescription = new Component[] {
            Component.translatable("jei.havenksh.magnet.desc.line1")
    };

    static Component[] dragonscaleDescription = new Component[] {
            Component.translatable("jei.havenksh.dragonscale.desc.line1"),
            Component.literal(" "),
            Component.translatable("jei.havenksh.dragonscale.desc.line2")
    };

    public static void populateItemDescriptions() {
        // Ore Hammer
        ITEM_DESCRIPTIONS.put(ModTools.copper_ore_hammer.get(), ore_hammer_description);
        ITEM_DESCRIPTIONS.put(ModTools.iron_ore_hammer.get(), ore_hammer_description);
        ITEM_DESCRIPTIONS.put(ModTools.gold_ore_hammer.get(), ore_hammer_description);
        ITEM_DESCRIPTIONS.put(ModTools.diamond_ore_hammer.get(), ore_hammer_description);
        ITEM_DESCRIPTIONS.put(ModTools.emerald_ore_hammer.get(), ore_hammer_description);
        ITEM_DESCRIPTIONS.put(ModTools.netherite_ore_hammer.get(), ore_hammer_description);

        // Bark
        ITEM_DESCRIPTIONS.put(ModItems.acacia_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.birch_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.cherry_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.crimson_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.dark_oak_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.jungle_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.mangrove_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.oak_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.spruce_bark.get(), barkDescription);
        ITEM_DESCRIPTIONS.put(ModItems.warped_bark.get(), barkDescription);

        // Magnet
        ITEM_DESCRIPTIONS.put(ModArmor.magnet.get(), magnetDescription);

        // Dragonscale
        ITEM_DESCRIPTIONS.put(ModItems.dragon_scale.get(), dragonscaleDescription);
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        // Loop through the map and register each item-description pair
        ITEM_DESCRIPTIONS.forEach((item, description) -> {
            registry.add(new ItemInfoDisplay(item, description));
        });
    }
}
