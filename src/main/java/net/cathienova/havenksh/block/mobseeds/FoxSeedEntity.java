package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.level.block.state.BlockState;

public class FoxSeedEntity extends MobSeedEntity<Fox> {
    public FoxSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.fox_seed_tile.get(), pos, state, HavenConfig.fox_seed_spawn_timer, EntityType.FOX, HavenConfig.fox_seed_spawn_timer);
    }
}
