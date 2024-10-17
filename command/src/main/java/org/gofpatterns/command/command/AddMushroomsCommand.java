package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.*;

public class AddMushroomsCommand extends Command {

    public AddMushroomsCommand(Pizzeria pizzeria) {
        super(pizzeria);
        super.foodType = FoodType.MUSHROOMS;
        super.defaultQuantity = MUSHROOMS_DEFAULT_QUANTITY;
    }
}
