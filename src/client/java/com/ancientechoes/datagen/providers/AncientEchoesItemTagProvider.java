package com.ancientechoes.datagen.providers;

import com.ancientechoes.core.AncientEchoesBlocks;
import com.ancientechoes.core.AncientEchoesItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class AncientEchoesItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public AncientEchoesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }



    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(AncientEchoesItems.WARDEN_BREACHER)
        ;


    }
}
