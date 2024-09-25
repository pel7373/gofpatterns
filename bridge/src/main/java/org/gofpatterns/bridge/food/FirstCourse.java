package org.gofpatterns.bridge.food;

import org.gofpatterns.bridge.cuisine.Cuisine;

public class FirstCourse extends Food {
    public FirstCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String cook() {
        return "It's firstCourse, made by " + getCuisine().toString();
    }
}
