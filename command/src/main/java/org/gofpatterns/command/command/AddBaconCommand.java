package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.FoodType;
import org.gofpatterns.command.pizza.Pizza;

public class AddBaconCommand implements Command{
    private Pizza pizza;

    public AddBaconCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        if(!pizza.isReady()) {
            pizza.addIngredient(FoodType.BACON, 220);
        } else {
            System.out.println("This pizza has already been cooked, you can't add new ingredients!");
        }
    }
}
