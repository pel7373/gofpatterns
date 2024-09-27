package org.gofpatterns.decorator.decorators;

import org.gofpatterns.decorator.pizza.Food;

public class MushroomsDecorator extends Decorator {
    public MushroomsDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void cook() {
        decoratedFood.cook();
        System.out.println("Add mushrooms!");
    }
}
