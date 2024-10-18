package org.gofpatterns.command.pizzeria;

import org.gofpatterns.command.exception.IngredientListEmptyException;

import java.util.ArrayList;
import java.util.List;


public class Pizzeria {
    private List<Ingredient> pizzaIngredientsList = new ArrayList<>();
    private Boolean isPizzaReady = false;

    public Pizzeria() {
        System.out.println("Let's make new pizza!");
    }

    public void addIngredient(FoodType foodType, Integer quantity) {
        pizzaIngredientsList.add(new Ingredient(foodType, quantity));
        System.out.printf("Add %s %d g. to our recipe!\n",  foodType.toString(), quantity);
    }

    public Ingredient getLastIngredient() {
        if(!pizzaIngredientsList.isEmpty()) {
            return pizzaIngredientsList.get(pizzaIngredientsList.size() - 1);
        }
        throw new IngredientListEmptyException("Ingredient list for this pizza is empty!");
    }

    public Boolean isIngredientsListEmpty() {
        return pizzaIngredientsList.isEmpty();
    }

    public void cookPizza() {
        pizzaIngredientsList.forEach(ingredient -> {
            System.out.printf("   !!!%s %d g. was added to our pizza!\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
        });
        isPizzaReady = true;
    }

    public void removeLastIngredient() {
        if(!pizzaIngredientsList.isEmpty()) {
            Ingredient ingredient = pizzaIngredientsList.get(pizzaIngredientsList.size() - 1);
            System.out.printf("Was removed the last ingredient: %s %d g. from our recipe\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
            pizzaIngredientsList.remove(ingredient);
        } else {
            System.out.println("Can't remove the last ingredient - ingredient list is empty!");
        }
    }

    public Boolean isPizzaReady() {
        return isPizzaReady;
    }

    public void showIngredientsList() {
        System.out.println("=== Ingredients list ===");
        pizzaIngredientsList.forEach(ingredient -> {
            System.out.printf("    %s %d g.\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
        });
    }
}
