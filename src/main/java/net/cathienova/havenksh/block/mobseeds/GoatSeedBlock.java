package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoatSeedBlock extends MobSeedBlock {
    public GoatSeedBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected BlockEntity createTileEntity(BlockPos pos, BlockState state) {
        return new GoatSeedEntity(pos, state);
    }

    @Override
    protected BlockEntityType<?> getTileEntityType() {
        return ModBlockEntities.goat_seed_tile.get();
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
        BlockState soil = worldIn.getBlockState(pos.below());
        if (soil.is(Blocks.GRASS_BLOCK) ||
                soil.is(Blocks.PODZOL) ||
                soil.is(Blocks.SNOW_BLOCK) ||
                soil.is(Blocks.STONE) ||
                soil.is(Blocks.COBBLESTONE) ||
                soil.is(Blocks.MOSSY_COBBLESTONE) ||
                soil.is(Blocks.GRANITE) ||
                soil.is(Blocks.ANDESITE) ||
                soil.is(Blocks.DIORITE) ||
                soil.is(Blocks.GRAVEL)
        ){
            return true;
        }
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BlockStateProperties.HORIZONTAL_FACING);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
        Block[] blocks = {Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.SNOW_BLOCK, Blocks.STONE, Blocks.COBBLESTONE, Blocks.MOSSY_COBBLESTONE, Blocks.GRANITE, Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRAVEL};
        String blockNames = "";
        for (Block block : blocks) {
            blockNames += block.getName().getString() + ", ";
        }
        tooltip.add(Component.translatable("block.havenksh.placement_on", blockNames.substring(0, blockNames.length() - 2)).withStyle(ChatFormatting.DARK_GREEN));
    }
}
