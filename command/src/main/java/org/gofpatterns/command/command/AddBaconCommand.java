package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.*;

public class AddBaconCommand extends Command{

    public AddBaconCommand(Pizzeria pizzeria) {
        super(pizzeria);
        super.foodType = FoodType.BACON;
        super.defaultQuantity = BACON_DEFAULT_QUANTITY;
    }
}
