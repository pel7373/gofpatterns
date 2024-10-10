package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.Pizzeria;

public class ShowIngredientsList implements Command {
    private Pizzeria pizzeria;

    public ShowIngredientsList(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        pizzeria.showIngredientsList();
    }
}
