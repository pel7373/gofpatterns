package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.*;

public class AddMushroomsCommand implements Command {
    private Pizzeria pizzeria;

    public AddMushroomsCommand(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        if(!pizzeria.isPizzaReady()) {
            pizzeria.addIngredient(FoodType.MUSHROOMS, checkAndGetQuantity(MUSHROOMS_DEFAULT_QUANTITY, quantity));
        } else {
            System.out.printf(PIZZA_IS_READY_CANT_ADD_INGREDIENT);
        }
    }
}
