package org.gofpatterns.interpreter.customer;

import org.gofpatterns.interpreter.command.Command;

public class Customer {

    public void execute(Command command, Integer... quantity) {
        command.execute(quantity);
    }
}
