package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.level.block.state.BlockState;

public class PigSeedEntity extends MobSeedEntity<Pig> {
    public PigSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.pig_seed_tile.get(), pos, state, HavenConfig.pig_seed_spawn_timer, EntityType.PIG, HavenConfig.pig_seed_spawn_timer);
    }
}
