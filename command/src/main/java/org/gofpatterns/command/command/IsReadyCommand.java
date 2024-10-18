package org.gofpatterns.command.command;

import org.gofpatterns.command.pizzeria.Pizzeria;

public class IsReadyCommand extends AbstractCommand {

    public IsReadyCommand(Pizzeria pizzeria) {
        super(pizzeria);
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
