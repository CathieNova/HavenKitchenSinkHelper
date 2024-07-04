package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.excavators.ExcavatorBase;
import net.cathienova.havenksh.item.hammers.HammerBase;
import net.cathienova.havenksh.item.orehammers.*;
import net.cathienova.havenksh.item.treechoppers.TreeChopperBase;
import net.cathienova.havenksh.util.ModToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools
{
    public static final DeferredRegister<Item> TOOLS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HavenKSH.MOD_ID);

    // Flint Tools and Weapons
    public static final RegistryObject<Item> flint_shovel = TOOLS.register("flint_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.1F, -3.0F, new Item.Properties().stacksTo(1).durability(16)));

    public static final RegistryObject<Item> flint_axe = TOOLS.register("flint_axe",
            () -> new AxeItem(Tiers.WOOD, 5.5F, -3.2F, new Item.Properties().stacksTo(1).durability(16)));

    public static final RegistryObject<Item> flint_pickaxe = TOOLS.register("flint_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties().stacksTo(1).durability(16)));

    public static final RegistryObject<Item> flint_hoe = TOOLS.register("flint_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties().stacksTo(1).durability(16)));

    public static final RegistryObject<Item> flint_sword = TOOLS.register("flint_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties().stacksTo(1).durability(16)));

    // Bone Tools and Weapons
    public static final RegistryObject<Item> bone_shovel = TOOLS.register("bone_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.1F, -3.0F, new Item.Properties().stacksTo(1).durability(78)));

    public static final RegistryObject<Item> bone_axe = TOOLS.register("bone_axe",
            () -> new AxeItem(Tiers.WOOD, 5.5F, -3.2F, new Item.Properties().stacksTo(1).durability(78)));

    public static final RegistryObject<Item> bone_pickaxe = TOOLS.register("bone_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties().stacksTo(1).durability(78)));

    public static final RegistryObject<Item> bone_hoe = TOOLS.register("bone_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3.0F, new Item.Properties().stacksTo(1).durability(78)));

    public static final RegistryObject<Item> bone_sword = TOOLS.register("bone_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties().stacksTo(1).durability(64)));

    // Emerald Tools and Weapons
    public static final RegistryObject<Item> emerald_shovel = TOOLS.register("emerald_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.4F, -3.0F, new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> emerald_axe = TOOLS.register("emerald_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5.0F, -3.2F, new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> emerald_pickaxe = TOOLS.register("emerald_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> emerald_hoe = TOOLS.register("emerald_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 0, -3.0F, new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> emerald_sword = TOOLS.register("emerald_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties().stacksTo(1).durability(1561)));

    // Obsidian Tools and Weapons
    public static final RegistryObject<Item> obsidian_shovel = TOOLS.register("obsidian_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.5F, -3.5F, new Item.Properties().stacksTo(1).durability(12288)));

    public static final RegistryObject<Item> obsidian_axe = TOOLS.register("obsidian_axe",
            () -> new AxeItem(Tiers.DIAMOND, 6.0F, -3.5F, new Item.Properties().stacksTo(1).durability(12288)));

    public static final RegistryObject<Item> obsidian_pickaxe = TOOLS.register("obsidian_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -3.2F, new Item.Properties().stacksTo(1).durability(12288)));

    public static final RegistryObject<Item> obsidian_hoe = TOOLS.register("obsidian_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 0, -3.5F, new Item.Properties().stacksTo(1).durability(12288)));

    public static final RegistryObject<Item> obsidian_sword = TOOLS.register("obsidian_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -3.0F, new Item.Properties().stacksTo(1).durability(12288)));

    // Wooden Tools and Weapons
    public static final RegistryObject<ShearsItem> wooden_shears = TOOLS.register("wooden_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).durability(32)));

    // Copper Tools and Weapons
    public static final RegistryObject<Item> copper_shovel = TOOLS.register("copper_shovel",
            () -> new ShovelItem(Tiers.STONE, 1.3F, -2.8F, new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> copper_axe = TOOLS.register("copper_axe",
            () -> new AxeItem(Tiers.STONE, 6.0F, -3.0F, new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> copper_pickaxe = TOOLS.register("copper_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> copper_hoe = TOOLS.register("copper_hoe",
            () -> new HoeItem(Tiers.STONE, 0, -3.0F, new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> copper_sword = TOOLS.register("copper_sword",
            () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> dragon_shovel = TOOLS.register("dragon_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, 1.5F, -2.0F, new Item.Properties().stacksTo(1).durability(4096)));

    public static final RegistryObject<Item> dragon_axe = TOOLS.register("dragon_axe",
            () -> new AxeItem(Tiers.NETHERITE, 7.0F, -2.0F, new Item.Properties().stacksTo(1).durability(4096)));

    public static final RegistryObject<Item> dragon_pickaxe = TOOLS.register("dragon_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 1, -1.8F, new Item.Properties().stacksTo(1).durability(4096)));

    public static final RegistryObject<Item> dragon_hoe = TOOLS.register("dragon_hoe",
            () -> new HoeItem(Tiers.NETHERITE, 0, -2.0F, new Item.Properties().stacksTo(1).durability(4096)));

    public static final RegistryObject<Item> dragon_sword = TOOLS.register("dragon_sword",
            () -> new SwordItem(Tiers.NETHERITE, 3, -1.4F, new Item.Properties().stacksTo(1).durability(4096)));

    public static final RegistryObject<BowItem> dragon_bow = TOOLS.register("dragon_bow",
            () -> new BowItem(new Item.Properties().stacksTo(1).durability(4096)));

    public static final RegistryObject<Item> dragon_shield = TOOLS.register("dragon_shield",
            () -> new ShieldItem(new Item.Properties().stacksTo(1).durability(4096)));

    public static final RegistryObject<Item> copper_ore_hammer = TOOLS.register("copper_ore_hammer",
            () -> new CopperOreHammer(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).defaultDurability(64)));

    public static final RegistryObject<Item> iron_ore_hammer = TOOLS.register("iron_ore_hammer",
            () -> new IronOreHammer(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).defaultDurability(128)));

    public static final RegistryObject<Item> gold_ore_hammer = TOOLS.register("gold_ore_hammer",
            () -> new GoldOreHammer(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).defaultDurability(256)));

    public static final RegistryObject<Item> diamond_ore_hammer = TOOLS.register("diamond_ore_hammer",
            () -> new DiamondOreHammer(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).defaultDurability(512)));

    public static final RegistryObject<Item> emerald_ore_hammer = TOOLS.register("emerald_ore_hammer",
            () -> new EmeraldOreHammer(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).defaultDurability(1024)));

    public static final RegistryObject<Item> netherite_ore_hammer = TOOLS.register("netherite_ore_hammer",
            () -> new NetheriteOreHammer(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).defaultDurability(2048)));

    public static final RegistryObject<Item> havenite_ore_hammer = TOOLS.register("havenite_ore_hammer",
            () -> new HaveniteOreHammer(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).defaultDurability(-1)));

    public static final RegistryObject<Item> stone_hammer = TOOLS.register("stone_hammer",
            () -> new HammerBase(ModToolTiers.stone, 1, -2.8F,
                    new Item.Properties().stacksTo(1).durability(131)));

    public static final RegistryObject<Item> copper_hammer = TOOLS.register("copper_hammer",
            () -> new HammerBase(ModToolTiers.iron, 1, -2.8F,
                    new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> iron_hammer = TOOLS.register("iron_hammer",
            () -> new HammerBase(ModToolTiers.iron, 2, -2.8F,
                    new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> golden_hammer = TOOLS.register("golden_hammer",
            () -> new HammerBase(ModToolTiers.gold, 3, -2.8F,
                    new Item.Properties().stacksTo(1).durability(169)));

    public static final RegistryObject<Item> diamond_hammer = TOOLS.register("diamond_hammer",
            () -> new HammerBase(ModToolTiers.diamond, 4, -2.8F,
                    new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> emerald_hammer = TOOLS.register("emerald_hammer",
            () -> new HammerBase(ModToolTiers.diamond, 4, -2.8F,
                    new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> netherite_hammer = TOOLS.register("netherite_hammer",
            () -> new HammerBase(ModToolTiers.netherite, 5, -2.8F,
                    new Item.Properties().stacksTo(1).durability(2031)));

    public static final RegistryObject<Item> havenite_hammer = TOOLS.register("havenite_hammer",
            () -> new HammerBase(ModToolTiers.netherite, 6, -2.4F,
                    new Item.Properties().stacksTo(1).durability(-1)));

    public static final RegistryObject<Item> stone_excavator = TOOLS.register("stone_excavator",
            () -> new ExcavatorBase(ModToolTiers.stone, 1, -2.8F,
                    new Item.Properties().stacksTo(1).durability(131)));

    public static final RegistryObject<Item> copper_excavator = TOOLS.register("copper_excavator",
            () -> new ExcavatorBase(ModToolTiers.iron, 1, -2.8F,
                    new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> iron_excavator = TOOLS.register("iron_excavator",
            () -> new ExcavatorBase(ModToolTiers.iron, 2, -2.8F,
                    new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> golden_excavator = TOOLS.register("golden_excavator",
            () -> new ExcavatorBase(ModToolTiers.gold, 3, -2.8F,
                    new Item.Properties().stacksTo(1).durability(169)));

    public static final RegistryObject<Item> diamond_excavator = TOOLS.register("diamond_excavator",
            () -> new ExcavatorBase(ModToolTiers.diamond, 4, -2.8F,
                    new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> emerald_excavator = TOOLS.register("emerald_excavator",
            () -> new ExcavatorBase(ModToolTiers.diamond, 4, -2.8F,
                    new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> netherite_excavator = TOOLS.register("netherite_excavator",
            () -> new ExcavatorBase(ModToolTiers.netherite, 5, -2.8F,
                    new Item.Properties().stacksTo(1).durability(2031)));

    public static final RegistryObject<Item> havenite_excavator = TOOLS.register("havenite_excavator",
            () -> new ExcavatorBase(ModToolTiers.netherite, 6, -2.4F,
                    new Item.Properties().stacksTo(1).durability(-1)));

    public static final RegistryObject<Item> stone_chopper = TOOLS.register("stone_chopper",
            () -> new TreeChopperBase(ModToolTiers.stone, 1, -2.8F,
                    new Item.Properties().stacksTo(1).durability(131)));
    public static final RegistryObject<Item> copper_chopper = TOOLS.register("copper_chopper",
            () -> new TreeChopperBase(ModToolTiers.iron, 1, -2.8F,
                    new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> iron_chopper = TOOLS.register("iron_chopper",
            () -> new TreeChopperBase(ModToolTiers.iron, 2, -2.8F,
                    new Item.Properties().stacksTo(1).durability(250)));

    public static final RegistryObject<Item> golden_chopper = TOOLS.register("golden_chopper",
            () -> new TreeChopperBase(ModToolTiers.gold, 3, -2.8F,
                    new Item.Properties().stacksTo(1).durability(169)));

    public static final RegistryObject<Item> diamond_chopper = TOOLS.register("diamond_chopper",
            () -> new TreeChopperBase(ModToolTiers.diamond, 4, -2.8F,
                    new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> emerald_chopper = TOOLS.register("emerald_chopper",
            () -> new TreeChopperBase(ModToolTiers.diamond, 4, -2.8F,
                    new Item.Properties().stacksTo(1).durability(1561)));

    public static final RegistryObject<Item> netherite_chopper = TOOLS.register("netherite_chopper",
            () -> new TreeChopperBase(ModToolTiers.netherite, 5, -2.8F,
                    new Item.Properties().stacksTo(1).durability(2031)));

    public static final RegistryObject<Item> havenite_chopper = TOOLS.register("havenite_chopper",
            () -> new TreeChopperBase(ModToolTiers.netherite, 6, -2.4F,
                    new Item.Properties().stacksTo(1).durability(-1)));

    public static final RegistryObject<Item> trowel = TOOLS.register("trowel",
            () -> new TrowelItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).durability(512)));

    public static void register(IEventBus eventBus) {
        TOOLS.register(eventBus);
    }
}
