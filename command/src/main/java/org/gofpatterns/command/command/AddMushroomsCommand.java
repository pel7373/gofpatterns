package org.gofpatterns.command.command;

import org.gofpatterns.command.pizza.FoodType;
import org.gofpatterns.command.pizza.Pizza;

public class AddMushroomsCommand implements Command {
    private Pizza pizza;

    public AddMushroomsCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        if(!pizza.isReady()) {
            pizza.addIngredient(FoodType.MUSHROOMS, 160);
        } else {
            System.out.println("This pizza has already been cooked, you can't add new ingredients!");
        }
    }
}
