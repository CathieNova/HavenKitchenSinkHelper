package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.PolarBear;
import net.minecraft.world.level.block.state.BlockState;

public class PolarBearSeedEntity extends MobSeedEntity<PolarBear> {
    public PolarBearSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.polar_bear_seed_tile.get(), pos, state, HavenConfig.polar_bear_seed_spawn_timer, EntityType.POLAR_BEAR, HavenConfig.polar_bear_seed_spawn_timer);
    }
}
