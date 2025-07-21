package com.wanderingwilds.core;

import com.wanderingwilds.WanderingWilds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class WanderingWildsItemGroups{

public static final ItemGroup WANDERING_WILDS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
        WanderingWilds.id("main"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.main"))
                .icon(() -> new ItemStack(WanderingWildsBlocks.CHISELED_SCULK)).entries((displayContext, entries) -> {

                    entries.add(WanderingWildsBlocks.CACTUS_FLOWER);
                    entries.add(WanderingWildsBlocks.CHISELED_SCULK );


                }).build());


public static void registerItemGroups() {
    WanderingWilds.LOGGER.info("Registering Item Groups for " + WanderingWilds.MOD_ID);
}

public static void initialize() {

}
}

