package org.gofpatterns.command.invoker;

import org.gofpatterns.command.command.Command;

public class Invoker {

    public void execute(Command command) {
        command.execute();
    }
}
