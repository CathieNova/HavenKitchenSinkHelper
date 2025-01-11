package net.cathienova.havenksh.handler;

import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.config.CommonConfig;
import net.cathienova.havenksh.config.HavenConfig;
import net.cathienova.havenksh.item.ModItems;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

@EventBusSubscriber(modid = HavenKSH.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class MobDropHandler
{
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onLivingDrops(LivingDropsEvent event){
        var entity = event.getEntity();
        var level = event.getEntity().level();
        int dragonScaleDropChance = HavenConfig.dragonScaleDropChance;

        if(!level.getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT)) return;

        var drops = event.getDrops();
        Random random = new Random();
        int dragonScaleDropAmount = HavenConfig.dragonScaleDropAmount;
        dragonScaleDropAmount = random.nextInt(1, dragonScaleDropAmount);

        if (entity != null && random.nextInt(0,100) < dragonScaleDropChance)
        {
            if (entity instanceof EnderDragon)
                drops.add(new ItemEntity(level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(ModItems.dragon_scale.get(), dragonScaleDropAmount)));
        }
    }
}