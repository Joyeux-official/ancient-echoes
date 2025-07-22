package com.wanderingwilds.datagen;

import com.joyeuxlib.datagenproviders.JoyeuxLibEnglishLangProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibRecipeProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibSoundProvider;
import com.wanderingwilds.core.WanderingWildsBlocks;
import com.wanderingwilds.datagen.providers.WanderingWildsBlockTagProvider;
import com.wanderingwilds.datagen.providers.WanderingWildsItemTagProvider;
import com.wanderingwilds.datagen.providers.WanderingWildsLootTableProvider;
import com.wanderingwilds.datagen.providers.WanderingWildsModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

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
joyENUSLang.addTranslation("itemgroup.nature","WW: Wild Nature");
joyENUSLang.addTranslation("itemgroup.ancient","WW: Ancient Artifacts");
joyENUSLang.addTranslation("block.wandering-wilds.chiseled_sculk","Chiseled Sculk");
joyENUSLang.addTranslation("block.wandering-wilds.magenta_cactus_flower","Magenta Cactus Flower");
joyENUSLang.addTranslation("block.wandering-wilds.purple_cactus_flower","Purple Cactus Flower");
joyENUSLang.addTranslation("block.wandering-wilds.red_cactus_flower","Red Cactus Flower");
joyENUSLang.addTranslation("block.wandering-wilds.orange_cactus_flower","Orange Cactus Flower");
joyENUSLang.addTranslation("block.wandering-wilds.yellow_cactus_flower","Yellow Cactus Flower");
joyENUSLang.addTranslation("block.wandering-wilds.white_cactus_flower","White Cactus Flower");
		return joyENUSLang;
	}

	public JoyeuxLibSoundProvider addSounds(FabricDataOutput output) {
		JoyeuxLibSoundProvider soundProvider = new JoyeuxLibSoundProvider(output);
		return soundProvider;
	}

	public JoyeuxLibRecipeProvider recipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		JoyeuxLibRecipeProvider joyRecipe = new JoyeuxLibRecipeProvider(output);

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.MAGENTA_DYE, 1)
				.input(WanderingWildsBlocks.MAGENTA_CACTUS_FLOWER)
				.criterion(hasItem(WanderingWildsBlocks.MAGENTA_CACTUS_FLOWER), conditionsFromItem(WanderingWildsBlocks.MAGENTA_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.PURPLE_DYE, 1)
				.input(WanderingWildsBlocks.PURPLE_CACTUS_FLOWER)
				.criterion(hasItem(WanderingWildsBlocks.PURPLE_CACTUS_FLOWER), conditionsFromItem(WanderingWildsBlocks.PURPLE_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.RED_DYE, 1)
				.input(WanderingWildsBlocks.RED_CACTUS_FLOWER)
				.criterion(hasItem(WanderingWildsBlocks.RED_CACTUS_FLOWER), conditionsFromItem(WanderingWildsBlocks.RED_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.ORANGE_DYE, 1)
				.input(WanderingWildsBlocks.ORANGE_CACTUS_FLOWER)
				.criterion(hasItem(WanderingWildsBlocks.ORANGE_CACTUS_FLOWER), conditionsFromItem(WanderingWildsBlocks.ORANGE_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.YELLOW_DYE, 1)
				.input(WanderingWildsBlocks.YELLOW_CACTUS_FLOWER)
				.criterion(hasItem(WanderingWildsBlocks.YELLOW_CACTUS_FLOWER), conditionsFromItem(WanderingWildsBlocks.YELLOW_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.WHITE_DYE, 1)
				.input(WanderingWildsBlocks.WHITE_CACTUS_FLOWER)
				.criterion(hasItem(WanderingWildsBlocks.WHITE_CACTUS_FLOWER), conditionsFromItem(WanderingWildsBlocks.WHITE_CACTUS_FLOWER)));


		return joyRecipe;
	}
}
