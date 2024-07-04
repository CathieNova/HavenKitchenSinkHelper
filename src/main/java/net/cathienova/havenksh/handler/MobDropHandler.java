package net.cathienova.havenksh.handler;

import net.cathienova.havenksh.config.HavenConfig;
import net.cathienova.havenksh.item.ModItems;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;

public class MobDropHandler
{
    @SubscribeEvent
    public void onLivingDrops(LivingDropsEvent event){
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