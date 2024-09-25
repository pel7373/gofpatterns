package org.gofpatterns.bridge.food;

import org.gofpatterns.bridge.cuisine.Cuisine;

public abstract class Food {
    private final Cuisine cuisine;

    public Food(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public abstract String cook();

    public Cuisine getCuisine() {
        return cuisine;
    }
}
