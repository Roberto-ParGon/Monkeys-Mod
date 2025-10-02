package com.blossom.monkeysmod.entity.client;

import com.blossom.monkeysmod.entity.MonkeyEntity;
import com.blossom.monkeysmod.entity.client.model.MonkeyModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class MonkeyRenderer extends MobEntityRenderer<MonkeyEntity, LivingEntityRenderState, MonkeyModel>{

    private static final Identifier TEXTURE = Identifier.of("monkeysmod", "textures/entity/monkey.png");

    public MonkeyRenderer(EntityRendererFactory.Context context) {
        super(context, new MonkeyModel(context.getPart(ModModelLayers.MONKEY)), 0.4f);
    }

    public LivingEntityRenderState createRenderState(MonkeyEntity entity, float tickDelta) {
        LivingEntityRenderState state = new LivingEntityRenderState();
        return state;
    }


    @Override
    public LivingEntityRenderState createRenderState() {
        return new LivingEntityRenderState();
    }

    @Override
    public Identifier getTexture(LivingEntityRenderState state) {
        return TEXTURE;
    }

}
