package net.cathienova.havenksh.item.artifacts;

import io.wispforest.accessories.api.slot.SlotReference;
import net.cathienova.havenksh.config.HavenConfig;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RepairTalisman extends ArtifactBase
{
    /*public RepairTalisman(Properties properties) {
        super(properties);
    }*/

    @Override
    public void tick(ItemStack stack, SlotReference reference)
    {
        Player player = (Player) reference.entity();

        if (player != null)
        {
            Level level = player.level();
            if (!level.isClientSide())
            {
                ServerPlayer serverPlayer = (ServerPlayer) player;

                if (serverPlayer.tickCount % HavenConfig.mendingNecklaceRepairInterval == 0)
                {
                    repairItems(serverPlayer);
                }
            }
        }
    }

    private static void repairItems(ServerPlayer serverPlayer) {
        serverPlayer.getInventory().items.forEach(itemStack -> {
            if (!itemStack.isEmpty() && itemStack.isDamaged()) {
                itemStack.setDamageValue(itemStack.getDamageValue() - 1);
            }
        });

        serverPlayer.getInventory().armor.forEach(itemStack -> {
            if (!itemStack.isEmpty() && itemStack.isDamaged()) {
                itemStack.setDamageValue(itemStack.getDamageValue() - 1);
            }
        });

        serverPlayer.getInventory().offhand.forEach(itemStack -> {
            if (!itemStack.isEmpty() && itemStack.isDamaged()) {
                itemStack.setDamageValue(itemStack.getDamageValue() - 1);
            }
        });
    }

    /*@Override
    protected boolean isCosmetic()
    {
        return false;
    }*/
}
