package org.gofpatterns.decorator.decorators;

import org.gofpatterns.decorator.pizza.Food;

public class BackonDecorator extends Decorator {
    public BackonDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void cook() {
        decoratedFood.cook();
        System.out.println("Add backon!");
    }
}
