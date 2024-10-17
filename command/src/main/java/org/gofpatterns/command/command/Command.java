package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENT;

public abstract class Command {
    protected final Pizzeria pizzeria;
    FoodType foodType;
    int defaultQuantity;

    public Command(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    public void execute(Integer... quantity) {
        if(!pizzeria.isPizzaReady()) {
            pizzeria.addIngredient(foodType, checkAndGetQuantity(defaultQuantity, quantity));
        } else {
            System.out.printf(PIZZA_IS_READY_CANT_ADD_INGREDIENT);
        }
    }

    private int checkAndGetQuantity(Integer defaultQuantity, Integer... quantity) {
        if(quantity == null || quantity.length == 0 || quantity[0] == null || quantity[0] <= 0) {
            return defaultQuantity;
        }
        return quantity[0];
    }
}
