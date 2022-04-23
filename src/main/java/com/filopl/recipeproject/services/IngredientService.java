package com.filopl.recipeproject.services;

import com.filopl.recipeproject.commands.IngredientCommand;

/**
 * Created by T. FIlo Zegarlicki on 23.04.2022
 **/

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
