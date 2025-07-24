package com.ancientechoes;

import com.ancientechoes.core.AncientEchoesBlocks;
import com.ancientechoes.core.AncientEchoesItemGroups;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientEchoes implements ModInitializer {
	public static final String MOD_ID = "ancient-echoes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Block BoxBlock;

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize() {

		AncientEchoesItemGroups.initialize();
		AncientEchoesBlocks.registerAncientEchoesBlocks();

	}
}