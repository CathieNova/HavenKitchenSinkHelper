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

public class PigSeedBlock extends MobSeedBlock {
    public PigSeedBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected BlockEntity createTileEntity(BlockPos pos, BlockState state) {
        return new PigSeedEntity(pos, state);
    }

    @Override
    protected BlockEntityType<?> getTileEntityType() {
        return ModBlockEntities.pig_seed_tile.get();
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
        BlockState soil = worldIn.getBlockState(pos.below());
        return soil.is(Blocks.GRASS_BLOCK) ||
                soil.is(Blocks.PODZOL) ||
                soil.is(Blocks.COARSE_DIRT) ||
                soil.is(Blocks.DIRT) ||
                soil.is(Blocks.MOSS_BLOCK) ||
                soil.is(Blocks.MYCELIUM) ||
                soil.is(Blocks.ROOTED_DIRT);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BlockStateProperties.HORIZONTAL_FACING);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
        Block[] blocks = {Blocks.GRASS_BLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT, Blocks.DIRT, Blocks.MOSS_BLOCK, Blocks.MYCELIUM, Blocks.ROOTED_DIRT};
        String blockNames = "";
        for (Block block : blocks) {
            blockNames += block.getName().getString() + ", ";
        }
        tooltip.add(Component.translatable("block.havenksh.placement_on", blockNames.substring(0, blockNames.length() - 2)).withStyle(ChatFormatting.DARK_GREEN));
    }
}
