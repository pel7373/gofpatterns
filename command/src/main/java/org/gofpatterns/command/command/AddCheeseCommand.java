package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.CHEESE_DEFAULT_QUANTITY;

public class AddCheeseCommand extends AbstractCommand {

    public AddCheeseCommand(Pizzeria pizzeria) {
        super(pizzeria);
        super.foodType = FoodType.CHEESE;
        super.defaultQuantity = CHEESE_DEFAULT_QUANTITY;
    }
}
