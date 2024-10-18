package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.Pizzeria;

import static org.gofpatterns.command.config.Config.*;

public class CookCommand extends AbstractCommand {

    public CookCommand(Pizzeria pizzeria) {
        super(pizzeria);
    }

    @Override
    public void execute(Integer... quantity) {
        if(pizzeria.isPizzaReady()) {
            System.out.printf(PIZZA_COOKING_AGAIN);
        } else {
            System.out.printf(PIZZA_START_COOKING);
        }
        pizzeria.cookPizza();
        System.out.printf(PIZZA_IS_READY);
    }
}
