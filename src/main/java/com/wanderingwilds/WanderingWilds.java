package com.wanderingwilds;

import com.wanderingwilds.core.WanderingWildsBlocks;
import com.wanderingwilds.core.WanderingWildsItemGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WanderingWilds implements ModInitializer {
	public static final String MOD_ID = "wandering-wilds";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Block BoxBlock;

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize() {

		WanderingWildsItemGroups.initialize();
		WanderingWildsBlocks.registerWanderingWildsBlocks();

	}
}