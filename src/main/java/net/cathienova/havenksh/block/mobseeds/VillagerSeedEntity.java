package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.block.state.BlockState;

public class VillagerSeedEntity extends MobSeedEntity<Villager> {
    public VillagerSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.villager_seed_tile.get(), pos, state, HavenConfig.villager_seed_spawn_timer, EntityType.VILLAGER, HavenConfig.villager_seed_spawn_timer);
    }
}
