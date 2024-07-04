package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.artifacts.Magnet;
import net.cathienova.havenksh.item.artifacts.RepairTalisman;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModArmor
{
    public static final DeferredRegister<Item> ARMOR =
            DeferredRegister.create(ForgeRegistries.ITEMS, HavenKSH.MOD_ID);
    // Wooden Armor
    public static final RegistryObject<Item> wooden_helmet = ARMOR.register("wooden_helmet",
            () -> new ModItemArmor(ModArmorMaterials.wooden, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(59)));

    public static final RegistryObject<Item> wooden_chestplate = ARMOR.register("wooden_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.wooden, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(59)));

    public static final RegistryObject<Item> wooden_leggings = ARMOR.register("wooden_leggings",
            () -> new ModItemArmor(ModArmorMaterials.wooden, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(59)));

    public static final RegistryObject<Item> wooden_boots = ARMOR.register("wooden_boots",
            () -> new ModItemArmor(ModArmorMaterials.wooden, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(59)));

    // Flint Armor
    public static final RegistryObject<Item> flint_helmet = ARMOR.register("flint_helmet",
            () -> new ModItemArmor(ModArmorMaterials.flint, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(16)));

    public static final RegistryObject<Item> flint_chestplate = ARMOR.register("flint_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.flint, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(16)));

    public static final RegistryObject<Item> flint_leggings = ARMOR.register("flint_leggings",
            () -> new ModItemArmor(ModArmorMaterials.flint, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(16)));

    public static final RegistryObject<Item> flint_boots = ARMOR.register("flint_boots",
            () -> new ModItemArmor(ModArmorMaterials.flint, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(16)));

    // Bone Armor
    public static final RegistryObject<Item> bone_helmet = ARMOR.register("bone_helmet",
            () -> new ModItemArmor(ModArmorMaterials.bone, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(78)));

    public static final RegistryObject<Item> bone_chestplate = ARMOR.register("bone_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.bone, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(78)));

    public static final RegistryObject<Item> bone_leggings = ARMOR.register("bone_leggings",
            () -> new ModItemArmor(ModArmorMaterials.bone, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(78)));

    public static final RegistryObject<Item> bone_boots = ARMOR.register("bone_boots",
            () -> new ModItemArmor(ModArmorMaterials.bone, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(78)));

    // Stone Armor
    public static final RegistryObject<Item> stone_helmet = ARMOR.register("stone_helmet",
            () -> new ModItemArmor(ModArmorMaterials.stone, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(131)));

    public static final RegistryObject<Item> stone_chestplate = ARMOR.register("stone_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.stone, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(131)));

    public static final RegistryObject<Item> stone_leggings = ARMOR.register("stone_leggings",
            () -> new ModItemArmor(ModArmorMaterials.stone, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(131)));

    public static final RegistryObject<Item> stone_boots = ARMOR.register("stone_boots",
            () -> new ModItemArmor(ModArmorMaterials.stone, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(131)));

    // Copper Armor
    public static final RegistryObject<Item> copper_helmet = ARMOR.register("copper_helmet",
            () -> new ModItemArmor(ModArmorMaterials.copper, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(250)));

    public static final RegistryObject<Item> copper_chestplate = ARMOR.register("copper_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.copper, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(250)));

    public static final RegistryObject<Item> copper_leggings = ARMOR.register("copper_leggings",
            () -> new ModItemArmor(ModArmorMaterials.copper, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(250)));

    public static final RegistryObject<Item> copper_boots = ARMOR.register("copper_boots",
            () -> new ModItemArmor(ModArmorMaterials.copper, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(250)));

    // Obsidian Armor
    public static final RegistryObject<Item> obsidian_helmet = ARMOR.register("obsidian_helmet",
            () -> new ModItemArmor(ModArmorMaterials.obsidian, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(12288)));

    public static final RegistryObject<Item> obsidian_chestplate = ARMOR.register("obsidian_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.obsidian, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(12288)));

    public static final RegistryObject<Item> obsidian_leggings = ARMOR.register("obsidian_leggings",
            () -> new ModItemArmor(ModArmorMaterials.obsidian, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(12288)));

    public static final RegistryObject<Item> obsidian_boots = ARMOR.register("obsidian_boots",
            () -> new ModItemArmor(ModArmorMaterials.obsidian, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(12288)));

    // Emerald Armor
    public static final RegistryObject<Item> emerald_helmet = ARMOR.register("emerald_helmet",
            () -> new ModItemArmor(ModArmorMaterials.emerald, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(1561)));

    public static final RegistryObject<Item> emerald_chestplate = ARMOR.register("emerald_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.emerald, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(1561)));

    public static final RegistryObject<Item> emerald_leggings = ARMOR.register("emerald_leggings",
            () -> new ModItemArmor(ModArmorMaterials.emerald, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(1561)));

    public static final RegistryObject<Item> emerald_boots = ARMOR.register("emerald_boots",
            () -> new ModItemArmor(ModArmorMaterials.emerald, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(1561)));

    // Dragon Armor
    public static final RegistryObject<Item> dragon_helmet = ARMOR.register("dragon_helmet",
            () -> new ModItemArmor(ModArmorMaterials.dragon, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1).defaultDurability(4096)));

    public static final RegistryObject<Item> dragon_chestplate = ARMOR.register("dragon_chestplate",
            () -> new ModItemArmor(ModArmorMaterials.dragon, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1).defaultDurability(4096)));

    public static final RegistryObject<Item> dragon_leggings = ARMOR.register("dragon_leggings",
            () -> new ModItemArmor(ModArmorMaterials.dragon, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1).defaultDurability(4096)));

    public static final RegistryObject<Item> dragon_boots = ARMOR.register("dragon_boots",
            () -> new ModItemArmor(ModArmorMaterials.dragon, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1).defaultDurability(4096)));


    public static final RegistryObject<Item> repair_talisman = ARMOR.register("repair_talisman",
            () -> new RepairTalisman(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> magnet = ARMOR.register("magnet",
            () -> new Magnet(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5));


    public static void register(IEventBus eventBus) {
        ARMOR.register(eventBus);
    }
}
