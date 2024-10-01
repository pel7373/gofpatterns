package org.gofpatterns.decorator.decorators;

import org.gofpatterns.decorator.pizza.Food;

public class CheeseDecorator extends Decorator {
    public CheeseDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void cook() {
        decoratedFood.cook();
        System.out.println("Add cheese!");
    }
}
