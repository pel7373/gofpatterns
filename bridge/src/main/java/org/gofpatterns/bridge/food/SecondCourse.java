package org.gofpatterns.bridge.food;

import org.gofpatterns.bridge.cuisine.Cuisine;

public class SecondCourse extends Food {
    public SecondCourse(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String cook() {
        return "It's secondCourse, made by " + getCuisine().toString();
    }
}
