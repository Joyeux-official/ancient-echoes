package com.ancientechoes.core;

import com.ancientechoes.AncientEchoes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class AncientEchoesItems {


    public static final Item MARSHMALLOW = registerItem("marshmallow",
            new Item(new FabricItemSettings().food(AncientEchoesFoodComponenets.MARSHMALLOW)));

    public static final Item MARSHMALLOW_ON_A_STICK = registerItem("marshmallow_on_a_stick",
            new Item(new FabricItemSettings().food(AncientEchoesFoodComponenets.MARSHMALLOW)));

    public static final Item LIGHTLY_ROASTED_MARSHMALLOW_ON_A_STICK = registerItem("lightly_roasted_marshmallow_on_a_stick",
            new Item(new FabricItemSettings().food(AncientEchoesFoodComponenets.MARSHMALLOW_LIGHTLY_ROASTED)));

    public static final Item GOLDEN_MARSHMALLOW_ON_A_STICK = registerItem("golden_marshmallow_on_a_stick",
            new Item(new FabricItemSettings().food(AncientEchoesFoodComponenets.MARSHMALLOW_GOLDEN)));

    public static final Item BURNT_MARSHMALLOW_ON_A_STICK = registerItem("burnt_marshmallow_on_a_stick",
            new Item(new FabricItemSettings().food(AncientEchoesFoodComponenets.MARSHMALLOW_BURNT)));

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
