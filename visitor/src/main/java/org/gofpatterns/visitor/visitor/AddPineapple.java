package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;

import static org.gofpatterns.visitor.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENTS;

public class AddPineapple implements Visitor{
    @Override
    public void visit(AmericanPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the AmericanPizza add pineapple 220 gr. Great!");
            pizza.addIngredient("pineapple", 220);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(JapanesePizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the JapanesePizza add pineapple 230 gr. Great!");
            pizza.addIngredient("pineapple", 230);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(UkrainianPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the UkrainianPizza add pineapple 240 gr. Great!");
            pizza.addIngredient("pineapple", 240);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }
}
