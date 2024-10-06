package net.cathienova.havenksh.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class JsonExportHelper
{

    private static final File CONFIG_DIR = FMLPaths.CONFIGDIR.get().resolve("havenksh/generated_jsons").toFile();
    private static final File FTBQUEST_DIR = FMLPaths.CONFIGDIR.get().resolve("ftbquests/quests/chapters").toFile();
    private static final File FTBQUESTREWARD_DIR = FMLPaths.CONFIGDIR.get().resolve("ftbquests/quests/reward_tables").toFile();

    public static void exportItemsToJson()
    {
        List<String> items = new ArrayList<>();
        for (var item : ForgeRegistries.ITEMS)
        {
            items.add(ForgeRegistries.ITEMS.getKey(item).toString());
        }

        Collections.sort(items);
        writeToJson("items.json", items, CONFIG_DIR);
    }

    public static void exportEntityTypesToJson()
    {
        List<String> entityTypes = new ArrayList<>();
        for (var entityType : ForgeRegistries.ENTITY_TYPES)
        {
            entityTypes.add(ForgeRegistries.ENTITY_TYPES.getKey(entityType).toString());
        }

        Collections.sort(entityTypes);
        writeToJson("mobs.json", entityTypes, CONFIG_DIR);
    }

    public static void exportBlocksToJson()
    {
        List<String> blocks = new ArrayList<>();
        for (var block : ForgeRegistries.BLOCKS)
        {
            blocks.add(ForgeRegistries.BLOCKS.getKey(block).toString());
        }

        Collections.sort(blocks);
        writeToJson("blocks.json", blocks, CONFIG_DIR);
    }

    public static void exportItemTagsToJson(String tagName)
    {
        List<String> taggedItems = new ArrayList<>();
        String actualTagName = tagName.replace('_', ':');
        var tagResource = new ResourceLocation(actualTagName);
        var itemTagKey = ItemTags.create(tagResource);

        if (ForgeRegistries.ITEMS.tags().isKnownTagName(itemTagKey))
        {
            ForgeRegistries.ITEMS.tags().getTag(itemTagKey).forEach(item ->
            {
                taggedItems.add(ForgeRegistries.ITEMS.getKey(item).toString());
            });
        }

        Collections.sort(taggedItems);
        writeToJson("item_tags_" + actualTagName.replace(':', '_') + ".json", taggedItems, CONFIG_DIR);
    }

    public static void exportBlockTagsToJson(String tagName)
    {
        List<String> taggedBlocks = new ArrayList<>();
        String actualTagName = tagName.replace('_', ':');
        var tagResource = new ResourceLocation(actualTagName);
        var blockTagKey = BlockTags.create(tagResource);

        if (ForgeRegistries.BLOCKS.tags().isKnownTagName(blockTagKey))
        {
            ForgeRegistries.BLOCKS.tags().getTag(blockTagKey).forEach(block ->
            {
                taggedBlocks.add(ForgeRegistries.BLOCKS.getKey(block).toString());
            });
        }

        Collections.sort(taggedBlocks);
        writeToJson("block_tags_" + actualTagName.replace(':', '_') + ".json", taggedBlocks, CONFIG_DIR);
    }

    public static void exportModItemsToJson(String modId)
    {
        List<String> modItems = new ArrayList<>();
        for (var item : ForgeRegistries.ITEMS)
        {
            var itemKey = ForgeRegistries.ITEMS.getKey(item);
            if (itemKey != null && itemKey.getNamespace().equals(modId))
            {
                modItems.add(itemKey.toString());
            }
        }

        Collections.sort(modItems);
        writeToJson(modId + "_items.json", modItems, CONFIG_DIR);
    }

    public static void exportModBlocksToJson(String modId)
    {
        List<String> modBlocks = new ArrayList<>();
        for (var block : ForgeRegistries.BLOCKS)
        {
            var blockKey = ForgeRegistries.BLOCKS.getKey(block);
            if (blockKey != null && blockKey.getNamespace().equals(modId))
            {
                modBlocks.add(blockKey.toString());
            }
        }

        Collections.sort(modBlocks);
        writeToJson(modId + "_blocks.json", modBlocks, CONFIG_DIR);
    }

    public static void exportContainerItemsToJson(ServerPlayer player, BlockPos containerPos)
    {
        List<Map<String, Object>> containerItems = new ArrayList<>();
        BlockEntity blockEntity = player.level().getBlockEntity(containerPos);

        if (blockEntity instanceof Container)
        {
            Container container = (Container) blockEntity;
            for (int i = 0; i < container.getContainerSize(); i++)
            {
                ItemStack itemStack = container.getItem(i);
                if (!itemStack.isEmpty())
                {
                    Map<String, Object> itemData = new HashMap<>();
                    String itemId = ForgeRegistries.ITEMS.getKey(itemStack.getItem()).toString();
                    int amount = itemStack.getCount();
                    itemData.put("item", itemId);
                    itemData.put("amount", amount);
                    containerItems.add(itemData);
                }
            }
        }
        else if (blockEntity != null && blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).isPresent())
        {
            blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler ->
            {
                for (int i = 0; i < handler.getSlots(); i++)
                {
                    ItemStack itemStack = handler.getStackInSlot(i);
                    if (!itemStack.isEmpty())
                    {
                        Map<String, Object> itemData = new HashMap<>();
                        String itemId = ForgeRegistries.ITEMS.getKey(itemStack.getItem()).toString();
                        int amount = itemStack.getCount();
                        itemData.put("item", itemId);
                        itemData.put("amount", amount);
                        containerItems.add(itemData);
                    }
                }
            });
        }
        else
        {
            player.sendSystemMessage(Component.literal("No storage container found at the specified location"));
            return;
        }

        writeToJson("container_items.json", containerItems, CONFIG_DIR);
    }

    // This is the missing function to export blocks from a container
    public static void exportContainerBlocksToJson(ServerPlayer player, BlockPos containerPos)
    {
        List<String> containerBlocks = new ArrayList<>();
        BlockEntity blockEntity = player.level().getBlockEntity(containerPos);

        if (blockEntity instanceof Container)
        {
            Container container = (Container) blockEntity;
            for (int i = 0; i < container.getContainerSize(); i++)
            {
                ItemStack itemStack = container.getItem(i);
                if (!itemStack.isEmpty() && itemStack.getItem() instanceof BlockItem)
                {
                    String blockId = ForgeRegistries.BLOCKS.getKey(((BlockItem) itemStack.getItem()).getBlock()).toString();
                    containerBlocks.add(blockId);
                }
            }
        }
        else if (blockEntity != null && blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).isPresent())
        {
            blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler ->
            {
                for (int i = 0; i < handler.getSlots(); i++)
                {
                    ItemStack itemStack = handler.getStackInSlot(i);
                    if (!itemStack.isEmpty() && itemStack.getItem() instanceof BlockItem)
                    {
                        String blockId = ForgeRegistries.BLOCKS.getKey(((BlockItem) itemStack.getItem()).getBlock()).toString();
                        containerBlocks.add(blockId);
                    }
                }
            });
        }
        else
        {
            player.sendSystemMessage(Component.literal("No storage container found at the specified location"));
            return;
        }

        writeToJson("container_blocks.json", containerBlocks, CONFIG_DIR);
    }

    public static void exportFTBQuestRewardsToJson(ServerPlayer player, BlockPos containerPos, String title) {
        List<String> rewards = new ArrayList<>();
        List<String> rewardsWithNBT = new ArrayList<>();
        BlockEntity blockEntity = player.level().getBlockEntity(containerPos);

        if (blockEntity instanceof Container) {
            Container container = (Container) blockEntity;
            for (int i = 0; i < container.getContainerSize(); i++) {
                ItemStack itemStack = container.getItem(i);
                if (!itemStack.isEmpty()) {
                    // Check if item has NBT data
                    if (itemStack.hasTag() && !itemStack.getTag().isEmpty()) {
                        rewardsWithNBT.add(constructNBTItemString(itemStack));
                    } else {
                        rewards.add(ForgeRegistries.ITEMS.getKey(itemStack.getItem()).toString());
                    }
                }
            }
        } else if (blockEntity != null && blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).isPresent()) {
            blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
                for (int i = 0; i < handler.getSlots(); i++) {
                    ItemStack itemStack = handler.getStackInSlot(i);
                    if (!itemStack.isEmpty()) {
                        if (itemStack.hasTag() && !itemStack.getTag().isEmpty()) {
                            rewardsWithNBT.add(constructNBTItemString(itemStack));
                        } else {
                            rewards.add(ForgeRegistries.ITEMS.getKey(itemStack.getItem()).toString());
                        }
                    }
                }
            });
        } else {
            player.sendSystemMessage(Component.literal("No storage container found at the specified location"));
            return;
        }

        // Check if file exists
        File snbtFile = new File(FTBQUESTREWARD_DIR, title.toLowerCase() + ".snbt");
        if (snbtFile.exists()) {
            // If the file exists, append the new rewards to the existing rewards
            String existingContent = readSnbtFile(snbtFile);
            String updatedContent = addRewardsToExistingSnbt(existingContent, rewards, rewardsWithNBT);
            writeToSnbtFile(title.toLowerCase() + ".snbt", updatedContent, FTBQUESTREWARD_DIR);
        } else {
            // If file does not exist, create a new one
            StringBuilder snbtBuilder = new StringBuilder();
            snbtBuilder.append("{\n")
                    .append("  hide_tooltip: true,\n")
                    .append("  icon: \"havenksh:research_tier_basic\",\n")  // Default icon
                    .append("  id: \"").append(generateRandomHexID()).append("\",\n")
                    .append("  loot_size: 1,\n")
                    .append("  order_index: 0,\n")
                    .append("  rewards: [\n");

            // Add basic items (without NBT)
            for (String reward : rewards) {
                snbtBuilder.append("    { item: \"").append(reward).append("\" },\n");
            }

            // Add items with NBT
            for (String rewardWithNBT : rewardsWithNBT) {
                snbtBuilder.append("    { item: ").append(rewardWithNBT).append(" },\n");
            }

            // Remove last comma
            if (!rewards.isEmpty() || !rewardsWithNBT.isEmpty()) {
                snbtBuilder.setLength(snbtBuilder.length() - 2);
            }

            snbtBuilder.append("\n  ],\n")
                    .append("  title: \"").append(title).append("\"\n")
                    .append("}");

            // Write to SNBT file
            writeToSnbtFile(title.toLowerCase() + ".snbt", snbtBuilder.toString(), FTBQUESTREWARD_DIR);
        }
    }

    public static void exportFTBQuestChapterToJson(String title, String modId) {
        List<String> modElements = new ArrayList<>();

        // Fetch mod's items
        for (var item : ForgeRegistries.ITEMS) {
            var itemKey = ForgeRegistries.ITEMS.getKey(item);
            if (itemKey != null && itemKey.getNamespace().equals(modId)) {
                modElements.add(itemKey.toString());
            }
        }

        // Fetch mod's blocks
        for (var block : ForgeRegistries.BLOCKS) {
            var blockKey = ForgeRegistries.BLOCKS.getKey(block);
            if (blockKey != null && blockKey.getNamespace().equals(modId)) {
                modElements.add(blockKey.toString());
            }
        }

        // Calculate total number of mod elements (items + blocks)
        int totalElements = modElements.size();
        if (totalElements == 0) {
            return; // No items or blocks, exit early
        }

        // Calculate rows and columns for a balanced grid (closest to square)
        int gridSize = (int) Math.ceil(Math.sqrt(totalElements)); // Square root to get approx grid size
        int rows = gridSize;
        int columns = (int) Math.ceil((double) totalElements / rows); // Adjust column count

        // Build SNBT for quests
        StringBuilder snbtBuilder = new StringBuilder();
        snbtBuilder.append("{\n")
                .append("  default_hide_dependency_lines: false,\n")
                .append("  default_quest_shape: \"\",\n")
                .append("  filename: \"").append(title.toLowerCase()).append("\",\n")
                .append("  group: \"").append(generateRandomHexID()).append("\",\n")
                .append("  id: \"").append(generateRandomHexID()).append("\",\n")
                .append("  order_index: 0,\n")
                .append("  quest_links: [ ],\n")
                .append("  quests: [\n");

        int elementIndex = 0;
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                if (elementIndex >= totalElements) {
                    break; // If we've processed all elements, break out
                }
                String element = modElements.get(elementIndex);

                // Append quest data for each element
                snbtBuilder.append("    {\n")
                        .append("      id: \"").append(generateRandomHexID()).append("\",\n")
                        .append("      tasks: [{ id: \"").append(generateRandomHexID()).append("\", item: \"").append(element).append("\", type: \"item\" }],\n")
                        .append("      x: ").append(x).append("d,\n")
                        .append("      y: ").append(y).append("d\n")
                        .append("    },\n");

                elementIndex++;
            }
        }

        // Remove last comma
        if (!modElements.isEmpty()) {
            snbtBuilder.setLength(snbtBuilder.length() - 2);
        }

        snbtBuilder.append("\n  ],\n")
                .append("  title: \"").append(title).append("\"\n")
                .append("}");

        // Write to SNBT file
        writeToSnbtFile(title.toLowerCase() + ".snbt", snbtBuilder.toString(), FTBQUEST_DIR);
    }

    private static String generateRandomHexID()
    {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase().substring(0, 16);
    }

    private static String readSnbtFile(File snbtFile) {
        try {
            return new String(Files.readAllBytes(snbtFile.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static String addRewardsToExistingSnbt(String existingContent, List<String> rewards, List<String> rewardsWithNBT) {
        StringBuilder newContent = new StringBuilder();

        // Find the "rewards" section and append new rewards
        int rewardsIndex = existingContent.indexOf("rewards: [");
        if (rewardsIndex != -1) {
            int rewardsEndIndex = existingContent.indexOf("]", rewardsIndex);
            if (rewardsEndIndex != -1) {
                newContent.append(existingContent, 0, rewardsEndIndex);

                // Add the new rewards (without NBT)
                for (String reward : rewards) {
                    newContent.append(",\n    { item: \"").append(reward).append("\" }");
                }

                // Add the new rewards (with NBT)
                for (String rewardWithNBT : rewardsWithNBT) {
                    newContent.append(",\n    { item: ").append(rewardWithNBT).append(" }");
                }

                // Append the rest of the file after the rewards section
                newContent.append(existingContent.substring(rewardsEndIndex));
            } else {
                // If no rewards section, just return the original content
                return existingContent;
            }
        }

        return newContent.toString();
    }

    private static String constructNBTItemString(ItemStack itemStack) {
        StringBuilder itemBuilder = new StringBuilder();
        String itemId = ForgeRegistries.ITEMS.getKey(itemStack.getItem()).toString();
        int count = itemStack.getCount();

        itemBuilder.append("{\n")
                .append("      Count: ").append(count).append(",\n")
                .append("      id: \"").append(itemId).append("\",\n");

        if (itemStack.hasTag()) {
            itemBuilder.append("      tag: {\n");

            // Handle custom NBT data
            if (itemStack.getTag().contains("Damage")) {
                itemBuilder.append("        Damage: ").append(itemStack.getTag().getInt("Damage")).append(",\n");
            }

            // Handle enchantments
            if (itemStack.getTag().contains("Enchantments")) {
                itemBuilder.append("        Enchantments: [\n");
                var enchantments = itemStack.getTag().getList("Enchantments", 10); // List of CompoundNBTs
                for (int i = 0; i < enchantments.size(); i++) {
                    var enchantment = enchantments.getCompound(i);
                    itemBuilder.append("          { id: \"")
                            .append(enchantment.getString("id"))
                            .append("\", lvl: ")
                            .append(enchantment.getShort("lvl"))
                            .append("s },\n");
                }
                itemBuilder.setLength(itemBuilder.length() - 2); // Remove last comma
                itemBuilder.append("\n        ],\n");
            }

            // Handle display names (if exists)
            if (itemStack.getTag().contains("display")) {
                var display = itemStack.getTag().getCompound("display");
                if (display.contains("Name")) {
                    itemBuilder.append("        display: {\n")
                            .append("          Name: ").append(display.getString("Name")).append("\n")
                            .append("        },\n");
                }
            }

            // Remove last comma
            if (itemBuilder.charAt(itemBuilder.length() - 2) == ',') {
                itemBuilder.setLength(itemBuilder.length() - 2);
            }

            itemBuilder.append("\n      }\n");
        }

        itemBuilder.append("    }");
        return itemBuilder.toString();
    }

    private static void writeToJson(String fileName, List<?> data, File directory)
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try
        {
            File file = new File(directory, fileName);

            if (!directory.exists())
            {
                directory.mkdirs();
            }

            try (FileWriter writer = new FileWriter(file, false))
            {
                gson.toJson(data, writer);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void writeToSnbtFile(String fileName, String snbtData, File directory) {
        try {
            File file = new File(directory, fileName);

            if (!directory.exists()) {
                directory.mkdirs();
            }

            try (FileWriter writer = new FileWriter(file, false)) {
                writer.write(snbtData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
