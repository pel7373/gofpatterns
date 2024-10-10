package org.gofpatterns.interpreter.command;

import org.gofpatterns.interpreter.pizzeria.FoodType;
import org.gofpatterns.interpreter.pizzeria.Pizzeria;

import static org.gofpatterns.interpreter.config.Config.BACON_DEFAULT_QUANTITY;
import static org.gofpatterns.interpreter.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENT;

public class AddBaconCommand implements Command{
    private final Pizzeria pizzeria;

    public AddBaconCommand(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        if(!pizzeria.isPizzaReady()) {
            pizzeria.addIngredient(FoodType.BACON, checkAndGetQuantity(BACON_DEFAULT_QUANTITY, quantity));
        } else {
            System.out.printf(PIZZA_IS_READY_CANT_ADD_INGREDIENT);
        }
    }
}
