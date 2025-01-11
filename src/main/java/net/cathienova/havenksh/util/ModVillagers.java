package net.cathienova.havenksh.util;

import com.google.common.collect.ImmutableSet;
import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModVillagers
{
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, HavenKSH.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, HavenKSH.MOD_ID);

    public static final Supplier<PoiType> COBBLEMASTER_POI = POI_TYPES.register("cobblemaster_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.wooden_cobble_gen.get().getStateDefinition().getPossibleStates()),
                    1, 2));

    public static final Supplier<VillagerProfession> COBBLEMASTER =
            VILLAGER_PROFESSIONS.register("cobblemaster", () -> new VillagerProfession("cobblemaster",
                    holder -> holder == COBBLEMASTER_POI, holder -> holder == COBBLEMASTER_POI,
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static void register(IEventBus eventBus)
    {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
