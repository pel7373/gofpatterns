package org.gofpatterns.factorymethod.food;

import org.gofpatterns.factorymethod.exception.CantCookFromFoodException;

public class RoastMeat extends Food {
    @Override
    public String toString() {
        return "It's RoastMeat!";
    }

}
