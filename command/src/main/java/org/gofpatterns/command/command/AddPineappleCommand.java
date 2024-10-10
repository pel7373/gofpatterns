package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.*;

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
