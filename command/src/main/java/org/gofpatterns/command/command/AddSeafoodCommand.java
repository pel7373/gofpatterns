package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.SEAFOOD_DEFAULT_QUANTITY;

public class AddSeafoodCommand extends Command {

    public AddSeafoodCommand(Pizzeria pizzeria) {
        super(pizzeria);
        super.foodType = FoodType.SEAFOOD;
        super.defaultQuantity = SEAFOOD_DEFAULT_QUANTITY;
    }
}
