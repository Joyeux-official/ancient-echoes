package com.wanderingwilds;

import com.joyeuxlib.core.JoyeuxLibBlocks;
import com.wanderingwilds.core.WanderingWildsBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class WanderingWildsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(WanderingWildsBlocks.CACTUS_FLOWER, RenderLayer.getCutout());
	}
}