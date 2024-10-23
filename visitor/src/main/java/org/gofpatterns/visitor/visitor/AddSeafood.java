package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;

import static org.gofpatterns.visitor.config.Config.PIZZA_IS_READY_CANT_ADD_INGREDIENTS;

public class AddSeafood implements Visitor {
    @Override
    public void visit(AmericanPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the AmericanPizza add American seafood 400 gr. Great!");
            pizza.addIngredient("American seafood", 400);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(JapanesePizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the JapanesePizza add Japanese seafood 360 gr. Great!");
            pizza.addIngredient("Japanese seafood", 360);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }

    @Override
    public void visit(UkrainianPizza pizza) {
        if (!pizza.isReady()) {
            System.out.println("To the UkrainianPizza add Ukrainian seafood 380 gr. Great!");
            pizza.addIngredient("Ukrainian seafood", 380);
        } else {
            System.out.println(PIZZA_IS_READY_CANT_ADD_INGREDIENTS);
        }
    }
}
