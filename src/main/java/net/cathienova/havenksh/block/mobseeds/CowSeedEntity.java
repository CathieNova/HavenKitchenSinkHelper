package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.level.block.state.BlockState;

public class CowSeedEntity extends MobSeedEntity<Cow> {
    public CowSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.cow_seed_tile.get(), pos, state, HavenConfig.cow_seed_spawn_timer, EntityType.COW, HavenConfig.cow_seed_spawn_timer);
    }
}
