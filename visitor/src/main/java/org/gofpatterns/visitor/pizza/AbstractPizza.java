package org.gofpatterns.visitor.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza implements Pizza {
    private final List<Ingredient> ingredientsList = new ArrayList<>();
    private boolean isReady = false;

    public void addIngredient(String ingredient, int quantity) {
        ingredientsList.add(new Ingredient(ingredient, quantity));
    }

    public List<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady() {
        isReady = true;
    }
}
