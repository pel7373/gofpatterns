package org.gofpatterns.bridge.food;

import org.gofpatterns.bridge.cuisine.Cuisine;

public class ThirdCourse extends Food {
    public ThirdCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String cook() {
        return "It's thirdCourse, made by " + getCuisine().toString();
    }
}