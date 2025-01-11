package net.cathienova.havenksh.item.artifacts;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;

public class Magnet extends ArtifactBase
{
    private final int range;
    public int getRange() {
        return range;
    }

    public Magnet(Properties properties, int range) {
        super(properties);
        this.range = range;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected)
    {
        Player player = (Player) entity;

        if (!level.isClientSide())
        {
            ServerPlayer serverPlayer = (ServerPlayer) player;
            if (!serverPlayer.isCrouching())
            {
                if (serverPlayer.tickCount % 5 == 0)
                {
                    attractItemsToPlayer(player, stack);
                }
            }
        }
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack)
    {
        Player player = (Player) slotContext.entity();

        if (player != null)
        {
            Level level = player.level();
            if (!level.isClientSide())
            {
                ServerPlayer serverPlayer = (ServerPlayer) player;
                if (!serverPlayer.isCrouching())
                {
                    if (serverPlayer.tickCount % 5 == 0)
                    {
                        attractItemsToPlayer(player, stack);
                    }
                }
            }
        }
    }

    private static void attractItemsToPlayer(Player player, ItemStack stack) {
        double x = player.getX();
        double y = player.getY();
        double z = player.getZ();
        int range = ((Magnet) stack.getItem()).getRange();

        List<ItemEntity> items = player.level().getEntitiesOfClass(ItemEntity.class,
                new AABB(x - range, y - range, z - range, x + range, y + range, z + range),
                entity -> true);

        for (ItemEntity item : items) {
            item.setPickUpDelay(1);
            Vec3 itemVector = new Vec3(item.getX(), item.getY(), item.getZ());
            Vec3 playerVector = new Vec3(x, y + 0.03, z);
            Vec3 motion = playerVector.subtract(itemVector).scale(0.5);
            item.setDeltaMovement(motion);
        }
    }

    @Override
    protected boolean isCosmetic()
    {
        return false;
    }
}
