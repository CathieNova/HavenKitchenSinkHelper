package net.cathienova.havenksh.item;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial
{
    wooden("wooden", 5, new int[] {1, 1, 1, 1}, 10, SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F, 0.0F, () -> Ingredient.of(Items.OAK_PLANKS)),
    flint("flint", 0, new int[] {1, 2, 2, 1}, 10, SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F, 0.0F, () -> Ingredient.of(Items.FLINT)),
    bone("bone", 0, new int[] {1, 2, 2, 1}, 15, SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F, 0.0F, () -> Ingredient.of(Items.BONE)),
    copper("copper", 0, new int[] {2, 5, 3, 1}, 20, SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F, 0.0F, () -> Ingredient.of(Items.COPPER_INGOT)),
    stone("stone", 0, new int[] {1, 1, 1, 1}, 10, SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F, 0.0F, () -> Ingredient.of(Items.STONE)),
    obsidian("obsidian", 0, new int[] {1, 3, 4, 2}, 25, SoundEvents.ARMOR_EQUIP_CHAIN,
            3.0F, 0.0F, () -> Ingredient.of(Items.OBSIDIAN)),
    emerald("emerald", 0, new int[] {2, 7, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_CHAIN,
            2.0F, 0.0F, () -> Ingredient.of(Items.EMERALD)),
    dragon("dragon", 0, new int[] {1, 3, 4, 2}, 25, SoundEvents.ARMOR_EQUIP_CHAIN,
            4.0F, 0.4F, () -> Ingredient.of(ModItems.dragon_scale.get())),

    ;

    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient)
    {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType)
    {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType)
    {
        return this.slotProtections[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }

    @Override
    public String getName()
    {
        return HavenKSH.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }
}
