package com.ancientechoes.core;


import com.ancientechoes.AncientEchoes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class AncientEchoesBlocks {

    public static final Block CHISELED_SCULK = registerBlock("chiseled_sculk",
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK_CATALYST).sounds(BlockSoundGroup.SCULK_CATALYST)));




    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, new Identifier(AncientEchoes.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(AncientEchoes.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));


    }

    public static void registerAncientEchoesBlocks() {
    }
}
