package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.Pizza;

public class ShowIngredientsList implements Command {
    private Pizza pizza;

    public ShowIngredientsList(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        pizza.showIngredientsList();
    }
}
