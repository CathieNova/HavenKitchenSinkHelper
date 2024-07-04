package net.cathienova.havenksh.datagen;

import net.cathienova.havenksh.HavenKSH;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider
{
    public ModGlobalLootModifiersProvider(PackOutput output)
    {
        super(output, HavenKSH.MOD_ID);
    }

    @Override
    protected void start()
    {
    }
}
