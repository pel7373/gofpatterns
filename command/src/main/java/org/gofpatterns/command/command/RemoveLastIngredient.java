package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.Pizza;

public class RemoveLastIngredient implements Command {
    private Pizza pizza;

    public RemoveLastIngredient(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        pizza.removeLastIngredient();
    }
}
