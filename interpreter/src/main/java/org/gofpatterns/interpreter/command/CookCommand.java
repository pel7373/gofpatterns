package org.gofpatterns.interpreter.command;

import org.gofpatterns.interpreter.pizzeria.Pizzeria;

import static org.gofpatterns.interpreter.config.Config.*;

public class CookCommand implements Command {
    private Pizzeria pizzeria;

    public CookCommand(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
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
