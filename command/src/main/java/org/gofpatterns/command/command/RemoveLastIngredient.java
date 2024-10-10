package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.Pizzeria;

public class RemoveLastIngredient implements Command {
    private Pizzeria pizzeria;

    public RemoveLastIngredient(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        pizzeria.removeLastIngredient();
    }
}
