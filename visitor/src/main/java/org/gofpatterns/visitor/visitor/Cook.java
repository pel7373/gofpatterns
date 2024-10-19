package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;

public class Cook implements Visitor {
    public void visit(AmericanPizza pizza) {
        System.out.println();
        System.out.println("Let's cook the American pizza! \nRoll out the dough, put in the following ingredients:");
        pizza.getIngredientsMap().forEach((k, v) -> {
            System.out.println("   * " + k + ": " + v + " gr.");
        });
        System.out.println("...and now put it to the American oven...");
        System.out.println("...wait for 5 minutes and...");
        System.out.println("...our American pizza is ready! Bon appetit!");
        System.out.println();
        pizza.setReady();
    }

    public void visit(JapanesePizza pizza) {
        pizza.addIngredient("Cheese Mozarella", 150);
    }

    public void visit(UkrainianPizza pizza) {
        pizza.addIngredient("Cheese Ricotta", 250);
    }
}
