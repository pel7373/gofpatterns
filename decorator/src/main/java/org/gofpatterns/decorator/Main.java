package org.gofpatterns.decorator;

import org.gofpatterns.decorator.decorators.*;
import org.gofpatterns.decorator.pizza.Food;
import org.gofpatterns.decorator.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        Food pizza = new MushroomsDecorator(
                new SeaFoodDecorator(
                        new CheeseDecorator(
                                new PineappleDecorator(
                                        new BackonDecorator(
                                                new CheeseDecorator(
                                                        new Pizza()
                                                ))))));
        pizza.cook();

        System.out.println();
        Food pizza2 = new MushroomsDecorator(
                new MarshmellowDecorator(
                        new PineappleDecorator(
                                new BackonDecorator(
                                        new CheeseDecorator(
                                                new Pizza()
                                        )))));
        pizza2.cook();
    }
}