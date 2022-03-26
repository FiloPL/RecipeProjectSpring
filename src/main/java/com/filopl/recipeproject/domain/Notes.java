package com.filopl.recipeproject.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long io;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Long getIo() {
        return io;
    }

    public void setIo(Long io) {
        this.io = io;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
