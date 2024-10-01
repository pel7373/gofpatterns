package org.gofpatterns.decorator.decorators;

import org.gofpatterns.decorator.pizza.Food;

public class SeaFoodDecorator extends Decorator {
    public SeaFoodDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void cook() {
        decoratedFood.cook();
        System.out.println("Add seafood!");
    }
}
