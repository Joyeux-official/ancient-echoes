package com.ancientechoes;


import com.ancientechoes.core.AncientEchoesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AncientEchoesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
;
        BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.JAR, RenderLayer.getCutout());

    }
}