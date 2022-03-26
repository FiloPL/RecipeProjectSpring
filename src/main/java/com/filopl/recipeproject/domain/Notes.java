package com.filopl.recipeproject.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long io;

    @OneToOne
    private Recipe recipe;
    private String recipeNotes;

}
