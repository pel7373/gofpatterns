package org.gofpatterns.interpreter.command;

import org.gofpatterns.interpreter.pizzeria.Pizzeria;

public class IsReadyCommand implements Command {
    private Pizzeria pizzeria;

    public IsReadyCommand(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    @Override
    public void execute(Integer... quantity) {
        if(pizzeria.isPizzaReady()){
            System.out.println("Pizza is ready! Bon appetit!");
        } else {
            System.out.println("Pizza isn't ready!");
        }
    }
}
