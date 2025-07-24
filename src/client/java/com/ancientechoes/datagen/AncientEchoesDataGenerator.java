package com.ancientechoes.datagen;

import com.ancientechoes.AncientEchoes;
import com.ancientechoes.core.AncientEchoesBlocks;
import com.ancientechoes.datagen.providers.*;
import com.joyeuxlib.datagenproviders.JoyeuxLibEnglishLangProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibRecipeProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibSoundProvider;
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

public class AncientEchoesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(this::englishTranslationsProvider);
		pack.addProvider(this::addSounds);
		pack.addProvider(this::recipeProvider);
		pack.addProvider(AncientEchoesBlockTagProvider::new);
		pack.addProvider(AncientEchoesItemTagProvider::new);
		pack.addProvider(AncientEchoesLootTableProvider::new);
		pack.addProvider(AncientEchoesModelProvider::new);
		generateachivement(pack);
	}

	public JoyeuxLibEnglishLangProvider englishTranslationsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		JoyeuxLibEnglishLangProvider joyENUSLang = new JoyeuxLibEnglishLangProvider(output);

// Item Groups
		joyENUSLang.addTranslation("itemgroup.ancient","Ancient Echoes");

// Blocks
		joyENUSLang.addTranslation("block.ancient-echoes.chiseled_sculk","Chiseled Sculk");
		joyENUSLang.addTranslation("block.ancient-echoes.magenta_cactus_flower","Magenta Cactus Flower");
		joyENUSLang.addTranslation("block.ancient-echoes.purple_cactus_flower","Purple Cactus Flower");
		joyENUSLang.addTranslation("block.ancient-echoes.red_cactus_flower","Red Cactus Flower");
		joyENUSLang.addTranslation("block.ancient-echoes.orange_cactus_flower","Orange Cactus Flower");
		joyENUSLang.addTranslation("block.ancient-echoes.yellow_cactus_flower","Yellow Cactus Flower");
		joyENUSLang.addTranslation("block.ancient-echoes.white_cactus_flower","White Cactus Flower");
		joyENUSLang.addTranslation("block.ancient-echoes.warden_head","Warden Head");

// Achievements
		joyENUSLang.addTranslation("achievement.ancient-echoes.title.root","Ancient Echoes");
		joyENUSLang.addTranslation("achievement.ancient-echoes.description.root","Discover the secrets of the Ancient Beings");

		joyENUSLang.addTranslation("achievement.ancient-echoes.title.obtain_warden_head","Guardian Of The Deep Dark!");
		joyENUSLang.addTranslation("achievement.ancient-echoes.description.obtain_warden_head","Behead the Warden with a Warden Breacher to obtain its head");


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
				.input(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER)
				.criterion(hasItem(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER), conditionsFromItem(AncientEchoesBlocks.MAGENTA_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.PURPLE_DYE, 1)
				.input(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER)
				.criterion(hasItem(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER), conditionsFromItem(AncientEchoesBlocks.PURPLE_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.RED_DYE, 1)
				.input(AncientEchoesBlocks.RED_CACTUS_FLOWER)
				.criterion(hasItem(AncientEchoesBlocks.RED_CACTUS_FLOWER), conditionsFromItem(AncientEchoesBlocks.RED_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.ORANGE_DYE, 1)
				.input(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER)
				.criterion(hasItem(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER), conditionsFromItem(AncientEchoesBlocks.ORANGE_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.YELLOW_DYE, 1)
				.input(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER)
				.criterion(hasItem(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER), conditionsFromItem(AncientEchoesBlocks.YELLOW_CACTUS_FLOWER)));

		joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
				.create(RecipeCategory.MISC, Items.WHITE_DYE, 1)
				.input(AncientEchoesBlocks.WHITE_CACTUS_FLOWER)
				.criterion(hasItem(AncientEchoesBlocks.WHITE_CACTUS_FLOWER), conditionsFromItem(AncientEchoesBlocks.WHITE_CACTUS_FLOWER)));


		return joyRecipe;
	}

	private void generateachivement(FabricDataGenerator.Pack pack) {
		pack.addProvider(AncientEchoesAchievementProvider::new);
	}

}
