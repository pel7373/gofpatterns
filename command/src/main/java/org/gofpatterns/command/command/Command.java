package org.gofpatterns.command.command;

public interface Command {
    void execute(Integer... quantity);

    default Integer checkAndGetQuantity(Integer defaultQuantity, Integer... quantity) {
        if(quantity == null || quantity.length == 0 || quantity[0] == null) {
            return defaultQuantity;
        }

        return quantity[0];
    }
}
