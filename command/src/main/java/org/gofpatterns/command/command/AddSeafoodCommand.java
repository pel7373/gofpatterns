package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.FoodType;
import org.gofpatterns.command.pizza.Pizza;

public class AddSeafoodCommand implements Command {
    private Pizza pizza;

    public AddSeafoodCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        if(!pizza.isReady()) {
            pizza.addIngredient(FoodType.SEAFOOD, 300);
        } else {
            System.out.println("This pizza has already been cooked, you can't add new ingredients!");
        }
    }
}
