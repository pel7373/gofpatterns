package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.FoodType;
import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.PINEAPPLE_DEFAULT_QUANTITY;

public class AddPineappleCommand extends AbstractCommand {

    public AddPineappleCommand(Pizzeria pizzeria) {
        super(pizzeria);
        super.foodType = FoodType.PINEAPPLE;
        super.defaultQuantity = PINEAPPLE_DEFAULT_QUANTITY;
    }
}
