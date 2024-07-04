package net.cathienova.havenksh.block.mobseeds;

import net.cathienova.havenksh.block.ModBlockEntities;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.level.block.state.BlockState;

public class LlamaSeedEntity extends MobSeedEntity<Llama> {
    public LlamaSeedEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.llama_seed_tile.get(), pos, state, HavenConfig.llama_seed_spawn_timer, EntityType.LLAMA, HavenConfig.llama_seed_spawn_timer);
    }
}
