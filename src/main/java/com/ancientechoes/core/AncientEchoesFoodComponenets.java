package com.ancientechoes.core;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class AncientEchoesFoodComponenets {

    public static final FoodComponent MARSHMALLOW = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 0), 1.0f)
            .snack()
            .alwaysEdible()
            .build();

    public static final FoodComponent MARSHMALLOW_LIGHTLY_ROASTED = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 0), 1.0f)
            .snack()
            .alwaysEdible()
            .build();

    public static final FoodComponent MARSHMALLOW_GOLDEN = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 0), 1.0f)
            .snack()
            .alwaysEdible()
            .build();

    public static final FoodComponent MARSHMALLOW_BURNT = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1.0f)
            .snack()
            .alwaysEdible()
            .build();

}
