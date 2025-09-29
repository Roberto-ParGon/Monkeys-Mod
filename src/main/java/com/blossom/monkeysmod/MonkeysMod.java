package com.blossom.monkeysmod;

import com.blossom.monkeysmod.entity.ModEntities;
import com.blossom.monkeysmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonkeysMod implements ModInitializer {
	public static final String MOD_ID = "monkeysmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModEntities.registerEntities();
        ModEntities.registerAttributes();
	}
}