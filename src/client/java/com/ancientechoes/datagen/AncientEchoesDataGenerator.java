package com.ancientechoes.datagen;


import com.ancientechoes.core.AncientEchoesBlocks;
import com.ancientechoes.core.AncientEchoesItems;
import com.ancientechoes.datagen.providers.*;
import com.joyeuxlib.datagenproviders.JoyeuxLibEnglishLangProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibRecipeProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibSoundProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

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
		joyENUSLang.addTranslation(AncientEchoesBlocks.CHISELED_SCULK,"Chiseled Sculk");
        joyENUSLang.addTranslation(AncientEchoesBlocks.JAR,"Jar");

// Items
        joyENUSLang.addTranslation(AncientEchoesItems.MARSHMALLOW,"Marshmallow");
        joyENUSLang.addTranslation(AncientEchoesItems.MARSHMALLOW_ON_A_STICK,"Marshmallow on a Stick");
        joyENUSLang.addTranslation(AncientEchoesItems.LIGHTLY_ROASTED_MARSHMALLOW_ON_A_STICK,"Lightly Roasted Marshmallow on a Stick");
        joyENUSLang.addTranslation(AncientEchoesItems.GOLDEN_MARSHMALLOW_ON_A_STICK,"Golden Marshmallow on a Stick");
        joyENUSLang.addTranslation(AncientEchoesItems.BURNT_MARSHMALLOW_ON_A_STICK,"Burnt Marshmallow on a Stick");

// Achievements
		joyENUSLang.addTranslation("achievement.ancient-echoes.title.root","Ancient Echoes");
		joyENUSLang.addTranslation("achievement.ancient-echoes.description.root","Discover the secrets of the Ancient Beings");


		return joyENUSLang;
	}

	public JoyeuxLibSoundProvider addSounds(FabricDataOutput output) {
		JoyeuxLibSoundProvider soundProvider = new JoyeuxLibSoundProvider(output);
		return soundProvider;
	}

	public JoyeuxLibRecipeProvider recipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		JoyeuxLibRecipeProvider joyRecipe = new JoyeuxLibRecipeProvider(output);

joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
        .create(RecipeCategory.FOOD, AncientEchoesItems.MARSHMALLOW, 4)
        .input(Items.MILK_BUCKET)
        .input(Items.SUGAR)
        .input(Items.WHEAT)
        .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
        .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
        .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT)));

joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
        .create(RecipeCategory.FOOD, AncientEchoesItems.MARSHMALLOW_ON_A_STICK, 1)
        .input(AncientEchoesItems.MARSHMALLOW)
        .input(Items.STICK)
        .criterion(hasItem(AncientEchoesItems.MARSHMALLOW), conditionsFromItem(AncientEchoesItems.MARSHMALLOW))
        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)));

joyRecipe.addShapedRecipe(ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, AncientEchoesBlocks.JAR, 1)
        .pattern(" S ")
        .pattern("G G")
        .pattern("GGG")
        .input('G', Blocks.GLASS)
        .input('S', ItemTags.WOODEN_SLABS)
        .criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS))
        .criterion(hasItem(Items.OAK_FENCE), conditionsFromItem(Items.OAK_FENCE)));


        return joyRecipe;
	}

	private void generateachivement(FabricDataGenerator.Pack pack) {
		pack.addProvider(AncientEchoesAchievementProvider::new);
	}

}
