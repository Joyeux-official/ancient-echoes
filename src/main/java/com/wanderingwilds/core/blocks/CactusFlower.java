package com.wanderingwilds.core.blocks;

import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CactusFlower extends PlantBlock implements SuspiciousStewIngredient {
    protected static final float field_31094 = 3.0F;
    protected static final VoxelShape SHAPE = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 13.0F, 2.0F, 13.0F);

    private static final TagKey<Block> PLACEABLE_ON = TagKey.of(Registries.BLOCK.getKey(), new Identifier("wandering-wilds", "flower_placeable"));

    private final StatusEffect effectInStew;
    private final int effectInStewDuration;

    public CactusFlower(StatusEffect suspiciousStewEffect, int effectDuration, AbstractBlock.Settings settings) {
        super(settings);
        this.effectInStew = suspiciousStewEffect;
        this.effectInStewDuration = suspiciousStewEffect.isInstant() ? effectDuration : effectDuration * 20;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(PLACEABLE_ON);
    }

    public StatusEffect getEffectInStew() {
        return this.effectInStew;
    }

    public int getEffectInStewDuration() {
        return this.effectInStewDuration;
    }
}
