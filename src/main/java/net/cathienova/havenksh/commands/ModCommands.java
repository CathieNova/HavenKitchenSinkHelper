package net.cathienova.havenksh.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.cathienova.havenksh.util.JsonExportHelper;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import static net.cathienova.havenksh.util.JsonExportHelper.exportFTBQuestRewardsToJson;

public class ModCommands
{

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher)
    {
        dispatcher.register(Commands.literal("havenksh")
                .requires(cs -> cs.hasPermission(2))
                .then(Commands.literal("admin")
                        .then(Commands.literal("reload")
                                .executes(ModCommands::reloadConfig))
                        .then(Commands.literal("generatejsons")
                                .then(Commands.literal("items")
                                        .executes(ModCommands::generateItemJsons))
                                .then(Commands.literal("mobs")
                                        .executes(ModCommands::generateMobJsons))
                                .then(Commands.literal("blocks")
                                        .executes(ModCommands::generateBlockJsons))
                                .then(Commands.literal("chest")
                                        .then(Commands.literal("items")
                                                .executes(ModCommands::generateChestItemsJsons))
                                        .then(Commands.literal("blocks")
                                                .executes(ModCommands::generateChestBlocksJsons)))
                                .then(Commands.literal("tags")
                                        .then(Commands.argument("tagname", StringArgumentType.string())
                                                .then(Commands.literal("items")
                                                        .executes(context ->
                                                        {
                                                            String tagName = StringArgumentType.getString(context, "tagname");
                                                            JsonExportHelper.exportItemTagsToJson(tagName);
                                                            return 1;
                                                        }))
                                                .then(Commands.literal("blocks")
                                                        .executes(context ->
                                                        {
                                                            String tagName = StringArgumentType.getString(context, "tagname");
                                                            JsonExportHelper.exportBlockTagsToJson(tagName);
                                                            return 1;
                                                        }))))
                                .then(Commands.literal("moditems")
                                        .then(Commands.argument("modid", StringArgumentType.string())
                                                .executes(ModCommands::generateModItemsJsons)))
                                .then(Commands.literal("modblocks")
                                        .then(Commands.argument("modid", StringArgumentType.string())
                                                .executes(ModCommands::generateModBlocksJsons)))
                                .then(Commands.literal("ftbquestrewards")
                                        .then(Commands.argument("title", StringArgumentType.string())
                                                .executes(ModCommands::generateFTBQuestRewardsJson)))
                                .then(Commands.literal("ftbquestchapter")
                                        .then(Commands.argument("title", StringArgumentType.string())
                                                .then(Commands.argument("modid", StringArgumentType.string())
                                                        .executes(ModCommands::generateFTBQuestChapterJson))))

                        )));
    }

    private static int generateItemJsons(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        return executeJsonExport(context, JsonExportHelper::exportItemsToJson);
    }

    private static int generateMobJsons(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        return executeJsonExport(context, JsonExportHelper::exportEntityTypesToJson);
    }

    private static int generateBlockJsons(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        return executeJsonExport(context, JsonExportHelper::exportBlocksToJson);
    }

    private static int generateModItemsJsons(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        String modId = StringArgumentType.getString(context, "modid");
        JsonExportHelper.exportModItemsToJson(modId);
        return 1;
    }

    private static int generateModBlocksJsons(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        String modId = StringArgumentType.getString(context, "modid");
        JsonExportHelper.exportModBlocksToJson(modId);
        return 1;
    }

    private static int generateChestItemsJsons(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        return exportChestJsons(context, JsonExportHelper::exportContainerItemsToJson);
    }

    private static int generateChestBlocksJsons(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        return exportChestJsons(context, JsonExportHelper::exportContainerBlocksToJson);
    }

    private static int generateFTBQuestChapterJson(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        String title = StringArgumentType.getString(context, "title");
        String modId = StringArgumentType.getString(context, "modid");

        JsonExportHelper.exportFTBQuestChapterToJson(title, modId);
        return 1;
    }

    private static int exportChestJsons(CommandContext<CommandSourceStack> context, ChestJsonExporter exporter) throws CommandSyntaxException
    {
        ServerPlayer player = context.getSource().getPlayerOrException();
        BlockPos chestPos = getTargetBlockPos(player);
        if (chestPos != null)
        {
            exporter.export(player, chestPos);
            return 1;
        }
        else
        {
            player.sendSystemMessage(Component.translatable("command.havenksh.no_block_targeted"));
            return 0;
        }
    }

    private static BlockPos getTargetBlockPos(ServerPlayer player)
    {
        double reach = 6;
        Vec3 eyePosition = player.getEyePosition(1.0F);
        Vec3 lookVector = player.getViewVector(1.0F);
        Vec3 reachVector = eyePosition.add(lookVector.x * reach, lookVector.y * reach, lookVector.z * reach);
        BlockHitResult hitResult = player.level().clip(new ClipContext(eyePosition, reachVector, ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, player));

        if (hitResult.getType() == HitResult.Type.BLOCK)
        {
            return hitResult.getBlockPos();
        }
        return null;
    }

    private static int generateFTBQuestRewardsJson(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        ServerPlayer player = context.getSource().getPlayerOrException();
        BlockPos chestPos = getTargetBlockPos(player);
        String title = StringArgumentType.getString(context, "title");

        if (chestPos != null)
        {
            exportFTBQuestRewardsToJson(player, chestPos, title);
            return 1;
        }
        else
        {
            player.sendSystemMessage(Component.translatable("command.havenksh.no_block_targeted"));
            return 0;
        }
    }

    private static int reloadConfig(CommandContext<CommandSourceStack> context) throws CommandSyntaxException
    {
        return ReloadConfig(context);
    }

    private static int NoPermissionToReload(CommandContext<CommandSourceStack> context, String translationKey)
    {
        context.getSource().sendFailure(Component.translatable(translationKey));
        return 0;
    }

    private static int ReloadConfig(CommandContext<CommandSourceStack> context)
    {
        /*if (HavenKSH.reloadConfigs()) {
            context.getSource().sendSuccess(() -> Component.translatable("command.havenksh.config_reload_success"), true);
            return 1;
        } else {
            return NoPermissionToReload(context, "command.havenksh.config_reload_fail");
        }*/
        return -1;
    }

    @FunctionalInterface
    private interface ChestJsonExporter
    {
        void export(ServerPlayer player, BlockPos chestPos) throws CommandSyntaxException;
    }

    private static int executeJsonExport(CommandContext<CommandSourceStack> context, Runnable exportTask) throws CommandSyntaxException
    {
        ServerPlayer player = context.getSource().getPlayerOrException();
        exportTask.run();
        return 1;
    }
}
