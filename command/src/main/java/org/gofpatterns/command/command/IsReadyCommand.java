package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.Pizza;

public class IsReadyCommand implements Command {
    private Pizza pizza;

    public IsReadyCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        if(pizza.isReady()){
            System.out.println("Pizza is ready! Bon appetit!");
        } else {
            System.out.println("Pizza isn't ready!");
        }
    }
}
