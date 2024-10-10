package org.gofpatterns.command.customer;

import org.gofpatterns.command.command.Command;

public class Customer {

    public void execute(Command command, Integer... quantity) {
        command.execute(quantity);
    }
}
