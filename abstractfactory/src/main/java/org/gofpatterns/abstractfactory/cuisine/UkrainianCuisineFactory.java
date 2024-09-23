package org.gofpatterns.abstractfactory.cuisine;

import org.gofpatterns.abstractfactory.food.*;

public class UkrainianCuisineFactory extends CuisineFactory{
    @Override
    public Potato cookPotato() {
        return new UkrainianPotato();
    }

    @Override
    public RoastMeat cookRoastMeat() {
        return new UkrainianRoastMeat();
    }

    @Override
    public Salad cookSalad() {
        return new UkrainianSalad();
    }

    @Override
    public LunchSet cookSetLunch() {
        return new UkrainianLunchSet();
    }

    @Override
    public String toString() {
        return "It's Ukrainian cuisineFactory!";
    }
}
