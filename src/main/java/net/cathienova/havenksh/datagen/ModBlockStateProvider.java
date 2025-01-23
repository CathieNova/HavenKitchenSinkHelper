package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HavenKSH.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.dust);
        blockWithItem(ModBlocks.crushed_netherrack);
        blockWithItem(ModBlocks.crushed_end_stone);
        blockWithItem(ModBlocks.charcoal_block);
        blockWithItem(ModBlocks.andesite_brick);
        blockWithItem(ModBlocks.diorite_brick);
        blockWithItem(ModBlocks.granite_brick);
        blockWithItem(ModBlocks.flesh_block);
        blockWithItem(ModBlocks.ender_block);
        blockWithItem(ModBlocks.nether_star_block);
        blockWithItem(ModBlocks.scorched_stone);
        blockWithItem(ModBlocks.scorched_stone_bricks);
        blockWithItem(ModBlocks.scorched_cobblestone);
        blockWithItem(ModBlocks.scorched_coal_ore);
        blockWithItem(ModBlocks.scorched_iron_ore);
        blockWithItem(ModBlocks.scorched_gold_ore);
        blockWithItem(ModBlocks.scorched_diamond_ore);
        blockWithItem(ModBlocks.scorched_emerald_ore);
        blockWithItem(ModBlocks.scorched_redstone_ore);
        blockWithItem(ModBlocks.scorched_lapis_ore);
        blockWithItem(ModBlocks.scorched_copper_ore);
        blockWithItem(ModBlocks.scorched_quartz_ore);
        blockWithItem(ModBlocks.flint_block);
        blockWithItem(ModBlocks.reinforced_glass);
        blockWithItem(ModBlocks.havenite_block);
        blockWithItem(ModBlocks.havenite_ore);
        blockWithItem(ModBlocks.deepslate_havenite_ore);
        blockWithItem(ModBlocks.raw_havenite_block);
    }

    private void blockItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(HavenKSH.MOD_ID +
                ":block/" + BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void crossBlock(DeferredBlock<Block> blockRegistryObject) {
        ModelFile blockModel = models().cross(blockRegistryObject.getId().getPath(), ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "block/animalgrass"));
        simpleBlock(blockRegistryObject.get(), blockModel);

        itemModels().withExistingParent(blockRegistryObject.getId().getPath(), "item/generated")
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(HavenKSH.MOD_ID, "item/" + blockRegistryObject.getId().getPath()));
    }
}
