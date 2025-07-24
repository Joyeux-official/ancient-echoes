package com.ancientechoes.core.blockentites;

import com.ancientechoes.core.AncientEchoesBlockEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class WardenHeadBlockEntity extends BlockEntity {

    public WardenHeadBlockEntity(BlockPos pos, BlockState state) {
        super(AncientEchoesBlockEntityTypes.WARDEN_HEAD_BLOCK_ENTITY_TYPE, pos, state);
    }

    public float getScale() {
        return 1;
    }
}

