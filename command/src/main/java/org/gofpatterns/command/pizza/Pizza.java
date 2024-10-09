package org.gofpatterns.command.pizza;

import org.gofpatterns.command.exception.IngredientListEmptyException;

import java.util.ArrayList;
import java.util.List;


public class Pizza {
    private List<Ingredient> ingredientsList = new ArrayList<>();
    private Boolean isReady = false;

    public Pizza() {
        System.out.println("Let's make new pizza!");
    }

    public void addIngredient(FoodType foodType, Integer quantity) {
        ingredientsList.add(new Ingredient(foodType, quantity));
        System.out.printf("Add %s %d g. to our recipe!\n",  foodType.toString(), quantity);
    }

    public Ingredient getLastIngredient() {
        if(!ingredientsList.isEmpty()) {
            return ingredientsList.get(ingredientsList.size() - 1);
        }
        throw new IngredientListEmptyException("Ingredient list for this pizza is empty!");
    }

    public Boolean isIngredientsListEmpty() {
        return ingredientsList.isEmpty();
    }

    public void cook() {
        ingredientsList.forEach(ingredient -> {
            System.out.printf("   !!!%s %d g. was added to our pizza!\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
        });
        isReady = true;
    }

    public void removeLastIngredient() {
        if(!ingredientsList.isEmpty()) {
            Ingredient ingredient = ingredientsList.get(ingredientsList.size() - 1);
            System.out.printf("Was removed the last ingredient: %s %d g. from our recipe\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
            ingredientsList.remove(ingredient);
        } else {
            System.out.println("Can't remove the last ingredient - ingredient list is empty!");
        }
    }

    public Boolean isReady() {
        return isReady;
    }

    public void showIngredientsList() {
        System.out.println("=== Ingredients list ===");
        ingredientsList.forEach(ingredient -> {
            System.out.printf("    %s %d g.\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
        });
    }
}
