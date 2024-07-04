package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.level.block.state.BlockState;

public class MooshroomSeedEntity extends MobSeedEntity<MushroomCow> {
    public MooshroomSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.mooshroom_seed_tile.get(), pos, state, HavenConfig.mooshroom_seed_spawn_timer, EntityType.MOOSHROOM, HavenConfig.mooshroom_seed_spawn_timer);
    }
}
