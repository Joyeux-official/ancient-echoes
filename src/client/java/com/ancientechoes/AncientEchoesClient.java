package com.ancientechoes;

import com.ancientechoes.core.AncientEchoesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AncientEchoesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.RED_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.WHITE_CACTUS_FLOWER, RenderLayer.getCutout());
	}
}