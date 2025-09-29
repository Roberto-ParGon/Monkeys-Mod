package com.blossom.monkeysmod.entity;

import com.blossom.monkeysmod.MonkeysMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final RegistryKey<EntityType<?>> MONKEY_KEY =
            RegistryKey.of(Registries.ENTITY_TYPE.getKey(), Identifier.of(MonkeysMod.MOD_ID, "monkey"));


    public static final EntityType<MonkeyEntity> MONKEY = Registry.register(
            Registries.ENTITY_TYPE,
            MONKEY_KEY.getValue(),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MonkeyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.2f))
                    .build(MONKEY_KEY)
    );
    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(MONKEY, MonkeyEntity.createMonkeyAttributes());
    }

    public static void registerEntities() {
        MonkeysMod.LOGGER.info("Registering entities for " + MonkeysMod.MOD_ID);
    }
}
