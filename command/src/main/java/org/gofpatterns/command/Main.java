package org.gofpatterns.command;

import org.gofpatterns.command.command.*;
import org.gofpatterns.command.invoker.Invoker;
import org.gofpatterns.command.pizza.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Command addCheese = new AddCheeseCommand(pizza);
        Command addBacon = new AddBaconCommand(pizza);
        Command addPineapple = new AddPineappleCommand(pizza);
        Command addMushrooms = new AddMushroomsCommand(pizza);
        Command addSeafood = new AddSeafoodCommand(pizza);
        Command repeatLastIngredient = new RepeatLastIngredientCommand(pizza);
        Command showIngredientList = new ShowIngredientsList(pizza);
        Command isReady = new IsReadyCommand(pizza);
        Command removeLastIngredient = new RemoveLastIngredient(pizza);
        Command cook = new CookCommand(pizza);

        Invoker invoker = new Invoker();
        invoker.execute(repeatLastIngredient);
        invoker.execute(addCheese);
        invoker.execute(removeLastIngredient);
        invoker.execute(removeLastIngredient);
        invoker.execute(addBacon);
        invoker.execute(addPineapple);
        invoker.execute(repeatLastIngredient);
        invoker.execute(isReady);
        invoker.execute(addMushrooms);
        invoker.execute(addSeafood);
        invoker.execute(removeLastIngredient);
        invoker.execute(isReady);
        invoker.execute(showIngredientList);
        invoker.execute(addCheese);
        invoker.execute(cook);
        invoker.execute(isReady);
        invoker.execute(cook);
    }
}