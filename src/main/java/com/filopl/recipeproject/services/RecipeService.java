package com.filopl.recipeproject.services;

import com.filopl.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}