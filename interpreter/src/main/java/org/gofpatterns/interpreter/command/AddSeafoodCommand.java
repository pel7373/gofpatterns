package org.gofpatterns.interpreter.command;

import org.gofpatterns.interpreter.pizzeria.FoodType;
import org.gofpatterns.interpreter.pizzeria.Pizzeria;

import static org.gofpatterns.interpreter.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENT;
import static org.gofpatterns.interpreter.config.Config.SEAFOOD_DEFAULT_QUANTITY;

public class AddSeafoodCommand implements Command {
    private Pizzeria pizzeria;

    public AddSeafoodCommand(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        if(!pizzeria.isPizzaReady()) {
            pizzeria.addIngredient(FoodType.SEAFOOD, checkAndGetQuantity(SEAFOOD_DEFAULT_QUANTITY, quantity));
        } else {
            System.out.printf(PIZZA_IS_READY_CANT_ADD_INGREDIENT);
        }
    }
}
