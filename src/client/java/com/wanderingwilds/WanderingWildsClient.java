package com.wanderingwilds;

import com.wanderingwilds.core.WanderingWildsBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class WanderingWildsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(WanderingWildsBlocks.MAGENTA_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(WanderingWildsBlocks.PURPLE_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(WanderingWildsBlocks.RED_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(WanderingWildsBlocks.ORANGE_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(WanderingWildsBlocks.YELLOW_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(WanderingWildsBlocks.WHITE_CACTUS_FLOWER, RenderLayer.getCutout());
	}
}