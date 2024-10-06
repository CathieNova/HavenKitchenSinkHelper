package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.item.ModArmor;
import net.cathienova.havenksh.item.ModItems;
import net.cathienova.havenksh.item.ModTools;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HavenKSH.MOD_ID, existingFileHelper);
    }
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    @Override
    protected void registerModels()
    {
        simpleItem(ModItems.dice);

        handHeldItem(ModTools.copper_ore_hammer);
        handHeldItem(ModTools.iron_ore_hammer);
        handHeldItem(ModTools.gold_ore_hammer);
        handHeldItem(ModTools.diamond_ore_hammer);
        handHeldItem(ModTools.emerald_ore_hammer);
        handHeldItem(ModTools.netherite_ore_hammer);
        handHeldItem(ModTools.havenite_ore_hammer);

        handHeldItem(ModTools.stone_crusher);
        handHeldItem(ModTools.iron_crusher);
        handHeldItem(ModTools.golden_crusher);
        handHeldItem(ModTools.diamond_crusher);
        handHeldItem(ModTools.netherite_crusher);
        handHeldItem(ModTools.havenite_crusher);

        simpleItem(ModItems.diamond_nugget);
        simpleItem(ModItems.emerald_nugget);
        simpleItem(ModItems.netherite_nugget);
        simpleItem(ModItems.lapis_nugget);
        simpleItem(ModItems.quartz_nugget);
        simpleItem(ModItems.redstone_nugget);
        simpleItem(ModItems.copper_nugget);
        simpleItem(ModItems.mini_coal);
        simpleItem(ModItems.mini_charcoal);

        simpleItem(ModItems.oak_bark);
        simpleItem(ModItems.spruce_bark);
        simpleItem(ModItems.birch_bark);
        simpleItem(ModItems.jungle_bark);
        simpleItem(ModItems.acacia_bark);
        simpleItem(ModItems.dark_oak_bark);
        simpleItem(ModItems.crimson_bark);
        simpleItem(ModItems.warped_bark);
        simpleItem(ModItems.cherry_bark);
        simpleItem(ModItems.mangrove_bark);

        simpleItem(ModItems.dragon_scale);
        simpleItem(ModItems.empty_iron_watering_can);
        simpleItem(ModItems.iron_watering_can);

        simpleItem(ModItems.copper_dust);
        simpleItem(ModItems.tin_dust);
        simpleItem(ModItems.tin_ingot);
        simpleItem(ModItems.netherite_dust);
        simpleItem(ModItems.iron_dust);
        simpleItem(ModItems.gold_dust);
        simpleItem(ModItems.lead_dust);
        simpleItem(ModItems.lead_ingot);
        simpleItem(ModItems.silver_dust);
        simpleItem(ModItems.silver_ingot);
        simpleItem(ModItems.nickel_dust);
        simpleItem(ModItems.nickel_ingot);
        simpleItem(ModItems.uranium_dust);
        simpleItem(ModItems.uranium_ingot);
        simpleItem(ModItems.osmium_dust);
        simpleItem(ModItems.osmium_ingot);
        simpleItem(ModItems.zinc_dust);
        simpleItem(ModItems.zinc_ingot);
        simpleItem(ModItems.aluminum_dust);
        simpleItem(ModItems.aluminum_ingot);
        simpleItem(ModItems.havenite_dust);
        simpleItem(ModItems.havenite_ingot);
        simpleItem(ModItems.havenite_nugget);
        simpleItem(ModItems.raw_havenite);

        simpleItem(ModItems.research_tier_basic);
        simpleItem(ModItems.research_tier_intermediate);
        simpleItem(ModItems.research_tier_advanced);
        simpleItem(ModItems.research_tier_elite);
        simpleItem(ModItems.research_tier_ultimate);

        handHeldItem(ModTools.trowel);

        simpleItem(ModArmor.magnet);
        simpleItem(ModArmor.repair_talisman);
        simpleItem(ModItems.cobble_gen_upgrade_wooden);
        simpleItem(ModItems.cobble_gen_upgrade_stone);
        simpleItem(ModItems.cobble_gen_upgrade_iron);
        simpleItem(ModItems.cobble_gen_upgrade_gold);
        simpleItem(ModItems.cobble_gen_upgrade_diamond);
        simpleItem(ModItems.cobble_gen_upgrade_emerald);
        simpleItem(ModItems.cobble_gen_upgrade_netherite);

        handHeldItem(ModTools.stone_hammer);
        handHeldItem(ModTools.copper_hammer);
        handHeldItem(ModTools.iron_hammer);
        handHeldItem(ModTools.golden_hammer);
        handHeldItem(ModTools.diamond_hammer);
        handHeldItem(ModTools.emerald_hammer);
        handHeldItem(ModTools.netherite_hammer);
        handHeldItem(ModTools.havenite_hammer);

        handHeldItem(ModTools.stone_excavator);
        handHeldItem(ModTools.copper_excavator);
        handHeldItem(ModTools.iron_excavator);
        handHeldItem(ModTools.golden_excavator);
        handHeldItem(ModTools.diamond_excavator);
        handHeldItem(ModTools.emerald_excavator);
        handHeldItem(ModTools.netherite_excavator);
        handHeldItem(ModTools.havenite_excavator);

        handHeldItem(ModTools.stone_chopper);
        handHeldItem(ModTools.copper_chopper);
        handHeldItem(ModTools.iron_chopper);
        handHeldItem(ModTools.golden_chopper);
        handHeldItem(ModTools.diamond_chopper);
        handHeldItem(ModTools.emerald_chopper);
        handHeldItem(ModTools.netherite_chopper);
        handHeldItem(ModTools.havenite_chopper);

        trimmedArmorItem(ModArmor.wooden_helmet);
        trimmedArmorItem(ModArmor.wooden_chestplate);
        trimmedArmorItem(ModArmor.wooden_leggings);
        trimmedArmorItem(ModArmor.wooden_boots);
        ShearsItem(ModTools.wooden_shears);

        trimmedArmorItem(ModArmor.bone_helmet);
        trimmedArmorItem(ModArmor.bone_chestplate);
        trimmedArmorItem(ModArmor.bone_leggings);
        trimmedArmorItem(ModArmor.bone_boots);
        handHeldItem(ModTools.bone_shovel);
        handHeldItem(ModTools.bone_axe);
        handHeldItem(ModTools.bone_pickaxe);
        handHeldItem(ModTools.bone_sword);
        handHeldItem(ModTools.bone_hoe);

        trimmedArmorItem(ModArmor.flint_boots);
        trimmedArmorItem(ModArmor.flint_helmet);
        trimmedArmorItem(ModArmor.flint_chestplate);
        trimmedArmorItem(ModArmor.flint_leggings);
        handHeldItem(ModTools.flint_shovel);
        handHeldItem(ModTools.flint_axe);
        handHeldItem(ModTools.flint_pickaxe);
        handHeldItem(ModTools.flint_sword);
        handHeldItem(ModTools.flint_hoe);

        trimmedArmorItem(ModArmor.stone_helmet);
        trimmedArmorItem(ModArmor.stone_chestplate);
        trimmedArmorItem(ModArmor.stone_leggings);
        trimmedArmorItem(ModArmor.stone_boots);

        trimmedArmorItem(ModArmor.copper_helmet);
        trimmedArmorItem(ModArmor.copper_chestplate);
        trimmedArmorItem(ModArmor.copper_leggings);
        trimmedArmorItem(ModArmor.copper_boots);
        handHeldItem(ModTools.copper_shovel);
        handHeldItem(ModTools.copper_axe);
        handHeldItem(ModTools.copper_pickaxe);
        handHeldItem(ModTools.copper_sword);
        handHeldItem(ModTools.copper_hoe);

        trimmedArmorItem(ModArmor.obsidian_helmet);
        trimmedArmorItem(ModArmor.obsidian_chestplate);
        trimmedArmorItem(ModArmor.obsidian_leggings);
        trimmedArmorItem(ModArmor.obsidian_boots);
        handHeldItem(ModTools.obsidian_shovel);
        handHeldItem(ModTools.obsidian_axe);
        handHeldItem(ModTools.obsidian_pickaxe);
        handHeldItem(ModTools.obsidian_sword);
        handHeldItem(ModTools.obsidian_hoe);

        trimmedArmorItem(ModArmor.emerald_helmet);
        trimmedArmorItem(ModArmor.emerald_chestplate);
        trimmedArmorItem(ModArmor.emerald_leggings);
        trimmedArmorItem(ModArmor.emerald_boots);
        handHeldItem(ModTools.emerald_shovel);
        handHeldItem(ModTools.emerald_axe);
        handHeldItem(ModTools.emerald_pickaxe);
        handHeldItem(ModTools.emerald_sword);
        handHeldItem(ModTools.emerald_hoe);

        //trimmedArmorItem(ModArmor.dragon_helmet);
        trimmedArmorItem(ModArmor.dragon_chestplate);
        trimmedArmorItem(ModArmor.dragon_leggings);
        trimmedArmorItem(ModArmor.dragon_boots);
        handHeldItem(ModTools.dragon_shovel);
        handHeldItem(ModTools.dragon_axe);
        handHeldItem(ModTools.dragon_pickaxe);
        handHeldItem(ModTools.dragon_sword);
        handHeldItem(ModTools.dragon_hoe);
        //bowItem(ModTools.dragon_bow);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HavenKSH.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder bowItem(RegistryObject<BowItem> bow) {
        return getBuilder(bow.getId().getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(HavenKSH.MOD_ID, "item/" + bow.getId().getPath()))
                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .model(new ModelFile.UncheckedModelFile(new ResourceLocation(HavenKSH.MOD_ID, "item/" + bow.getId().getPath() + "_pulling_0")))
                .end()
                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .predicate(new ResourceLocation("pull"), 0.65F)
                .model(new ModelFile.UncheckedModelFile(new ResourceLocation(HavenKSH.MOD_ID, "item/" + bow.getId().getPath() + "_pulling_1")))
                .end()
                .override()
                .predicate(new ResourceLocation("pulling"), 1.0F)
                .predicate(new ResourceLocation("pull"), 0.9F)
                .model(new ModelFile.UncheckedModelFile(new ResourceLocation(HavenKSH.MOD_ID, "item/" + bow.getId().getPath() + "_pulling_2")))
                .end();
    }

    private ItemModelBuilder ShearsItem(RegistryObject<ShearsItem> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HavenKSH.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HavenKSH.MOD_ID,"item/" + item.getId().getPath()));
    }

    private void simpleBlockItem(RegistryObject<Block> block) {
        String path = block.getId().getPath();
        withExistingParent(path, modLoc("block/" + path + "_stage3"));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block)
    {
        this.withExistingParent(HavenKSH.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject)
    {
        final String MOD_ID = HavenKSH.MOD_ID;

        if (itemRegistryObject.get() instanceof ArmorItem armorItem)
        {
            trimMaterials.entrySet().forEach(entry ->
            {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot())
                        {
                            case HEAD -> "helmet";
                            case CHEST -> "chestplate";
                            case LEGS -> "leggings";
                            case FEET -> "boots";
                            default -> "";
                        };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
}
