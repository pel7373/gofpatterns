package org.gofpatterns.interpreter.command;

import org.gofpatterns.interpreter.pizzeria.Ingredient;
import org.gofpatterns.interpreter.pizzeria.Pizzeria;

public class RepeatLastIngredientCommand implements Command {
    private Pizzeria pizzeria;

    public RepeatLastIngredientCommand(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        if(!pizzeria.isPizzaReady()) {
            if(!pizzeria.isIngredientsListEmpty()) {
                Ingredient ingredient = pizzeria.getLastIngredient();
                pizzeria.addIngredient(ingredient.getFoodType(), ingredient.getQuantity());
                System.out.printf("   Was repeated the last ingredient: %s %d g. to our recipe\n", ingredient.getFoodType().toString(), ingredient.getQuantity());
            } else {
                System.out.println("Can't repeat the last ingredient - the ingredient list for this pizza is empty!");
            }
        } else {
            System.out.println("This pizza has already been cooked, you can't add new ingredients!");
        }

    }
}
