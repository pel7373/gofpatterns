package org.gofpatterns.decorator.decorators;

import org.gofpatterns.decorator.pizza.Food;

public class MarshmellowDecorator extends Decorator {
    public MarshmellowDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void cook() {
        decoratedFood.cook();
        System.out.println("Add marshmellow!");
    }
}
