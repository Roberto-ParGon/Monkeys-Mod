package com.blossom.monkeysmod;

import com.blossom.monkeysmod.entity.ModEntities;
import com.blossom.monkeysmod.entity.client.MonkeyRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MonkeysModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MONKEY, MonkeyRenderer::new);
    }
}
