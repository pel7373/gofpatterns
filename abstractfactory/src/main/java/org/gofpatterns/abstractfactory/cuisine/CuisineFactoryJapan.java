package org.gofpatterns.abstractfactory.cuisine;

import org.gofpatterns.abstractfactory.food.*;

public class CuisineFactoryJapan extends CuisineFactory {
    @Override
    public Potato cookPotato() {
        return new PotatoJapan();
    }

    @Override
    public RoastMeat cookRoastMeat() {
        return new RoastMeatJapan();
    }

    @Override
    public Salad cookSalad() {
        return new SaladJapan();
    }

    @Override
    public SetLunch cookSetLunch() {
        return new SetLunchJapan();
    }

    @Override
    public String toString() {
        return "It's cuisineFactoryJapan!";
    }
}
