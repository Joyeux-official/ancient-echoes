package com.ancientechoes.core;

import com.ancientechoes.AncientEchoes;
import com.ancientechoes.core.Items.WardenBreacherItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class AncientEchoesItems {


    public static final Item WARDEN_BREACHER = registerItem("warden_breacher",
            new WardenBreacherItem(AncientEchoesToolMaterials.WARDEN_BREACHER, 10, -1.5F, new Item.Settings().maxCount(1))
    );

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, AncientEchoes.id(name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(AncientEchoesItems::addItemsToIngredientItemGroup);
    }



    public static void registerAncientEchoesItems() {
    }
}
