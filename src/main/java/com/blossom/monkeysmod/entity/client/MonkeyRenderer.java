package com.blossom.monkeysmod.entity.client;

import com.blossom.monkeysmod.MonkeysMod;
import com.blossom.monkeysmod.entity.MonkeyEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class MonkeyRenderer extends MobEntityRenderer<MonkeyEntity, LivingEntityRenderState, EmptyModel> {

    private static final Identifier TEXTURE = Identifier.of(MonkeysMod.MOD_ID, "textures/entity/monkey.png");

    public MonkeyRenderer(EntityRendererFactory.Context context) {
        super(context, new EmptyModel(context.getPart(EntityModelLayers.PLAYER)), 0.4f);
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
