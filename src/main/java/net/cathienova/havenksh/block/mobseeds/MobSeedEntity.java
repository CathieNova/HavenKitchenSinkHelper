package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public abstract class MobSeedEntity<T extends Mob> extends BlockEntity {

    private int spawnTimer;
    private final EntityType<T> entityType;
    private final int maxGrowthTime;

    private long lastSpawnTick = -1;

    public MobSeedEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int spawnTimer, EntityType<T> entityType, int maxGrowthTime) {
        super(type, pos, state);
        this.spawnTimer = spawnTimer;
        this.entityType = entityType;
        this.maxGrowthTime = maxGrowthTime;
    }

    public void tick(Level level, BlockPos pos, BlockState state, MobSeedEntity<?> blockEntity) {
        if (level.isClientSide) {
            return;
        }

        FluidState fluidState = level.getFluidState(pos);
        if (level.getBlockState(pos.below()).getFluidState().getType() == Fluids.WATER)
        {
            return;
        }
        else if (level.getBlockState(pos.below()).getFluidState().getType() == Fluids.LAVA)
        {
            return;
        }
        else if (level.getBlockState(pos.below()).is(Blocks.AIR))
        {
            return;
        }

        int pDist = HavenConfig.playerGrowthDistance;
        boolean playerNearby = !level.getEntitiesOfClass(Player.class, new AABB(
                Vec3.atCenterOf(pos).subtract(pDist, pDist, pDist),
                Vec3.atCenterOf(pos).add(pDist, pDist, pDist)
        )).isEmpty();

        if (!playerNearby) {
            spawnTimer--;
            setChanged();
            sync();
        }

        // Check if enough time has passed to spawn a mob (prevent multiple spawns in the same tick)
        long currentTick = level.getGameTime();
        if (spawnTimer <= 0 && currentTick != lastSpawnTick) {
            T mob = entityType.create(level);
            if (mob != null) {
                Vec3 spawnPosition = Vec3.atBottomCenterOf(pos);
                mob.setPos(spawnPosition.x, spawnPosition.y, spawnPosition.z);
                if (mob instanceof AgeableMob) {
                    mob.setBaby(true);
                }
                level.addFreshEntity(mob);
                if (fluidState.getType() == Fluids.WATER) {
                    level.setBlock(pos, Blocks.WATER.defaultBlockState(), 3);
                } else if (fluidState.getType() == Fluids.LAVA) {
                    level.setBlock(pos, Blocks.LAVA.defaultBlockState(), 3);
                } else {
                    level.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
                }
                level.playSound(null, pos, SoundType.GRASS.getPlaceSound(), SoundSource.NEUTRAL, 1.0F, 1.0F);

                lastSpawnTick = currentTick;
            }
        }
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    private void sync() {
        if (level != null && !level.isClientSide) {
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
            setChanged();
        }
    }

    public int getAge() {
        return Math.max(0, maxGrowthTime - spawnTimer);
    }

    public int getRemainingTime() {
        return Math.max(0, spawnTimer);
    }

    public float getGrowthScale() {
        float scale = 0.1f + 0.9f * (1.0f - ((float) spawnTimer / maxGrowthTime));
        return scale; // Start at 10% size and grow to full size
    }

    public EntityType<T> getEntityType() {
        return entityType;
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries)
    {
        super.loadAdditional(tag, registries);
        if (tag.contains("SpawnTimer")) {
            spawnTimer = tag.getInt("SpawnTimer");
        }
        if (tag.contains("LastSpawnTick")) {
            lastSpawnTick = tag.getLong("LastSpawnTick");
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putInt("SpawnTimer", spawnTimer);
        tag.putLong("LastSpawnTick", lastSpawnTick);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = super.getUpdateTag(registries);
        saveAdditional(tag, registries);
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider lookupProvider) {
        loadAdditional(tag, lookupProvider);
    }
}
