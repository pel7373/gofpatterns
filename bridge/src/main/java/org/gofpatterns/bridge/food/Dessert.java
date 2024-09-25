package org.gofpatterns.bridge.food;

import org.gofpatterns.bridge.cuisine.Cuisine;

public class Dessert extends Food {
    public Dessert(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String cook() {
        return "It's dessert, made by " + getCuisine().toString();
    }
}
