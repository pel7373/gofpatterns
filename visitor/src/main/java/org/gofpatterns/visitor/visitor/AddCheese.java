package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.*;

import static org.gofpatterns.visitor.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENTS;

public class AddCheese implements Visitor {

    @Override
    public void visit(AmericanPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the AmericanPizza add Cheese Camamber 200 gr. Great!");
            pizza.addIngredient("Cheese Camamber", 200);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(JapanesePizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the JapanesePizza add Cheese Mozarella 150 gr. Great!");
            pizza.addIngredient("Cheese Mozzarella", 150);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(UkrainianPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the UkrainianPizza add Cheese Ricotta 250 gr. Great!");
            pizza.addIngredient("Cheese Ricotta", 250);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }
}
