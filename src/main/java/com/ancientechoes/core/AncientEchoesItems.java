package com.ancientechoes.core;

import com.ancientechoes.AncientEchoes;
import com.ancientechoes.core.Items.WardenBreacherItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class AncientEchoesItems {


    public static final Item WARDEN_BREACHER = registerItem("warden_breacher",
            new WardenBreacherItem(AncientEchoesToolMaterials.WARDEN_BREACHER, 20, -1.5F, new Item.Settings().maxCount(1))
    );

    public static final Item WARDEN_SMITHING_UPGRADE = registerItem("warden_smithing_upgrade",
            new Item(new FabricItemSettings()));



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
