package org.gofpatterns.decorator.decorators;

import org.gofpatterns.decorator.pizza.Food;

public abstract class Decorator implements Food {
    protected Food decoratedFood;

    public Decorator(Food decoratedFood) {
        this.decoratedFood = decoratedFood;
    }

    public void cook() {
        decoratedFood.cook();
    }
}
