package org.gofpatterns.command;

import org.gofpatterns.command.command.*;
import org.gofpatterns.command.customer.Customer;
import org.gofpatterns.command.pizzeria.Pizzeria;


public class Main {
    public static void main(String[] args) {
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

        Customer customer = new Customer();
        customer.execute(repeatLastIngredient);
        customer.execute(addCheese, 300);
        customer.execute(removeLastIngredient);
        customer.execute(removeLastIngredient);
        customer.execute(addBacon, 400);
        customer.execute(addPineapple);
        customer.execute(repeatLastIngredient);
        customer.execute(isReady);
        customer.execute(addMushrooms);
        customer.execute(addSeafood, 150);
        customer.execute(removeLastIngredient);
        customer.execute(isReady);
        customer.execute(showIngredientsList);
        customer.execute(addCheese, 200);
        customer.execute(cook);
        customer.execute(isReady);
        customer.execute(cook);
    }
}