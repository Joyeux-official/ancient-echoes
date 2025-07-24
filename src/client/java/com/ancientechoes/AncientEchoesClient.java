package com.ancientechoes;

import com.ancientechoes.core.AncientEchoesBlockEntityTypes;
import com.ancientechoes.core.AncientEchoesBlocks;
import com.ancientechoes.renderers.heads.WardenHeadRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

import static com.ancientechoes.AncientEchoes.id;

public class AncientEchoesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.RED_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(AncientEchoesBlocks.WHITE_CACTUS_FLOWER, RenderLayer.getCutout());
		blockEntityRendererRegister();
	}

	public static void blockEntityRendererRegister() {
		BlockEntityRendererFactories.register(AncientEchoesBlockEntityTypes.WARDEN_HEAD_BLOCK_ENTITY_TYPE, WardenHeadRenderer::new);

		// Register builtin resourcepacks
		FabricLoader.getInstance().getModContainer("ancient-echoes").ifPresent(modContainer -> {
			ResourceManagerHelper.registerBuiltinResourcePack(id("panoramaandlogo"), modContainer, ResourcePackActivationType.DEFAULT_ENABLED);
		});
	}

}