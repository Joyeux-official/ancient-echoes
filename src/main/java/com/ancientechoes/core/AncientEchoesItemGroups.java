package com.ancientechoes.core;

import com.ancientechoes.AncientEchoes;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class AncientEchoesItemGroups {

    public static final ItemGroup ANCIENT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            AncientEchoes.id("ancient"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ancient"))
                    .icon(() -> new ItemStack(AncientEchoesBlocks.CHISELED_SCULK)).entries((displayContext, entries) -> {


                        entries.add(AncientEchoesBlocks.CHISELED_SCULK);
                        entries.add(AncientEchoesItems.MARSHMALLOW);
                        entries.add(AncientEchoesItems.MARSHMALLOW_ON_A_STICK);
                        entries.add(AncientEchoesItems.LIGHTLY_ROASTED_MARSHMALLOW_ON_A_STICK);
                        entries.add(AncientEchoesItems.GOLDEN_MARSHMALLOW_ON_A_STICK);
                        entries.add(AncientEchoesItems.BURNT_MARSHMALLOW_ON_A_STICK);
                        entries.add(AncientEchoesBlocks.JAR);



                    }).build());


public static void registerItemGroups() {
    AncientEchoes.LOGGER.info("Registering Item Groups for " + AncientEchoes.MOD_ID);
}

public static void initialize() {

}
}

