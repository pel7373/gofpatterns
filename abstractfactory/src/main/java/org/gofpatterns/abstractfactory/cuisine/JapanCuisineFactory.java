package org.gofpatterns.abstractfactory.cuisine;

import org.gofpatterns.abstractfactory.food.*;

public class JapanCuisineFactory extends CuisineFactory {
    @Override
    public Potato cookPotato() {
        return new JapanPotato();
    }

    @Override
    public RoastMeat cookRoastMeat() {
        return new JapanRoastMeat();
    }

    @Override
    public Salad cookSalad() {
        return new JapanSalad();
    }

    @Override
    public LunchSet cookSetLunch() {
        return new JapanLunchSet();
    }

    @Override
    public String toString() {
        return "It's Japan cuisineFactory!";
    }
}
