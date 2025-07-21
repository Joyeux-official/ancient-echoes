package com.wanderingwilds.datagen.providers;

import com.wanderingwilds.core.WanderingWildsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class WanderingWildsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public WanderingWildsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(WanderingWildsBlocks.CHISELED_SCULK)
        ;

       getOrCreateTagBuilder(BlockTags.FLOWERS)
               .add(WanderingWildsBlocks.CACTUS_FLOWER)
        ;


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(WanderingWildsBlocks.CHISELED_SCULK)
        ;

//        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
//                ;

//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
//               ;
    }
}
