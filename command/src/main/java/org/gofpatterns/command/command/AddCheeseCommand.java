package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.*;

public class AddCheeseCommand extends Command {

    public AddCheeseCommand(Pizzeria pizzeria) {
        super(pizzeria);
        super.foodType = FoodType.CHEESE;
        super.defaultQuantity = CHEESE_DEFAULT_QUANTITY;
    }
}
