package com.ancientechoes.datagen.providers;

import com.ancientechoes.core.AncientEchoesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class AncientEchoesLootTableProvider extends FabricBlockLootTableProvider {
    public AncientEchoesLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

                addDrop(AncientEchoesBlocks.CHISELED_SCULK);
                addDrop(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER);
                addDrop(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER);
                addDrop(AncientEchoesBlocks.RED_CACTUS_FLOWER);
                addDrop(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER);
                addDrop(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER);
                addDrop(AncientEchoesBlocks.WHITE_CACTUS_FLOWER);
                addDrop(AncientEchoesBlocks.WARDEN_HEAD_BLOCK);

    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
