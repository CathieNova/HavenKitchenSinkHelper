package net.cathienova.havenksh.compat;

import net.cathienova.havenksh.block.mobseeds.MobSeedBlock;
import net.cathienova.havenksh.block.mobseeds.MobSeedEntity;
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
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(MobSeedComponentProvider.INSTANCE, MobSeedBlock.class);
    }
}
