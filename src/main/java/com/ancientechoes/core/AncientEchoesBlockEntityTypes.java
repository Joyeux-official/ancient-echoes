package com.ancientechoes.core;

import com.ancientechoes.core.blockentites.WardenHeadBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;

public class AncientEchoesBlockEntityTypes {

    public static BlockEntityType<WardenHeadBlockEntity> WARDEN_HEAD_BLOCK_ENTITY_TYPE = FabricBlockEntityTypeBuilder
            .create(WardenHeadBlockEntity::new, AncientEchoesBlocks.WARDEN_HEAD_BLOCK).build();
}
