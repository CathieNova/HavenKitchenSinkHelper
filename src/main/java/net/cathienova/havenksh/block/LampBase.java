package net.cathienova.havenksh.block;

import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class LampBase extends Block
{
    public LampBase(Properties pProperties)
    {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP).setValue(ON, Boolean.TRUE));
    }

    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final BooleanProperty ON = BooleanProperty.create("on");

    private static final VoxelShape SHAPE_FLOOR = Stream.of(
            Block.box(3, 0, 3, 13, 1, 13),
            Block.box(5, 1, 5, 11, 7, 11),
            Block.box(4, 1, 6, 12, 8, 7),
            Block.box(4, 1, 9, 12, 8, 10),
            Block.box(4, 5, 4, 12, 6, 6),
            Block.box(4, 5, 7, 12, 6, 9),
            Block.box(4, 5, 10, 12, 6, 12),
            Block.box(4, 2, 10, 12, 3, 12),
            Block.box(4, 2, 7, 12, 3, 9),
            Block.box(4, 2, 4, 12, 3, 6)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_CEILING = Stream.of(
            Block.box(3, 15, 3, 13, 16, 13),
            Block.box(5, 9, 5, 11, 15, 11),
            Block.box(4, 8, 6, 12, 15, 7),
            Block.box(4, 8, 9, 12, 15, 10),
            Block.box(4, 10, 4, 12, 11, 6),
            Block.box(4, 10, 7, 12, 11, 9),
            Block.box(4, 10, 10, 12, 11, 12),
            Block.box(4, 13, 10, 12, 14, 12),
            Block.box(4, 13, 7, 12, 14, 9),
            Block.box(4, 13, 4, 12, 14, 6)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WALL_NORTH = Stream.of(
            Block.box(3, 3, 15, 13, 13, 16),
            Block.box(5, 5, 9, 11, 11, 15),
            Block.box(4, 6, 8, 12, 7, 15),
            Block.box(4, 9, 8, 12, 10, 15),
            Block.box(4, 4, 10, 12, 6, 11),
            Block.box(4, 7, 10, 12, 9, 11),
            Block.box(4, 10, 10, 12, 12, 11),
            Block.box(4, 10, 13, 12, 12, 14),
            Block.box(4, 7, 13, 12, 9, 14),
            Block.box(4, 4, 13, 12, 6, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WALL_SOUTH = Stream.of(
            Block.box(3, 3, 0, 13, 13, 1),
            Block.box(5, 5, 1, 11, 11, 7),
            Block.box(4, 6, 1, 12, 7, 8),
            Block.box(4, 9, 1, 12, 10, 8),
            Block.box(4, 4, 5, 12, 6, 6),
            Block.box(4, 7, 5, 12, 9, 6),
            Block.box(4, 10, 5, 12, 12, 6),
            Block.box(4, 10, 2, 12, 12, 3),
            Block.box(4, 7, 2, 12, 9, 3),
            Block.box(4, 4, 2, 12, 6, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WALL_EAST = Stream.of(
            Block.box(0, 3, 3, 1, 13, 13),
            Block.box(1, 5, 5, 7, 11, 11),
            Block.box(1, 6, 4, 8, 7, 12),
            Block.box(1, 9, 4, 8, 10, 12),
            Block.box(5, 4, 4, 6, 6, 12),
            Block.box(5, 7, 4, 6, 9, 12),
            Block.box(5, 10, 4, 6, 12, 12),
            Block.box(2, 10, 4, 3, 12, 12),
            Block.box(2, 7, 4, 3, 9, 12),
            Block.box(2, 4, 4, 3, 6, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WALL_WEST = Stream.of(
            Block.box(15, 3, 3, 16, 13, 13),
            Block.box(9, 5, 5, 15, 11, 11),
            Block.box(8, 6, 4, 15, 7, 12),
            Block.box(8, 9, 4, 15, 10, 12),
            Block.box(10, 4, 4, 11, 6, 12),
            Block.box(10, 7, 4, 11, 9, 12),
            Block.box(10, 10, 4, 11, 12, 12),
            Block.box(13, 10, 4, 14, 12, 12),
            Block.box(13, 7, 4, 14, 9, 12),
            Block.box(13, 4, 4, 14, 6, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction facing = state.getValue(FACING);
        switch (facing) {
            case DOWN:
                return SHAPE_CEILING;
            case NORTH:
                return SHAPE_WALL_NORTH;
            case SOUTH:
                return SHAPE_WALL_SOUTH;
            case WEST:
                return SHAPE_WALL_WEST;
            case EAST:
                return SHAPE_WALL_EAST;
            default:
                return SHAPE_FLOOR;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getClickedFace();
        return this.defaultBlockState().setValue(FACING, direction).setValue(ON, Boolean.TRUE);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, ON);
    }

    @Override
    public void playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player)
    {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double d0 = (double) pos.getX() + random.nextDouble();
            double d1 = (double) pos.getY() + random.nextDouble();
            double d2 = (double) pos.getZ() + random.nextDouble();
            world.addParticle(new BlockParticleOption(ParticleTypes.BLOCK, state), d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        if (!level.isClientSide)
        {
            boolean on = state.getValue(ON);

            level.setBlock(pos, state.setValue(ON, !on), 3);
            if (on)
            {
                level.playSound(null, pos, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            else
            {
                level.playSound(null, pos, SoundEvents.STONE_BUTTON_CLICK_ON, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos)
    {
        return state.getValue(ON) ? 15 : 0;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag)
    {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);

        pTooltip.add(Component.translatable("block.havenksh.lamp.tooltip").withStyle(ChatFormatting.GOLD));
    }
}
