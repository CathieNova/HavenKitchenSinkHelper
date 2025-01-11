package net.cathienova.havenksh.block.mobseeds;

import com.mojang.serialization.MapCodec;
import net.cathienova.havenksh.block.ModBlockEntities;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import java.util.List;

public class SnifferSeedBlock extends MobSeedBlock {
    public SnifferSeedBlock(Properties properties) {
        super(properties);
    }
    public static final MapCodec<SnifferSeedBlock> CODEC = simpleCodec(SnifferSeedBlock::new);

    @Override
    protected BlockEntity createTileEntity(BlockPos pos, BlockState state) {
        return new SnifferSeedEntity(pos, state);
    }

    @Override
    protected BlockEntityType<?> getTileEntityType() {
        return ModBlockEntities.sniffer_seed_tile.get();
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec()
    {
        return CODEC;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
        BlockState soil = worldIn.getBlockState(pos.below());
        return soil.is(Blocks.GRASS_BLOCK) ||
                soil.is(Blocks.PODZOL);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BlockStateProperties.HORIZONTAL_FACING);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        Block[] blocks = {Blocks.GRASS_BLOCK, Blocks.PODZOL};
        String blockNames = "";
        for (Block block : blocks) {
            blockNames += block.getName().getString() + ", ";
        }
        tooltip.add(Component.translatable("block.havenksh.placement_on", blockNames.substring(0, blockNames.length() - 2)).withStyle(ChatFormatting.DARK_GREEN));
    }
}
