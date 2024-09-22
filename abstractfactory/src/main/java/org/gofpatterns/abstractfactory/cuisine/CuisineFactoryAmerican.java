package org.gofpatterns.abstractfactory.cuisine;

import org.gofpatterns.abstractfactory.food.*;

public class CuisineFactoryAmerican extends CuisineFactory {
    @Override
    public Potato cookPotato() {
        return new PotatoAmerican();
    }

    @Override
    public RoastMeat cookRoastMeat() {
        return new RoastMeatAmerican();
    }

    @Override
    public Salad cookSalad() {
        return new SaladAmerican();
    }

    @Override
    public SetLunch cookSetLunch() {
        return new SetLunchAmerican();
    }

    @Override
    public String toString() {
        return "It's cuisineFactoryAmerican!";
    }
}
