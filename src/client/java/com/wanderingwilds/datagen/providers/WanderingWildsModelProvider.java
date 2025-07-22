package com.wanderingwilds.datagen.providers;

import com.joyeuxlib.datagenproviders.JoyeuxLibModelProvider;
import com.wanderingwilds.core.WanderingWildsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class WanderingWildsModelProvider extends JoyeuxLibModelProvider {
    public WanderingWildsModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Item.fromBlock(WanderingWildsBlocks.MAGENTA_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(WanderingWildsBlocks.PURPLE_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(WanderingWildsBlocks.RED_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(WanderingWildsBlocks.ORANGE_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(WanderingWildsBlocks.YELLOW_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(WanderingWildsBlocks.WHITE_CACTUS_FLOWER), Models.GENERATED);

    }
}