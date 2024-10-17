package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.Pizzeria;

public class RemoveLastIngredient extends Command {

    public RemoveLastIngredient(Pizzeria pizzeria) {
        super(pizzeria);
    }

    @Override
    public void execute(Integer... quantity) {
        pizzeria.removeLastIngredient();
    }
}
