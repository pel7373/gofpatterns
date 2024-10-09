package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.Ingredient;
import org.gofpatterns.command.pizza.Pizza;

public class RepeatLastIngredientCommand implements Command {
    private Pizza pizza;

    public RepeatLastIngredientCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        if(!pizza.isReady()) {
            if(!pizza.isIngredientsListEmpty()) {
                Ingredient ingredient = pizza.getLastIngredient();
                pizza.addIngredient(ingredient.getFoodType(), ingredient.getQuantity());
                System.out.printf("   Was repeated the last ingredient: %s %d g. to our recipe\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
            } else {
                System.out.println("Can't repeat the last ingredient - the ingredient list for this pizza is empty!");
            }
        } else {
            System.out.println("This pizza has already been cooked, you can't add new ingredients!");
        }

    }
}
