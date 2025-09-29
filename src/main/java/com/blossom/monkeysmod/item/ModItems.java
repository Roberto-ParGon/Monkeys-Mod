package com.blossom.monkeysmod.item;

import com.blossom.monkeysmod.MonkeysMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    private static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        Identifier id = Identifier.of(MonkeysMod.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(Registries.ITEM.getKey(), id);
        Item.Settings settings = new Item.Settings().registryKey(key);
        Item item = factory.apply(settings);
        return Registry.register(Registries.ITEM, key, item);
    }

    public static final Item PEELED_BANANA = registerItem("peeled_banana", settings ->
            new Item(settings.food(new FoodComponent.Builder()
                    .nutrition(4)
                    .saturationModifier(0.3f)
                    .build()
            ))
    );

    public static final Item BANANA = registerItem("banana", settings -> new BananaItem(settings));

    public static void registerModItems() {
        MonkeysMod.LOGGER.info("Registering Mod Items for " + MonkeysMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BANANA);
            entries.add(PEELED_BANANA);
        });
    }
}
