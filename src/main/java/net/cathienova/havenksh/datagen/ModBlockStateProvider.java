package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(HavenKSH.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
