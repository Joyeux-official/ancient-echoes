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


                        entries.add(AncientEchoesBlocks.CHISELED_SCULK );
                        entries.add(AncientEchoesBlocks.WARDEN_HEAD_BLOCK );
                        entries.add(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER);
                        entries.add(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER);
                        entries.add(AncientEchoesBlocks.RED_CACTUS_FLOWER);
                        entries.add(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER);
                        entries.add(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER);
                        entries.add(AncientEchoesBlocks.WHITE_CACTUS_FLOWER);


                    }).build());


public static void registerItemGroups() {
    AncientEchoes.LOGGER.info("Registering Item Groups for " + AncientEchoes.MOD_ID);
}

public static void initialize() {

}
}

