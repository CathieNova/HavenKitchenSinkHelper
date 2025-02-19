package net.cathienova.havenksh.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.core.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.fml.loading.FMLPaths;

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
    private static final File FTBQUESTLANG_DIR = FMLPaths.CONFIGDIR.get().resolve("ftbquests/quests/lang").toFile();

    public static void exportItemsToJson()
    {
        List<String> items = new ArrayList<>();
        for (var item : BuiltInRegistries.ITEM)
        {
            items.add(BuiltInRegistries.ITEM.getKey(item).toString());
        }

        Collections.sort(items);
        writeToJson("items.json", items, CONFIG_DIR);
    }

    public static void exportEntityTypesToJson()
    {
        List<String> entityTypes = new ArrayList<>();
        for (var entityType : BuiltInRegistries.ENTITY_TYPE)
        {
            entityTypes.add(BuiltInRegistries.ENTITY_TYPE.getKey(entityType).toString());
        }

        Collections.sort(entityTypes);
        writeToJson("mobs.json", entityTypes, CONFIG_DIR);
    }

    public static void exportBlocksToJson()
    {
        List<String> blocks = new ArrayList<>();
        for (var block : BuiltInRegistries.BLOCK)
        {
            blocks.add(BuiltInRegistries.BLOCK.getKey(block).toString());
        }

        Collections.sort(blocks);
        writeToJson("blocks.json", blocks, CONFIG_DIR);
    }

    public static void exportItemTagsToJson(String tagName)
    {
        List<String> taggedItems = new ArrayList<>();
        String actualTagName = tagName.replace('_', ':');
        var tagResource = ResourceLocation.parse(actualTagName);
        var itemTagKey = ItemTags.create(tagResource);
        Registry<Item> itemRegistry = BuiltInRegistries.ITEM;

        if (itemRegistry.containsKey(itemTagKey.location())) {
            HolderLookup<Item> itemHolderLookup = itemRegistry.asLookup();
            Optional<HolderSet.Named<Item>> tagItems = itemHolderLookup.get(itemTagKey);

            tagItems.ifPresent(holders -> holders.forEach(item ->
            {
                taggedItems.add(Objects.requireNonNull(item.getKey()).toString());
            }));
        }

        Collections.sort(taggedItems);
        writeToJson("item_tags_" + actualTagName.replace(':', '_') + ".json", taggedItems, CONFIG_DIR);
    }

    public static void exportBlockTagsToJson(String tagName)
    {
        List<String> taggedBlocks = new ArrayList<>();
        String actualTagName = tagName.replace('_', ':');
        var tagResource = ResourceLocation.parse(actualTagName);
        var itemTagKey = BlockTags.create(tagResource);
        Registry<Block> blockRegistry = BuiltInRegistries.BLOCK;

        if (blockRegistry.containsKey(itemTagKey.location())) {
            HolderLookup<Block> itemHolderLookup = blockRegistry.asLookup();
            Optional<HolderSet.Named<Block>> tagBlocks = itemHolderLookup.get(itemTagKey);

            tagBlocks.ifPresent(holders -> holders.forEach(block ->
            {
                taggedBlocks.add(Objects.requireNonNull(block.getKey()).toString());
            }));
        }

        Collections.sort(taggedBlocks);
        writeToJson("block_tags_" + actualTagName.replace(':', '_') + ".json", taggedBlocks, CONFIG_DIR);
    }

    public static void exportModItemsToJson(String modId)
    {
        List<String> modItems = new ArrayList<>();
        for (var item : BuiltInRegistries.ITEM)
        {
            var itemKey = BuiltInRegistries.ITEM.getKey(item);
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
        for (var block : BuiltInRegistries.BLOCK)
        {
            var blockKey = BuiltInRegistries.BLOCK.getKey(block);
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
                    String itemId = BuiltInRegistries.ITEM.getKey(itemStack.getItem()).toString();
                    int amount = itemStack.getCount();
                    itemData.put("item", itemId);
                    itemData.put("amount", amount);
                    containerItems.add(itemData);
                }
            }
        }
        /*else if (blockEntity != null && blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).isPresent())
        {
            blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler ->
            {
                for (int i = 0; i < handler.getSlots(); i++)
                {
                    ItemStack itemStack = handler.getStackInSlot(i);
                    if (!itemStack.isEmpty())
                    {
                        Map<String, Object> itemData = new HashMap<>();
                        String itemId = BuiltInRegistries.ITEM.getKey(itemStack.getItem()).toString();
                        int amount = itemStack.getCount();
                        itemData.put("item", itemId);
                        itemData.put("amount", amount);
                        containerItems.add(itemData);
                    }
                }
            });
        }*/
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
                    String blockId = BuiltInRegistries.BLOCK.getKey(((BlockItem) itemStack.getItem()).getBlock()).toString();
                    containerBlocks.add(blockId);
                }
            }
        }
        /*else if (blockEntity != null && blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).isPresent())
        {
            blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler ->
            {
                for (int i = 0; i < handler.getSlots(); i++)
                {
                    ItemStack itemStack = handler.getStackInSlot(i);
                    if (!itemStack.isEmpty() && itemStack.getItem() instanceof BlockItem)
                    {
                        String blockId = BuiltInRegistries.BLOCK.getKey(((BlockItem) itemStack.getItem()).getBlock()).toString();
                        containerBlocks.add(blockId);
                    }
                }
            });
        }*/
        else
        {
            player.sendSystemMessage(Component.literal("No storage container found at the specified location"));
            return;
        }

        writeToJson("container_blocks.json", containerBlocks, CONFIG_DIR);
    }

    public static void exportFTBQuestRewardsToJson(ServerPlayer player, BlockPos containerPos, String title) {
        List<Map<String, Object>> rewards = new ArrayList<>();

        BlockEntity blockEntity = player.level().getBlockEntity(containerPos);

        if (blockEntity instanceof ChestBlockEntity chestEntity) {
            // Handle single or double chest inventory
            BlockState state = player.level().getBlockState(containerPos);
            if (state.getBlock() instanceof ChestBlock chestBlock) {
                Container inventory = ChestBlock.getContainer(chestBlock, state, player.level(), containerPos, false);
                if (inventory != null) {
                    for (int i = 0; i < inventory.getContainerSize(); i++) {
                        ItemStack itemStack = inventory.getItem(i);
                        if (!itemStack.isEmpty()) {
                            Map<String, Object> reward = new HashMap<>();
                            reward.put("count", itemStack.getCount());
                            reward.put("item_id", BuiltInRegistries.ITEM.getKey(itemStack.getItem()).toString());
                            rewards.add(reward);
                        }
                    }
                }
            }
        } else if (blockEntity instanceof Container container) {
            // Handle generic containers
            for (int i = 0; i < container.getContainerSize(); i++) {
                ItemStack itemStack = container.getItem(i);
                if (!itemStack.isEmpty()) {
                    Map<String, Object> reward = new HashMap<>();
                    reward.put("count", itemStack.getCount());
                    reward.put("item_id", BuiltInRegistries.ITEM.getKey(itemStack.getItem()).toString());
                    rewards.add(reward);
                }
            }
        } else {
            player.sendSystemMessage(Component.literal("No valid container found at the specified location"));
            return;
        }

        String rewardTableId = generateRandomHexID();
        File snbtFile = new File(FTBQUESTREWARD_DIR, title.toLowerCase() + ".snbt");

        if (snbtFile.exists()) {
            String existingContent = readSnbtFile(snbtFile);
            String updatedContent = addRewardsToExistingSnbt(existingContent, rewards);
            writeToSnbtFile(title.toLowerCase() + ".snbt", updatedContent, FTBQUESTREWARD_DIR);
        } else {
            StringBuilder snbtBuilder = new StringBuilder();
            snbtBuilder.append("{\n")
                    .append("  id: \"").append(rewardTableId).append("\",\n")
                    .append("  loot_size: 1,\n")
                    .append("  order_index: 0,\n")
                    .append("  rewards: [\n");

            for (int i = 0; i < rewards.size(); i++) {
                snbtBuilder.append("    {\n")
                        .append("      count: ").append(rewards.get(i).get("count")).append(",\n")
                        .append("      id: \"").append(generateRandomHexID()).append("\",\n")
                        .append("      item: {\n")
                        .append("        count: ").append(rewards.get(i).get("count")).append(",\n")
                        .append("        id: \"").append(rewards.get(i).get("item_id")).append("\"\n")
                        .append("      }\n")
                        .append("    }");
                if (i < rewards.size() - 1) {
                    snbtBuilder.append(",");
                }
                snbtBuilder.append("\n");
            }

            snbtBuilder.append("  ]\n")
                    .append("}");

            writeToSnbtFile(title.toLowerCase() + ".snbt", snbtBuilder.toString(), FTBQUESTREWARD_DIR);
        }

        addRewardTableToLangFile(rewardTableId, title);
    }

    private static void addRewardTableToLangFile(String rewardTableId, String title) {
        File langFile = new File(FTBQUESTLANG_DIR + "/en_us.snbt");

        // Ensure the directories exist
        if (!langFile.getParentFile().exists()) {
            langFile.getParentFile().mkdirs();
        }

        // Ensure the file exists and is initialized
        if (!langFile.exists()) {
            try {
                langFile.createNewFile();
                try (FileWriter writer = new FileWriter(langFile, false)) {
                    writer.write("{\n}\n"); // Write an empty structure
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        StringBuilder langContent = new StringBuilder();

        // Read the content of the file
        try {
            langContent.append(new String(Files.readAllBytes(langFile.toPath())));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        String langEntry = "    reward_table." + rewardTableId + ".title: \"" + title + "\"";

        // Check if the entry already exists
        if (langContent.toString().contains(langEntry)) {
            return; // Do nothing if the entry already exists
        }

        // Find the closing brace
        int closingBraceIndex = langContent.lastIndexOf("}");
        if (closingBraceIndex == -1) {
            // If the structure is malformed, reinitialize it
            langContent.setLength(0);
            langContent.append("{\n}\n");
            closingBraceIndex = langContent.lastIndexOf("}");
        }

        // Check if there are existing entries
        boolean hasEntries = langContent.lastIndexOf(":") != -1;

        // Insert the new entry
        if (hasEntries) {
            // Add a comma to the last entry if not already present
            int lastEntryIndex = langContent.lastIndexOf("\n", closingBraceIndex - 1);
            if (lastEntryIndex != -1) {
                int lastCharIndex = closingBraceIndex - 1;
                if (langContent.charAt(lastCharIndex) != ',') {
                    langContent.insert(lastCharIndex, ",");
                }
            }
            // Add the new entry with no extra newline
            langContent.insert(closingBraceIndex, "\n" + langEntry);
        } else {
            // Add the first entry with proper indentation
            langContent.insert(closingBraceIndex, langEntry + "\n");
        }

        // Write the updated content back to the file
        try (FileWriter writer = new FileWriter(langFile, false)) {
            writer.write(langContent.toString().trim() + "\n"); // Ensure a single newline at the end of the file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportFTBQuestChapterToJson(String title, String modId) {
        List<String> modElements = new ArrayList<>();
        String transformedTitle = formatTitle(title);

        // Fetch mod's items
        for (var item : BuiltInRegistries.ITEM) {
            var itemKey = BuiltInRegistries.ITEM.getKey(item);
            if (itemKey != null && itemKey.getNamespace().equals(modId)) {
                modElements.add(itemKey.toString());
            }
        }

        // Fetch mod's blocks
        for (var block : BuiltInRegistries.BLOCK) {
            var blockKey = BuiltInRegistries.BLOCK.getKey(block);
            if (blockKey != null && blockKey.getNamespace().equals(modId)) {
                modElements.add(blockKey.toString());
            }
        }

        // Calculate total number of mod elements
        int totalElements = modElements.size();
        if (totalElements == 0) {
            return; // No items or blocks, exit early
        }

        // Calculate rows and columns for a balanced grid
        int gridSize = (int) Math.ceil(Math.sqrt(totalElements));
        int rows = gridSize;
        int columns = (int) Math.ceil((double) totalElements / rows);

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
                    break; // If we've processed all elements, exit loop
                }
                String element = modElements.get(elementIndex);

                // Append quest data for each element
                snbtBuilder.append("    {\n")
                        .append("      id: \"").append(generateRandomHexID()).append("\",\n")
                        .append("      tasks: [{\n")
                        .append("        id: \"").append(generateRandomHexID()).append("\",\n")
                        .append("        item: { count: 1, id: \"").append(element).append("\" },\n")
                        .append("        type: \"item\"\n")
                        .append("      }],\n")
                        .append("      rewards: [{\n")
                        .append("        id: \"").append(generateRandomHexID()).append("\",\n")
                        .append("        item: { count: 1, id: \"").append(element).append("\" },\n")
                        .append("        type: \"item\"\n")
                        .append("      }],\n")
                        .append("      x: ").append(x).append(".0d,\n")
                        .append("      y: ").append(y).append(".0d\n")
                        .append("    },\n");

                elementIndex++;
            }
        }

        // Remove last comma
        if (!modElements.isEmpty()) {
            snbtBuilder.setLength(snbtBuilder.length() - 2);
        }

        snbtBuilder.append("\n  ],\n")
                .append("  title: \"").append(transformedTitle).append("\"\n")
                .append("}");

        // Write to SNBT file
        writeToSnbtFile(title.toLowerCase() + ".snbt", snbtBuilder.toString(), FTBQUEST_DIR);
    }

    private static String formatTitle(String title) {
        // Replace underscores with spaces
        title = title.replace("_", " ");
        // Capitalize each word
        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();
        for (String word : words) {
            capitalizedTitle.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase()).append(" ");
        }
        return capitalizedTitle.toString().trim();
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

    private static String addRewardsToExistingSnbt(String existingContent, List<Map<String, Object>> rewards) {
        StringBuilder newContent = new StringBuilder();

        // Find the "rewards" section and append new rewards
        int rewardsIndex = existingContent.indexOf("rewards: [");
        if (rewardsIndex != -1) {
            int rewardsEndIndex = existingContent.indexOf("]", rewardsIndex);
            if (rewardsEndIndex != -1) {
                // Copy existing content up to the end of the rewards list
                newContent.append(existingContent, 0, rewardsEndIndex);

                // Check if the last reward in the existing content ends with a comma
                boolean hasExistingRewards = existingContent.substring(rewardsIndex, rewardsEndIndex).contains("{");

                // Add a comma if there are existing rewards
                if (hasExistingRewards) {
                    newContent.append(",\n");
                }

                // Add the new rewards
                for (Map<String, Object> reward : rewards) {
                    newContent.append("    { count: ").append(reward.get("count"))
                            .append(", item: \"").append(reward.get("item")).append("\" },\n");
                }

                // Remove the last comma
                if (newContent.charAt(newContent.length() - 2) == ',') {
                    newContent.setLength(newContent.length() - 2);
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
        String itemId = BuiltInRegistries.ITEM.getKey(itemStack.getItem()).toString();
        int count = itemStack.getCount();

        itemBuilder.append("{\n")
                .append("  Count: ").append(count).append(",\n")
                .append("  id: \"").append(itemId).append("\"");

        // Handle custom components
        var components = itemStack.getComponents();
        if (!components.isEmpty()) {
            itemBuilder.append(",\n  components: {\n");

            // Handle damage (if applicable)
            if (itemStack.isDamageableItem()) {
                int damage = itemStack.getDamageValue();
                itemBuilder.append("    Damage: ").append(damage).append(",\n");
            }

            // Handle enchantments
            ItemEnchantments enchantments = itemStack.getEnchantments();
            if (!enchantments.isEmpty()) {
                itemBuilder.append("    Enchantments: [\n");
                for (var entry : enchantments.entrySet()) {
                    Holder<Enchantment> enchantment = entry.getKey();
                    int level = entry.getValue();
                    String enchantmentId = enchantment.unwrapKey().map(ResourceKey::location).orElseThrow().toString();
                    itemBuilder.append("      { id: \"").append(enchantmentId).append("\", lvl: ").append(level).append(" },\n");
                }
                itemBuilder.setLength(itemBuilder.length() - 2); // Remove the last comma
                itemBuilder.append("\n    ],\n");
            }

            // Handle display properties
            Component displayName = itemStack.getHoverName();
            if (displayName != null) {
                itemBuilder.append("    display: {\n")
                        .append("      Name: \"").append(displayName.getString()).append("\"\n")
                        .append("    },\n");
            }

            // Remove trailing comma
            if (itemBuilder.charAt(itemBuilder.length() - 2) == ',') {
                itemBuilder.setLength(itemBuilder.length() - 2);
            }

            itemBuilder.append("\n  }");
        }

        itemBuilder.append("\n}");
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

    public static void exportAllTagsToJson() {
        List<String> itemTags = new ArrayList<>();
        List<String> blockTags = new ArrayList<>();

        // Retrieve all Item tags
        BuiltInRegistries.ITEM.asLookup().listTags().forEach(tagKey -> {
            if (tagKey != null) {
                itemTags.add(tagKey.key().location().toString());
            }
        });

        // Sort and write item tags to JSON
        Collections.sort(itemTags);
        writeToJson("all_item_tags.json", itemTags, CONFIG_DIR);

        // Retrieve all Block tags
        BuiltInRegistries.BLOCK.asLookup().listTags().forEach(tagKey -> {
            if (tagKey != null) {
                blockTags.add(tagKey.key().location().toString());
            }
        });

        // Sort and write block tags to JSON
        Collections.sort(blockTags);
        writeToJson("all_block_tags.json", blockTags, CONFIG_DIR);
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
