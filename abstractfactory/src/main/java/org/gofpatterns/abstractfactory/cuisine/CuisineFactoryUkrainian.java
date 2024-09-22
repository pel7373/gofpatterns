package org.gofpatterns.abstractfactory.cuisine;

import org.gofpatterns.abstractfactory.food.*;

public class CuisineFactoryUkrainian extends CuisineFactory{
    @Override
    public Potato cookPotato() {
        return new PotatoUkrainian();
    }

    @Override
    public RoastMeat cookRoastMeat() {
        return new RoastMeatUkrainian();
    }

    @Override
    public Salad cookSalad() {
        return new SaladUkrainian();
    }

    @Override
    public SetLunch cookSetLunch() {
        return new SetLunchUkrainian();
    }

    @Override
    public String toString() {
        return "It's cuisineFactoryUkrainian!";
    }
}
