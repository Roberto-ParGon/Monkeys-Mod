package com.blossom.monkeysmod.entity.client;

import com.blossom.monkeysmod.entity.MonkeyEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.state.CatEntityRenderState;
import net.minecraft.util.Identifier;

public class MonkeyRenderer extends MobEntityRenderer<MonkeyEntity, CatEntityRenderState, CatEntityModel> {

    // Puedes usar tu textura personalizada:
    // private static final Identifier TEXTURE = Identifier.of("monkeysmod", "textures/entity/monkey.png");
    // O usar la textura vanilla de ocelote como placeholder:
    private static final Identifier TEXTURE = Identifier.of("monkeysmod", "textures/entity/monkey.png");

    public MonkeyRenderer(EntityRendererFactory.Context context) {
        super(context, new CatEntityModel(context.getPart(EntityModelLayers.CAT)), 0.4f);
    }

    @Override
    public CatEntityRenderState createRenderState() {
        return new CatEntityRenderState();
    }

    @Override
    public Identifier getTexture(CatEntityRenderState state) {
        return TEXTURE;
    }
}
