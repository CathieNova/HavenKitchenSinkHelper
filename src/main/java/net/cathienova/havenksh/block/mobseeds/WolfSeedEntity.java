package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.level.block.state.BlockState;

public class WolfSeedEntity extends MobSeedEntity<Wolf> {
    public WolfSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.wolf_seed_tile.get(), pos, state, HavenConfig.wolf_seed_spawn_timer, EntityType.WOLF, HavenConfig.wolf_seed_spawn_timer);
    }
}
