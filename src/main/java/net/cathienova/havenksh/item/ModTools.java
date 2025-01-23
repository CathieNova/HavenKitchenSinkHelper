package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.util.ModToolTiers;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTools
{
    public static final DeferredRegister.Items TOOLS = DeferredRegister.createItems(HavenKSH.MOD_ID);

    // Flint Tools and Weapons
    public static final DeferredItem<Item> flint_shovel = TOOLS.register("flint_shovel",
            () -> new ShovelItem(Tiers.WOOD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.WOOD,1.1F, -3.0F))
                    .stacksTo(1).durability(16)));

    public static final DeferredItem<Item> flint_axe = TOOLS.register("flint_axe",
            () -> new AxeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.WOOD, 5.5F, -3.2F))
                    .stacksTo(1).durability(16)));

    public static final DeferredItem<Item> flint_pickaxe = TOOLS.register("flint_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.WOOD, 1, -2.8F))
                    .stacksTo(1).durability(16)));

    public static final DeferredItem<Item> flint_hoe = TOOLS.register("flint_hoe",
            () -> new HoeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.WOOD, 0, -3.0F))
                    .stacksTo(1).durability(16)));

    public static final DeferredItem<Item> flint_sword = TOOLS.register("flint_sword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD,3, -2.4F))
                    .stacksTo(1).durability(16)));

    // Bone Tools and Weapons
    public static final DeferredItem<Item> bone_shovel = TOOLS.register("bone_shovel",
            () -> new ShovelItem(Tiers.WOOD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.WOOD,1.1F, -3.0F))
                    .stacksTo(1).durability(78)));

    public static final DeferredItem<Item> bone_axe = TOOLS.register("bone_axe",
            () -> new AxeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.WOOD, 5.5F, -3.2F))
                    .stacksTo(1).durability(78)));

    public static final DeferredItem<Item> bone_pickaxe = TOOLS.register("bone_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.WOOD, 1, -2.8F))
                    .stacksTo(1).durability(78)));

    public static final DeferredItem<Item> bone_hoe = TOOLS.register("bone_hoe",
            () -> new HoeItem(Tiers.WOOD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.WOOD, 0, -3.0F))
                    .stacksTo(1).durability(78)));

    public static final DeferredItem<Item> bone_sword = TOOLS.register("bone_sword",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD,3, -2.4F))
                    .stacksTo(1).durability(64)));

    // Emerald Tools and Weapons
    public static final DeferredItem<Item> emerald_shovel = TOOLS.register("emerald_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.DIAMOND, 1.5F, -3.0F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> emerald_axe = TOOLS.register("emerald_axe",
            () -> new AxeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.DIAMOND, 5.0F, -3.2F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> emerald_pickaxe = TOOLS.register("emerald_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1, -2.8F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> emerald_hoe = TOOLS.register("emerald_hoe",
            () -> new HoeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.DIAMOND, 0, -3.0F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> emerald_sword = TOOLS.register("emerald_sword",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 3, -2.4F))
                    .stacksTo(1).durability(1561)));

    // Obsidian Tools and Weapons
    public static final DeferredItem<Item> obsidian_shovel = TOOLS.register("obsidian_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.DIAMOND, 1.5F, -3.5F))
                    .stacksTo(1).durability(12288)));

    public static final DeferredItem<Item> obsidian_axe = TOOLS.register("obsidian_axe",
            () -> new AxeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.DIAMOND, 6.0F, -3.5F))
                    .stacksTo(1).durability(12288)));

    public static final DeferredItem<Item> obsidian_pickaxe = TOOLS.register("obsidian_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 1, -3.2F))
                    .stacksTo(1).durability(12288)));

    public static final DeferredItem<Item> obsidian_hoe = TOOLS.register("obsidian_hoe",
            () -> new HoeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.DIAMOND, 0, -3.5F))
                    .stacksTo(1).durability(12288)));

    public static final DeferredItem<Item> obsidian_sword = TOOLS.register("obsidian_sword",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 3, -3.0F))
                    .stacksTo(1).durability(12288)));

    // Wooden Tools and Weapons
    public static final DeferredItem<ShearsItem> wooden_shears = TOOLS.register("wooden_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).durability(32)));

    // Copper Tools and Weapons
    public static final DeferredItem<Item> copper_shovel = TOOLS.register("copper_shovel",
            () -> new ShovelItem(Tiers.STONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.STONE, 1.3F, -2.8F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> copper_axe = TOOLS.register("copper_axe",
            () -> new AxeItem(Tiers.STONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.STONE, 6.0F, -3.0F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> copper_pickaxe = TOOLS.register("copper_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.STONE, 1, -2.8F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> copper_hoe = TOOLS.register("copper_hoe",
            () -> new HoeItem(Tiers.STONE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.STONE, 0, -3.0F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> copper_sword = TOOLS.register("copper_sword",
            () -> new SwordItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 3, -2.4F))
                    .stacksTo(1).durability(250)));

    // Dragon Tools and Weapons
    public static final DeferredItem<Item> dragon_shovel = TOOLS.register("dragon_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 1.5F, -2.0F))
                    .stacksTo(1).durability(4096)));

    public static final DeferredItem<Item> dragon_axe = TOOLS.register("dragon_axe",
            () -> new AxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 7.0F, -2.0F))
                    .stacksTo(1).durability(4096)));

    public static final DeferredItem<Item> dragon_pickaxe = TOOLS.register("dragon_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 1, -1.8F))
                    .stacksTo(1).durability(4096)));

    public static final DeferredItem<Item> dragon_hoe = TOOLS.register("dragon_hoe",
            () -> new HoeItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(Tiers.NETHERITE, 0, -2.0F))
                    .stacksTo(1).durability(4096)));

    public static final DeferredItem<Item> dragon_sword = TOOLS.register("dragon_sword",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 3, -1.4F))
                    .stacksTo(1).durability(4096)));

    public static final DeferredItem<BowItem> dragon_bow = TOOLS.register("dragon_bow",
            () -> new BowItem(new Item.Properties().stacksTo(1).durability(4096)));

    public static final DeferredItem<Item> dragon_shield = TOOLS.register("dragon_shield",
            () -> new ShieldItem(new Item.Properties().stacksTo(1).durability(4096)));

    public static final DeferredItem<Item> copper_ore_hammer = TOOLS.register("copper_ore_hammer",
            () -> new OreHammerBase(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).durability(64)));

    public static final DeferredItem<Item> iron_ore_hammer = TOOLS.register("iron_ore_hammer",
            () -> new OreHammerBase(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).durability(128)));

    public static final DeferredItem<Item> gold_ore_hammer = TOOLS.register("gold_ore_hammer",
            () -> new OreHammerBase(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).durability(256)));

    public static final DeferredItem<Item> diamond_ore_hammer = TOOLS.register("diamond_ore_hammer",
            () -> new OreHammerBase(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).durability(512)));

    public static final DeferredItem<Item> emerald_ore_hammer = TOOLS.register("emerald_ore_hammer",
            () -> new OreHammerBase(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).durability(1024)));

    public static final DeferredItem<Item> netherite_ore_hammer = TOOLS.register("netherite_ore_hammer",
            () -> new OreHammerBase(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).durability(2048)));

    public static final DeferredItem<Item> havenite_ore_hammer = TOOLS.register("havenite_ore_hammer",
            () -> new OreHammerBase(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).durability(50000)));

    public static final DeferredItem<Item> stone_hammer = TOOLS.register("stone_hammer",
            () -> new HammerBase(ModToolTiers.stone, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.STONE, 1, -3.8F))
                    .stacksTo(1).durability(131)));

    public static final DeferredItem<Item> copper_hammer = TOOLS.register("copper_hammer",
            () -> new HammerBase(ModToolTiers.iron, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 1, -3.8F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> iron_hammer = TOOLS.register("iron_hammer",
            () -> new HammerBase(ModToolTiers.iron, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 2, -3.8F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> golden_hammer = TOOLS.register("golden_hammer",
            () -> new HammerBase(ModToolTiers.gold, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.GOLD, 3, -3.8F))
                    .stacksTo(1).durability(169)));

    public static final DeferredItem<Item> diamond_hammer = TOOLS.register("diamond_hammer",
            () -> new HammerBase(ModToolTiers.diamond, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 4, -3.8F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> emerald_hammer = TOOLS.register("emerald_hammer",
            () -> new HammerBase(ModToolTiers.diamond, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 4, -3.8F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> netherite_hammer = TOOLS.register("netherite_hammer",
            () -> new HammerBase(ModToolTiers.netherite, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 5, -3.8F))
                    .stacksTo(1).durability(2031)));

    public static final DeferredItem<Item> havenite_hammer = TOOLS.register("havenite_hammer",
            () -> new HammerBase(ModToolTiers.havenite, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.havenite, 6, -3.4F))
                    .stacksTo(1).durability(50000)));

    public static final DeferredItem<Item> stone_excavator = TOOLS.register("stone_excavator",
            () -> new ExcavatorBase(ModToolTiers.stone, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.STONE, 1, -2.8F))
                    .stacksTo(1).durability(131)));

    public static final DeferredItem<Item> copper_excavator = TOOLS.register("copper_excavator",
            () -> new ExcavatorBase(ModToolTiers.iron, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.IRON, 1, -2.8F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> iron_excavator = TOOLS.register("iron_excavator",
            () -> new ExcavatorBase(ModToolTiers.iron, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.IRON, 2, -2.8F))
                    .stacksTo(1).durability(250)));

    public static final DeferredItem<Item> golden_excavator = TOOLS.register("golden_excavator",
            () -> new ExcavatorBase(ModToolTiers.gold, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.GOLD, 3, -2.8F))
                    .stacksTo(1).durability(169)));

    public static final DeferredItem<Item> diamond_excavator = TOOLS.register("diamond_excavator",
            () -> new ExcavatorBase(ModToolTiers.diamond, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.DIAMOND, 4, -2.8F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> emerald_excavator = TOOLS.register("emerald_excavator",
            () -> new ExcavatorBase(ModToolTiers.diamond, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.DIAMOND, 4, -2.8F))
                    .stacksTo(1).durability(1561)));

    public static final DeferredItem<Item> netherite_excavator = TOOLS.register("netherite_excavator",
            () -> new ExcavatorBase(ModToolTiers.netherite, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(Tiers.NETHERITE, 5, -2.8F))
                    .stacksTo(1).durability(2031)));

    public static final DeferredItem<Item> havenite_excavator = TOOLS.register("havenite_excavator",
            () -> new ExcavatorBase(ModToolTiers.havenite, new Item.Properties()
                    .attributes(DiggerItem.createAttributes(ModToolTiers.havenite, 6, -2.4F))
                    .stacksTo(1).durability(50000)));

    public static final DeferredItem<Item> stone_chopper = TOOLS.register("stone_chopper",
            () -> new ChopperBase(ModToolTiers.stone, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.STONE, 1,  -2.8F))
                    .stacksTo(1).durability(131), 131));

    public static final DeferredItem<Item> copper_chopper = TOOLS.register("copper_chopper",
            () -> new ChopperBase(ModToolTiers.iron, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.IRON, 1,  -2.8F))
                    .stacksTo(1).durability(250), 250));

    public static final DeferredItem<Item> iron_chopper = TOOLS.register("iron_chopper",
            () -> new ChopperBase(ModToolTiers.iron, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.IRON, 2,  -2.8F))
                    .stacksTo(1).durability(250), 250));

    public static final DeferredItem<Item> golden_chopper = TOOLS.register("golden_chopper",
            () -> new ChopperBase(ModToolTiers.gold, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.GOLD, 3,  -2.8F))
                    .stacksTo(1).durability(169), 169));

    public static final DeferredItem<Item> diamond_chopper = TOOLS.register("diamond_chopper",
            () -> new ChopperBase(ModToolTiers.diamond, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.DIAMOND, 4,  -2.8F))
                    .stacksTo(1).durability(1561), 1561));

    public static final DeferredItem<Item> emerald_chopper = TOOLS.register("emerald_chopper",
            () -> new ChopperBase(ModToolTiers.diamond, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.DIAMOND, 4,  -2.8F))
                    .stacksTo(1).durability(1561), 1561));

    public static final DeferredItem<Item> netherite_chopper = TOOLS.register("netherite_chopper",
            () -> new ChopperBase(ModToolTiers.netherite, new Item.Properties()
                    .attributes(AxeItem.createAttributes(Tiers.NETHERITE, 5,  -2.8F))
                    .stacksTo(1).durability(2031), 2031));

    public static final DeferredItem<Item> havenite_chopper = TOOLS.register("havenite_chopper",
            () -> new ChopperBase(ModToolTiers.havenite, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.havenite, 6,  -2.4F))
                    .stacksTo(1).durability(50000), 50000));

    public static void register(IEventBus eventBus) {
        TOOLS.register(eventBus);
    }
}
