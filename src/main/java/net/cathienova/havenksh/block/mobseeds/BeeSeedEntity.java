package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.block.state.BlockState;

public class BeeSeedEntity extends MobSeedEntity<Bee> {
    public BeeSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.bee_seed_tile.get(), pos, state, HavenConfig.bee_seed_spawn_timer, EntityType.BEE, HavenConfig.bee_seed_spawn_timer);
    }
}
