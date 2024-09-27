package org.gofpatterns.decorator.decorators;

import org.gofpatterns.decorator.pizza.Food;

public class PineappleDecorator extends Decorator {
    public PineappleDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void cook() {
        decoratedFood.cook();
        System.out.println("Add pineapple!");
    }
}
