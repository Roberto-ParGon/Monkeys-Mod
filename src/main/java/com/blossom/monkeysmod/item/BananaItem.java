package com.blossom.monkeysmod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.particle.ParticleTypes;

public class BananaItem extends Item {

    public BananaItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient) {
            ItemStack peeled = new ItemStack(ModItems.PEELED_BANANA);

            if (!player.getInventory().insertStack(peeled)) {
                player.dropItem(peeled, false);
            }
            stack.decrement(1);

            world.playSound(
                    null,
                    player.getX(),
                    player.getY(),
                    player.getZ(),
                    SoundEvents.ENTITY_GENERIC_EAT,
                    SoundCategory.PLAYERS,
                    1.0f,
                    1.0f
            );
        } else {
            for (int i = 0; i < 8; i++) {
                world.addParticleClient(
                        new ItemStackParticleEffect(ParticleTypes.ITEM, new ItemStack(ModItems.BANANA)),
                        player.getX(),
                        player.getBodyY(0.5),
                        player.getZ(),
                        (world.random.nextDouble() - 0.5) * 0.2,
                        0.1,
                        (world.random.nextDouble() - 0.5) * 0.2
                );
            }
        }

        return ActionResult.SUCCESS;
    }
}
