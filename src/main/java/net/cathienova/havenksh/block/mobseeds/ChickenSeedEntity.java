package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.level.block.state.BlockState;

public class ChickenSeedEntity extends MobSeedEntity<Chicken> {
    public ChickenSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.chicken_seed_tile.get(), pos, state, HavenConfig.chicken_seed_spawn_timer, EntityType.CHICKEN, HavenConfig.chicken_seed_spawn_timer);
    }
}
