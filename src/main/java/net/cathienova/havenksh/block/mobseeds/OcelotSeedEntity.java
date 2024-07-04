package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.level.block.state.BlockState;

public class OcelotSeedEntity extends MobSeedEntity<Ocelot> {
    public OcelotSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ocelot_seed_tile.get(), pos, state, HavenConfig.ocelot_seed_spawn_timer, EntityType.OCELOT, HavenConfig.ocelot_seed_spawn_timer);
    }
}
