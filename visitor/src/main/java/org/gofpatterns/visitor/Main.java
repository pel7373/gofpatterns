package org.gofpatterns.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.Pizza;
import org.gofpatterns.visitor.visitor.AddBacon;
import org.gofpatterns.visitor.visitor.AddCheese;
import org.gofpatterns.visitor.visitor.Cook;
import org.gofpatterns.visitor.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        Pizza americanPizza = new AmericanPizza();
        Visitor addCheese = new AddCheese();
        Visitor addBacon = new AddBacon();
        Visitor cook = new Cook();

        americanPizza.accept(addCheese);
        americanPizza.accept(cook);
        americanPizza.accept(addCheese);
        americanPizza.accept(cook);
    }
}