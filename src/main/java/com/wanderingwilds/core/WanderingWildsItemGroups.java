package com.wanderingwilds.core;

import com.wanderingwilds.WanderingWilds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class WanderingWildsItemGroups{

public static final ItemGroup NATURE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
        WanderingWilds.id("nature"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nature"))
                .icon(() -> new ItemStack(WanderingWildsBlocks.MAGENTA_CACTUS_FLOWER)).entries((displayContext, entries) -> {

                    entries.add(WanderingWildsBlocks.MAGENTA_CACTUS_FLOWER);
                    entries.add(WanderingWildsBlocks.PURPLE_CACTUS_FLOWER);
                    entries.add(WanderingWildsBlocks.RED_CACTUS_FLOWER);
                    entries.add(WanderingWildsBlocks.ORANGE_CACTUS_FLOWER);
                    entries.add(WanderingWildsBlocks.YELLOW_CACTUS_FLOWER);
                    entries.add(WanderingWildsBlocks.WHITE_CACTUS_FLOWER);


                }).build());

    public static final ItemGroup ANCIENT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            WanderingWilds.id("ancient"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ancient"))
                    .icon(() -> new ItemStack(WanderingWildsBlocks.CHISELED_SCULK)).entries((displayContext, entries) -> {


                        entries.add(WanderingWildsBlocks.CHISELED_SCULK );


                    }).build());


public static void registerItemGroups() {
    WanderingWilds.LOGGER.info("Registering Item Groups for " + WanderingWilds.MOD_ID);
}

public static void initialize() {

}
}

