package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

public class DataGenerators {
    @Mod.EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModRecipeProvider {
        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            boolean includeClient = event.includeClient();
            boolean includeServer = event.includeServer();

            if (includeClient) {
                generator.addProvider(includeClient, new ModEngLangProvider(output));
                generator.addProvider(includeClient, new ModBlockStateProvider(output, existingFileHelper));
                generator.addProvider(includeClient, new ModItemModelProvider(output, existingFileHelper));
            }

            if (includeServer) {
                generator.addProvider(includeServer, new net.cathienova.havenksh.datagen.recipes.ModRecipeProvider(output));
                generator.addProvider(includeServer, ModLootTableProvider.create(output));

                ModBlockTagGenerator blockTagGenerator = generator.addProvider(includeServer, new ModBlockTagGenerator(output, lookupProvider, existingFileHelper));
                generator.addProvider(includeServer, new ModItemTagGenerator(output, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

                generator.addProvider(includeServer, new ModGlobalLootModifiersProvider(output));
                generator.addProvider(includeServer, new ModAdvancementProvider(output, lookupProvider, existingFileHelper));
                generator.addProvider(event.includeServer(), new ModWorldGenProvider(output, lookupProvider));
                generator.addProvider(event.includeServer(), new ModPoiTypeTagsProvider(output, lookupProvider, existingFileHelper));
            }
        }
    }
}
