package com.ancientechoes.core;


import com.ancientechoes.AncientEchoes;
import com.ancientechoes.core.blocks.CactusFlower;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class AncientEchoesBlocks {

    public static final Block CHISELED_SCULK = registerBlock("chiseled_sculk",
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK_CATALYST).sounds(BlockSoundGroup.SCULK_CATALYST)));

    public static final Block MAGENTA_CACTUS_FLOWER = registerBlock("magenta_cactus_flower",
            new CactusFlower(StatusEffects.POISON, 7, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_CACTUS_FLOWER = registerBlock("purple_cactus_flower",
            new CactusFlower(StatusEffects.POISON, 7, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_CACTUS_FLOWER = registerBlock("red_cactus_flower",
            new CactusFlower(StatusEffects.POISON, 7, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_CACTUS_FLOWER = registerBlock("yellow_cactus_flower",
            new CactusFlower(StatusEffects.POISON, 7, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_CACTUS_FLOWER = registerBlock("orange_cactus_flower",
            new CactusFlower(StatusEffects.POISON, 7, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHITE_CACTUS_FLOWER = registerBlock("white_cactus_flower",
            new CactusFlower(StatusEffects.POISON, 7, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.FLOWERING_AZALEA).pistonBehavior(PistonBehavior.DESTROY)));





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
