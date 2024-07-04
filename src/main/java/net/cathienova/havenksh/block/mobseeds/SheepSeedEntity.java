package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.level.block.state.BlockState;

public class SheepSeedEntity extends MobSeedEntity<Sheep> {
    public SheepSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.sheep_seed_tile.get(), pos, state, HavenConfig.sheep_seed_spawn_timer, EntityType.SHEEP, HavenConfig.sheep_seed_spawn_timer);
    }
}
