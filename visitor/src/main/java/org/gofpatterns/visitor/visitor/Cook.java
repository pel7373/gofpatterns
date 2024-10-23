package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;

public class Cook implements Visitor {
    @Override
    public void visit(AmericanPizza pizza) {
        System.out.println();
        System.out.println("Let's cook the American pizza! \n" +
                "Roll out the dough, put in the following ingredients:");
        pizza.getIngredientsList().forEach(i -> {
            System.out.println("   * " + i.getTitle() + ": " + i.getQuantity() + " gr.");
        });
        System.out.println("...and now put it to the American oven...");
        System.out.println("...wait for 5 minutes and...");
        System.out.println("...our American pizza is ready! Bon appetit!");
        System.out.println();
        pizza.setReady();
    }

    @Override
    public void visit(JapanesePizza pizza) {
        System.out.println();
        System.out.println("Let's cook the Japanese pizza! \n" +
                "Roll out the dough, put in the following ingredients:");
        pizza.getIngredientsList().forEach(i -> {
            System.out.println("   * " + i.getTitle() + ": " + i.getQuantity() + " gr.");
        });
        System.out.println("...and now put it to the Japanese oven...");
        System.out.println("...wait for 7 minutes and...");
        System.out.println("...our Japanese pizza is ready! Bon appetit!");
        System.out.println();
        pizza.setReady();
    }

    @Override
    public void visit(UkrainianPizza pizza) {
        System.out.println();
        System.out.println("Let's cook the Ukrainian pizza! \n" +
                "Roll out the dough, put in the following ingredients:");
        pizza.getIngredientsList().forEach(i -> {
            System.out.println("   * " + i.getTitle() + ": " + i.getQuantity() + " gr.");
        });
        System.out.println("...and now put it to the Ukrainian oven...");
        System.out.println("...wait for 8 minutes and...");
        System.out.println("...our Ukrainian pizza is ready! Bon appetit!");
        System.out.println();
        pizza.setReady();
    }
}
