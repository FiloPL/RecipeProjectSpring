package com.filopl.recipeproject.services;

import com.filopl.recipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by T. FIlo Zegarlicki on 23.04.2022
 **/
public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
