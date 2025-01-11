package net.cathienova.havenksh.compat;

import net.cathienova.havenksh.block.cobblegen.*;
import net.cathienova.havenksh.block.mobseeds.MobSeedBlock;
import net.cathienova.havenksh.block.mobseeds.MobSeedEntity;
import net.cathienova.havenksh.compat.jade.CobbleGenComponentProvider;
import net.cathienova.havenksh.compat.jade.CobbleGenDataProvider;
import net.cathienova.havenksh.compat.jade.MobSeedComponentProvider;
import net.cathienova.havenksh.compat.jade.MobSeedDataProvider;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class JadePlugin implements IWailaPlugin {
    @Override
    public void register(IWailaCommonRegistration registration) {
        registration.registerBlockDataProvider(MobSeedDataProvider.INSTANCE, MobSeedEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, WoodenCobbleGenEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, StoneCobbleGenEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, IronCobbleGenEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, GoldCobbleGenEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, DiamondCobbleGenEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, EmeraldCobbleGenEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, NetheriteCobbleGenEntity.class);
        registration.registerBlockDataProvider(CobbleGenDataProvider.INSTANCE, CreativeCobbleGenEntity.class);
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(MobSeedComponentProvider.INSTANCE, MobSeedBlock.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, WoodenCobbleGen.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, StoneCobbleGen.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, IronCobbleGen.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, GoldCobbleGen.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, DiamondCobbleGen.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, EmeraldCobbleGen.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, NetheriteCobbleGen.class);
        registration.registerBlockComponent(CobbleGenComponentProvider.INSTANCE, CreativeCobbleGen.class);
    }
}
