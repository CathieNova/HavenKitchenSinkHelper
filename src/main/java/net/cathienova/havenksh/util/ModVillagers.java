package net.cathienova.havenksh.util;

import com.google.common.collect.ImmutableSet;
import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModVillagers
{
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, HavenKSH.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, HavenKSH.MOD_ID);

    public static final RegistryObject<PoiType> COBBLEMASTER_POI = POI_TYPES.register("cobblemaster_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.wooden_cobble_gen.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> COBBLEMASTER =
            VILLAGER_PROFESSIONS.register("cobblemaster", () -> new VillagerProfession("cobblemaster",
                    holder -> holder.get() == COBBLEMASTER_POI.get(), holder -> holder.get() == COBBLEMASTER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static void register(IEventBus eventBus)
    {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
