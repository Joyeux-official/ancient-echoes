package com.wanderingwilds.datagen;

import com.joyeuxlib.datagenproviders.JoyeuxLibEnglishLangProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibModelProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibRecipeProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibSoundProvider;
import com.wanderingwilds.datagen.providers.WanderingWildsBlockTagProvider;
import com.wanderingwilds.datagen.providers.WanderingWildsItemTagProvider;
import com.wanderingwilds.datagen.providers.WanderingWildsLootTableProvider;
import com.wanderingwilds.datagen.providers.WanderingWildsModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class WanderingWildsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(this::englishTranslationsProvider);
		pack.addProvider(this::addSounds);
		pack.addProvider(this::recipeProvider);
		pack.addProvider(WanderingWildsBlockTagProvider::new);
		pack.addProvider(WanderingWildsItemTagProvider::new);
		pack.addProvider(WanderingWildsLootTableProvider::new);
		pack.addProvider(WanderingWildsModelProvider::new);
	}

	public JoyeuxLibEnglishLangProvider englishTranslationsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		JoyeuxLibEnglishLangProvider joyENUSLang = new JoyeuxLibEnglishLangProvider(output);
joyENUSLang.addTranslation("itemgroup.main","Wandering Wilds");
joyENUSLang.addTranslation("block.wandering-wilds.chiseled_sculk","Chiseled Sculk");
joyENUSLang.addTranslation("block.wandering-wilds.cactus_flower","Cactus Flower");
		return joyENUSLang;
	}

	public JoyeuxLibSoundProvider addSounds(FabricDataOutput output) {
		JoyeuxLibSoundProvider soundProvider = new JoyeuxLibSoundProvider(output);
		return soundProvider;
	}

	public JoyeuxLibRecipeProvider recipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		JoyeuxLibRecipeProvider joyRecipe = new JoyeuxLibRecipeProvider(output);

		return joyRecipe;
	}
}
