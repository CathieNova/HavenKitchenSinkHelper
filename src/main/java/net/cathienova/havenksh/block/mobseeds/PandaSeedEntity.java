package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Panda;
import net.minecraft.world.level.block.state.BlockState;

public class PandaSeedEntity extends MobSeedEntity<Panda> {
    public PandaSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.panda_seed_tile.get(), pos, state, HavenConfig.panda_seed_spawn_timer, EntityType.PANDA, HavenConfig.panda_seed_spawn_timer);
    }
}
