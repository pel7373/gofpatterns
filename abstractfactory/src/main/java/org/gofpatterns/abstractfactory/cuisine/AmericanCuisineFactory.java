package org.gofpatterns.abstractfactory.cuisine;

import org.gofpatterns.abstractfactory.food.*;

public class AmericanCuisineFactory extends CuisineFactory {
    @Override
    public Potato cookPotato() {
        return new AmericanPotato();
    }

    @Override
    public RoastMeat cookRoastMeat() {
        return new AmericanRoastMeat();
    }

    @Override
    public Salad cookSalad() {
        return new AmericanSalad();
    }

    @Override
    public LunchSet cookSetLunch() {
        return new AmericanLunchSet();
    }

    @Override
    public String toString() {
        return "It's American cuisineFactory!";
    }
}
