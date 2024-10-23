package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;

import static org.gofpatterns.visitor.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENTS;

public class AddBacon implements Visitor {
    @Override
    public void visit(AmericanPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the AmericanPizza add Bacon American 330 gr. Great!");
            pizza.addIngredient("Bacon American", 330);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(JapanesePizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the JapanesePizza add Bacon Japanese 300 gr. Great!");
            pizza.addIngredient("Bacon Japanese", 300);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(UkrainianPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the UkrainianPizza add Bacon Ukrainian 280 gr. Great!");
            pizza.addIngredient("Bacon Ukrainian", 280);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }
}
