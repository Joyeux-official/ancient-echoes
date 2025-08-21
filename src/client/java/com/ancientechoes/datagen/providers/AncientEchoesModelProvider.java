package com.ancientechoes.datagen.providers;


import com.joyeuxlib.datagenproviders.JoyeuxLibModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class AncientEchoesModelProvider extends JoyeuxLibModelProvider {
    public AncientEchoesModelProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


    }
}