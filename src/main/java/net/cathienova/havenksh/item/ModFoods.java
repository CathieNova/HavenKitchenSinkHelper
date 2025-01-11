package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.cathienova.havenksh.item.ModItems.ITEMS;

public class ModFoods
{
    public static final DeferredRegister.Items FOOD =
            DeferredRegister.createItems(HavenKSH.MOD_ID);
    public static final FoodProperties blackberry_food = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties blueberry_food = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties raspberry_food = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodProperties strawberry_food = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).build();


    public static final DeferredItem<Item> blueberry = FOOD.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoods.blueberry_food)));
    public static final DeferredItem<Item> blackberry = FOOD.register("blackberry",
            () -> new Item(new Item.Properties().food(ModFoods.blackberry_food)));
    public static final DeferredItem<Item> raspberry = FOOD.register("raspberry",
            () -> new Item(new Item.Properties().food(ModFoods.raspberry_food)));
    public static final DeferredItem<Item> strawberry = FOOD.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.strawberry_food)));

    public static void register(IEventBus eventBus) {
        FOOD.register(eventBus);
    }
}
