package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;

import static org.gofpatterns.visitor.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENTS;

public class AddMushrooms implements Visitor {
    @Override
    public void visit(AmericanPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the AmericanPizza add American mushrooms 150 gr. Great!");
            pizza.addIngredient("American mushrooms", 150);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(JapanesePizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the JapanesePizza add Japanese mushrooms 170 gr. Great!");
            pizza.addIngredient("Japanese mushrooms", 170);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(UkrainianPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the UkrainianPizza add Ukrainian mushrooms 190 gr. Great!");
            pizza.addIngredient("Ukrainian mushrooms", 190);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }
}
