package org.gofpatterns.visitor.pizza;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPizza implements Pizza {
    private Map<String, Integer> ingredientsMap = new HashMap<>();
    private boolean isReady = false;

    public void addIngredient(String ingredient, int quantity) {
        ingredientsMap.put(ingredient, quantity);
    }

    public Map<String, Integer> getIngredientsMap() {
        return ingredientsMap;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady() {
        isReady = true;
    }
}
