package net.cathienova.havenksh.events;

import com.mojang.blaze3d.vertex.PoseStack;
import net.cathienova.havenksh.HavenKSH;
import net.cathienova.havenksh.block.mobseeds.MobSeedEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
public class MobSeedRenderer<T extends MobSeedEntity<?>> implements BlockEntityRenderer<T> {
    private final EntityRenderDispatcher dispatcher;

    public MobSeedRenderer() {
        this.dispatcher = null;//Minecraft.getInstance().getEntityRenderDispatcher();
    }

    public MobSeedRenderer(BlockEntityRendererProvider.Context context)
    {
        this.dispatcher = Minecraft.getInstance().getEntityRenderDispatcher();
    }

    @Override
    public void render(T blockEntity, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
        blockEntity.requestModelDataUpdate();
        Level level = blockEntity.getLevel();
        if (level != null) {
            matrixStack.pushPose();
            matrixStack.translate(0.5, 0, 0.5);

            EntityType<?> entityType = blockEntity.getEntityType();
            Mob mob = (Mob) entityType.create(level);
            if (mob != null) {
                if (mob instanceof AgeableMob) {
                    mob.setBaby(true);
                }
                mob.setInvulnerable(true);
                mob.setNoAi(true);
                mob.setNoGravity(true);
                mob.yBodyRot = 0;
                mob.yHeadRot = 0;
                mob.yHeadRotO = 0;
                mob.xRotO = 0;
                mob.tickCount = 0;
                float scale = blockEntity.getGrowthScale();
                matrixStack.scale(scale, scale, scale);

                dispatcher.render(mob, 0, 0, 0, 0, partialTicks, matrixStack, buffer, combinedLight);
            }

            matrixStack.popPose();
        }
    }

    @Override
    public boolean shouldRenderOffScreen(T blockEntity) {
        return true;
    }
}
