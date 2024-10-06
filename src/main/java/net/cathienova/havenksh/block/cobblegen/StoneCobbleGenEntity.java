package net.cathienova.havenksh.block.cobblegen;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class StoneCobbleGenEntity extends BlockEntity implements BlockEntityTicker<StoneCobbleGenEntity> {

    private int cycle = 0;
    private CobbleGenInventory cobbleGenContents;

    public StoneCobbleGenEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.stone_cobble_gen_tile.get(), pos, state);
        this.createInventory();
    }

    public StoneCobbleGenEntity setGenStats() {
        if (this.level != null) {
            this.level.setBlock(this.worldPosition, this.getBlockState(), 3);
        }
        this.createInventory();
        return this;
    }

    private void createInventory() {
        cobbleGenContents = CobbleGenInventory.createForTileEntity(1, HavenConfig.stone_cobble_gen_output);
    }

    private boolean canPlayerAccessInventory(Player player) {
        if (this.level.getBlockEntity(this.worldPosition) != this) return false;
        return player.distanceToSqr(this.worldPosition.getX() + 0.5, this.worldPosition.getY() + 0.5, this.worldPosition.getZ() + 0.5) < 64.0;
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);

        if (this.cobbleGenContents == null) this.createInventory();
        if (tag.contains("inventory")) {
            this.cobbleGenContents.deserializeNBT(tag.getCompound("inventory"));
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.put("inventory", this.cobbleGenContents.serializeNBT());
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag);
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        this.load(pkt.getTag());
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag);
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag) {
        this.load(tag);
    }

    public void tick(Level level, BlockPos pos, BlockState state, StoneCobbleGenEntity blockEntity) {
        if (level.isClientSide()) return;

        if (cycle++ >= HavenConfig.stone_cobble_gen_speed) {
            cycle = 0;

            Block blockToGenerate = getBlockToGenerate();  // Now checks all sides
            ItemStack stack = cobbleGenContents.getItem(0);
            if (stack.isEmpty()) {
                cobbleGenContents.setItem(0, new ItemStack(blockToGenerate));
            } else if (stack.getItem() == blockToGenerate.asItem()) {
                int newSize = Math.min(stack.getCount() + 1, HavenConfig.stone_cobble_gen_output);
                stack.setCount(newSize);
                cobbleGenContents.setItem(0, stack);
            } else {
                return;
            }

            BlockEntity tileAbove = level.getBlockEntity(pos.above());
            if (tileAbove != null) {
                tileAbove.getCapability(ForgeCapabilities.ITEM_HANDLER, Direction.DOWN).ifPresent(handler -> {
                    for (int slot = 0; slot < handler.getSlots(); slot++) {
                        ItemStack singleItemStack = cobbleGenContents.removeItem(0, 1);
                        if (!singleItemStack.isEmpty()) {
                            ItemStack leftoverStack = handler.insertItem(slot, singleItemStack, false);
                            if (!leftoverStack.isEmpty()) {
                                cobbleGenContents.setItem(0, leftoverStack);
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                });
            }

            this.setChanged();
        }
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return LazyOptional.of(() -> this.cobbleGenContents.getHandler()).cast();
        }
        return super.getCapability(cap, side);
    }

    public CobbleGenInventory getInventory() {
        return this.cobbleGenContents;
    }

    public int getMaxStackSize() {
        return HavenConfig.stone_cobble_gen_output;
    }

    private Block getBlockToGenerate() {
        List<? extends String> validBlocks = HavenConfig.cobbleGenValidBlocks;
        Random random = new Random();

        // Loop through all six directions (up, down, north, south, east, west)
        for (Direction direction : Direction.values()) {
            assert this.level != null;
            Block blockAtSide = this.level.getBlockState(this.worldPosition.relative(direction)).getBlock();
            String blockAtSideName = ForgeRegistries.BLOCKS.getKey(blockAtSide).toString();

            // Iterate over each config entry (formatted as blockToCheck;blockToGenerate1,blockToGenerate2,...)
            for (String entry : validBlocks) {
                String[] parts = entry.split(";");
                if (parts.length == 2) {
                    String blockToCheck = parts[0];  // The block to check on the side
                    String[] blockToGenerateList = parts[1].split(",");  // Blocks to randomly choose from

                    // If the blockAtSide matches blockToCheck, randomly select a block from blockToGenerateList
                    if (blockAtSideName.equals(blockToCheck)) {
                        String randomBlockToGenerate = blockToGenerateList[random.nextInt(blockToGenerateList.length)];
                        Block generateBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(randomBlockToGenerate));
                        if (generateBlock != null) {
                            return generateBlock;
                        }
                    }
                }
            }
        }
        // Default to cobblestone if no match
        return Blocks.COBBLESTONE;
    }
}
