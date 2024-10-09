package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.FoodType;
import org.gofpatterns.command.pizza.Pizza;

public class AddCheeseCommand implements Command {
    private Pizza pizza;

    public AddCheeseCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
       if(!pizza.isReady()) {
            pizza.addIngredient(FoodType.CHEESE, 200);
        } else {
           System.out.println("This pizza has already been cooked, you can't add new ingredients!");
        }
    }
}
