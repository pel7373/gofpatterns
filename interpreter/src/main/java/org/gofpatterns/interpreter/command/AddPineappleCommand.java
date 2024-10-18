package org.gofpatterns.interpreter.command;

import org.gofpatterns.interpreter.pizzeria.FoodType;
import org.gofpatterns.interpreter.pizzeria.Pizzeria;

import static org.gofpatterns.interpreter.config.Config.PINEAPPLE_DEFAULT_QUANTITY;
import static org.gofpatterns.interpreter.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENT;

public class AddPineappleCommand implements Command {
    private Pizzeria pizzeria;

    public AddPineappleCommand(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        if(!pizzeria.isPizzaReady()) {
            pizzeria.addIngredient(FoodType.PINEAPPLE, checkAndGetQuantity(PINEAPPLE_DEFAULT_QUANTITY, quantity));
        } else {
            System.out.printf(PIZZA_IS_READY_CANT_ADD_INGREDIENT);
        }
    }
}
