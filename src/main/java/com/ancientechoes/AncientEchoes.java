package com.ancientechoes;

import com.ancientechoes.core.AncientEchoesBlocks;
import com.ancientechoes.core.AncientEchoesItemGroups;
import com.ancientechoes.core.AncientEchoesItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.ancientechoes.core.AncientEchoesItems.WARDEN_BREACHER;

public class AncientEchoes implements ModInitializer {
	public static final String MOD_ID = "ancient-echoes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Block BoxBlock;

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}



	@Override
	public void onInitialize() {

		AncientEchoesItemGroups.initialize();
		AncientEchoesBlocks.registerAncientEchoesBlocks();
		AncientEchoesItems.registerAncientEchoesItems();

		ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {
			if (killedEntity instanceof WardenEntity && entity instanceof LivingEntity) {
				LivingEntity killer = (LivingEntity) entity;
				ItemStack weapon = killer.getMainHandStack();

				if (weapon.getItem() == WARDEN_BREACHER) {
					// Drop a stick at the Warden's death location
					if (world != null) {
						killedEntity.dropStack(new ItemStack(AncientEchoesBlocks.WARDEN_HEAD_BLOCK));
					}
				}
			}
		});
	}
	}
