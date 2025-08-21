package com.ancientechoes.datagen.providers;

import com.ancientechoes.core.AncientEchoesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class AncientEchoesBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public AncientEchoesBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AncientEchoesBlocks.CHISELED_SCULK)
        ;




        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(AncientEchoesBlocks.CHISELED_SCULK)
        ;

//        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
//                ;

//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
//               ;
    }
}
