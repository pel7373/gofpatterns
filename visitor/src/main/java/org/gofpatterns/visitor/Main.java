package org.gofpatterns.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.Pizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;
import org.gofpatterns.visitor.visitor.*;

public class Main {
    public static void main(String[] args) {
        Pizza americanPizza = new AmericanPizza();
        Visitor addCheese = new AddCheese();
        Visitor addBacon = new AddBacon();
        Visitor addMushrooms = new AddMushrooms();
        Visitor addPineapple = new AddPineapple();
        Visitor addSeafood = new AddSeafood();
        Visitor cook = new Cook();

        americanPizza.accept(addCheese);
        americanPizza.accept(addBacon);
        americanPizza.accept(addMushrooms);
        americanPizza.accept(addPineapple);
        americanPizza.accept(addSeafood);
        americanPizza.accept(cook);
        americanPizza.accept(addCheese);
        americanPizza.accept(cook);

        System.out.println();
        Pizza japanesePizza = new JapanesePizza();
        japanesePizza.accept(addCheese);
        japanesePizza.accept(addBacon);
        japanesePizza.accept(addPineapple);
        japanesePizza.accept(addSeafood);
        japanesePizza.accept(addCheese);
        japanesePizza.accept(cook);

        System.out.println();
        Pizza ukrainianPizza = new UkrainianPizza();
        ukrainianPizza.accept(addCheese);
        ukrainianPizza.accept(addBacon);
        ukrainianPizza.accept(addMushrooms);
        ukrainianPizza.accept(addBacon);
        ukrainianPizza.accept(cook);
    }
}