package com.blossom.monkeysmod.entity.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;

public class EmptyModel extends EntityModel<LivingEntityRenderState> {
    public EmptyModel(ModelPart root) {
        super(root);
    }

    @Override
    public void setAngles(LivingEntityRenderState state) {
    }
}
