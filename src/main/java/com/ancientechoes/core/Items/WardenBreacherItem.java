package com.ancientechoes.core.Items;

import com.joyeuxlib.core.items.DifferingHandModelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class WardenBreacherItem extends SwordItem implements DifferingHandModelItem {
    public WardenBreacherItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
