package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Donkey;
import net.minecraft.world.level.block.state.BlockState;

public class DonkeySeedEntity extends MobSeedEntity<Donkey> {
    public DonkeySeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.donkey_seed_tile.get(), pos, state, HavenConfig.donkey_seed_spawn_timer, EntityType.DONKEY, HavenConfig.donkey_seed_spawn_timer);
    }
}
