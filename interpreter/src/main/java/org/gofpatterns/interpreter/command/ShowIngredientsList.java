package org.gofpatterns.interpreter.command;

import org.gofpatterns.interpreter.pizzeria.Pizzeria;

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
