package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.Pizza;

public class CookCommand implements Command {
    private Pizza pizza;

    public CookCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        if(!pizza.isReady()) {
            System.out.println("!!! Start cooking pizza");
            pizza.cook();
            System.out.println("!!! Pizza is ready! Bon appetit!");
        } else {
            System.out.println("This pizza has already been cooked! It can't be cooked again!");
        }
    }
}
