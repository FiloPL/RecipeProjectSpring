package com.filopl.recipeproject.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by T.Filo Zegarlicki on 29.03.2022
 **/
class CategoryTest {

    Category category;

    @Test
    void getId() {
        category = new Category();
    }

    @Test
    void getDescription() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    void getRecipes() {
    }
}