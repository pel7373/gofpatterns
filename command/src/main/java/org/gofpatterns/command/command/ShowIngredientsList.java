package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.Pizzeria;

public class ShowIngredientsList extends AbstractCommand {

    public ShowIngredientsList(Pizzeria pizzeria) {
        super(pizzeria);
    }

    @Override
    public void execute(Integer... quantity) {
        pizzeria.showIngredientsList();
    }
}
