package org.gofpatterns.interpreter.command;

public interface Command {
    void execute(Integer... quantity);

    default Integer checkAndGetQuantity(Integer defaultQuantity, Integer... quantity) {
        if(quantity == null || quantity.length == 0 || quantity[0] == null || quantity[0] <= 0) {
            return defaultQuantity;
        }

        return quantity[0];
    }
}
