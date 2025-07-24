package com.ancientechoes.datagen.providers;

import com.ancientechoes.AncientEchoes;
import com.ancientechoes.core.AncientEchoesBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class AncientEchoesAchievementProvider extends FabricAdvancementProvider {
    public AncientEchoesAchievementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement root = Advancement.Builder.create()
                .display(AncientEchoesBlocks.CHISELED_SCULK,
                        Text.translatable("achievement.ancient-echoes.title.root"),
                        Text.translatable("achievement.ancient-echoes.description.root"),
                        new Identifier("textures/block/anvil.png"),
                        AdvancementFrame.TASK, false, false, false)
                .criterion("root", InventoryChangedCriterion.Conditions.items(AncientEchoesBlocks.WARDEN_HEAD_BLOCK))
                .build(consumer, AncientEchoes.MOD_ID + "/root");

        Advancement jellyBabies = Advancement.Builder.create().parent(root)
                .display(AncientEchoesBlocks.WARDEN_HEAD_BLOCK,
                        Text.translatable("achievement.ancient-echoes.title.obtain_warden_head"),
                        Text.translatable("achievement.ancient-echoes.description.obtain_warden_head"),
                        null, AdvancementFrame.GOAL, true, true, true)
                .criterion("obtain_warden_head", InventoryChangedCriterion.Conditions.items(AncientEchoesBlocks.WARDEN_HEAD_BLOCK))
                .build(consumer, AncientEchoes.MOD_ID + "/obtain_warden_head");
    }
}
