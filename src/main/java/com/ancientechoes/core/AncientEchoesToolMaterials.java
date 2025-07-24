package com.ancientechoes.core;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AncientEchoesToolMaterials {
    public static final ToolMaterial WARDEN_BREACHER = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 1500;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 0;
        }

        @Override
        public float getAttackDamage() {
            return 1;
        }

        @Override
        public int getMiningLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.ECHO_SHARD);
        }

    };
}
