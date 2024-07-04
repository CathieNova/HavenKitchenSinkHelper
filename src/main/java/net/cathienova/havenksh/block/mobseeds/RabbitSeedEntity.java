package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.level.block.state.BlockState;

public class RabbitSeedEntity extends MobSeedEntity<Rabbit> {
    public RabbitSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.rabbit_seed_tile.get(), pos, state, HavenConfig.rabbit_seed_spawn_timer, EntityType.RABBIT, HavenConfig.rabbit_seed_spawn_timer);
    }
}
