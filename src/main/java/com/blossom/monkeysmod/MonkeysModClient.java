package com.blossom.monkeysmod;

import com.blossom.monkeysmod.entity.ModEntities;
import com.blossom.monkeysmod.entity.client.ModModelLayers;
import com.blossom.monkeysmod.entity.client.MonkeyRenderer;
import com.blossom.monkeysmod.entity.client.model.MonkeyModel;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MonkeysModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MONKEY, MonkeyModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MONKEY, MonkeyRenderer::new);
    }
}
