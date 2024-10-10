package org.gofpatterns.interpreter;

import org.gofpatterns.interpreter.command.*;
import org.gofpatterns.interpreter.customer.Customer;
import org.gofpatterns.interpreter.pizzeria.Pizzeria;

import java.util.Arrays;

public class Interpreter {
    private final Customer customer;

    Pizzeria pizzeria = new Pizzeria();
    Command addCheese = new AddCheeseCommand(pizzeria);
    Command addBacon = new AddBaconCommand(pizzeria);
    Command addPineapple = new AddPineappleCommand(pizzeria);
    Command addMushrooms = new AddMushroomsCommand(pizzeria);
    Command addSeafood = new AddSeafoodCommand(pizzeria);
    Command repeatLastIngredient = new RepeatLastIngredientCommand(pizzeria);
    Command showIngredientsList = new ShowIngredientsList(pizzeria);
    Command isReady = new IsReadyCommand(pizzeria);
    Command removeLastIngredient = new RemoveLastIngredient(pizzeria);
    Command cook = new CookCommand(pizzeria);

    public Interpreter(Customer customer) {
        this.customer = customer;
    }

    public void execute(String string) {
        if (string == null || string.isBlank()) {
            return;
        }

        Arrays.stream(string.split(",")).forEach(substring -> {
            if (!substring.isBlank()) {
                System.out.printf("### INTERPRETER RECEIVES COMMAND: %s\n", substring.trim());
                String[] operandsOfSubstring = substring.trim().split(" ");
                int quantityParameter = -1;
                if (operandsOfSubstring.length >= 2) {
                    try {
                        quantityParameter = Integer.parseInt(operandsOfSubstring[1]);
                    } catch (NumberFormatException ignored) {
                    }
                }
                switch (operandsOfSubstring[0].toUpperCase()) {
                    case "ADD_BACON" -> customer.execute(addBacon, quantityParameter);
                    case "ADD_CHEESE" -> customer.execute(addCheese, quantityParameter);
                    case "ADD_MUSHROOMS" -> customer.execute(addMushrooms, quantityParameter);
                    case "ADD_PINEAPPLE" -> customer.execute(addPineapple, quantityParameter);
                    case "ADD_SEAFOOD" -> customer.execute(addSeafood, quantityParameter);
                    case "COOK" -> customer.execute(cook);
                    case "IS_READY" -> customer.execute(isReady);
                    case "REMOVE_LAST_INGREDIENT" -> customer.execute(removeLastIngredient);
                    case "REPEAT_LAST_INGREDIENT" -> customer.execute(repeatLastIngredient);
                    case "SHOW_INGREDIENT_LIST" -> customer.execute(showIngredientsList);
                    default -> System.out.printf("### This command %s can't interpreted and executed!\n", substring);
                }
            } else {
                System.out.println("### Command list is blank! It can't be interpreted and executed!");
            }
        });
    }
}
