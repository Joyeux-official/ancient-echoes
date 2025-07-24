package com.ancientechoes.datagen.providers;

import com.joyeuxlib.datagenproviders.JoyeuxLibModelProvider;
import com.ancientechoes.core.AncientEchoesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class AncientEchoesModelProvider extends JoyeuxLibModelProvider {
    public AncientEchoesModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Item.fromBlock(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(AncientEchoesBlocks.RED_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(AncientEchoesBlocks.WHITE_CACTUS_FLOWER), Models.GENERATED);

    }
}