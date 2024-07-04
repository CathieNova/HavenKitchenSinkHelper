package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.cathienova.havenksh.item.ModItems.ITEMS;

public class ModFoods
{
    public static final DeferredRegister<Item> FOOD =
            DeferredRegister.create(ForgeRegistries.ITEMS, HavenKSH.MOD_ID);
    public static final FoodProperties blackberry_food = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties blueberry_food = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties raspberry_food = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties strawberry_food = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();


    public static final RegistryObject<Item> blueberry = FOOD.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoods.blueberry_food)));
    public static final RegistryObject<Item> blackberry = FOOD.register("blackberry",
            () -> new Item(new Item.Properties().food(ModFoods.blackberry_food)));
    public static final RegistryObject<Item> raspberry = FOOD.register("raspberry",
            () -> new Item(new Item.Properties().food(ModFoods.raspberry_food)));
    public static final RegistryObject<Item> strawberry = FOOD.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.strawberry_food)));

    public static void register(IEventBus eventBus) {
        FOOD.register(eventBus);
    }
}
