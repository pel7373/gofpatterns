package org.gofpatterns.interpreter;

import org.gofpatterns.interpreter.command.*;
import org.gofpatterns.interpreter.customer.Customer;
import org.gofpatterns.interpreter.pizzeria.Pizzeria;

public class Main {
    public static void main(String[] args) {
        String string = "REPEAT_LAST_INGREDIENT, ADD_CHEESE 300, " +
                "REMOVE_LAST_INGREDIENT, REMOVE_LAST_INGREDIENT, ADD_BACON, " +
                "ADD_PINEAPPLE, REPEAT_LAST_INGREDIENT, IS_READY, ADD_MUSHROOMS, " +
                "ADD_SEAFOOD 150, REMOVE_LAST_INGREDIENT, SHOW_INGREDIENT_LIST, " +
                "IS_READY, ADD_CHEESE 200, COOK, IS_READY, COOK, cook, C";

        new Interpreter(new Customer()).execute(string);
    }
}