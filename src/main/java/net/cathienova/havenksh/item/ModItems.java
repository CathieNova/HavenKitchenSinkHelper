package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.bark.*;
import net.cathienova.havenksh.item.cobblegen.*;
import net.cathienova.havenksh.item.fuel.FuelItem;
import net.cathienova.havenksh.item.wateringcans.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HavenKSH.MOD_ID);

    public static final DeferredItem<Item> empty_iron_watering_can = ITEMS.register("empty_iron_watering_can",
            () -> new EmptyIronWateringCan(new Item.Properties()));

    public static final DeferredItem<Item> iron_watering_can = ITEMS.register("iron_watering_can",
            () -> new IronWateringCan(new Item.Properties().durability(64)));

    public static final DeferredItem<Item> dragon_scale = ITEMS.register("dragon_scale",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> mini_coal = ITEMS.register("mini_coal",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final DeferredItem<Item> mini_charcoal = ITEMS.register("mini_charcoal",
            () -> new FuelItem(new Item.Properties(), 200));

    // Nugget Resources
    public static final DeferredItem<Item> copper_nugget = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> diamond_nugget = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> emerald_nugget = ITEMS.register("emerald_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> netherite_nugget = ITEMS.register("netherite_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> lapis_nugget = ITEMS.register("lapis_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> quartz_nugget = ITEMS.register("quartz_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> redstone_nugget = ITEMS.register("redstone_nugget",
            () -> new Item(new Item.Properties()));

    // Dust Resources
    public static final DeferredItem<Item> copper_dust = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> iron_dust = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> gold_dust = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> tin_dust = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> netherite_dust = ITEMS.register("netherite_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> lead_dust = ITEMS.register("lead_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> silver_dust = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> nickel_dust = ITEMS.register("nickel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> uranium_dust = ITEMS.register("uranium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> osmium_dust = ITEMS.register("osmium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> zinc_dust = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> aluminum_dust = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties()));

    // Ingot Resources
    public static final DeferredItem<Item> tin_ingot = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> lead_ingot = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> silver_ingot = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> nickel_ingot = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> uranium_ingot = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> osmium_ingot = ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> zinc_ingot = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> aluminum_ingot = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> havenite_ingot = ITEMS.register("havenite_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> raw_havenite = ITEMS.register("raw_havenite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> havenite_dust = ITEMS.register("havenite_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> havenite_nugget = ITEMS.register("havenite_nugget",
            () -> new Item(new Item.Properties()));

    // Bark
    public static final DeferredItem<Item> acacia_bark = ITEMS.register("acacia_bark",
            () -> new AcaciaBark(new Item.Properties()));

    public static final DeferredItem<Item> birch_bark = ITEMS.register("birch_bark",
            () -> new BirchBark(new Item.Properties()));

    public static final DeferredItem<Item> cherry_bark = ITEMS.register("cherry_bark",
            () -> new CherryBark(new Item.Properties()));

    public static final DeferredItem<Item> crimson_bark = ITEMS.register("crimson_bark",
            () -> new CrimsonBark(new Item.Properties()));

    public static final DeferredItem<Item> dark_oak_bark = ITEMS.register("dark_oak_bark",
            () -> new DarkOakBark(new Item.Properties()));

    public static final DeferredItem<Item> jungle_bark = ITEMS.register("jungle_bark",
            () -> new JungleBark(new Item.Properties()));

    public static final DeferredItem<Item> mangrove_bark = ITEMS.register("mangrove_bark",
            () -> new MangroveBark(new Item.Properties()));

    public static final DeferredItem<Item> oak_bark = ITEMS.register("oak_bark",
            () -> new OakBark(new Item.Properties()));

    public static final DeferredItem<Item> spruce_bark = ITEMS.register("spruce_bark",
            () -> new SpruceBark(new Item.Properties()));

    public static final DeferredItem<Item> warped_bark = ITEMS.register("warped_bark",
            () -> new WarpedBark(new Item.Properties()));

    // Research Tiers
    public static final DeferredItem<Item> research_tier_basic = ITEMS.register("research_tier_basic",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> research_tier_intermediate = ITEMS.register("research_tier_intermediate",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> research_tier_advanced = ITEMS.register("research_tier_advanced",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> research_tier_elite = ITEMS.register("research_tier_elite",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> research_tier_ultimate = ITEMS.register("research_tier_ultimate",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));

    public static final DeferredItem<Item> dice = ITEMS.register("dice",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> cobble_gen_upgrade_wooden = ITEMS.register("cobble_gen_upgrade_wooden",
            () -> new CobbleGenUpgradeWooden(new Item.Properties()));

    public static final DeferredItem<Item> cobble_gen_upgrade_stone = ITEMS.register("cobble_gen_upgrade_stone",
            () -> new CobbleGenUpgradeStone(new Item.Properties()));

    public static final DeferredItem<Item> cobble_gen_upgrade_iron = ITEMS.register("cobble_gen_upgrade_iron",
            () -> new CobbleGenUpgradeIron(new Item.Properties()));

    public static final DeferredItem<Item> cobble_gen_upgrade_gold = ITEMS.register("cobble_gen_upgrade_gold",
            () -> new CobbleGenUpgradeGold(new Item.Properties()));

    public static final DeferredItem<Item> cobble_gen_upgrade_diamond = ITEMS.register("cobble_gen_upgrade_diamond",
            () -> new CobbleGenUpgradeDiamond(new Item.Properties()));

    public static final DeferredItem<Item> cobble_gen_upgrade_emerald = ITEMS.register("cobble_gen_upgrade_emerald",
            () -> new CobbleGenUpgradeEmerald(new Item.Properties()));

    public static final DeferredItem<Item> cobble_gen_upgrade_netherite = ITEMS.register("cobble_gen_upgrade_netherite",
            () -> new CobbleGenUpgradeNetherite(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
